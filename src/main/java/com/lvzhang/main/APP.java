package com.lvzhang.main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
/**
 * 在上加上RestController 
 * 表示修饰该Controller所有的方法返回JSON格式,直接可以编写Restful接口
 * @author lvzhang
 *注解@EnableAutoConfiguration:作用在于让 SpringBoot根据应用所声明的依赖来对 Spring 
 *框架进行自动配置这个注解告诉Spring Boot根据添加的jar依赖猜测你想如何配置Spring。
 *由于spring-boot-starter-web添加了Tomcat和SpringMVC，
 *所以auto-configuration将假定你正在开发一个web应用并相应地对Spring进行设置。
 *标识为启动类
 */
//@EnableAutoConfiguration
@ComponentScan(basePackages = "com.lvzhang")
//@MapperScan(basePackages = "com.lvzhang.mapper")
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class //将spring boot自带的DataSourceAutoConfiguration禁掉
})

//@EnableCaching // 开启缓存注解
//@EnableScheduling//开启定时任务注解
//@EnableJpaRepositories(basePackages = "com.lvzhang.dao")
//@EnableAutoConfiguration
//@EntityScan(basePackages = "com.lvzhang.entity")
public class APP {
	public static void main(String[] args) {
		SpringApplication.run(APP.class, args);
	}
}
