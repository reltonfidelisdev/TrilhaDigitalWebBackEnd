# 08. Exercício Completo (Pseudocódigo)
## Aplicação: Caixa Eletrônico
Consiste em um menu com as opções:
+ verificar saldo
+ fazer um depósito
+ fazer um saque
+ encerrar o programa

A única validação é: Se o saldo da conta estiver a baixo do valor do saque 
a pessoa não consegue fazer o saque.

INICIO principal
    VAR opcaoSelecionada: STRING
    VAR valor, saldo: INTEIRO
    VAR encerrarPrograma: BOOLEANO

    DEFINIR encerrarPrograma -> Falso

    ENQUANTO encerrarPrograma IGUAL_A Falso
        CHAMAR MOSTRAR_MENU -> opcaoSelecionada
            SE opcaoSelecionada IGUAL_A a
                MOSTRAR "Seu saldo é: ", saldo
                OU_SE opcaoSelecionada IGUAL_A b
                    MOSTRAR "Digite o valor a depositar: "
                    ESPERA_DIGITACAO -> valor
                    SOMAR valor, saldo -> saldo
                    MOSTRAR "Deposito efetuado. Novo saldo: ", saldo
                OU_SE opcaoSelecionada IGUAL_A c
                    MOSTRAR "Digite o valor a retirar: "
                    ESPERAR_DIGITACAO -> valor
                    SE valor MAIOR_QUE saldo
                        MOSTRAR "Saque não permitido, saldo insuficiente"
                    SENAO
                        SUBTRAIR valor, saldo -> saldo
                    FIM SE
                    MOSTRAR "Saque Efetuado."
                OU_SE opcaoSelecionada IGUAL_A d
                    DEFINIR Verdadeiro -> encerrarPrograma
                SENAO 
                    MOSTRAR "Opção inválida, tente novamente"
            FIM SE

    FIM ENQUANTO
FINAL

INICIO MOSTRAR_MENU
    VAR opcaoSelecionada: STRING
    MOSTRAR "Menu de operações"
    MOSTRAR "[a] Mostrar Saldo"
    MOSTRAR "[b] Efetuar Depósito"
    MOSTRAR "[c] Efetuar Saque"
    MOSTRAR "[d] Finalizar"
    ESPERA_DIGITACAO -> opcaoSelecionada
FIM MOSTRAR_MENU
