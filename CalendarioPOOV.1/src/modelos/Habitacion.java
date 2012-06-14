package modelos;

public class Habitacion implements InterfaceGeneral {

    private Object numHabitacion;
    private String denominacion;
    private TipoHabitacion tipoHabitacion;
    private boolean errorInt;
    private boolean errorObject;

    public Habitacion(Object numHabitacion, TipoHabitacion tipoHabitacion) {
        this.numHabitacion = numHabitacion;
        this.tipoHabitacion = tipoHabitacion;
    }

    public Habitacion(int numHabitacion, TipoHabitacion tipoHabitacion) {
        this.numHabitacion = numHabitacion;
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public Object getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(Object numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String toString() {
        return String.valueOf(this.numHabitacion);
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
