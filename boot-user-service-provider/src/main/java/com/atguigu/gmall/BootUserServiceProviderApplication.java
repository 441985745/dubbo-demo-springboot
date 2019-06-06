package com.atguigu.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
/**
 * 1。导入依赖
 * 	1）导入dubbo-starter
 *  2)导入dubbo的其他依赖
 *
 *  srpingboot和dubbo整合的三种方式
 *  1)导入dubbo-starter,在application.properties配置属性,使用@Service[暴露服务]@Reference[引用服务]
 *  2)导入dubbo-starter,保留dubbo.xml配置文件,将provider.xml放入resources目录下,在启动类BootUserServiceProviderApplication上,去掉注解@EnableDubbo,
 *  使用@ImportResource(locations="classpath:provider.xml") 就可以了
 *  3)使用注解api的方式
 *  	将每一个组件手动创建到容器中  MyDubboConfig
 *
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
