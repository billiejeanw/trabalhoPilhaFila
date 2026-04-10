# trabalhoPilhaFila
Implementação de Pilha e Fila em Java
projeto criado para demostrar funcionamento de duas estruturas: pilha e fila usando java puro.
Usando arrays como estrutura de armazenamento, com objetivo de mostrar o controle e remoçao de indices.

Pilha (Stack)
A pilha segue a lógica LIFO (Last In, First Out), onde o último elemento a entrar é obrigatoriamente o primeiro a sair. 
Controle: Realizado pela variável `topo`.
Operações: `push` (inserir), `pop` (remover), `peek` (visualizar topo), `isEmpty` e `isFull`.

Fila (Queue)
A fila segue a lógica FIFO (First In, First Out), onde o primeiro elemento a entrar é o primeiro a ser removido.
- Controle: Realizado pelas variáveis `inicio`, `fim` e `total`.
- Diferencial: Implementada como Fila Circular, permitindo o reaproveitamento de espaços vazios no array de forma eficiente.
- Operações `enqueue` (inserir), `dequeue` (remover), `front` (visualizar primeiro), `isEmpty` e `isFull`.

- video: https://youtu.be/DT0TmsDT73k
