package com.xjldtc.base.http;

public enum ResponseEnum {
	
	FAIL(999999,"请求失败"),
	OK(100000, "请求成功"),
	UNFINISHED(100001,"未完成的功能"),
	Unopened(100002,"未开放的功能");
	
	ResponseEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	private int code;
	
	private String message;

	public int code() {
		return code;
	}

	public String message() {
		return message;
	}
}
