package com.midnightnoon.learn2code.springlearn2code;

import com.midnightnoon.learn2code.springlearn2code.services.HelloWorldService;
import com.midnightnoon.learn2code.springlearn2code.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//pomocna trieda na spustanie aplikacie
@Component
public class AppRun {

//    @Autowired //zo Springu z kontajneru dotiahne implementaciu
//    MovieService movieService;

//    public void run(){
//        movieService.createAndAddMovie();
//    }

//    @Autowired
//    @Qualifier("englishHelloWorld")
    HelloWorldService helloWorldService;

    //Qualifier viem ešte použiť v konštruktore alebo v setter metóde
//    public AppRun(@Qualifier("englishHelloWorld") HelloWorldService helloWorldService) {
//        this.helloWorldService = helloWorldService;
//    }

//    @Qualifier("englishHelloWorld")
//    public void setHelloWorldService(@Qualifier("englishHelloWorld") HelloWorldService helloWorldService) {
//        this.helloWorldService = helloWorldService;
//    }

    public void run(){
        helloWorldService.sayHello();
    }
}
