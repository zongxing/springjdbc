package com.mashensoft.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mashensoft.model.User;

public interface IUserDao {
	public List<Map<String, Object>> getUsers();
	public User getUserById();
	public int delteUserById();
	public int updateUser(User user);
}
