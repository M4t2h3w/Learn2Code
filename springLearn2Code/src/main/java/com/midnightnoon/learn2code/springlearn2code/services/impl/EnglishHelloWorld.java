package com.midnightnoon.learn2code.springlearn2code.services.impl;

import com.midnightnoon.learn2code.springlearn2code.services.HelloWorldService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service
//@Profile("eng")
public class EnglishHelloWorld implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}
