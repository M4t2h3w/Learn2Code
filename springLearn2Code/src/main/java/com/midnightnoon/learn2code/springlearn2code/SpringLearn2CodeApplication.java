package com.midnightnoon.learn2code.springlearn2code;

import com.biblia.BibleVerses;
import com.midnightnoon.learn2code.springlearn2code.services.HelloWorldService;
import com.midnightnoon.learn2code.springlearn2code.services.RestApiService;
import com.midnightnoon.learn2code.springlearn2code.services.impl.PrintService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLearn2CodeApplication {

	public static void main(String[] args) {

		ApplicationContext kontext = SpringApplication.run(SpringLearn2CodeApplication.class, args);
//		String verse = kontext.getBean(BibleVerses.class).getVerse();
//		System.out.println(verse);

		System.out.println(kontext.getBean(RestApiService.class).getTodo(1L));


		//ak použijem Application listener (DataInit class) tak uz nepotrebujem pisat kod takto
//		//ulozim si kontext do premennej aby som ho mohol pouzivat
//		ApplicationContext context =
//			SpringApplication.run(SpringLearn2CodeApplication.class, args);
//
//		//takto poviem Springu, ze chcem Bean pre danu triedu
//		AppRun appRun = context.getBean(AppRun.class);
//		appRun.run();

//		// toto fungovat nebude, lebo som AppRun dotiahol mimo Spring, nemam implementaciu
//		AppRun appRun = new AppRun();
//		appRun.run();

	}

}
