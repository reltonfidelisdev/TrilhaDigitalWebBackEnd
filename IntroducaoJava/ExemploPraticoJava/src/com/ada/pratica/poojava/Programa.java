package com.ada.pratica.poojava;

public class Programa {

	public static void main(String[] args) {

		Animals cachorroUm = new Animals();
		cachorroUm.nome			= "Puppy";
		cachorroUm.cor			= "Marron";
		cachorroUm.altura		= 25;
		cachorroUm.peso			= 5.5;
		cachorroUm.tamanhoRabo	= 5;
		
		cachorroUm.latir(); // AU AU
		System.out.printf("%n O cachorro pegou uma %s.", cachorroUm.pegar()); // O cachorro pegou uma Bolinha.
		System.out.printf("%n O cachorro está %s.", cachorroUm.interagir("carinho")); // O cachorro está feliz.
		System.out.printf("%n O cachorro está %s.", cachorroUm.interagir("")); // O cachorro está neutro.
		System.out.printf("%n O cachorro está %s.", cachorroUm.interagir("vai dormir")); //  O cachorro está Bravo.
	}

}
