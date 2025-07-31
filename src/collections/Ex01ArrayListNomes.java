package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Ex01ArrayListNomes {

    public static void main(String[] args) {

        // TODO: 1. Crie uma ArrayList<String> e adicione: Ana, Carlos, Maria, João, Bianca

        ArrayList<String> listaDePessoas = new ArrayList<>();
        listaDePessoas.add("Ana");
        listaDePessoas.add("Carlos");
        listaDePessoas.add("Maria");
        listaDePessoas.add("João");
        listaDePessoas.add("Bianca");

        // TODO: 2. Ordene a lista em ordem alfabética

        Collections.sort(listaDePessoas);
        System.out.println("Lista em ordem alfabética: "+listaDePessoas);

        // TODO: 3. Remova "Carlos" e exiba o resultado

        listaDePessoas.remove("Carlos");
        System.out.println("Lista sem o Carlos: "+listaDePessoas);
    }
}