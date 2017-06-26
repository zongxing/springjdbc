package com.mashensoft.service;

import java.util.List;

import com.mashensoft.model.User;

public interface IUserService {
	public String getName(int age) throws Exception;
	public List<User> getUser();
}
