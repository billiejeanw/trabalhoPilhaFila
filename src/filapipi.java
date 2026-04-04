public class filapipi {
    private String[] trabalhadores;
    private int inicio;
    private int fim;
    private int total;

    public filapipi(int tamanho) {
        trabalhadores = new String[tamanho];
        inicio = 0;
        fim = 0;
        total = 0;
    }

    public boolean isEmpty() {
        return (total == 0);
    }

    public boolean isFull() {
        return (total == trabalhadores.length);
    }

    //add a fila (enqueue)
    public void enqueue(String nome) {
        if (!isFull()) {
            trabalhadores[fim] = nome;
            fim = (fim + 1) % trabalhadores.length; // fila repeteco
            total++;
            System.out.println("Trabalhador " + nome + " entrou na fila.");
        } else {
            System.out.println("ERRO: A fila esta muito grande");
        }
    }

    // Remover da fila (dequeue)
    public String dequeue() {
        if (!isEmpty()) {
            String atendido = trabalhadores[inicio];
            trabalhadores[inicio] = null;
            inicio = (inicio + 1) % trabalhadores.length;
            total--;
            return atendido;
        } else {
            System.out.println("Ninguem na fila.");
            return null;
        }
    }

    // Ver o primeiro da fila (front)
    public void front() {
        if (!isEmpty()) {
            System.out.println("O primeiro da fila é: " + trabalhadores[inicio]);
        } else {
            System.out.println("Fila vazia.");
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Fila vazia.");
        } else {
            System.out.print("FILA ATUAL: ");
            int aux = inicio;
            for (int i = 0; i < total; i++) {
                System.out.print("[" + trabalhadores[aux] + "] ");
                aux = (aux + 1) % trabalhadores.length;
            }
            System.out.println();
        }
    }
}