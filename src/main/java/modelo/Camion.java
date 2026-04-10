package modelo;

import TDAs.iPila;

import java.util.Stack;

public class Camion {
    private Stack<Paquete<?>> pila;

    public Camion() {
        pila = new Stack<>();
    }

    public void cargarPaquete(Paquete<?> paquete) {
        pila.push(paquete);
    }

    public void descargarPaquete(Paquete<?> paquete) {
        pila.pop();
    }

}
