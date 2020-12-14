package com.midnightnoon.learn2code.springlearn2code.services.impl;

import com.midnightnoon.learn2code.springlearn2code.services.HelloWorldService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service
//@Primary
//@Profile({"sk","eng","cze","default"}) //viac profilov pre implementaciu
public class PrimaryHelloWorld implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Ahoj svet z primary!");
    }
}
