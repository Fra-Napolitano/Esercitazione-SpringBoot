package com.esercitazione.Esercitazione;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.esercitazione.Esercitazione.lazy.NotAlwaysUsedBean;

@SpringBootApplication
public class EsercitazioneApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EsercitazioneApplication.class, args);
		System.out.println("Chiamo il Bean NotAlwaysBean");
		ctx.getBean(NotAlwaysUsedBean.class);
	}

}
