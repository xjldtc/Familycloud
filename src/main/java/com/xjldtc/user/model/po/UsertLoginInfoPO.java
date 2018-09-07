package com.xjldtc.user.model.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UsertLoginInfoPO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/*
	 * 主键 
	 */
	@Id
    @GeneratedValue
    @Column(name = "ID")
	private Integer id;
	
	/*
	 * user表主键 
	 */
    @Column(name = "USER_ID")
	private Integer userId;
    
    /*
     * 
     */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
