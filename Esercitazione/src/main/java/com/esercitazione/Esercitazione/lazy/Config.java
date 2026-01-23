package com.esercitazione.Esercitazione.lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class Config {
	
	@Bean
	@Lazy(value=false)
	public AlwaysUsedBean alwaysUsedBean() {
		return new AlwaysUsedBean();
	}
	
	@Bean
	public NotAlwaysUsedBean notAlwaysUsedBean() {
		return new NotAlwaysUsedBean();
	}
}
