package com.mashensoft.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mashensoft.service.IUserService;

@Controller
public class UserControler {
	@Autowired
	IUserService userService;
	@RequestMapping("/test1")
	public String test1(Integer age) throws Exception{
		System.out.println("test1");
		if(age==null){
			age=1;
		}
		userService.getName(age);
		return "test1";
	}
//	@ExceptionHandler({ArithmeticException.class,NullPointerException.class,RuntimeException.class})
//	public String glException(){
//		System.out.println("userControler里异常");
//		return "error";
//	}
	@RequestMapping("/test2")
	public String test2() throws Exception{
		
		userService.getUser();
		userService.getName(0);
		return "test1";
	}
}
