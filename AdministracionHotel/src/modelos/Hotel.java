

package modelos;

public class Hotel {
    private String nombre;
    private String direccion;
    private Cliente cliente;

    public Hotel(String nombre, String direccion, Cliente cliente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    




}
