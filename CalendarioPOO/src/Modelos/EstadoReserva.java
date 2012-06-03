/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

public class EstadoReserva {
    
    public String estado;

    EstadoReserva(String estadoReserva) {
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
