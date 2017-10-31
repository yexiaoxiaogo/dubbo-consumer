package com.alibaba.dubbo.demo;

import java.util.List;

import io.github.yexiaoxiaogo.weather.domain.WeatherCity;

public class Controller {
	public String abc() {
		AbcService bean = Client.context.getBean(AbcService.class);
		
		System.out.println("This is out put by client");
		String a = "";
		String b = a;
		String c = b;
		List<WeatherCity> list = bean.weatherCityService.selectAll();
		return "";
	}
}
