package com.baizhi.service;

public class HelloServiceImpl  implements  HelloService{
    public String hello(String name) {
        return "欢迎你："+name;
    }
}
