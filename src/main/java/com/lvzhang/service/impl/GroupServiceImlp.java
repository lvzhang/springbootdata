package com.lvzhang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lvzhang.db.mapper.GroupMapper;
import com.lvzhang.entity.Group;
import com.lvzhang.service.GroupService;
@Service
public class GroupServiceImlp implements GroupService{
	@Autowired
	GroupMapper groupMapper;
	@Override
	public Group findById() {
		return groupMapper.findById();
	}

	@Override
	public int insert(Integer user_id, Integer project_id, Integer type) {
		return groupMapper.insert(user_id, project_id, type);
	}

}
