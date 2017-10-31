package com.alibaba.dubbo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Client {
	
	public static ConfigurableApplicationContext context;
    public static void main(String[] args) {
    	context = SpringApplication.run(Client.class, args);
    	
//        ConfigurableApplicationContext run = SpringApplication.run(Client.class, args);
//        AbcService bean = run.getBean(AbcService.class);
//        
//        System.out.println("This is out put by client");
//        List<WeatherCity> list = bean.weatherCityService.selectAll();
//		System.out.println(list.size());
//		System.out.println(list.get(0).toString());
    }
}