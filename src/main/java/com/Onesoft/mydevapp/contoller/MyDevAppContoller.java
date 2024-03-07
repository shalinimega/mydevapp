package com.Onesoft.mydevapp.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDevAppContoller {
	@GetMapping("msg")
	public String msg() {
		return "hello";
	}

}
