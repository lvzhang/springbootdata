package com.lvzhang.controller;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lvzhang.db.mapper.GroupMapper;
import com.lvzhang.entity.Group;
import com.lvzhang.entity.User;
import com.lvzhang.master.mapper.UserMapper;
import com.lvzhang.service.GroupService;
import com.lvzhang.service.UserService;
@Controller
public class DataController {
	@Autowired
	GroupMapper groupMapper;
	@Autowired
	UserMapper userMapper;
	@RequestMapping("/group")
	@ResponseBody
	public String index (){
//		administratorService.createUser("小名", 25);|
		User findByName = userMapper.findByName("小名1");
		System.out.println("findByName------"+findByName);
		Group findById = groupMapper.findById();
		System.out.println("11111111111111111111111"+findById);
		return "Hello World2!!!";
	}
	
	@RequestMapping("/index222")
	public String index(Map<String, Object> map) {
	    map.put("name","美丽的天使...");
		return "index";
	}
}
