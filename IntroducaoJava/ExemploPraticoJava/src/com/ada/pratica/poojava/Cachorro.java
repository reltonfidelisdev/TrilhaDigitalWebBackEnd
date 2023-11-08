package com.ada.pratica.poojava;

public class Cachorro extends Animals {

	// Variables
	private int tamanhoRabo;
	protected double peso;
	// Methods
	protected String latir(String latido) {
		return latido;
	}
	@Override
	protected void doSleep() {
		System.out.println("Cachorro dormindo.");
	}
	@Override
	protected void doSound() {
		System.out.println("WOLF, WOLF");
	}
	
	@Override
	protected void doEat() {
		super.doEat();
		System.out.println("Come Ração");
	}
}
