package modelo.contenido;

public class Alimentos {
    private String fechaVencimiento;
    private boolean requiereRefrigeracion;

    public Alimentos(String fechaVencimiento, boolean requiereRefrigeracion) {
        this.fechaVencimiento = fechaVencimiento;
        this.requiereRefrigeracion = requiereRefrigeracion;
    }
    // getters y toString
}
