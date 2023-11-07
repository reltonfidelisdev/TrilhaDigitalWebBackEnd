package com.ada.pratica.saidaformatada;

import java.util.Random;

public class Programa {
	public static void main(String[] args) {
		
		/**
		 * A Saida Formatada é uma forma de juntar um texto com variáveis
		 * sem precisar quebrar a string e concatenar.  
		 */
		// Marcadores comuns do comando System.out.printf();
		/**
		 * %d : para inteiros de qualquer tipo
		 * %f : para reais de qualquer tipo
		 * %c : para caractere
		 * %s : para String
		 * 
		 * %n : quebra linha
		 * 
		 */
		Random random = new Random();
		System.out.printf("O valor sorteado foi %d %n", random.nextInt(Integer.MAX_VALUE));
		System.out.printf("O valor de PI é: %f %n", Math.PI);
		
		
	}
}
