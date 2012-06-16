

package modelos;


public class Documento {
    
    private String numeroDocumento;
    private TipoDocumento tipo;

    public Documento(String numeroDocumento, TipoDocumento tipo) {
        this.numeroDocumento = numeroDocumento;
        this.tipo = tipo;
    }
    
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public TipoDocumento getTipo() {
        return tipo;
    }

    public void setTipo(TipoDocumento tipo) {
        this.tipo = tipo;
    }
    
    public String toString(){
        return this.numeroDocumento;
    }
}
