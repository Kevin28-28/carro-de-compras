
/**
 * Write a description of class producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        if (nombre == null || nombre.isEmpty() || precio <= 0) {
            throw new IllegalArgumentException("Datos de producto inválidos.");
        }
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
}