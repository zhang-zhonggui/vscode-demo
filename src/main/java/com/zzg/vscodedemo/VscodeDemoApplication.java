package com.zzg.vscodedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zzg.vscodedemo.mapper")
public class VscodeDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(VscodeDemoApplication.class, args);
    }

}
