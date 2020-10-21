package org.walker.spring.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.walker.spring.web.dao.UserMapper;
import org.walker.spring.web.model.User;
import org.walker.spring.web.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User searchUser() {
		return userMapper.selectByPrimaryKey(1);
	}

}
