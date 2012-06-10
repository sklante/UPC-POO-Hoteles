/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Angel
 */
public class Moneda {
    
    
    private String codigoMoneda;
    private String nombreMoneda;

    public Moneda(String codigoMoneda, String nombreMoneda) {
        this.codigoMoneda = codigoMoneda;
        this.nombreMoneda = nombreMoneda;
    }

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public String getNombreMoneda() {
        return nombreMoneda;
    }

    public void setNombreMoneda(String nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }
      
    
    
}
