package modelos;

public class Hotel implements InterfaceGeneral{

    private String nombreHotel;
    private String urlHotel;
    private int cantidadHabitaciones;
    private boolean estado;
    private boolean errorInt;
    private boolean errorObject;

    public Hotel(String nombreHotel, String urlHotel) {
        this.nombreHotel = nombreHotel;
        this.urlHotel = urlHotel;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getUrlHotel() {
        return urlHotel;
    }

    public void setUrlHotel(String urlHotel) {
        this.urlHotel = urlHotel;
    }

    public String toString() {
        return this.nombreHotel;
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
