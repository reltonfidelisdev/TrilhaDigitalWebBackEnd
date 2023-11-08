package com.ada.pratica.poojava;

public class Programa {

	public static void main(String[] args) {

		Animals cachorroUm = new Animals();
		cachorroUm.nome			= "Puppy";
		cachorroUm.cor			= "Marron";
		cachorroUm.altura		= 25;
		cachorroUm.peso			= 5.5;
		cachorroUm.tamanhoRabo	= 5;
		
		cachorroUm.latir();
		System.out.println(cachorroUm.pegar());
	}

}
