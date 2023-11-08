package com.ada.pratica.lacosnumericos;

public class Program {

	public static void main(String[] args) {
		System.err.println("Início da Tabuaba");
		for(int i = 0 ; i <= 10 ; i++) {
			System.out.printf("%n************** Tabuada do %d **************%n", i);
			for(int j = 1; j <= 10; ++j) {
				if(i % 2 != 0) {
					// tabuada impar em vermelho
					System.err.println("\t\t" + j + " x " + i + " = " + j * i );	
				}else {			
					// tabuada par em preto
					System.out.println("\t\t" + j + " x " + i + " = " + j * i );
				}
			}
		}
		System.err.println("Fim da Tabuada");
	}
}
