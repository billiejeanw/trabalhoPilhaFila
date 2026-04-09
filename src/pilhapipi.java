public class pilhapipi {
    private String[] blocos;
    private int topo;

    // define o tamanho da pilha
    public pilhapipi(int tamanho) {
        blocos = new String[tamanho];
        topo = -1; // Começa em -1 p indicar q esta totalmente vazia, porque o array começa em 0
    }

    // Verifica se ta vazia
    public boolean isEmpty() {
        return (topo == -1);
    }

    // Verifica se ta cheia
    public boolean isFull() {
        return (topo == blocos.length - 1);
    }

    // Empilhar um bloco (push)
    public void push(String bloco) {
        if (!isFull()) {
            topo++;
            blocos[topo] = bloco;
            System.out.println("Bloco '" + bloco + "' colocado");
        } else {
            System.out.println("ERRO: A pirame ja esta no limite de altura!");
        }
    }

    // Desempilhar um bloco (pop)
    public String pop() {
        if (!isEmpty()) {
            String removido = blocos[topo];
            blocos[topo] = null;
            topo--;
            return removido;
        } else {
            System.out.println("ERRO: Nao tem nenhum bloco para tirar");
            return null;
        }
    }

    // Ver o bloco do topo.
    public void peek() {
        if (!isEmpty()) {
            System.out.println("O bloco no topo é: " + blocos[topo]);
        } else {
            System.out.println("A piramide esta vazia.");
        }
    }

    // Mostrar pilha
    public void display() {
        if (isEmpty()) {
            System.out.println("Nada para mostrar aqui.");
        } else {
            System.out.println("Estrutura da piramide (Topo para Base)");
            for (int i = topo; i >= 0; i--) {
                System.out.println("[" + blocos[i] + "]");
            }
        }
    }
}