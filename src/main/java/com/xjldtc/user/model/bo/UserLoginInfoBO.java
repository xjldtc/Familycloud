package com.xjldtc.user.model.bo;

import java.sql.Date;

public class UserLoginInfoBO {

	private Integer userId;
	
	/*
	 * 登陆名称
	 */
	private String logName;
	
	/*
	 * 用户名称
	 */
	private String userName;
	
	/*
	 * 用户密码
	 */
	private String logPWD;
	
	/*
	 * 手机号
	 */
	private String mobile;
	
	/*
	 * 电子邮箱地址
	 */
	private String email;
	
	/*
	 * 用户状态 :
	 *    0,未激活
	 *    1,正常 
	 *    2,无效
	 */
	private Integer userStatus;
	
	/*
	 * 是否第一次登陆 0 是 1否
	 */
	private Integer firstLogin;
	
	/*
	 * 备注信息
	 */
	private String remark;
	
	/*
	 * 创建人
	 */
	private String creator;
	
	/*
	 * 创建时间
	 */
	private Date createTime;
	
	/*
	 * 修改人
	 */
	private String modifier;
}
