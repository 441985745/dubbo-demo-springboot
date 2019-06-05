package com.atguigu.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
/**
 * 1。导入依赖
 * 	1）导入dubbo-starter
 *  2)导入dubbo的其他依赖
 * @author zhangshulong
 *
 */
@EnableDubbo //开始基于注解的dubbo功能
@SpringBootApplication
public class BootUserServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootUserServiceProviderApplication.class, args);
	}

}
