package com.mashensoft.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mashensoft.dao.IUserDao;
import com.mashensoft.model.User;

@Service
public class UserService implements IUserService {
	@Autowired
	IUserDao userDao; 
	@Override
	public String getName(int age) throws Exception {
		if(age==0){
			throw new ArithmeticException();
		}
		System.out.println("方法被调用");
		userDao.getUsers();
		
		User u = userDao.getUserById();
		System.out.println("hibernate--------username"+u.getUsername());
		return "zongxing";
	}

	@Override
	public List<User> getUser() {
		List<Map<String, Object>> users = userDao.getUsers();
		System.out.println(users.size());
		return users;
	}
	
}
