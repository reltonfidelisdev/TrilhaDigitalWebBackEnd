# 06. Cálculo de sub rede
192.168.10.1   = 11000000.10101000.00001010.00000001 // gateway

128 64  32  16  8   4   2   1
2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0

192.168.10     = Endereço de Rede
1 -> 254       = Endereços de Hosts disponíveis na Rede.
255.255.255.0  = Máscara de sub-rede
192.168.10.255 = Endereço de broadcast


Fórmula hosts de redes: 2^b-2
> 2^8-2 = 254 Hosts

Site de ajuda para cálculo de sub-redes
https://www.site24x7.com
https://www.site24x7.com/tools/ipv4-subnetcalculator.html