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
		
		switch(acao){
		case "carinho" : this.estadoEapirito = "feliz";
		break;
		case "vai dormir" : this.estadoEapirito = "Bravo";
		break;
		case "pisar na patinha" : this.estadoEapirito = "feliz";
		break;
		default : this.estadoEapirito = "neutro";
		}
		
		return estadoEapirito;
	}
}
