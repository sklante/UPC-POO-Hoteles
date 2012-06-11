
package modelos;

public class EstadoReserva {
    
    public String estado;

    public EstadoReserva(String estadoReserva) {
        this.estado=estadoReserva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String toString(){
        return this.estado;
    }
    
}
