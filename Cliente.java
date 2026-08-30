
/**
 * Write a description of class cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente extends Persona {
    private Usuario usuario;

    public Cliente(String nombre, String identificacion, Usuario usuario) {
        super(nombre, identificacion);
        if (usuario == null) throw new IllegalArgumentException("Usuario no puede ser nulo.");
        this.usuario = usuario;
    }

    public Usuario getUsuario() { return usuario; }
}
