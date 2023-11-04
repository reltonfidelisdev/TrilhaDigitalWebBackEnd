# 09. Git branch

As branchs (ramos ou galhos) podem ser usadas quando pecisamos dividir as tarevas do time.
Ex: Eu estou na branch main, você fica na branch development e ela na bug-track.

Dessa forma abrimos uma ramificação em nosso código de forma que possamos unir todas as branches
formando novamente um único código de forma que o desenvolvimento em paralelo possa acontecer evitando o máximo de conflitos.

## Comando git branch
O comando git branch testing é usado para criar uma nova branch local chamada testing.

Existe um *ponteiro chamado HEAD que indica para qual branch o Git está apontando.
No meu caso, indca que está na "main" 

## Comando git log --oneline --decorate
90837aa (HEAD -> main)  (origin/main, origin/HEAD) 
Esse comando indica para onde o HEAD está apontando.
Usamos ele quando queremos saber para que branch vamos mandar as alterações.

## Comando git checkout
O comando git checkout testing faz o poneiro HEAD apontar para a branch testing, ou seja, 
muda para a nova branch criada.
