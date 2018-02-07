package com.lvzhang.controller.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//@ControllerAdvice
public class GlobalExceptionHandler {
//	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String, Object> exceptionHanlder(){
		Map<String, Object> map = new HashMap<>();
		map.put("errorCode", "101");
		map.put("errorMsg", "系统错误！！！");
		return map;
		
	}
}
