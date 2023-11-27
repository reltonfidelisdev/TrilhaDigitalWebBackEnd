# 04. Decisão

Decisões são representadas nos algoritmos como desvio de fluxo.
Imagine que precisamos determinar se uma pessoa pode tirar o título de eleitor.
Ora, é preciso ter idade maior ou igual a 16 anos para isso.
Isso constitui uma rega que desvia o fluxo de execução do programa.
Se o usuário informar algum número abaixo de 16 o probrama exibe uma mensagem
informando a idade mínima para tirar o título de eleitor e o fluxo se encerra/reinicia.
Senão o usuário é direcionado a um cartório eleitoral para tirar seu título eleitoral 
então o fluxo se encerra/reinicia.
> Esse controle é do tipo decisão(if/else)

Considere o algoritmo para avaliar a hora atual:
INICIO
  var nome, mensagem: String
  VAR hora: INTEIRO
  hora = system.getTimeInstance.getHora()
  // se hora >= 0 && hora < 12 
  mensagem = "Bom dia "
  MOSTRAR mensagem, nome, hora
  // senao se hora >= 12 && hora < 18
  mensagem = "Boa tarde "
  MOSTRAR mensagem, nome, hora
  // senao se hora >= 18 && <=24
  mensagem = "Boa noite "
  MOSTRAR mensagem, nome, hora
  // senao
  mensagem = "Hora inválida"
  MOSTRAR mensagem, nome, hora
FIM
