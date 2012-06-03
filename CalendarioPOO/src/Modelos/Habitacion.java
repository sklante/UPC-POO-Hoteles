package Modelos;

public class Habitacion {

    private int numHabitacion;
    private String denominacion;
    private TipoHabitacion tipoHabitacion;

    
    public Habitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
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

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }
    
    public String toString(){
        return String.valueOf(this.numHabitacion);
    }
}
