package com.lvzhang.service;

import com.lvzhang.entity.Group;
public interface GroupService {
	Group findById();
	int insert(Integer user_id,Integer project_id,Integer type);
}
