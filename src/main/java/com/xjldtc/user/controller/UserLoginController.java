package com.xjldtc.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xjldtc.base.http.BaseResponseModel;
import com.xjldtc.user.model.dto.UserLoginDTO;
import com.xjldtc.user.model.po.UserPO;
import com.xjldtc.user.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserLoginController {

	@Autowired
	UserService userLoginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public BaseResponseModel login(@RequestBody UserLoginDTO userLiginDTO,HttpServletRequest request) {
		BaseResponseModel model = userLoginService.userLogin(userLiginDTO, request);
		UserPO userPO = (UserPO) model.getData();
		return userLoginService.userLoginInfo(userPO.getId());
	}
	
}
