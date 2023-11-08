package com.ada.pratica.poojava;

public class Programa {

	public static void main(String[] args) {

		Animals cachorroUm = new Animals();
		cachorroUm.setNome("lily");
		cachorroUm.setCor("Caralemo");
		cachorroUm.setAltura(5);
		cachorroUm.setPeso(2.5);
		cachorroUm.setTamanhoRabo(5);
		
		System.out.printf("%n O nome do animal é %s.", cachorroUm.getNome()); // rex
		System.out.printf("%n O cachorro pegou uma %s.", cachorroUm.pegar()); // O cachorro pegou uma Bolinha.
		System.out.printf("%n O cachorro está %s.", cachorroUm.interagir("carinho")); // O cachorro está feliz.
		System.out.printf("%n O cachorro está %s.", cachorroUm.interagir("")); // O cachorro está neutro.
		System.out.printf("%n O cachorro está %s.", cachorroUm.interagir("vai dormir")); //  O cachorro está Bravo.
		System.out.printf("%n O cachorro está %s.", cachorroUm.interagir("pisar na patinha")); //  O cachorro está triste.
	}

}
