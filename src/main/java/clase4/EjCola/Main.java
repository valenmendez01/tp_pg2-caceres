package clase4.EjCola;

public class Main {

    public static void main(String[] args) {

        RegistroNotas registro = new RegistroNotas();

        // Crear estudiantes
        Estudiante e1 = new Estudiante("Juan");
        Estudiante e2 = new Estudiante("Maria");

        // Agregar estudiantes
        registro.agregarEstudiante(e1);
        registro.agregarEstudiante(e2);

        // Agregar notas
        registro.agregarNota(e1, "Matematica", 8.5);
        registro.agregarNota(e1, "Lengua", 7.0);

        registro.agregarNota(e2, "Matematica", 9.0);
        registro.agregarNota(e2, "Historia", 6.5);

        // Mostrar estudiantes
        System.out.println("=== LISTA DE ESTUDIANTES ===");
        registro.listarEstudiantes();

        // Mostrar notas
        System.out.println("\n=== NOTAS DE JUAN ===");
        registro.mostrarNotas(e1);

        System.out.println("\n=== NOTAS DE MARIA ===");
        registro.mostrarNotas(e2);

        // Promedios
        System.out.println("\n=== PROMEDIOS ===");
        registro.obtenerPromedioNotas(e1);
        registro.obtenerPromedioNotas(e2);

    }
}
