package com.ada.pratica.tiposprimitivos;

// Algoritmo: Mostra valores mínimos e máximos suportados pelos tipos primitivos do Java 
public class Programa {

	public static void main(String[] args) {
		System.out.println("Tipos primitivos para inteiros: ");
		System.out.println("--");
		byte  varByte[]  = {Byte.MIN_VALUE, Byte.MAX_VALUE}; 
		System.out.println("O valor mínimo permitido para o tipo Byte é: " + varByte[0]);
		System.out.println("O valor máximo permitido para o tipo Byte é: " + varByte[1]);
		System.out.println("--");
		short varShort[] = {Short.MIN_VALUE, Short.MAX_VALUE};
		System.out.println("O valor mínimo permitido para o tipo Short é: " + varShort[0]);
		System.out.println("O valor máximo permitido para o tipo Short é: " + varShort[1]);
		System.out.println("--");
		int   varInt[]   = {Integer.MIN_VALUE, Integer.MAX_VALUE};
		System.out.println("O valor mínimo permitido para o tipo Int é: " + varInt[0]);
		System.out.println("O valor máximo permitido para o tipo Int é: " + varInt[1]);
		System.out.println("--");
		long  varLong[]  = {Long.MIN_VALUE,Long.MAX_VALUE};
		System.out.println("O valor mínimo permitido para o tipo Long é: " + varLong[0]);
		System.out.println("O valor máximo permitido para o tipo Long é: " + varLong[1]);
		
		
		
	}
}
