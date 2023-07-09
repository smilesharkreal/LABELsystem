package com.example.labelsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.labelsystem.Dao")
public class LabeLsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabeLsystemApplication.class, args);
    }

}
