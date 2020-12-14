package com.midnightnoon.learn2code.springlearn2code.config;

import com.midnightnoon.learn2code.springlearn2code.services.HelloWorldService;
import com.midnightnoon.learn2code.springlearn2code.services.impl.HelloWorldServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorldServiceFactory createFactory(){
        return new HelloWorldServiceFactory();
    }

    @Bean
    @Profile("cze")
    public HelloWorldService createCzechHelloWorld(HelloWorldServiceFactory helloWorldServiceFactory){
        return helloWorldServiceFactory.createHelloWorldService("cze");
    }

    @Bean
    @Profile("eng")
    public HelloWorldService createEnglishHelloWorld(HelloWorldServiceFactory helloWorldServiceFactory){
        return helloWorldServiceFactory.createHelloWorldService("eng");
    }

    @Bean
    @Profile({"sk", "default"})
    public HelloWorldService createSlovakHelloWorld(HelloWorldServiceFactory helloWorldServiceFactory){
        return helloWorldServiceFactory.createHelloWorldService("svk");
    }

    @Bean
    @Primary
    @Profile("eng")
    public HelloWorldService createPrimaryHelloWorld(HelloWorldServiceFactory helloWorldServiceFactory){
        return helloWorldServiceFactory.createHelloWorldService("primary");
    }
}
