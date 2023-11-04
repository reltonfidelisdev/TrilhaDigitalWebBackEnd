# 04. Decisão

Decições são representadas nos algoritmos como desvio de fluxo.
Imagine que precisamos determinar se uma pessoa pode tirar o título de eleitor.
Ora, é preciso ter idade maior ou igual a 16 anos para isso.
Isso constitui uma rega que desvia o fluxo de execução do programa.
Se o usuário informar algum número abaixo de 16 o probrama exibe uma mensagem
informando a idade mínima para tirar o título de eleitor e o fluxo se encerra/reinicia.
Senão o usuário é direcionado a um cartório eleitoral para tirar seu título eleitoral 
então o fluxo se encerra/reinicia.
> Esse controle é do tipo decisão(if/else)

Considere o algoritmo para avaliar a hora atual:<br>
INICIO<br>
  var nome, mensagem: String<br>
  VAR hora: INTEIRO<br>
  hora = system.getTimeInstance.getHora();
  // se hora >= 0 && hora < 12 <br>
  mensagem = "Bom dia "<br>
  MOSTRAR mensagem, nome, hora<br>
  // senao se hora >= 12 && hora < 18<br>
  mensagem = "Boa tarde "<br>
  MOSTRAR mensagem, nome, hora<br>
  // senao se hora >= 18 && <=24<br>
  mensagem = "Boa noite "<br>
  MOSTRAR mensagem, nome, hora<br>
  // senao<br>
  mensagem = "Hora inválida"<br>
  MOSTRAR mensagem, nome, hora<br>
FIM
