package com.xjldtc.user.model.po;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserPO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	/*
	 * 主键 
	 */
	@Id
    @GeneratedValue
    @Column(name = "ID")
	private Integer id;
	
	/*
	 * 登陆名称
	 */
	@Column(name = "LOG_NAME")
	private String logName;
	
	/*
	 * 用户名称
	 */
	@Column(name = "USER_NAME")
	private String userName;
	
	/*
	 * 用户密码
	 */
	@Column(name = "LOG_PWD")
	private String logPWD;
	
	/*
	 * 手机号
	 */
	@Column(name = "MOBILE")
	private String mobile;
	
	/*
	 * 电子邮箱地址
	 */
	@Column(name = "EMAIL")
	private String email;
	
	/*
	 * 用户状态 :
	 *    0,未激活
	 *    1,正常 
	 *    2,无效
	 */
	@Column(name = "USER_STATUS")
	private Integer userStatus;
	
	/*
	 * 是否第一次登陆 0 是 1否
	 */
	@Column(name = "FIRST_LOGIN")
	private Integer firstLogin;
	
	/*
	 * 备注信息
	 */
	@Column(name = "REMARK")
	private String remark;
	
	/*
	 * 创建人
	 */
	@Column(name = "CREATOR")
	private String creator;
	
	/*
	 * 创建时间
	 */
	@Column(name = "CREATE_TIME")
	private Date createTime;
	
	/*
	 * 修改人
	 */
	@Column(name = "MODIFIER")
	private String modifier;
	
	/*
	 * 修改时间
	 */
	@Column(name = "UPDATE_TIME")
	private Date updateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogName() {
		return logName;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLogPWD() {
		return logPWD;
	}

	public void setLogPWD(String logPWD) {
		this.logPWD = logPWD;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	public Integer isFirstLogin() {
		return firstLogin;
	}

	public void setFirstLogin(Integer firstLogin) {
		this.firstLogin = firstLogin;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
