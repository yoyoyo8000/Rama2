import java.util.ArrayList;

public class ArrayListGet {
    public static void main(String[] args) {
        ArrayList<String> ropa = new ArrayList<>();

        ropa.add("chaqueta");
        ropa.add("camiseta");
        ropa.add("pantalon");
        System.out.println("ArrayList: " + ropa);
        //Con la función .get() accedemos a un elemento en una posición concreta.
        String str = ropa.get(2);

        System.out.print("Elemento en el índice 2: " + str);
    }
}

