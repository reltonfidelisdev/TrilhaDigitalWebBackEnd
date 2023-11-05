# 07. Funções
As Funções em algoritmos são pedaços de código que são isolados de forma que o programador pode
incluir no fluxo de execulção sem precisar escrever novamente o a quela parte do código.

Considere a função soma(a, b) : INTEIRO
Quando precisar somar eu não preciso reescrever a função soma, apenas chamo(executo) ela no código;
Na medida em que os algoritmos vão se desenvolvendo, precisamos pensar na manutenção do código.
Se temos código repitido e precisar-mos dar manutenção nesse código, o trabalho pode se 10x mais demorado.

As funções são como sub-programas e se comportam como tal. 
Elas nos permitem resproveitar boa parte do código.


INICIO principal
    VAR listaNumeros ARRAY(INTEIROS)
    MOSTRAR "Vamos obter os numeros: "
    CHAMAR OBTER_NUMEROS -> listaNumeros
    MOSTRAR "Agora, mostrar os numeros: "
    MOSTRAR listaNumeros
FIM

INICIO OBTER_NUMEROS
    VAR listaNumerosFunc: ARRAY(INTEIRO)
    VAR numereo : INTEIRO
    ENQUANTO(listNumeros) MENOR_QUE 10
        MOSTAR "Digite um número inteiro: "
        ESPERAR_DIGITACAO -> numero
        ADICIONAR_ITEM NUMERO, listaNumerosFunc
    FIM ENQUANTO
    RETORNAR listaNumerosFunc
FIM OBTER_NUMEROS

Quando usamos funções nossos programas são divididos em pequenos módulos que tratam situações específicas e isoladas. Isso nos permite isolar comportamentos, testar comportamentos específicos facilitando o debug e a
correção de possíveis erros com mais agilidade.

A chance do programador se perder alterando um código grande é maior do que se precisar alterar um código
menor e com responsabilidades bem definidas.