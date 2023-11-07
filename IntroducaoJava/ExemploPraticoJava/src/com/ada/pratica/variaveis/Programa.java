package com.ada.pratica.variaveis;

public class Programa{
    public static void main(String[] args){
        System.out.println("Inicio");
        if(args.length > 0){
            String nome = args[0].toUpperCase();
            System.out.printf("Pratica Aula 03. Desenvolvedor: %s%n", nome);
        }else{
            System.err.println("Falas ao acessar o vetor de argumentos.");
            System.err.println("Voce precisa informar seu nome!");
        }
        
        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        System.out.printf("Soma de a + b = %");
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        
        
        System.out.println("Material Oficial Java Oracle:");
        System.out.println("https://docs.oracle.com/javase/tutorial/reallybigindex.html");
        System.out.println("Fim");
    }
}