package com.example.demojavasql;

import com.example.demojavasql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoJavaSqlApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoJavaSqlApplication.class, args);

    }

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        // Cho ng dùng nhập vào tên -> hhieern thị danh sách những ng có tên như vậy
        userService.findUserByEmailAndPhone("dat@gmail.com", "123456");
    }
}
