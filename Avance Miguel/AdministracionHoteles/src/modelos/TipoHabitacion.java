/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Angel
 */
public class TipoHabitacion {
    private String nombreTipo;
    private double precio;
    private Moneda nombreMoneda;

    public TipoHabitacion(String nombreTipo, double precio, Moneda nombreMoneda) {
        this.nombreTipo = nombreTipo;
        this.precio = precio;
        this.nombreMoneda = nombreMoneda;
    }

    public Moneda getNombreMoneda() {
        return nombreMoneda;
    }

    public void setNombreMoneda(Moneda nombreMoneda) {
        this.nombreMoneda = nombreMoneda;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
