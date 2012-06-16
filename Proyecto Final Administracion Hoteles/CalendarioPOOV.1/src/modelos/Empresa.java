/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc
 */
public class Empresa extends Entidad{
    
    private String convenio;
    private Medios medioDePago;
    private List<Persona> contacto = new ArrayList<Persona>();
    
    public Empresa(String nombre, Documento documento, String telefono, String correo, Medios medios){
        this.setNombre(nombre);
        this.setDocumento(documento);
        this.setTel(telefono);
        this.setEmail(correo);
        this.setMedioDePago(medios);
    }

    public List<Persona> getContacto() {
        return contacto;
    }

    public void setContacto(List<Persona> contacto) {
        this.contacto = contacto;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public Medios getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(Medios medioDePago) {
        this.medioDePago = medioDePago;
    }
    
    @Override
    public String toString(){
        return "Emp: "+this.getNombre();
    }
    
}
