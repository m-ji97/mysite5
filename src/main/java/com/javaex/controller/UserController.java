package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.UserService;
import com.javaex.vo.UserVo;

@Controller
public class UserController {
	
	private UserService userservice;
	
	//로그인폼
	@RequestMapping(value="/user/loginform",method = {RequestMethod.GET,RequestMethod.POST})
	public String loginForm() {
		System.out.println("UserController.loginForm()");
		
		return "user/loginForm";
	}
	
	//로그인
	@RequestMapping(value="/user/login",method = {RequestMethod.GET,RequestMethod.POST})
	public String login(@ModelAttribute UserVo userVo) {
		System.out.println("UserController.login()");
		
		System.out.println(userVo);
		
		userservice.exeLogin(userVo);
		
		//(id pw) vo
		
		//service에게 보낸다 -->vo(no name)를 받는다-->세션에 저장한다
		
		
		return "";
		
	}

}
