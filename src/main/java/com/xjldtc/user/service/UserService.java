package com.xjldtc.user.service;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xjldtc.base.http.BaseResponseModel;
import com.xjldtc.base.http.ResponseEnum;
import com.xjldtc.base.prop.UrlPropertys;
import com.xjldtc.base.util.PropertiesUtil;
import com.xjldtc.user.model.po.UserLoginPO;

@Service
public class UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UrlPropertys urlPropertys;
	
	public BaseResponseModel userLogin(UserLoginPO userLogin, HttpServletRequest request){
		StringBuffer usersInfo = new StringBuffer();
		try {
			Properties prop = PropertiesUtil.readProp(urlPropertys.getUserUrlPropertys());
			usersInfo.append(prop.getProperty("user_info"));
		} catch (IOException e) {
			e.printStackTrace();
			return new BaseResponseModel(ResponseEnum.FAIL.code(),ResponseEnum.FAIL.name());
		}
		
		return new BaseResponseModel(ResponseEnum.OK.code(),ResponseEnum.OK.name());
	}
	
}
