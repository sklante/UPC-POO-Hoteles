package modelos;

public class Moneda implements InterfaceGeneral {

    private String simbolo;
    private int conversion;
    private boolean predeterminada;
    private boolean errorInt;
    private boolean errorObject;

    public Moneda(String simbolo, int conversion, boolean predeterminada, boolean errorInt, boolean errorObject) {
        this.simbolo = simbolo;
        this.conversion = conversion;
        this.predeterminada = predeterminada;
        this.errorInt = errorInt;
        this.errorObject = errorObject;
    }

    


    public int getConversion() {
        return conversion;
    }

    public void setConversion(int conversion) {
        this.conversion = conversion;
    }

    public boolean isPredeterminada() {
        return predeterminada;
    }

    public void setPredeterminada(boolean predeterminada) {
        this.predeterminada = predeterminada;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return this.simbolo;
    }

    @Override
    public boolean isErrorInt() {
        return errorInt;
    }

    @Override
    public boolean isErrorObject() {
        return errorObject;
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
}
