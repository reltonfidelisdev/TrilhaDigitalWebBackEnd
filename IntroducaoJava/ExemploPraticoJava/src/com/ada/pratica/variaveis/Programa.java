package com.ada.pratica.variaveis;

public class Programa{
    public static void main(String[] args){
        System.out.println("Inicio");
        if(args.length > 0){
            String nome = args[0].toUpperCase();
            System.out.printf("Pratica Aula 03. Desenvolvedor: %s%n", nome);
        }else{
            throw new ArrayIndexOutOfBoundsException("Falas ao acessar o vetor de argumentos. Array Index Out of Bounds");
        }
        System.out.println("Fim");
    }
}