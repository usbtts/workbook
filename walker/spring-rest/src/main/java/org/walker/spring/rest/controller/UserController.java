package org.walker.spring.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.walker.spring.rest.base.AbstractController;
import org.walker.spring.rest.base.Result;
import org.walker.spring.rest.pojo.UserInfo;

@RestController
public class UserController extends AbstractController{
	
	@RequestMapping(path="/users", method=RequestMethod.GET)
	public Result getUsers(UserInfo userInfo) {
		logger.info("getUsers " + userInfo);
		return new Result().add(new UserInfo(1, "User1")).add(new UserInfo(2, "User2"));
	}
	
	@RequestMapping(path="/users/{id}", method=RequestMethod.GET)
	public Result getUserById(@PathVariable(name="id") String id) {
		logger.info("getUserById " + id);
		return new Result().add(new UserInfo(Integer.parseInt(id), "User" + id));
		
	}
	
	@RequestMapping(path="/users", method=RequestMethod.POST)
	public Result addUsers(@RequestBody List<UserInfo> users) {
		logger.info("addUsers " + users);
		return new Result();
		
	}
}
