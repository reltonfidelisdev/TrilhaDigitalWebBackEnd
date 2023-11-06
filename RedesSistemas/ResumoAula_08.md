# 08. Principais comandos de configuração
## Comandos do Windows
## Comando ipconfig
> Configuração de IP do Windows
// Saída do comando ipconfig
Adaptador Ethernet Ethernet: // Placa de Rede 

   Estado da mídia. . . . . . . . . . . . . .  : mídia desconectada
   Sufixo DNS específico de conexão. . . . . . :

Adaptador Ethernet Ethernet 2: // Placa de Rede

   Sufixo DNS específico de conexão. . . . . . :
   Endereço IPv6 de link local . . . . . . . . : fe80::4a5a:6b08:a0ab:c514%11
   Endereço IPv4. . . . . . . .  . . . . . . . : 192.168.42.80
   Máscara de Sub-rede . . . . . . . . . . . . : 255.255.255.0
   Gateway Padrão. . . . . . . . . . . . . . . : 192.168.42.129

# Comando Ping
ping google.com
> teste de comunicação entre hosts
Disparando google.com [142.251.135.46] com 32 bytes de dados:
Resposta de 142.251.135.46: bytes=32 tempo=72ms TTL=118
Resposta de 142.251.135.46: bytes=32 tempo=66ms TTL=118
Esgotado o tempo limite do pedido.
Resposta de 142.251.135.46: bytes=32 tempo=76ms TTL=118       

Estatísticas do Ping para 142.251.135.46:
    Pacotes: Enviados = 4, Recebidos = 3, Perdidos = 1 (25% de
             perda),
Aproximar um número redondo de vezes em milissegundos:
    Mínimo = 66ms, Máximo = 76ms, Média = 71m

# Comando tracert
> Mapea quantos saltos um pacote dará até chegar ao destino
// Retorno do comando
> tracert google.com
Rastreando a rota para registro.br [200.160.2.3]
com no máximo 30 saltos:

  1     3 ms     2 ms     2 ms  192.168.42.129 
  2     *        *        *     Esgotado o tempo limite do pedido.
  .
  .
  .
  ...
 11     *        *        *     Esgotado o tempo limite do pedido.
 12   130 ms    76 ms    78 ms  as22548.saopaulo.sp.ix.br [187.16.217.2] 
 13   105 ms    83 ms    77 ms  xe-0-1-3-61.core1.nu.registro.br [200.160.0.158] 
 14    78 ms    77 ms    75 ms  xe-0-0-0.ar1.jd.registro.br [200.160.0.241] 
 15    92 ms    78 ms    88 ms  registro.br [200.160.2.3] 

Rastreamento concluído.
# Comando rute PRINT
===========================================================================
Lista de interfaces
  8...78 2b cb bd fe 73 ......Intel(R) 82579LM Gigabit Network Connection
 11...e2 40 d3 99 14 5d ......Remote NDIS based Internet Sharing Device
  1...........................Software Loopback Interface 1
===========================================================================

Tabela de rotas IPv4
===========================================================================
Rotas ativas:
Endereço de rede          Máscara   Ender. gateway       Interface   Custo
          0.0.0.0          0.0.0.0   192.168.42.129    192.168.42.80     25
        127.0.0.0        255.0.0.0      No vínculo         127.0.0.1    331
        127.0.0.1  255.255.255.255      No vínculo         127.0.0.1    331
  127.255.255.255  255.255.255.255      No vínculo         127.0.0.1    331
     192.168.42.0    255.255.255.0      No vínculo     192.168.42.80    281
    192.168.42.80  255.255.255.255      No vínculo     192.168.42.80    281
   192.168.42.255  255.255.255.255      No vínculo     192.168.42.80    281
        224.0.0.0        240.0.0.0      No vínculo         127.0.0.1    331
        224.0.0.0        240.0.0.0      No vínculo     192.168.42.80    281
  255.255.255.255  255.255.255.255      No vínculo         127.0.0.1    331
  255.255.255.255  255.255.255.255      No vínculo     192.168.42.80    281
===========================================================================
Rotas persistentes:
  Nenhuma

Tabela de rotas IPv6
===========================================================================
Rotas ativas:
 Se destino de rede de métrica      Gateway
  1    331 ::1/128                  No vínculo
 11    281 fe80::/64                No vínculo
 11    281 fe80::4a5a:6b08:a0ab:c514/128
                                    No vínculo
  1    331 ff00::/8                 No vínculo
 11    281 ff00::/8                 No vínculo
===========================================================================
Rotas persistentes:
  Nenhuma

## Comandos do Linux/Unix/BSD/MacOS
> ifconfig / ip
## Comando netstat
> Mostra uso de conexões e portas ativas
// Retorno do comando
Conexões ativas

  Proto  Endereço local         Endereço externo       Estado
  TCP    192.168.42.80:57270    a23-45-15-115:https    ESTABLISHED
  TCP    192.168.42.80:57276    204.79.197.222:https   ESTABLISHED
  TCP    192.168.42.80:57436    52.226.139.180:https   ESTABLISHED
  TCP    192.168.42.80:57508    rio09s05-in-f10:https  ESTABLISHED
  TCP    192.168.42.80:57604    13.107.3.254:https     ESTABLISHED
  TCP    192.168.42.80:57606    13.107.246.33:https    ESTABLISHED
  TCP    192.168.42.80:58232    lb-140-82-112-26-iad:https  ESTABLISHED
  TCP    192.168.42.80:58257    rio07s07-in-f3:http    ESTABLISHED
  TCP    192.168.42.80:58258    186.228.52.45:https    ESTABLISHED
  TCP    192.168.42.80:58261    rio07s04-in-f10:https  ESTABLISHED
  TCP    192.168.42.80:58262    186.228.52.45:https    ESTABLISHED
  TCP    192.168.42.80:58264    186.228.52.45:https    CLOSE_WAIT
  TCP    192.168.42.80:58265    186-230-50-76:https    ESTABLISHED
  TCP    192.168.42.80:58266    186-230-50-76:https    ESTABLISHED
  TCP    192.168.42.80:58267    13.78.111.198:https    ESTABLISHED