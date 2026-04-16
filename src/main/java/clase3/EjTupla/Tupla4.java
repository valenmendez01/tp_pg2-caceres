package clase3.EjTupla;

public class Tupla4 <T, U, V, W> implements iTupla4 <T, U, V, W>{
    private final T nombreJugBlancas;
    private final U nombreJugNegras;
    private final V resultado;
    private final W cantMovimientos;

    public Tupla4(T nombreJugBlancas, U nombreJugNegras, V resultado, W cantMovimientos) {
        this.nombreJugBlancas = nombreJugBlancas;
        this.nombreJugNegras = nombreJugNegras;
        this.resultado = resultado;
        this.cantMovimientos = cantMovimientos;
    }

    public T getJugadorBlancas() {
        return nombreJugBlancas;
    }

    public U getJugadorNegras() {
        return nombreJugNegras;
    }

    public V getResultado() {
        return resultado;
    }

    public W getCantMovimientos() {
        return cantMovimientos;
    }

    public String imprimirTupla4() {
        return "Jugador Blancas: " + nombreJugBlancas +
                ", Jugador Negras: " + nombreJugNegras +
                ", Resultado: " + resultado +
                ", Cantidad de movimientos: " + cantMovimientos;
    }
}
