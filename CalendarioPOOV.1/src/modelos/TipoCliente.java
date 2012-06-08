

package modelos;


public class TipoCliente implements InterfaceGeneral{
    
    private String tipoCliente;

    public TipoCliente(String tipoCliente) {
        this.tipoCliente=tipoCliente;
    }
    
    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public boolean isErrorInt() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isErrorObject() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean validarIgualesObject(Object variable1, Object variable2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean validarNulos(Object campo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean validarNumerosValidos(int numero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
