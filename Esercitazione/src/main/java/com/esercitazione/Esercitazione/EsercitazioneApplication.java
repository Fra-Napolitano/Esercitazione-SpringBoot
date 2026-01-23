package com.esercitazione.Esercitazione;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan
// stessa cosa di scrivere solo @SpringBootApplication
public class EsercitazioneApplication {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(EsercitazioneApplication.class);
		
		for(String beanName : ctx.getBeanDefinitionNames()) {
			System.out.println("Bean ----> " + beanName);
		}
		ctx.close();
	}

}
