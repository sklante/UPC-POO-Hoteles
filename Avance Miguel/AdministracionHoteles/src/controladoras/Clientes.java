

package controladoras;
import modelos.Cliente;
import modelos.Hotel;
import modelos.Habitacion;
import java.util.ArrayList;

public class Clientes {
     private ArrayList<Cliente> dbClientes = new ArrayList<Cliente>();
    
    private void simularTabla(){
        this.dbClientes.add(new Cliente("01", "sklante_1@hotmail.com", "123456"));       
          this.dbClientes.add(new Cliente("02", "alfredo@hotmail.com", "1234"));
          this.dbClientes.add(new Cliente("03", "ana@hotmail.com", "1234")); 
         
        
          
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
   
    
    
    
    
    
    
    
    private ArrayList<Habitacion>habitaciones;
       
       public Clientes(){
        habitaciones = new ArrayList<Habitacion>();
}
            
             public ArrayList<Habitacion>getHabitaciones(){
        return habitaciones;  
        
    }
             void registrarHabitacion(String nombreHabitacion, String tipoHabitacion,Hotel hotel){
        
        buscarHabitacion(nombreHabitacion);
        
         Habitacion habitacion = new Habitacion(nombreHabitacion, tipoHabitacion, hotel);
        habitaciones.add(habitacion);      
    }
      private void buscarHabitacion (String nombreHabitacion)throws RuntimeException{
          for (Habitacion habitacion: habitaciones){
          if (habitacion.getNombreHabitacion().equals(nombreHabitacion)) {       
                throw new RuntimeException("Habitacion registrado");   
        }   
      }
      }
                    
    
    
}