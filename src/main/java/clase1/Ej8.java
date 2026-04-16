package clase1;

public class Ej8 {
    /*
    Dada una lista de números:

    Crear una función que reciba por parámetro un vector y devuelva un booleano
    que indique si todos los elementos son múltiplos de 3.

    Crear una función que reciba por parámetro un vector y devuelva un booleano
    que indique si algún elemento múltiplo de 3.
     */

    private final static int[] numeros = {3, 4, 5, 6, 7 ,8, 9, 10};
    private final static int[] multiplos3 = {3, 6, 12, 9, 30 ,15, 9, 33};

    public static void main(String[] args) {

        System.out.println("Todos múltiplos: " + validarTodosMultiplos(multiplos3));
        System.out.println("Algún múltiplo: " + validarAlgunMultiplos(numeros));

    }

    private static boolean validarTodosMultiplos(int[] numeros) {
        boolean res = true;
        for (int numero : numeros) {
            if (numero % 3 != 0) {
                res = false;
                break;
            }
        }
        return res;
    }

    private static boolean validarAlgunMultiplos(int[] numeros) {
        boolean res = false;
        for (int numero : numeros) {
            if (numero % 3 == 0) {
                res = true;
                break;
            }
        }
        return res;
    }

}
