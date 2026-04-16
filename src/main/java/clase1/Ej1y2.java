package clase1;

import java.util.Scanner;

public class Ej1y2 {

    public static void main(String[] args) {

        System.out.println("Hola Mundo");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();

        imprimirDatos(nombre, edad);

        System.out.println("Hola " + devolverNombre(nombre));

        scanner.close();
    }

    private static void imprimirDatos(String nombre, int edad) {

        System.out.println("Hola " + nombre + ", su edad es " + edad);
    }

    private static String devolverNombre(String nombre) {
        return nombre;
    }


}
