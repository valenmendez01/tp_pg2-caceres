package TDAs;

public class Conjunto<T> implements iConjunto<T> {

    T[] elemento;
    int pos;

    public Conjunto(int cantidad) {
        this.elemento = (T[]) new Object[cantidad];
        pos = 0;
    }

    public void agregar(T elemento) {
        this.elemento[pos] = elemento;
        pos++;
    }
}
