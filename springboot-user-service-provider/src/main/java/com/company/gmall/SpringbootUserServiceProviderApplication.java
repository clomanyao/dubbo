package com.company.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;


//@EnableDubbo  //开启dubbo注解
//@ImportResource(locations = {"classpath:provider.xml"})
@EnableHystrix
@DubboComponentScan(basePackages = {"com.company.gmall"})
@SpringBootApplication
public class SpringbootUserServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootUserServiceProviderApplication.class, args);
	}

}
