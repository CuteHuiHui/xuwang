package com.xw.xuwang.aop;

import com.github.pagehelper.PageInfo;
import com.xw.xuwang.bean.PageResultBean;
import com.xw.xuwang.bean.ResultBean;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AopTest1 {

    private static final Logger logger = LoggerFactory.getLogger(AopTest1.class);

    ThreadLocal<PageResultBean<?>> pageResultBeanThreadLocal = new ThreadLocal();
    ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut(value = "execution(public com.xw.xuwang.bean.PageResultBean *(..))")
    public void handlerPageResultBeanMethod(){
    }

    @Around("handlerPageResultBeanMethod()")
    public Object handlerPageResultBeanMethod(ProceedingJoinPoint pj){
        startTime.set(System.currentTimeMillis());
        try {
            pageResultBeanThreadLocal.set((PageResultBean<?>) pj.proceed());
            logger.info("执行方法："+pj.getSignature()+",用时："+(System.currentTimeMillis() - startTime.get()));
        } catch (Throwable throwable) {
            ResultBean<?> resultBean = handlerException(pj,throwable);
            pageResultBeanThreadLocal.set(new PageResultBean<>(new PageInfo<>()).setMsg(resultBean.getMsg()).setCode(resultBean.getCode()));
        }
        return pageResultBeanThreadLocal.get();
    }

    private ResultBean<?> handlerException(ProceedingJoinPoint pj, Throwable throwable) {
        ResultBean<?> resultBean = new ResultBean<>();
        resultBean.setCode(ResultBean.FAIL);
        resultBean.setMsg(throwable.getMessage());
        return resultBean;
    }

}