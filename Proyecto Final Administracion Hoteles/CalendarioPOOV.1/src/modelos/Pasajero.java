
package modelos;


public class Pasajero extends Entidad{
    
    private String entidadActual;
    private boolean entidadPagador;

    public String getEntidadActual() {
        return entidadActual;
    }

    public void setEntidadActual(String entidadActual) {
        this.entidadActual = entidadActual;
    }

    public boolean isEntidadPagador() {
        return entidadPagador;
    }

    public void setEntidadPagador(boolean entidadPagador) {
        this.entidadPagador = entidadPagador;
    }
            
    
}
