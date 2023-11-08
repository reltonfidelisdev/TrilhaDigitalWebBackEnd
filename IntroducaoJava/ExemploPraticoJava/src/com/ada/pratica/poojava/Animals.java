package com.ada.pratica.poojava;

public class Animals {

	String nome;
	String cor;
	int altura;
	double peso;
	int tamanhoRabo;
	public String estadoEapirito;
	
	public void comer() {};
	
	public void latir() {
		System.out.println(" AU AU");
	}
	
	public String pegar() {
		return "Bolinha";
	}
	
	public String interagir(String acao) {
		if (acao.equals("carinho")) {
			return this.estadoEapirito = "feliz";
		}else if(acao.equals("vai dormir")){
			this.estadoEapirito = "Bravo";
		}else if(acao.equals("pisar na patinha")){
			this.estadoEapirito = "Triste";
			latir();
		}
		else {
			this.estadoEapirito = "neutro";
		}
		return estadoEapirito;
	}
}
