# 06. Git log e restore

## Curso Digital: Git

### Salvando alteração no Git

## Comando git log
Mostra um histórico dos commits feitos contendo o hash do commit,
o autor, data/hora e o conteúdo da linha alterada/adicionada/removida.
Exemplo de retorno do comando:
commit 000e3fa1788e1cb5152758ca99f4dd03a64163ae (HEAD -> main)
Author: Relton Fidelis <contato.reltonfidelis@gmail.com>
Date:   Fri Nov 3 23:59:55 2023 -0300
add new title

* Uso do comando restore
Uma vez que um arquivo está pronto para ir pro próximo commit, no status de staged,
podemos retornar para as mudançar anteriores, desfazendo as alterações e voltando
para o estágio "unmodified".
Exemplo:
* Para remover uma alteração na área do staged
git restore --staged .\caminho\do\arquivo\ResumoAula_06.md
* Para remover uma alteração na área do modified
git restore .\caminho\do\arquivo\ResumoAula_06.md
<<<<<<< HEAD

Removido isso
=======
>>>>>>> ba760e5a56a444ccd9cedd045a2404307c3e626a
