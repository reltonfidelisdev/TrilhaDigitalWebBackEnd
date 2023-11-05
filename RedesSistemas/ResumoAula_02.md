# 02. Infraestrutura de redes e os principais equipamentos

As redes de computadores funcionam baseadas em equipamentos de hardware e
infraestrutura de cabeamento, fibra óptica além de poderem se conectarem
atravez das redes wireless.

Os computadores comportam dispositivos de rede integrado capaz de se conectarem
em redes cabeadas e wireless.

As placas NIC (Network Interface Card) são responsáveis por tal conexão em redes
locais e na internet.
Utilizando o padrão Ethernet, estas placas podem transmitir e receber dados utilizando
cabos par trançado (padrão RJ45) ou sinal wireless 2.4 GHz e 5 GHz.

As NICs dispõem de dois endereços, um físico (mec address) e outro lógico (endereço ip).
Essas placas operam sobre o protocolo TCP/IP e implementam o padrão IEEE802/11 no caso de redes wireless.

O endereço mac é essencial para a comunicação com aparelhos que operam em modo bridge na rede.

## Hub
A ideia do Hub era ser um centralizador de equipamentos de rede.
Ele dispõe de entradas RJ45 e várias portas, conectando e permitindo que os computadores
da rede possam se comunicar.
O Hub replica as mensagens para todas as portas, dessa forma, não é possível garantir a confidencialidade
dos dados, uma vez que é replicado em todas as portas e os computadores conectadors a essas portas recebem
uma cópia de todo o trávego. Transmite em broadcast.

## Switch
É o hardwade essencial para comunicação entre redes e veio para substituir o Hub.
Responsável pela comutação dos quadros entre os dispositivos, podemos definir comutação como troca
ou encaminhamento de informação.
Equipamentos profissionais costumam ter 24 ou 48 portas e ultra capacidades de transmissão.

## Roteador
É responsável por permitir comunicação por um caminho específico na rede.
Uma rota para a internet passa por um roteador.
A internet é uma enorme rede de roteadores e switches.
Ele tem a responsabilidade de procurar as melhores rotas na internet para entregar os pacotes do
remetente ao destinatário no menor tempo possível.

## Modem
É o equipamento responsável pela modulação e demodulação do sinal de Internet.
Normalmente é fornecido em regime de comodato pelas empresas de telecomunicações.
Este equipamento autentica seu serviço de acesso banda larga fornecido pela Oi, Vivo, Tim...
Os roteadores atuais podems atuar como modem para se autenticar na operadora e modens tem funções de roteamento.
O ISP (Provedor de Internet) provê o cabeamento até o local junto com o aparelho.
O Cabeamnento pode ser:
* Cabo Coaxial
* Par trançado
* Fibra óptica
* Rádio frequência