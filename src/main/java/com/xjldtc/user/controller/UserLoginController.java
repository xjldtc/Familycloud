package com.xjldtc.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xjldtc.base.http.BaseResponseModel;
import com.xjldtc.user.model.po.UserLoginPO;
import com.xjldtc.user.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserLoginController {

	@Autowired
	UserService userLoginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request) {
		UserLoginPO userLogin = new UserLoginPO();
		userLogin.setMacAddress(request.getHeader("macAddress"));
		userLogin.setIpAddress(request.getRemoteHost());
		userLogin.setPassWord((String)request.getAttribute("loginName"));
		userLogin.setLoginName((String)request.getAttribute("passWord"));
		BaseResponseModel response = userLoginService.userLogin(userLogin, request);
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
}
