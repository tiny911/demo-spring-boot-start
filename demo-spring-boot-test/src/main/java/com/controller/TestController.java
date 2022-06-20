package com.controller;

import org.com.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class TestController {

	@Resource
	private DemoService demoService;

	@GetMapping(value = "/test")
	public void test(){
		System.out.println("*******成功啦*********");

		System.out.println(demoService.testDemo());
	}


}
