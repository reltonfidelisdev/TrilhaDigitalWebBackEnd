package com.ada.pratica.poojava;

public class Animals {

	// Fields
	protected String nome;
	protected String cor;
	protected int altura;
	protected double peso;
	protected String estadoEspirito;
	// Methods
	protected void doEat() {}
	protected void doSleep() {}
	protected void doSound() {}
	@Override
	public String toString() {
		return "Animals [nome=" + nome + ", cor=" + cor + ", altura=" + altura + ", peso=" + peso + ", estadoEspirito="
				+ estadoEspirito + "]";
	}
	
	


}
