package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序类
 * @SpringBootApplication 注解 SpringBoot应用
 */
@SpringBootApplication(scanBasePackages = "com")
public class MainApp {
    public static void main(String[] args) {

        // 返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApp.class, args);

        // 查看容器里的组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

    }
}
