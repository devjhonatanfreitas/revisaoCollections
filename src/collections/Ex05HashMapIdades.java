package collections;
import java.util.HashMap;
import java.util.Map;

public class Ex05HashMapIdades {
    public static void main(String[] args) {
        // TODO: 1. Crie um HashMap<String, Integer> com os pares:
        // ("Ana", 25), ("Carlos", 30), ("Maria", 22), ("João", 28), ("Bianca", 27)

        HashMap<String, Integer> people = new HashMap<>(Map.of(
                "Ana", 25,
                "Carlos", 30,
                "Maria", 22,
                "João", 28,
                "Bianca",27
        ));

        // TODO: 2. Atualize a idade de "Maria" para 23

        people.replace("Maria", 23);

        // TODO: 3. Percorra e imprima usando entrySet()

        for(Map.Entry<String, Integer> entry : people.entrySet()){
            System.out.println(entry.getKey() + " is "+ entry.getValue() + " years old.");
        }
    }
}