07. Domínios, DNS e latência

Os endereços IP são endereços dos computadores na rede local/internet/intranet.
Em algumas redes temos serviços sendo servidos na rede como DNS (Domain Name System), WEB (Aplicações Web) etc.
Para acessar estes serviços é necessários conhecer o endereço do servidor que provê tal serviço.
## DNS 
Nós, meros mortais não somos muito eficientes em lembrar números grandes como um endereço IP.
Para resolver esse problema criamos o protocolo dns, que converte/traduz/aponta um "domínio" para um IP.
## Domínio
Um domínio é o nome que escolhemos usar como "apelido" de determinado IP.
## Latência
A latência está relacionada a quantidade de roteadores que um pacote precisa saltar até encontrar um destino.
Quato mais saltos, maior a latência.
Podemos resolver problemas com latência adicionando dispositivo de cache em pontos estratégicos da rede.
## CDN
Content Delivery Network ou CDN é uma rede de servidores de arquivos criada com o objetivo de dimuir a latência nas conexões à internet.
CDN cria cópias de conteúdos em locais mais próximos dos internautas para otimizar a conexão e o comunsumo de conteúdo online.

Imagine que você contratou um servidor vpn na aws, na região de xOhio, onde hospeda o site da sua empresa.
Um cliente do Brasil que acessa seu site dá vários saltos até chegar no ip de host lá em xOhio.
O CDN age criando cópias em datacenters mais próximos dos usuários do seu site servindo a eles uma cópia do seu site que está em cache no CDN, caso seu site implemente essa tecnologia.