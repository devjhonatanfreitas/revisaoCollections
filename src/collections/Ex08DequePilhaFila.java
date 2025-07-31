package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ex08DequePilhaFila {
    public static void main(String[] args) {

        // TODO: 1. Crie um Deque<Integer>

        Deque<Integer> list = new ArrayDeque<>();

        // TODO: 2. Adicione 3 números no início (addFirst) e 3 no fim (addLast)

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        // TODO: 3. Remova do início e do fim

        list.removeFirst();
        list.removeLast();

        // TODO: 4. Use push() e pop() para simular uma pilha

        list.push(1);
        System.out.println("Push 1: "+list);

        list.pop();
        System.out.println("Pop 1: "+list);

    }
}