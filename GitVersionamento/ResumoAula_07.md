# 07. Repositórios remotos

Os repositórios remotos do Git podem ser compartilhados permitindo que outras pessoas
possam contribuir com o projeto.

A implementação mais famosa do Git online é o GitHub, atualmente a maior plataforma
de código hospedado. Outros exemplos são Bitbucket e GitLab.
Atualmente os programadores usam a plataforma do GitHub como forma de currículo ou portifólio.
Essas plataformas dispõem de recursos avaçados de restrição e segurança ao código ao mesmo tempo que permitem o compartilhamento e a contruibuição parecer simples como compartilhar uma pasta.

## Comando git push
Após o desenvolvedor fazer o commit no versionamento local do Git na máquena dele,
é possível salvar as alterações em forma de check-point e enviar para o repositório remoto.

Para enviar arquivos para o repositório remoto precisamos saber para qual origem queremos enviar
git remote //origin

Além da origem para onde vamos enviar, precisamos saber para qual branch. No meu caso a branch main.
comando para enviar ao repositório Git remoto:
git push origin main
* Retorno do comando:
Enumerating objects: 10, done.
Counting objects: 100% (10/10), done.
Delta compression using up to 4 threads
Compressing objects: 100% (7/7), done.
Writing objects: 100% (8/8), 1006 bytes | 1006.00 KiB/s, done.
Total 8 (delta 4), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (4/4), completed with 2 local objects.
To https://github.com/reltonfidelisdev/TrilhaDigitalWebBackEnd.git
   e8caf3a..1c59233  main -> main

## Comando git pull
O comando git pull é usado quando queremos trazer tudo do repositório remoto
para nossa máquina, sobrescrevendo o estado atual.
Isso significa que, se o arquivo remoto têm uma linha de código e o local têm
100 linhas, o remoto vai sobrascrever o local, deixando-o com apenas uma linha.
### Por isso devemos ter cautela ao utilizar este comando.

## Comando git fetch
O comango git fetch é usado para trazer apenas as modificações do repositório remoto 
para local, sem sobrescrever as mudanças para que posamos ver e decidir antes de savar.
git fetch
* Retorno do comando:
remote: Enumerating objects: 7, done.
remote: Counting objects: 100% (7/7), done.
remote: Compressing objects: 100% (4/4), done.
remote: Total 4 (delta 3), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (4/4), 894 bytes | 7.00 KiB/s, done.
From https://github.com/reltonfidelisdev/TrilhaDigitalWebBackEnd
   e455bb6..973b98b  main       -> origin/main

## Comando git diff
O comando "git fetch" baixa as mudanças do repositório remoto.
O comando git diff é usado quando queremos verificar as mudanças entre arquivos.
O comando "git diff origin main" compara as mudanças entre o mesmo arquivo local e o remoto.