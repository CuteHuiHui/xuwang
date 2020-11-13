package com.xw.xuwang.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author huixia.hu
 * Date:     2019/12/16 14:28
 * @version 1.0
 */
public class AopTest {

    //master

    public static void main(String[] args) {
        // array表示一个长度为n的数组 // 代码中的array.length就等于n
        int[] array = new int[5];
        int count = 0;
        int val = 6;
        if (count == array.length) {
            int sum = 0;
            for (int i = 0; i < array.length; ++i) {
                sum = sum + array[i];
            }
            array[0] = sum;
            count = 1;
        }
        array[count] = val;
        ++count;
    }



    //测试git
    private static final Logger logger = LoggerFactory.getLogger(AopTest.class);

    /**
     * 定义一个切点
     */
    @Pointcut(value = "execution(public String test(..))")
    public void cutOffPoint() {
    }

    @Before("cutOffPoint()")
    public void beforeTest() {
        logger.info("我在test方法之前执行");
    }

    @After("cutOffPoint()")
    public void doAfter(){
        logger.info("我是在test之后执行");
    }

    ThreadLocal<Long> startTime = new ThreadLocal<>();
    @Around("cutOffPoint()")
    public Object doAround(ProceedingJoinPoint pjp){
        startTime.set(System.currentTimeMillis());
        logger.info("我是环绕通知执行");
        Object obj;
        try{
            obj = pjp.proceed();
            logger.info("执行返回值 : " + obj);
            logger.info(pjp.getSignature().getName()+"方法执行耗时: " + (System.currentTimeMillis() - startTime.get()));
        } catch (Throwable throwable) {
            obj=throwable.toString();
        }
        return obj;
    }

    @AfterReturning(returning = "result", pointcut = "cutOffPoint()")
    public void doAfterReturning(Object result) throws Throwable {
        logger.info("大家好，我是@AfterReturning，他们都秀完了，该我上场了"+result);
    }

    @AfterThrowing(throwing = "e",pointcut = "cutOffPoint()")
    public void doAfterReturning(Throwable e) {
        logger.info("大家好，我是@AfterThrowing，他们犯的错误，我来背锅");
        logger.info("错误信息"+e.getMessage());
    }
    //222222
    //33333
}
