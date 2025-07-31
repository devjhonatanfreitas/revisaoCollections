package collections;

import java.util.Collections;
import java.util.TreeSet;

public class Ex04TreeSetOrdenacao {

    public static void main(String[] args) {

        // TODO: 1. Crie um TreeSet<String> e adicione: uva, banana, laranja, abacaxi, kiwi, manga

        String[] frutasArray = {"uva", "banana", "laranja", "abacaxi", "kiwi", "manga"};
        TreeSet<String> frutas = new TreeSet<>();
        Collections.addAll(frutas, frutasArray);

        // TODO: 2. Use first(), last(), higher("laranja") e lower("laranja")

        System.out.println("Maior fruta: "+frutas.first());
        System.out.println("Menor fruta: "+frutas.last());
        System.out.println("Seguinte a laranja: "+frutas.higher("laranja"));
        System.out.println("Antes da laranja: "+frutas.lower("laranja"));

        // TODO: 3. Imprima os resultados

        frutas.forEach(fruta -> System.out.println(fruta));

    }
}