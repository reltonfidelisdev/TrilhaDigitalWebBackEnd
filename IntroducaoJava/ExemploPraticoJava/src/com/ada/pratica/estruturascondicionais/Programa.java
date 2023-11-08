package com.ada.pratica.estruturascondicionais;

public class Programa {

	public static void main(String[] args) {

		// Comando if(condicao){execute}else{execute}
		int nota = 70;
		char graduacao = '\u0000';

		// Comando if encadeado:
		// A80 B70 C60 D0
		if (nota >= 80) {
			graduacao = 'A';
		}else if(nota < 80 && nota >= 70) {
			graduacao = 'B';
		}else if(nota < 70 && nota >= 60) {
			graduacao = 'C';
		}else if(nota >= 60 && nota >= 0) {
			graduacao = 'D';
		}else {
			System.out.println("Nota inválida!");
		}
		// Comando switch(value){case ?: execute(); break; default: executeDefault()}
		switch(graduacao) { 
		case 'A' :
		case 'B' : 
			System.out.println("Aluno Aprovado!");
			break;
		case 'C' : 
		case 'D' :
			System.out.println("Não aprovado");
		default :
			System.out.println("Graduação inálida");
		}

	}

}
