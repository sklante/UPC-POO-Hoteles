
package modelos;

import java.util.ArrayList;
import modelos.Cuenta;
import modelos.Usuario;


public class Cliente extends Usuario {
    
  private String codigoCliente;


    public Cliente (String codigoCliente, String nombre, String apellido, String correoElectronico, String password) {
        super(nombre, apellido, correoElectronico, password);
        this.codigoCliente = codigoCliente;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
}
