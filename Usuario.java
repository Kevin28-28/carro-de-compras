
public class Usuario {
    private String username;
    private String password;

    public Usuario(String username, String password) {
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Usuario y contraseña no pueden estar vacíos.");
        }
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public boolean validarPassword(String pass) { return password.equals(pass); }
}
