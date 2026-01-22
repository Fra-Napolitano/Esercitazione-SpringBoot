package com.esercitazione.Esercitazione;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class EsercitazioneApplication {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		for(String beanName : ctx.getBeanDefinitionNames()) {
			System.out.println("Bean ----> " + beanName);
		}
		ctx.close();
	}

}
