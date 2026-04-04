import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pilhapipi minhaPilha = new pilhapipi(5);
        filapipi minhaFila = new filapipi(5);

        while (true) {
            System.out.println("\n SISTEMA DE CONSTRUÇÃO DA PIRAMIDE");
            System.out.println("1 - Sistema de Blocos (Pilha)");
            System.out.println("2 - Sistema de Trabalhadores (Fila)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 0) break;

            if (opcao == 1) {
                System.out.println("\n MENU DA PILHA (BLOCOS)");
                System.out.println("1. Empilhar Bloco");
                System.out.println("2. Desempilhar Bloco");
                System.out.println("3. Ver Topo");
                System.out.println("4. Mostrar Pilha");
                System.out.print("Escolha: ");
                int opPilha = sc.nextInt();
                sc.nextLine();

                if (opPilha == 1) {
                    System.out.print("Nome/Tipo do Bloco: ");
                    minhaPilha.push(sc.nextLine());
                } else if (opPilha == 2) {
                    String removido = minhaPilha.pop();
                    if (removido != null) {
                        System.out.println("Bloco '" + removido + "' removido da pilha.");
                    }
                } else if (opPilha == 3) {
                    minhaPilha.peek();
                } else if (opPilha == 4) {
                    minhaPilha.display();
                }

            } else if (opcao == 2) {
                System.out.println("\n MENU DA FILA");
                System.out.println("1. Novo Trabalhador");
                System.out.println("2. Chamar do Job");
                System.out.println("3. Ver Primeiro");
                System.out.println("4. Mostrar Fila");
                System.out.print("Escolha: ");
                int opFila = sc.nextInt();
                sc.nextLine();

                if (opFila == 1) {
                    System.out.print("Nome do Trabalhador: ");
                    minhaFila.enqueue(sc.nextLine());
                } else if (opFila == 2) {
                    String atendido = minhaFila.dequeue();
                    if (atendido != null) {
                        System.out.println("Trabalhador '" + atendido + "' saiu da fila.");
                    }
                } else if (opFila == 3) {
                    minhaFila.front();
                } else if (opFila == 4) {
                    minhaFila.display();
                }
            }
        }

        System.out.println("Programa encerrado. Tudo no prumo!");
        sc.close();
    }
}