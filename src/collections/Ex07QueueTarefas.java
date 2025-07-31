package collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class Ex07QueueTarefas {
    public static void main(String[] args) {

        // TODO: 1. Crie uma Queue<String> com tarefas:
        // "Lavar roupa", "Estudar Java", "Fazer compras", "Ler livro", "Cozinhar"

        Queue<String> tasks = new ArrayDeque<>();
        Collections.addAll(tasks,"Lavar roupa", "Estudar Java", "Fazer compras", "Ler livro", "Cozinhar" );

        // TODO: 2. Use peek() para ver a primeira tarefa sem remover

        System.out.println(tasks.peek());

        // TODO: 3. Use poll() para remover a primeira tarefa

        tasks.poll();

        // TODO: 4. Teste remove() e poll() quando a fila estiver vazia

        tasks.clear();
        /*tasks.remove();*/
        /*tasks.poll();*/

    }
}