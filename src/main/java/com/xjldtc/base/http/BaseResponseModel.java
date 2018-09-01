package com.xjldtc.base.http;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Response 公共返回
 */
public class BaseResponseModel implements Serializable{
	
	private static final long serialVersionUID = 5700536698833222611L;

	private Object code; // 返回结果码
	private String message; // 返回结果信息
	
	@JsonInclude(value = JsonInclude.Include.NON_NULL)
	private Object data; // 返回数据内容
		
	public BaseResponseModel(Object code, String message) {
		this.code = code;
		this.message = message;
	}

	public BaseResponseModel(Object code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public Object getCode() {
		return code;
	}

	public void setCode(Object code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ResponseModel [code=" + code + ", message=" + message + ", data=" + data + "]";
	}
}
