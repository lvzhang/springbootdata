package com.lvzhang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lvzhang.entity.User;
import com.lvzhang.master.mapper.UserMapper;
import com.lvzhang.service.UserService;
@Service
public class UserServiceImlp implements UserService{
	@Autowired 
	UserMapper userMapper;
	@Override
	public User findByName(String name) {
		return userMapper.findByName(name);
	}

	@Override
	public int insert(String name, Integer age) {
		return userMapper.insert(name, age);
	}

}
