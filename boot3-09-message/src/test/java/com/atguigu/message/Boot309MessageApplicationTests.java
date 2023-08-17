package com.atguigu.message;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.concurrent.CompletableFuture;

@SpringBootTest
class Boot309MessageApplicationTests {

    @Autowired
    KafkaTemplate kafkaTemplate;


    @Test
    void contextLoads() {


            CompletableFuture future = kafkaTemplate.send("news", "haha", "哈哈");

    }

}
