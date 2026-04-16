package clase4.EjCola;

public class Tupla <M, N> implements iTupla<M, N>{

    private final M materia;
    private final N nota;

    public Tupla(M materia, N nota) {
        this.materia = materia;
        this.nota = nota;
    }

    public M getMateria() {
        return materia;
    }

    public N getNota() {
        return nota;
    }

    public void imprimirTupla() {
        System.out.println("Materia: " + materia + "\nNota: " + nota);
    }
}
