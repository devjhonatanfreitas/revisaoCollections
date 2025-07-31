package collections;
import java.util.Collections;
import java.util.HashSet;

public class Ex03HashSetNumeros {

    public static void main(String[] args) {

        // TODO: 1. Crie um HashSet<Integer> e adicione os números (incluindo repetidos):
        // 1,2,2,3,4,5,5,6,7,8,8,9,10

        Integer[] numeros = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10};
        HashSet<Integer> lista = new HashSet<>();
        Collections.addAll(lista, numeros);
        System.out.println("Hashset criado: ");
        for (Integer numero : numeros) {
            System.out.print(numero);
        }

        // TODO: 2. Verifique se 5 está presente

        if (lista.contains(5)) {
            System.out.println("\nContém 5");
        } else {
            System.out.println("Não contém 5");
        }

        // TODO: 3. Imprima todos os elementos (observe que a ordem não é garantida)

        lista.forEach(System.out::print);

    }
}