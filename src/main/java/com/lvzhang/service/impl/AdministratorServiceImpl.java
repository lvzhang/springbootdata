package com.lvzhang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.lvzhang.service.AdministratorService;
@Service
public class AdministratorServiceImpl implements AdministratorService{
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	@Override
	public void createUser(String name, Integer age) {
		System.out.println(name+":is:"+age);
//		jdbcTemplate.update("insert into users values(null,?,?);", name, age);	
	}

}
