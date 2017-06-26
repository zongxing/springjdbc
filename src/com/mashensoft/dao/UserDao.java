package com.mashensoft.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mashensoft.model.User;

@Repository
public class UserDao implements IUserDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Map<String, Object>> getUsers() {
		System.out.println("userdao数据库方法被调用。");
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from user");
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) iterator.next();
			Set set = map.keySet();
			for (Iterator iterator2 = set.iterator(); iterator2.hasNext();) {
				String key = (String) iterator2.next();
				System.out.println(key+map.get(key));
			}
		}
		return list;
	}

	@Override
	public User getUserById() {
		User user = (User)sessionFactory.openSession().load(User.class, 1);
		return user;
	}

	@Override
	public int delteUserById() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
