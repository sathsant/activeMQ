package com.springboot.activemq.springbootactivemq.config;

import java.util.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@Configuration
public class Config {

	@Bean
	public javax.jms.Queue queue(){
		return new ActiveMQQueue("Inmemory.queue");
	}
		
	
}
