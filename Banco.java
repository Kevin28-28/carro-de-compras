public class Banco {
    private String nombre;

    public Banco(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre de banco inválido.");
        }
        this.nombre = nombre;
    }

    public boolean procesarPago(double monto) {
        return monto > 0; 
    }

    public String getNombre() { return nombre; }
}