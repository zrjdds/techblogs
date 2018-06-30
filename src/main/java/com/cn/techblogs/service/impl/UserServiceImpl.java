package com.cn.techblogs.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.techblogs.dao.IUserDao;
import com.cn.techblogs.pojo.User;
import com.cn.techblogs.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
