package com.xw.xuwang;

import com.xw.xuwang.dao.EmployeeCopy1DAO;
import com.xw.xuwang.entity.EmployeeCopy1;
import lombok.extern.slf4j.Slf4j;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * JPA测试
 * @author huixia.hu
 * Date: 2019年12月16日 15:18
 * @param null null
 * @return
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)//根据测试方法名字搞定执行顺序
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class DemoApplicationTests {

	@Resource
	private EmployeeCopy1DAO employeeCopy1DAO;

	@Resource
	private RedisTemplate<String,Object> redisTemplate;

	@Test
	void contextLoads() {
		System.out.println(employeeCopy1DAO.findAll().toString());
	}

	/**
	 * JPA测试
	 * @author huixia.hu
	 * Date: 2019年12月17日 15:37
	 * @param
	 * @return void
	 */
	@Test
	public void add(){
		employeeCopy1DAO.save(new EmployeeCopy1("胡永辉",22));
	}

	@Test
	public void testRedisString(){
		redisTemplate.opsForValue().set("name","huhuixia");
		log.info(redisTemplate.opsForValue().get("name").toString());
	}

	@Test
	public void testRedisList(){
		List<String> trap = new ArrayList<>();
		trap.add("张三");
		trap.add("张无忌");
		trap.add("新垣结衣");
		//左值
		trap.forEach(value->redisTemplate.opsForList().leftPush("userList",value));
		//右值
		redisTemplate.opsForList().rightPush("userList", "huhuixia");
		log.info("userList:"+redisTemplate.opsForList().range("userList",0,-1));
	}

	@Test
	public void testRedisListRemove(){
		//第二个参数count 正数就是从左边开始删除 负数是从右面 例如-1就从右删除第一个值为value的，0代表删除全部值为value的
		redisTemplate.opsForList().remove("userList", 0, "huhuixia");
		log.info("userList:"+redisTemplate.opsForList().range("userList",0,-1));
	}




}
