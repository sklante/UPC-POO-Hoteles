

package modelos;

import javax.swing.JOptionPane;


public class TipoPasajero implements InterfaceGeneral{
    
    private String tipoPasajero;
    public boolean errorObject;
    public boolean errorInt;

    public TipoPasajero(String tipoCliente) {
        if(validarNulos(tipoCliente)){
        this.tipoPasajero=tipoCliente;
        }else{
            JOptionPane.showMessageDialog(null, "Valor nulo en: " + getClass());
        }
    }
    
    public String getTipoPasajero() {
        return tipoPasajero;
    }

    public void setTipoPasajero(String tipoCliente) {
        this.tipoPasajero = tipoCliente;
    }

    @Override
    public boolean validarNulos(Object campo) {
        if (campo != null) {
            return true;
        } else {
            errorObject = true;
            return false;
        }
    }

    @Override
    public boolean validarIgualesObject(Object variable1, Object variable2) {
        if (variable1.equals(variable2)) {
            return true;
        } else {
            errorObject = true;
            return false;
        }
    }

    @Override
    public boolean validarNumerosValidos(int numero) {
        if (numero <= 0) {
            errorInt = true;
            return false;
        }
        return true;
    }
    
    @Override
    public boolean isErrorInt() {
        return this.errorInt;
    }

    @Override
    public boolean isErrorObject() {
        return this.errorObject;
    }
}
