package clase1;

public class Ej9 {
    /*
    Dada esta matriz:
        int[][] aux2 = {
        { 9, 12, 18 },
        { 14, 10, 30 },
        { 9, 6, 3 } };

    Indicar si alguna fila tiene todos los elementos múltiplos de 2

    Indicar si alguna fila tiene algún elemento múltiplo de 2

    Indicar si alguna columna tiene todos los elementos múltiplos de 3.
     */

    private static final int[][] aux2 =
        {
            { 9, 12, 18 },
            { 14, 10, 30 },
            { 9, 6, 3 }
        };

    public static void main(String[] args) {

        System.out.println("Alguna fila con todos múltiplos de 2: " + filaTodosMultiplos2(aux2));
        System.out.println("Fila algún múltiplo de 2: " + filaAlgunMultiplo2(aux2));
        System.out.println("Columna todos múltiplos de 3: " + columnaTodosMultiplos3(aux2));

    }

    private static boolean filaTodosMultiplos2(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            boolean todos = true;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 != 0) {
                    todos = false;
                    break;
                }
            }

            if (todos) return true;
        }
        return false;
    }

    private static boolean filaAlgunMultiplo2(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            boolean alguno = false;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    alguno = true;
                    break;
                }
            }

            if (alguno) return true;
        }
        return false;
    }

    private static boolean columnaTodosMultiplos3(int[][] matriz) {

        for (int j = 0; j < matriz[0].length; j++) {
            boolean todos = true;
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] % 3 != 0) {
                    todos = false;
                    break;
                }
            }
            if (todos) return true;
        }
        return false;
    }
}
