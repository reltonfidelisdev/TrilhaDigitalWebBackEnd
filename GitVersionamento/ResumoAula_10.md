# 10. Merging branches
Como falado, fazer um merge, é juntar ramificações ou branches.
Estando eu na branch "main"
Para unir o conteúdo da branch testing usamos o comado git merge testing.
Neste momento podem haver conflitos, por exemplo, duas pessoas alteraram a mesma linha do mesmo arquivo.
Caso isso ocorra, o retorno do comando será algo paracedo com o exemplo abaixo:
> git merge testing
CONFLICT (content): Merge conflict in GitVersionamento/ResumoAula_09.md
Automatic merge failed; fix conflicts and then commit the result.

O programador deve inpecionar o arquivo e decidir sobre conteúdo que vai manter antes de fazer o merge.