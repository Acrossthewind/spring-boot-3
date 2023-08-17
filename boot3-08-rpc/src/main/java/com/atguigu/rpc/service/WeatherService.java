package com.atguigu.rpc.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 周肆淋
 * @version 1.0
 * @description: TODO
 * @date 2023/7/13 21:46
 */
@Service
public class WeatherService {

    public Mono<String> getWeather(String city){
        //远程调用阿里云API

        //创建WebClient
        WebClient client = WebClient.create();


        Map<String, String> params =new HashMap<>();
        params.put("area",city);

        //定义发请求方式
        Mono<String> mono = client.get()
                .uri("http://ali-weather.showapi.com/area-to-weather-date?area={area}", params)
                .accept(MediaType.APPLICATION_JSON)
                .header("Authorization", "APPCODE d436c8453211456080750e2f7f3a2ca4")
                .retrieve()
                .bodyToMono(String.class);


        return mono;

    }
}
