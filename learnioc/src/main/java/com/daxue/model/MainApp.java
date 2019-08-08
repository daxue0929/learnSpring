package com.daxue.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applactionConfig.xml");

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

        helloWorld.getMessage();

    }
}
