package com.javaex.dao;

import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {
	
	public void userSelectByIdPw(UserVo userVo) {
		System.out.println("UserDao.userSelectByIdPw");
		
		System.out.println(userVo);
	}

}
