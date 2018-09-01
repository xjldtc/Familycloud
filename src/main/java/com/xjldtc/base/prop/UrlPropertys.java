package com.xjldtc.base.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "url")
public class UrlPropertys {
	private String menuUrlPropertys;
	
	private String userUrlPropertys;

	public String getMenuUrlPropertys() {
		return menuUrlPropertys;
	}

	public void setMenuUrlPropertys(String menuUrlPropertys) {
		this.menuUrlPropertys = menuUrlPropertys;
	}

	public String getUserUrlPropertys() {
		return userUrlPropertys;
	}

	public void setUserUrlPropertys(String userUrlPropertys) {
		this.userUrlPropertys = userUrlPropertys;
	}
}
