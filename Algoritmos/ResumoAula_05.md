# 05. Repetição
A Repetição em algoritmos é equivalente as estruturas de loop nas linguagens de programação.
O loop é uma estrutura de repetição que avalia uma condição.
Imagine que você precisa executar um loop e testar, a cada passada, se a variável "xVeses" é >= 5.
Ex:
inicio
para (int xVezes = 0; xVezes >= 5 ; xVeses++) faca
    boolean teste = (xVezez >= 5 ? true : false);
    imprima xVezes, teste;
fim para

O loop também pode ficar executando enquanto uma condição (é/não é) satisfeita.
Ex:
incio
VAR b = true : BOOLEAN;
VAR c = 0 : INTEGER;
    enquanto(b != false) faca
        // se c == 100 paca
            pare;
        // fim se
    c = c + 1
    fim enquanto
fim

Também os loops podem ser do tipo onde temos tipos predefinidos de valores s serem testados.
Ex: switch/desvio
Inicio
VAR x = (int)Math.PI
devio(x){
    caso 1 : imprima "Desvio caso x == 1"
    pare
    caso 2 : imprima "Desvio caso x == 2"
    pare
    caso 3 : imprima "Desvio caso x == 3"
    pare
    default : imprima "Valor de x = ", x
}