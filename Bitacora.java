
/**
 * Write a description of class bitacora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;

public class Bitacora {
    private List<String> registros;

    public Bitacora() {
        registros = new ArrayList<>();
    }

    public void registrar(String mensaje) {
        registros.add(mensaje);
    }

    public void mostrarRegistros() {
        registros.forEach(System.out::println);
    }
}