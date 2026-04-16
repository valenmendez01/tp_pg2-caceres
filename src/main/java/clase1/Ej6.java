package clase1;

import java.util.Scanner;

public class Ej6 {

    /*
    Ejercicio integrador: realizar un menú donde el usuario elija una opción entre,
    compras, ventas, informe de compras, informe de ventas y la opción salir. Para
    compras y ventas, solo imprimir “menú compras” o “menú ventas”. Para informe
    de compras, imprimir: “Compra número: “ con un rango desde 100 hasta 110.
    Para informe de ventas, “Venta con importe:” con un rango de 1000.0 hasta
    1010.0. Para salir del sistema, se tendrá que seleccionar la opción salir..
     */

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = true;
        while(salir){
            mostrarMenu();
            int opcion = sc.nextInt();
            switch(opcion){
                case 1: System.out.println("menu compras"); break;
                case 2: System.out.println("menu ventas"); break;
                case 3: imprimirInformeCompras(); break;
                case 4: imprimirInformeVentas(); break;
                case 5: salir = false; break;
                default:  System.out.println("Opción no válida.");
            }
        }

    }

    private static void mostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Compras");
        System.out.println("2. Ventas");
        System.out.println("3. Informe de compras");
        System.out.println("4. Informe de ventas");
        System.out.println("5. Salir");
    }

    private static void imprimirInformeCompras() {
        for (int i = 100; i < 111; i++) {
            System.out.println("Compra numero " + i);
        }
    }

    private static void imprimirInformeVentas() {
        for (double i = 1000.0; i < 1011.0; i++) {
            System.out.println("Venta con importe:" + i);
        }
    }

}
