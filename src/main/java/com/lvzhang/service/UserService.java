package com.lvzhang.service;

import com.lvzhang.entity.User;

public interface UserService {
	User findByName(String name);
	int insert(String name,Integer age);
}
