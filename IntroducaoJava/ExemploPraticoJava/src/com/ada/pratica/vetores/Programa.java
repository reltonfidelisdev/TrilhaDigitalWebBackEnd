package com.ada.pratica.vetores;

import java.util.Arrays;
import java.util.Random;

public class Programa {

	public static void main(String[] args) {

		String[] arrayVogais = { "A", "E", "I", "O", "U" };
		System.err.println(arrayVogais);
		for (String string : arrayVogais) {
			System.out.printf(string);
		}
		System.out.printf("%n");
		int[] arrayInteiros = new int[10];
		for(int i = 0; i < arrayInteiros.length; i++) {
			arrayInteiros[i] = new Random().nextInt(arrayInteiros.length);
		}
		System.out.println(Arrays.toString(arrayInteiros));
		
		int maior = 0, menor = 0, media = 0;
		for(int i = 0; i < arrayInteiros.length; i++) {
			if(arrayInteiros[i] > maior){
				maior = arrayInteiros[i];
			}
			if(arrayInteiros[i] < menor) {
				menor = arrayInteiros[i];
			}
			 media += arrayInteiros[i];
		}
		System.out.printf("%n Maior numero: %d", maior);
		System.out.printf("%n Menor numero: %d", menor);
		System.out.printf("%n Média: %d", media);

	}

}
