package com.jing.ragaiback.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.jing.ragaiback.mapper")
public class MyBatisPlusConfig {
}