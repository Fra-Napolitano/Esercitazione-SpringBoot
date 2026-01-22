package com.esercitazione.Esercitazione;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String fistName;
	private String lastName;
	
	
	public Student() {
		super();
	}

	public Student(String fistName, String lastName) {
		super();
		this.fistName = fistName;
		this.lastName = lastName;
	}
	
	public String getFistName() {
		return fistName;
	}
	
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Utente [fistName=" + fistName + ", lastName=" + lastName + "]";
	}
	
	
}
