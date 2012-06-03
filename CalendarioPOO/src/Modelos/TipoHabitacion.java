

package Modelos;



public class TipoHabitacion {
    
    private String tipo;
    private double precio;
    
    public TipoHabitacion(){
    }
    
    public TipoHabitacion(String normaL, double precio) {
        this.precio = precio;
        this.tipo = normaL;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public TipoHabitacion(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String toString(){
        return this.tipo;
    }
    
}
