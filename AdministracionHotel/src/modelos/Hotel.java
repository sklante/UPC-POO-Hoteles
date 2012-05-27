

package modelos;

public class Hotel {
    private String nombre;
    private String direccionClerk;
    private Usuario usuario;

    public Hotel(String nombre, String direccionClerk, String usuario) {
        this.nombre = nombre;
        this.direccionClerk = direccionClerk;
        this.usuario = new Usuario(usuario);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getDireccion() {
        return direccionClerk;
    }

    public void setDireccion(String direccion) {
        this.direccionClerk = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

}
