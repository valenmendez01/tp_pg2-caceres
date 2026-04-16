package clase4.EjCola;

import java.util.ArrayList;
import java.util.List;

public class RegistroNotas {

    private List<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante e){
        estudiantes.add(e);
    }

    private boolean existeEstudiante(Estudiante e){
        return estudiantes.contains(e);
    }

    public void agregarNota(Estudiante e, String materia, double nota){
        if (existeEstudiante(e)){
            e.agregarNota(materia, nota);
        }
    }

    public void obtenerPromedioNotas(Estudiante e){
        if(existeEstudiante(e)){
            System.out.println("El promedio de notas es " + e.obtenerPromedio());
        }
    }

    public void mostrarNotas(Estudiante e){
        if(existeEstudiante(e)){
            e.obtenerNotas();
        }
    }

    public void listarEstudiantes(){
        for(Estudiante e: estudiantes){
            System.out.println("Nombre: " + e.getNombre());
        }
    }
}
