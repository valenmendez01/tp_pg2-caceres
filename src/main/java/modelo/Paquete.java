package modelo;

public class Paquete <T>{
    private int id;
    private double peso;
    private String destino;
    private boolean urgente;
    private T contenido;

    public Paquete(int id, double peso, String destino, boolean urgente, T contenido) {
        this.id = id;
        this.peso = peso;
        this.destino = destino;
        this.urgente = urgente;
        this.contenido = contenido;
    }

    public boolean esPrioritario(){
        return this.urgente || this.peso > 50;
    }


}
