package com.ada.pratica.tiposprimitivos;

// Algoritmo: Mostra valores mínimos e máximos suportados pelos tipos primitivos do Java 
public class Programa {

	public static void main(String[] args) {
		System.out.println("Inicio Tipos primitivos para inteiros: \n");
		byte varByte[] = { Byte.MIN_VALUE, Byte.MAX_VALUE };
		System.out.println("O valor mínimo permitido para o tipo Byte é: " + varByte[0]);
		System.out.println("O valor máximo permitido para o tipo Byte é: " + varByte[1]);
		System.out.println("--");
		short varShort[] = { Short.MIN_VALUE, Short.MAX_VALUE };
		System.out.println("O valor mínimo permitido para o tipo Short é: " + varShort[0]);
		System.out.println("O valor máximo permitido para o tipo Short é: " + varShort[1]);
		System.out.println("--");
		int varInt[] = { Integer.MIN_VALUE, Integer.MAX_VALUE };
		System.out.println("O valor mínimo permitido para o tipo Int é: " + varInt[0]);
		System.out.println("O valor máximo permitido para o tipo Int é: " + varInt[1]);
		System.out.println("--");
		long varLong[] = { Long.MIN_VALUE, Long.MAX_VALUE };
		System.out.println("O valor mínimo permitido para o tipo Long é: " + varLong[0]);
		System.out.println("O valor máximo permitido para o tipo Long é: " + varLong[1]);
		System.out.println("Fim Tipos primitivos para inteiros: ");
		System.out.println("");
		System.out.println("Inicio Tipos primitivos para real: ");
		System.out.println("--");
		float varFloat[] = { Float.MIN_VALUE, Float.MAX_VALUE };
		System.out.println("O valor mínimo permitido para o tipo Float é: " + varFloat[0]);
		System.out.println("O valor máximo permitido para o tipo Float é: " + varFloat[1]);
		System.out.println("--");
		double varDouble[] = { Double.MIN_VALUE, Double.MAX_VALUE };
		System.out.println("O valor mínimo permitido para o tipo Double é: " + varDouble[0]);
		System.out.println("O valor máximo permitido para o tipo Double é: " + varDouble[1]);
		System.out.println("--");
		System.out.println("Fim Tipos primitivos para real: ");
		System.out.println("");
		System.out.println("Inicio Tipos primitivos para char: ");
		char varChar[] = { Character.MIN_VALUE, Character.MAX_VALUE }; // '\u0000', '\uFFFF'
		System.out.println("O valor mínimo permitido para o tipo Char é: " + varChar[0]);
		System.out.println("O valor máximo permitido para o tipo Char é: " + varChar[1]);
		System.out.println("Fim Tipos primitivos para char: ");
		System.out.println("");
		System.out.println("Inicio Tipos primitivos para boolean: ");
		boolean varBoolean[] = { Boolean.FALSE, Boolean.TRUE };
		System.out.println("O valor mínimo permitido para o tipo Boolean é: " + varBoolean[0]);
		System.out.println("O valor máximo permitido para o tipo Boolean é: " + varBoolean[1]);
		System.out.println("--");
		System.out.println("Fim Tipos primitivos para boolean: ");
		System.out.println("");
	}
}
