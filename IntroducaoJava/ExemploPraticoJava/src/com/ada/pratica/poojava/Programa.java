package com.ada.pratica.poojava;

import javax.management.remote.SubjectDelegationPermission;

public class Programa {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.nome = "Rex";
		cachorro.cor = "Caramelo";
		cachorro.altura = 10;
		cachorro.peso = 5.3;
		cachorro.estadoEspirito = "de boa";
		System.out.println("{{"+  cachorro.toString() +"}}");
		cachorro.doEat(); // Sobrescrita do método
		cachorro.doSound();
		cachorro.doSleep();
	}

}
