package com.bgora.bgora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.bgora.bgora.mapper")
public class BgoraApplication {

    public static void main(String[] args) {
        SpringApplication.run(BgoraApplication.class, args);
    }

}
