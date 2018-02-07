//package com.lvzhang.controller;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.lvzhang.dao.UserDao;
//import com.lvzhang.entity.Users;
//@RestController
//public class IndexController {
//	@Autowired
//	private UserDao userDao;
//	@RequestMapping("/user")
//	public String index(Integer id) {
//		System.out.println("id----"+id);
//		Users findUser = userDao.findOne(id);
//		System.out.println("findUser------"+findUser.getName());
//		return "success";
//	}
//}