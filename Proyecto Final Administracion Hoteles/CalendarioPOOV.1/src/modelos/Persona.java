/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package modelos;

/**
 *
 * @author Pc
 */
public class Persona extends Entidad{
    
    private boolean esPagadorPersona;
    private String entidadActual;
    private boolean entidadPagador;

    public Persona(String nombre, Documento documento, String telefono, String correo) {
        this.setNombre(nombre);
        this.setDocumento(documento);
        this.setTel(telefono);
        this.setEmail(correo);
    }

    public boolean isEsPagadorPersona() {
        return esPagadorPersona;
    }

    public void setEsPagadorPersona(boolean esPagadorPersona) {
        this.esPagadorPersona = esPagadorPersona;
    }

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
