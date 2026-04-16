package clase3;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class EjConjunto {
    /*
    Realizar una lista de tareas, donde cada tarea es un String, las tareas no deben
    repetirse, y debe poder indicarse los favoritos, para que aparezcan al principio de
    la fila, los favoritos pueden estar en cualquier orden.
     */

    private Set<String> favoritas = new HashSet<>();
    private Set<String> normales = new HashSet<>();

    public void agregar(String tarea, boolean esFavorita) {
        if (favoritas.contains(tarea) || normales.contains(tarea)) return;

        if (esFavorita) {
            favoritas.add(tarea);
        } else {
            normales.add(tarea);
        }
    }

    public void mostrar() {
        for (String t : favoritas) {
            System.out.println("⭐ " + t);
        }
        for (String t : normales) {
            System.out.println(t);
        }
    }

}
