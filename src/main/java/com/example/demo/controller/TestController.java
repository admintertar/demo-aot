package com.example.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author PING
 * @date 2023/1/15 21:22
 */
@RestController
@RequestMapping("/test")
@Tag(name = "测试Controller")
public class TestController {

    @GetMapping
    @Operation(summary = "简单测试")
    public String test(){
        return "test";
    }

}
