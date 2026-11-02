package com.jing.ragaiback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@MapperScan("com.jing.ragaiback.mapper")

@SpringBootApplication
public class RagAiBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(RagAiBackApplication.class, args);
    }

}
