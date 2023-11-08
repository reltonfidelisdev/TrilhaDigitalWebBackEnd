package com.ada.pratica.operadores;

public class Programa {

	public static void main(String[] args) {
		
		// Opreações com booleanos
		boolean fimDeSemana = true, fazendoSol = true;
		boolean partiuPraia = fimDeSemana && fazendoSol;
		
		/**
		 *  Tabela verdade
		 *  
		 *  Operador && (AND)
		 *  true  && true = true
		 *  true  && false = false
		 *  false && true = false
		 *  false && false false
		 */
		System.out.println( partiuPraia ? "#Partiu!" : "#DeuRuim!" );
		
		/**
		 * Tabela verdade
		 * 
		 * Operador || (OR)
		 * true  || true = true
		 * true  || false = true
		 * false || true = true
		 * false || false = false
		 */
		partiuPraia = (fimDeSemana == false && fazendoSol == true);
		System.out.println( partiuPraia ? "#Partiu!" : "Nao eh fim de semana!" );
		
		

	}

}
