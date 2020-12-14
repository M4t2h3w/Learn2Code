package com.midnightnoon.learn2code.springlearn2code.config;

import com.midnightnoon.learn2code.springlearn2code.services.impl.PrintService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:matej.properties")   //path k suboru
public class MatejConfig {

    @Value("${matej.meno}")
    String meno;

    @Value("${matej.priezvisko}") //nasetujem premennu z matej.properties
    String priezvisko;

    @Bean   //vytvorim Bean pre printService a nasetujem ho datami z properties
    public PrintService printService(){
        PrintService printService = new PrintService();
        printService.setData(meno + ", " + priezvisko);
        return printService;
    }

}
