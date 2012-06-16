/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package modelos;



public class TipoDocumento {
    
    private String tipoDocumento;

    public TipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    public String toString(){
        return tipoDocumento;
    }
    
}
