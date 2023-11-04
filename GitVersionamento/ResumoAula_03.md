# 03. Repositórios do Git

Os repositórios do Git podem ser local ou remoto.
## Repositório remoto
Para utilizar um repositório remoto devemos primeiro clonar ele na nossa máquina.
No GitHub podemos clonar um repositótio de algumas formas, através do comando:
git clone 
* Usando HTTPS (Mais utilizado)
Ex: https://github.com/reltonfidelisdev/TrilhaDigitalWebBackEnd.git
* Usando SSH
Ex: git@github.com:reltonfidelisdev/TrilhaDigitalWebBackEnd.git
* Usando GitHub CLI
Ex: gh repo clone reltonfidelisdev/TrilhaDigitalWebBackEnd

## Repositório local
Para iniciar o vercionamento com o Git em uma pasta devemos usar o comando:
git init dentro da pasta que queremos iniciar o versionamento.
Sabemos que uma pasta está usando versionamento com Git quando
dentro dela existe uma pasta oculta com o nome .git.