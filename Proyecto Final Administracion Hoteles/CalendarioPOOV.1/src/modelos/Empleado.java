/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package modelos;

/**
 *
 * @author Pc
 */
public class Empleado extends Entidad{
    
    private String entidadActual;
    private boolean entidadPagador;

    public String getEntidadActual() {
        return entidadActual;
    }

    public void setEntidadActual(String entidadActual) {
        this.entidadActual = entidadActual;
    }

    public boolean isEntidadPagador() {
        return entidadPagador;
    }

    public void setEntidadPagador(boolean entidadPagador) {
        this.entidadPagador = entidadPagador;
    }

}
