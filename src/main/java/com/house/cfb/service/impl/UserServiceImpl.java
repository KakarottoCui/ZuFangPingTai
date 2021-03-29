package com.house.cfb.service.impl;

import com.house.cfb.dao.UserMapper;
import com.house.cfb.entity.Users;
import com.house.cfb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper mapper;
	
	@Override
	public Users login(Users user) {
		return mapper.login(user);
	}

	@Override
	public int regist(Users user) {
		return mapper.regist(user);
	}

	@Override
	public int updateUserPwd(Users users) {
		return mapper.updateUserPwd(users);
	}

	@Override
	public Users checkOldPwd(Users users) {
		return mapper.checkOldPwd(users);
	}
}
