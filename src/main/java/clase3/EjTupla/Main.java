package clase3.EjTupla;

public class Main {

    public static void main(String[] args) {

        Tupla4<String, String, String, Integer> partida1 = new Tupla4<>("Valentin", "Juan", "1-0", 20);

        System.out.println(partida1.imprimirTupla4());
    }
}
