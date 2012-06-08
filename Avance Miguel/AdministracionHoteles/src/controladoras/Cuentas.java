/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;
import java.util.ArrayList;
import modelos.Cliente;


public class Cuentas{
    private ArrayList<Cliente>clientes;
    
    public Cuentas(){   
        clientes = new ArrayList<Cliente>();
    }    
    public ArrayList<Cliente>getClientes(){
        return clientes;  
    }
    void registrarCliente(String codigo,String correoElectronico,String contrasena){
        
        buscarCliente(codigo, contrasena);
        
         Cliente cliente = new Cliente(codigo,correoElectronico, contrasena);
        clientes.add(cliente);      
    }
      private void buscarCliente (String codigo, String contrasena)throws RuntimeException{
          for (Cliente cliente: clientes){
          if (cliente.getCodigo().equals(codigo)) {       
                throw new RuntimeException("Cliente ya registrado");   
        }   
      }
      }
       
      }
          
 

    

