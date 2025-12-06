package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        // A mesma lógica que uma fila de mercado
        Queue<String> fila = new LinkedList<>();

        // Add e Offer -> adicionam elementos na fila
        // Quando a fila está cheia
        fila.add("Ana"); // Retorna um erro (exception)
        fila.offer("Bia"); // Retorna um boolean
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element pega elementos da fila sem remover
        // Element lança uma exception e o peek() retorna null quando a fila está vazia.
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

        // Poll e remove
        System.out.println(fila.poll()); // Remove da fila
        System.out.println(fila.remove()); // Remove da fila
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); // Retorna null quando está vazia
        System.out.println(fila.remove()); // Quando a fila está vazia lança uma exception

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains();

    }
}
