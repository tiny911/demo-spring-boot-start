package org.com.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "org.com.demo")
public class DemoProperties {

	private  String name;

	private  String context;


	public String getName() {
		return name;
	}

	public String getContext() {
		return context;
	}
}
