package com.xjldtc.user.service;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjldtc.base.http.BaseResponseModel;
import com.xjldtc.base.http.ResponseEnum;
import com.xjldtc.user.dao.mapper.UserMapper;
import com.xjldtc.user.dao.repository.UserRepository;
import com.xjldtc.user.model.dto.UserLoginDTO;
import com.xjldtc.user.model.po.UserPO;
import com.xjldtc.user.model.po.UsertLoginInfoPO;

@Service
public class UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserMapper userMapper;
	
	public BaseResponseModel userLogin(UserLoginDTO userLogin, HttpServletRequest request){
		UserPO user = userRepository.findByLogName(userLogin.getLoginName());
		return new BaseResponseModel(ResponseEnum.OK.code(),ResponseEnum.OK.name(),user);
	}
	
	public BaseResponseModel userLoginInfo(long userId){
		UsertLoginInfoPO user = userMapper.queryLoginInfoByUserId(userId);
		return new BaseResponseModel(ResponseEnum.OK.code(),ResponseEnum.OK.name(),user.getId());
	}
	
}
