# 03. Tipos de Dados
Quando precisamos pedir um dado ao usuário, devemos garantir que
o tipo de dado fornecido pelo usuária seja compatível com aqules 
que o cumputador entende. Por exemplo: Inteiro i = 8; Real r = Math.PI; String s = "Relton";

+ O primeiro tipo de dado é o numérico
O computador costuma separa os tipos numéricos em dois tipos.
Os inteiros e os reais, decimais ou ponto flutuante (float).

+ Outro tipo de dado é o texto
Conhecido como sequencia de caracteres (ou cadeia de caracteres ou String)

O que aconteceria se, em seu programa, você solicitasse a idade da pessoa, e,
o usuário digitasse "bug!"?
O programador deve garantir que o dado informado seja do tipo esperado pelo computador
para que ele consiga realizar a operação.
> Inteiro idade = "deuRuim";
+ Uma vez que determinamos o tipo de uma variável, ela deve receber apenas valores desse tipo.
+ Existem casos, onde podemos converter os tipos dos dados, para outros tipos.
+ Mas isso depende da linguagem utilizada
> Float f = Float.MAX_VALUE; 
> f = (double) Math.PI;
> f = (int)f++;