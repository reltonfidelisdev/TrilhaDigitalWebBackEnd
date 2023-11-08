package com.ada.pratica.poojava;

public class Animals {

	private String nome;
	private String cor;
	private int altura;
	private double peso;
	private int tamanhoRabo;
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == "lily") {
			this.nome = "rex";
		};
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getTamanhoRabo() {
		return tamanhoRabo;
	}

	public void setTamanhoRabo(int tamanhoRabo) {
		this.tamanhoRabo = tamanhoRabo;
	}

	public String getEstadoEapirito() {
		return estadoEapirito;
	}

	public void setEstadoEapirito(String estadoEapirito) {
		this.estadoEapirito = estadoEapirito;
	}

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
		case "pisar na patinha" : this.estadoEapirito = "triste";
		break;
		default : this.estadoEapirito = "neutro";
		}
		
		return estadoEapirito;
	}
}
