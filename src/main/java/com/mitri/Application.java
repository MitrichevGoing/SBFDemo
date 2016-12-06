package com.mitri;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by mitrichev on 2016/12/5.
 */
@SpringBootApplication
@MapperScan("com.mitri.mapper.*")
public class Application implements CommandLineRunner{
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    public void run(String... args) throws Exception {
        return;
    }
}
