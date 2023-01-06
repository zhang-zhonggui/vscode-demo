package com.zzg.vscodedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author zzg
 */
@RestController
@RequestMapping
public class HelloWorldController {
    @GetMapping("hello")
    public String hello() {
        return "hello world";
    }
}
