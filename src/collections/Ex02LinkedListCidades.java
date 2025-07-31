package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex02LinkedListCidades {

    public static void main(String[] args) {

        // TODO: 1. Crie uma LinkedList<String> com: São Paulo, Rio, Curitiba, Belo Horizonte, Salvador

        LinkedList<String> cidades = new LinkedList<>();
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Curitiba");
        cidades.add("Belo Horizonte");
        cidades.add("Salvador");
        System.out.println("Lista original: "+cidades);

        // TODO: 2. Use addFirst("Porto Alegre") e addLast("Fortaleza")

        cidades.addFirst("Porto Alegre");
        cidades.addLast("Fortaleza");
        System.out.print("Lista com adições First e Last: "+cidades+"\n");

        // TODO: 3. Remova o primeiro e o último elemento

        cidades.removeFirst();
        cidades.removeLast();
        System.out.print("Lista após remoção de First e Last: "+cidades+"\n");

        // TODO: 4. Itere a lista usando Iterator e depois usando forEach

        //Iterator
        System.out.println("Lista com Iterator: ");
        Iterator<String> iterator = cidades.iterator();
        while (iterator.hasNext()){
            String cidade = iterator.next();
            System.out.print(cidade+", ");
        }

        //forEach
        System.out.println("\nLista com forEach: ");
        for (String cidade: cidades){
            System.out.print(cidade+", ");
        }

        //Lambda
        System.out.println("\nLista com Lambda: ");
        cidades.forEach(cidade -> System.out.print(cidade+", "));

        //Method Reference
        System.out.println("\nLista com Method Reference: ");
        cidades.forEach(System.out::print);


    }
}