package org.com.demo.service;

import org.com.demo.properties.DemoProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class DemoService {
	@Autowired
	private DemoProperties demoProperties;

	public  DemoService(){}

	public DemoService(DemoProperties demoProperties){
		this.demoProperties =demoProperties;
	}

	public String testDemo(){
		return  "DemoService: " + demoProperties.getName() + "---" + demoProperties.getContext();
	}
}
