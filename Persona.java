
/**
 * Write a description of class persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona {
    private String nombre;
    private String identificacion;

    public Persona(String nombre, String identificacion) {
        if (nombre == null || nombre.isEmpty() || identificacion == null || identificacion.isEmpty()) {
            throw new IllegalArgumentException("Nombre e identificación no pueden estar vacíos.");
        }
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() { return nombre; }
    public String getIdentificacion() { return identificacion; }
}