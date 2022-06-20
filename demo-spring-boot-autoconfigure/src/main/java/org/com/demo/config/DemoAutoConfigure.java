package org.com.demo.config;

import org.com.demo.properties.DemoProperties;
import org.com.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DemoProperties.class)
public class DemoAutoConfigure {

	@Autowired
	private  DemoProperties demoProperties;

	@Bean
	@ConditionalOnMissingBean
	public DemoService  demoService(){
		return  new DemoService(demoProperties);
	}
}
