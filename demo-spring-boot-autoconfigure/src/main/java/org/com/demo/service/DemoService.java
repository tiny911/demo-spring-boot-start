package org.com.demo.service;

import org.com.demo.DemoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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
