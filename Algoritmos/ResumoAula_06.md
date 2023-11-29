# 06. Listas/Arrays
> Arrays são variáveis mais avançadas que são capazes de guardar não um único valor, mas vários.
>> Arrays são Listas com uma característica que é: Armazenar os valores conforme eles são colocados na lista.
Algumas linguagens permitem que as listas recebam valores de tipos de dados diferentes outras não.
Ex: 
VAR v = INTEGER : VETOR[10]
v[0] = "String"
v[1] = Math.PI
v[2] = (int)v[1]++

Para nossos exemplos, assumimos que nossos Arrays permite apenas valores do mesmo tipo.
> No próximo exemplo, vamos registrar os primeiros 20 numeros que são divisiveis por 2 ou por 5,
> e mostrar depois estes numeros.

INICIO principal
    VAR listaNumeros: LISTA(INTEIRO)
    VAR numeroAtual: INTEIRO

    DEFINIR -> numeroAtual

    ENQUANTO(QUANTIDADE_ITENS(listaNumetos) MENOR QUE 20) faca
        SE (RESTO(DIVISAO(numeroAtual, 2)) IGUAL A 0) OU (RESTO(DIVISAO(numeroAtual, 5)) IGUAL A 0)
            ADICIONAR_ITEM numeroAtual, listaNumeros
        FIM SE
        DEFINIR numeroAtual + 1 -> numeroAtual
    FIM ENQUANTO

    MOSTAR listaNumeros

    PARA CADA item EM listaNumeros
        SE (RESTO(DIVISAO(item, 2)) IGUAL a 0)
            MOATRAR "Numero", item , " é par"
        SENAO
            MOATRAR "Numero", item , " é ímpar"
        FIM SE
    FIM PARA
FIM

> Quando precisamos acessar o valor de um item da lista, normalmente referenciamos com o nome da variável,
seguido de colchetes.
>> Quando falamos na estrutura da lista, precisamos entender que os índices sempre começam em 0 e não em 1;
>>> listaNumeros[0] representa a primeita posição da lista, listNumeros[19] a última.
>>>> Com isso temos que a 10ª posição da lista é listNumeros[9]
