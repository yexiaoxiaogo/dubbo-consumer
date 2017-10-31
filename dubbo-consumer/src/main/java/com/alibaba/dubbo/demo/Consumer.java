package com.alibaba.dubbo.demo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.github.yexiaoxiaogo.weather.domain.WeatherCity;
import io.github.yexiaoxiaogo.weather.service.WeatherCityService;

/**
 * Hello world!
 *
 */
public class Consumer {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "META-INF/spring/dubbo-demo-consumer.xml" });
		context.start();
//		DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
//		String hello = demoService.sayHello("world"); //执行远程方法
//		System.out.println(hello); // 显示调用结果
		WeatherCityService weatherCityService = (WeatherCityService) context.getBean("weatherCityService");
		String string = weatherCityService.test("a");
		System.out.println(string);
		
//		WeatherCityService weatherCityService = (WeatherCityService) context.getBean("weatherCityService");
		List<WeatherCity> list = weatherCityService.selectAll();
		System.out.println(list.size());
		System.out.println(list.get(0).toString());
	}
}
