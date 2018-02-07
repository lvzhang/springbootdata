//package com.lvzhang.controller;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.lvzhang.entity.User;
//import com.lvzhang.service.AdministratorService;
//import com.lvzhang.service.UserService;
//@Controller
//public class HelloController {
//	@Autowired
//	AdministratorService administratorService;
//	@Autowired
//	UserService userService;
//	@RequestMapping("/index1")
//	@ResponseBody
//	public String index (){
////		administratorService.createUser("小名", 25);
//		System.out.println("11111111111111111111111");
//		User findByName = userService.findByName("小名1");
//		System.out.println("findByName------"+findByName);
//		return "Hello World2!!!";
//	}
//	
//	@RequestMapping("/index")
//	public String index(Map<String, Object> map) {
//	    map.put("name","美丽的天使...");
//		return "index";
//	}
//}
