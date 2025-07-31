package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex06TreeMapOrdenado {
    public static void main(String[] args) {

        // TODO: Repita o exercício anterior usando TreeMap

        TreeMap<String, Integer> people = new TreeMap<>(Map.of(
                "Ana", 25,
                "Carlos", 30,
                "Maria", 22,
                "João", 28,
                "Bianca",27
        ));

        // TODO: Observe que os nomes são exibidos em ordem alfabética

        for(Map.Entry<String, Integer> entry : people.entrySet()){
            System.out.println(entry.getKey() + " is "+ entry.getValue() + " years old.");
        }
    }
}