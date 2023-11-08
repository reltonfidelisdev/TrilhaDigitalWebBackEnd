package com.ada.pratica.funcoes;

import java.util.Random;

public class Program {

	static String nome = "Relton";
	public static void main(String[] args) {
		
		saudacao(nome);
		int result = soma( 2, 3);
		System.out.println(result);
	}

	private static int soma(int i, int j) {
		return i + j;
	}

	public static void saudacao(String nome) {
		System.out.println("Hello " + nome );
	}
}
