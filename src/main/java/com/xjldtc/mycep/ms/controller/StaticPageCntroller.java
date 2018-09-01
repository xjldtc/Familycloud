package com.xjldtc.mycep.ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class StaticPageCntroller {

	@GetMapping(value = "/")
	public String homePage() {
		return "index";
	}

}
