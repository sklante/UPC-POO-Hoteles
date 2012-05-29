/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;
import java.util.ArrayList;
import modelos.Cliente;
import modelos.Cliente;

/**
 *
 * @author Angel
 */
public class Cuentas{
    private ArrayList<Cliente>clientes;
    
    public Cuentas(){
        
        clientes = new ArrayList<Cliente>();
    }
    
    public ArrayList<Cliente>getClientes(){
        return clientes;
        
    }
    void registrarCliente(String codigo,String correoElectronico,String contrasena,String contrasena2){
        
        buscarCliente(codigo, contrasena, contrasena2);
        
         Cliente cliente = new Cliente(codigo,correoElectronico, contrasena,contrasena2);
        clientes.add(cliente);
      
    }
      private void buscarCliente (String codigo, String contrasena, String contrasena2)throws RuntimeException{
          for (Cliente cliente: clientes){
          if (cliente.getCodigo().equals(codigo)) {       
                throw new RuntimeException("Cliente ya registrado");   
        } 
         
         
      }
          
       
      }
       
      }
          
 

    

