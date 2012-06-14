package controladoras;

import modelos.Cliente;
import modelos.Hotel;
import modelos.Habitacion;
import modelos.TipoHabitacion;

import java.util.ArrayList;

public class Clientes {

     
    private ArrayList<Cliente> dbClientes = new ArrayList<Cliente>();

    private void simularTabla() {
        this.dbClientes.add(new Cliente("01", "sklante_1@hotmail.com", "123456"));
        this.dbClientes.add(new Cliente("02", "alfredo@hotmail.com", "1234"));
        this.dbClientes.add(new Cliente("03", "ana@hotmail.com", "1234"));



    }

    public boolean verificarCorreoElectronico(String correoElectronico) {
        if (correoElectronico != null) {
            return true;
        }
        return false;
    }

    public Cliente existeCorreoElectronico(String correoElectronico) {
        simularTabla();
        Cliente clienteEncontrado = null;
        for (Cliente cliente : dbClientes) {
            if (cliente.getCorreoElectronico().equals(correoElectronico)) {
                clienteEncontrado = cliente;
            }
        }
        return clienteEncontrado;
    }

    public boolean validarPassword(String correoElectronico, String contrasena, String contrasena2) {
        boolean acceso = false;

        Cliente clienteValido = existeCorreoElectronico(correoElectronico);
        if (clienteValido.getContrasena().equals(contrasena2)) {
            acceso = true;
        }
        return acceso;
    }
    private ArrayList<Habitacion> habitaciones;

    public Clientes() {
        habitaciones = new ArrayList<Habitacion>();
    }
    
    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;

    }


   public ArrayList<Habitacion> setHabitaciones() {
        return habitaciones;

    }

   public boolean verificarTotalHabitaciones(int setHabitaciones, int getHabitaciones){
       
       if (setHabitaciones == getHabitaciones){
              return  true;
           
       }else
          return  false;
                  
   }
   
     public boolean verificarNombreHabitacionyTipo(String nombreHabitacion, String tipoHabitacion) {
         
        if (nombreHabitacion == "" && tipoHabitacion == "") {
                                
             nombreHabitacion = "";
           tipoHabitacion = "single";
            
            return true;
        }else{
            
           return false;
        }
            
       
    }
   
   
    
    void registrarHabitacion(String nombreHabitacion, TipoHabitacion tipoHabitacion, Hotel hotel) {

        
        buscarHabitacion(nombreHabitacion);

        Habitacion habitacion = new Habitacion(nombreHabitacion, tipoHabitacion, hotel);
        habitaciones.add(habitacion);
    }
    
    
     void eliminaHabitaciones(String nombreHabitacion) {
        
        buscarHabitacion(nombreHabitacion);
        habitaciones.remove(buscarHabitacion(nombreHabitacion));
        
       
    }
    

    public Habitacion buscarHabitacion(String nombreHabitacion)  {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNombreHabitacion().equals(nombreHabitacion)) {
                //throw new RuntimeException("Habitacion registrado");
           return habitacion;
            }
        }
        return null;
    }
}
