package clase1;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        // Pedir dos números por teclado e indicar cuál es el mayor.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();

        System.out.println("El mayor es: " + devolverMayor(num1, num2));

        /*
        El problema con el scanner aparece solo cuando cambiás de nextInt() a nextLine():
        Ej:
        int num = sc.nextInt();
        String texto = sc.nextLine(); // problema

        Solución:
        int num = sc.nextInt();
        sc.nextLine(); // limpia el salto de línea
        String texto = sc.nextLine();
         */

    }

    private static int devolverMayor(int num1, int num2) {

        return Math.max(num1, num2);
        /*
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
         */
    }
}
