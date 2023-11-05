# 04. Modelo OSI e TCP/IP
*OSI*
O Modelo OSI é um modelo de rede de computador referência da ISO dividido em camadas de funções, criado em 1971 e formalizado em 1983, com objetivo de ser um padrão, para protocolos de comunicação entre os mais diversos sistemas em uma rede local, garantindo a comunicação entre dois sistemas computacionais.

*TCP/IP*
O TCP/IP é um conjunto de protocolos de comunicação entre computadores em rede. Seu nome vem de dois protocolos: o TCP e o IP.

## Modelo OSI
Open System Interconnection, o modelo OSI possue 7 camadas
* Camada 07 : Aplicação
> Nesta camada estão os aplicativos, nevagadores, protocolos de rede, dns, ssh, sftp.
* Camada 06 : Apresentação
> Esta camada é responsável por criptografar a conexão nos dois lados para permitir envio e recebimento seguro.
* Camada 05 : Sessão
> Podemos definir a camada de sessão como um acordo estabelecido sobre os detales da comunicação entre as partes envolvidas.
* Camada 04 : Transporte
> Também é responsável por fazer a conexão com o destino final. Utiliza os protocolos TCP/UDP.
* Camada 03 : Rede/Host
> Quando falamos da camada de Rede estamos nos referindo aos pacotes enviados pelos Roteadores que trafegam entre as redes com base nas tabelas de roteamento.
* Camada 02 : Enlace
> É na camada de enlace que os pacotes são fragmentados para serem transmitidos ao dispositivo de destino, conectados na rede. Utiliza os endereços físicos (mac address) dos equipamentos para realizar o envio.
* Camada 01 : Física
> Cabo, Placa de Rede, Switches e Roteadores.

## Modelo TCP/IP
Internet Protocol, o protocolo IP possue 4 camadas
* Camada 04 : Aplicação engloba { Aplicação, Apresentação, Sessão do modelo OSI }
* Camada 03 : Transporte
* Camada 02 : Internet { Rede/Host do modelo OSI }
* Camada 01 : Acesso a Rede { Física e Enlace do modelo OSI }
> Cabo, Placa de Rede, Switches e Roteadores.

# Protocolos TCP/UDP
## TCP
O protocolo TCP é utilizado quando precisamos garantir a entrega dos pacotes.
Nesse protocolo, os pacotes são reenviados, caso algum erro ocorra ou se não
houver confirmação de recebimento por parte do outro host.

## UDP
O protocolo UDP é utilizado para streams, fluxos de dados.