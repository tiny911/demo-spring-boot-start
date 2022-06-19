package org.com.demo;

import org.com.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DemoProperties.class)
@ConditionalOnProperty(
		prefix = "org.com.demo",
		name="enable",
		havingValue = "true"
)
public class DemoAutoConfigure {

	@Autowired
	private  DemoProperties demoProperties;

	public DemoService  demoService(){
		return  new DemoService(demoProperties);
	}
}
