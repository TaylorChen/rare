package com.example.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述：
 *
 * 
 */

@Configuration
@MapperScan(basePackages = "com.example.demo.mapper")
public class MyBatisConfig {
}
