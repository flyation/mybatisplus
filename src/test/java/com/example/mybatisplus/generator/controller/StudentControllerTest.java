package com.example.mybatisplus.generator.controller;

import com.example.mybatisplus.generator.service.IStudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentControllerTest {
    @Autowired
    IStudentService iStudentService;

    @Test
    public void test() {
        iStudentService.list(null).forEach(System.out::println);
    }
}