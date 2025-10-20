import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Eduardo");
        nomes.add("Pedro");
        nomes.add("Joao Pedro");
        nomes.add("Julia");
        nomes.add("Kamylla");

        Iterator<String> iterador = nomes.iterator() ;

        while (iterador.hasNext()){
            System.out.println(iterador.next());
        }

        System.out.println("\n\n");
        iterador.remove();

        iterador = nomes.iterator();

        while (iterador.hasNext()){
            System.out.println(iterador.next());
        }

    }
}