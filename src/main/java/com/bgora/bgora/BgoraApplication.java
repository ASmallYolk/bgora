package com.bgora.bgora;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.bgora.bgora.mapper")
public class BgoraApplication {

//    @Value("${file.uploadFolder}")
//    private String uploadFolder;

    public static void main(String[] args) {
        SpringApplication.run(BgoraApplication.class, args);
    }

//    @Bean
//    MultipartConfigElement multipartConfigElement() {
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        factory.setLocation(uploadFolder);
//        return factory.createMultipartConfig();
//    }

}
