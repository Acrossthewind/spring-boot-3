package com.atguigu.rpc.controller;

import com.atguigu.rpc.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/13 21:44
 */

@RestController
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/weather")
    public Mono<String> getWeather(@RequestParam("city") String city) {

        //查询天气
        Mono<String> weather = weatherService.getWeather(city);
        return weather;
    }


}
