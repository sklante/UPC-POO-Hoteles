

package modelos;



public class Cliente {
    
    
    private String nombreCliente;
    private String correoElectronico;
    private String clave;
    private boolean estado;
    
    public Cliente(String nombreCliente, String clave, String correoElectronico, boolean estado){
        this.nombreCliente=nombreCliente;
        this.clave=clave;
        this.correoElectronico=correoElectronico;
        this.estado=estado;        
    }
    
    public Cliente(String nombreCliente, String clave, String correoElectronico, boolean estado
            ,String nombreHotel, String urlHotel){
        this.nombreCliente=nombreCliente;
        this.clave=clave;
        this.correoElectronico=correoElectronico;
        this.estado=estado;
    }
    

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Override
    public String toString(){
        return this.nombreCliente;
    }
    public boolean verificaCorreo(String correoe){
        if(correoe != null){
            return true;
        }
        return false;
    }
    
}
