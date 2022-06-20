package org.com.demo.properties;

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

	public void setName(String name) {
		this.name = name;
	}

	public void setContext(String context) {
		this.context = context;
	}
}
