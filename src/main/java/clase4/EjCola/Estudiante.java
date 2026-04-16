package clase4.EjCola;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private final List<iTupla<String, Double>> tuplas = new ArrayList<>();

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Estudiante setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public void agregarNota(String materia, double nota) {
        iTupla<String, Double> tupla = new Tupla<>(materia, nota);
        this.tuplas.add(tupla);
    }

    public void obtenerNotas(){
        for (iTupla<String, Double> tupla : tuplas) {
            System.out.println(tupla.getMateria() + ": " + tupla.getNota());
        }
    }

    public double obtenerPromedio(){
        int contador = 0;
        double sumador = 0;
        for (iTupla<String, Double> tupla : tuplas) {
            sumador += tupla.getNota();
            contador++;
        }
        return contador == 0 ? 0 : sumador / contador;
    }
}
