package com.alibaba.dubbo.demo;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;

import io.github.yexiaoxiaogo.weather.service.WeatherCityService;

@Component
public class AbcService {
    @Reference//(version = "1.0.0")
    public WeatherCityService weatherCityService;
}