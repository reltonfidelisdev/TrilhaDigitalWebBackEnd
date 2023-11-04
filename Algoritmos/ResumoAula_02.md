# 02. Fluxos Simples, Sequencial

Para construir um algoritmo nós precisamos de uma sequência de passos bem definidos e explícitos.
De modo que a execução deve acontecer da quela forma.

Para o programador fazeir isso, ele deve instruir o computador, do jeito que ele conhece.
Para isso usamos as linguagens de programação.

Usando as linguagens de programação nós podemos conduzir a criação do bolo conforme a receita,
e garantir ou testar o resultado esperado, o bolo neste caso.

Para que o fluxo de processamento do algoritmo aconteça de forma esperada, precisamos saber
sobre entrada, processamento e saída.

Algoritmo para mostrar "Olá, " + o nome da pessoa:
Imprima "Iforme o seu nome: "; <- Saída para o mmonitor
> var nomePessoa = lerTeclado(); <- Entrada de teclado // Relton Lima
Imprima "Olá, " + nomePessoa; <- Saída para o monitor // Olá, Relton Lima 

## Algoritmo elaborado

> Início
* Imprimir mensagem inicial
* Pedir o nome da pessoa
* Armazenar o nome da pessoa
* Juntar o nome da pessoa ao texto "Olá, + NomeDaPessoa"
* Mostrar a frase montada
> final

## Teste de uso
> inicio
# Armazenamento
> Nome = 'Reton'
> saudacao = ', Bom dia!'
# Saida na tela            
* comando MOSTRAR"digite seu nome".toUperCase();
> DIGITE SEU NOME:   
* comando ESPERAR_DIGITACAO -> nome
* comando JUNTAR_TEXTO'Olá, ' -> nome -> saudacao
* comando MOSTRAR saudacao
> Olá, Relton, Bom dia!
* Finalizar
> Fim
