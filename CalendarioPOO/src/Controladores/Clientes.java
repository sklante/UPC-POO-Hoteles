/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import Modelos.Cliente;
import java.util.ArrayList;
/**
 *
 * @author Miguel
 */
public class Clientes {
     private ArrayList<Cliente> dbClientes = new ArrayList<Cliente>();
    
    private void simularTabla(){
        this.dbClientes.add(new Cliente("01", "sklante_1@hotmail.com", "123456", "123456", "A"));       
          this.dbClientes.add(new Cliente("02", "alfredo@hotmail.com", "1234", "1234","A"));
          this.dbClientes.add(new Cliente("03", "ana@hotmail.com", "1234", "1234","A")); 
    }
    
    public boolean verificarCorreoElectronico(String correoElectronico){
        if(correoElectronico != null){
            return true;
        }
        return false;
    }
    
    public Cliente existeCorreoElectronico(String correoElectronico){
        simularTabla();
        Cliente clienteEncontrado = null;
        for(Cliente cliente : dbClientes){
            if(cliente.getCorreoElectronico().equals(correoElectronico))
                clienteEncontrado = cliente;
        }
        return clienteEncontrado;            
    }
    
    public boolean validarPassword(String correoElectronico, String contrasena, String contrasena2){
        boolean acceso = false;
        
        Cliente clienteValido = existeCorreoElectronico(correoElectronico);
        if(clienteValido.getContrasena().equals(contrasena2)){
            acceso = true;
        }
        return acceso;
    }
    
    
}
