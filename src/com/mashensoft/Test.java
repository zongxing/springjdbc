package com.mashensoft;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mashensoft.service.IUserService;
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:spring-web.xml"})  
public class Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Value("${jdbc.url}")
	String url;
	@Autowired
	JdbcTemplate jdbcTemplate;
	@org.junit.Test
	public void test() {
		System.out.println(123);
		System.out.println(url);
	}
	@org.junit.Test
	public void test2() {
		System.out.println(jdbcTemplate.queryForList("select * from user").size());
		System.out.println(url);
	}
	@org.junit.Test
	public void test3() {
		System.out.println(jdbcTemplate.queryForList("select * from user").size());
		System.out.println(url);
	}
	@Autowired
	IUserService userService;
	@org.junit.Test
	public void test4() {
		System.out.println("调用userService");
		try {
			System.out.println(userService.getName(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
