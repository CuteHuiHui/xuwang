package com.xw.xuwang;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching//开启redis缓存
@Slf4j
public class DemoApplication /*implements CommandLineRunner */{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Autowired
//	private EmployeeCopy1DAO employeeCopy1DAO;

//	@Override
//	public void run(String... args) throws Exception {
//		log.info("总记录数：" + employeeCopy1DAO.count());
//		EmployeeCopy1 employeeCopy1 = new EmployeeCopy1("张三", 20);
//		EmployeeCopy1 employeeCopy2 = new EmployeeCopy1("李四", 23);
//		employeeCopy1DAO.save(employeeCopy1);
//		employeeCopy1DAO.save(employeeCopy2);
//		log.info("全部记录：" + employeeCopy1DAO.findAll());
//	}
}
