# 04. Gravando mudanças no repositório

Os estados possíveis de um arquivo dentro de um repositório Git:
## Estados do Git
* Untracked:
O arquivo ainda não está sendo versionado.
* Unmodified:
O arquivo foi adicionado ao versionamento mas não houve nenhuma modificação desde a última alteração.
* Modified:
O arquivo foi alterado mas não está na área de staged, não foi guardado o estado do arquivo.
* Staged:
O arquivo está adicionado e será enviado no próximo commit.

### Comando git add
Informa ao Git que queremos guardar as alterações no arquivo. Muda o stado do arquivo para staged.

### Comando git status
Verifica em que estado se encontra o arquivos do projeto.