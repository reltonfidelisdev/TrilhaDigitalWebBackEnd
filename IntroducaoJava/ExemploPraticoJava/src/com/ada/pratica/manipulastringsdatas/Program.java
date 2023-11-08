package com.ada.pratica.manipulastringsdatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		// Manipulação de Strings
		String nome = "Relton";
		System.out.printf("%s %n", nome.toUpperCase());
		System.out.printf("%s %n", nome.toLowerCase());
		System.out.println("Tamanho da variável nome: " + nome.length());
		
		String uotroNome = "relton";
		System.out.println(nome.equalsIgnoreCase(uotroNome));
		System.out.println(nome.equals(uotroNome));
		
		// Manipulação de datas
		LocalDate localdete = LocalDate.now();
		Locale locale= new Locale("pt","BR");
		System.out.println(localdete.getDayOfWeek().getDisplayName(TextStyle.FULL, locale));
		String diaSemana = localdete.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
		String saudacao = "";
		LocalDateTime now = LocalDateTime.now();
		if(now.getHour() >= 0 && now.getHour() < 12) {
			saudacao = "bom dia";
		} else if(now.getHour() >= 12 && now.getHour() < 18) {
			saudacao = "boa tarde";
		} else if(now.getHour() >= 18 && now.getHour() < 24) {
			saudacao = "boa noite";
		}
		System.out.printf("%n Olá, %s. Hoje é %s, %s,. %n", nome, diaSemana, saudacao.toUpperCase());
		
	}

}
