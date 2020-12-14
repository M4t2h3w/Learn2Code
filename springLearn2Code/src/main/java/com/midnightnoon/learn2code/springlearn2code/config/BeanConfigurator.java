package com.midnightnoon.learn2code.springlearn2code.config;

import com.biblia.BibleVerses;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfigurator {

    @Bean
    public BibleVerses getBibleVerses(){
        return new BibleVerses();
    }

    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        RestTemplate restTemplate = builder.build();
        return restTemplate;
    }
}
