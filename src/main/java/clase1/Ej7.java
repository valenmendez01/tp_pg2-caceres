package clase1;

public class Ej7 {
    // Dado estos vectores:
    // String[] nombres = {"Silla","Mesa","Tele"};
    // double[] precios = {100.0,200.0,120.0};
    // Imprimir mediante un ciclo, los nombres de los productos mayores a 100.

    private static final String[] nombres = {"Silla","Mesa","Tele"};
    private static final double[] precios = {100.0,200.0,120.0};

    public static void main(String[] args) {

        for (int i = 0; i < precios.length; i++) {
            if (precios[i] > 100){
                System.out.println(nombres[i]);
            }
        }

    }
}
