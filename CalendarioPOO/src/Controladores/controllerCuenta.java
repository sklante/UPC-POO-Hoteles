
package Controladores;

import java.util.ArrayList;
import Modelos.Cliente;

public class controllerCuenta {
    
    private ArrayList<Cliente> cuentas;

    public controllerCuenta() {
        cuentas=new ArrayList<Cliente>();
    }

    public ArrayList<Cliente> getCuentas() {
        return cuentas;
    }
    
    private void validarDatos(String correo, String password, String confirmaPassword, String nombreHotel, 
            String direccionClerk, boolean terminosCondiciones)
            throws BusinessException {
        String msg = "";
        //== null cuando es nulo
        //isEmpty cuando esta vacio
        if (correo == null || correo.isEmpty())
            msg = "Correo no puede ser vacio o nulo";

        if (password == null || password.isEmpty())
            msg += "\nDebe de Ingresar Contraseña para crear su cuenta";

        if (confirmaPassword == null || confirmaPassword.isEmpty()){
            msg += "\nPara confirmar ingrese nuevamente su contraseña";

            if (confirmaPassword != password)
                msg += "\nAmbas contraseñas contraseñas deben de coincidir";
        }
        
        if (nombreHotel == null || nombreHotel.isEmpty())
            msg += "\nNombre de Hotel no pueder ser vacio o nulo";
        if (direccionClerk == null || direccionClerk.isEmpty())
            msg += "\nDebe de ingresar una direccion valida";
        if (terminosCondiciones == false)
            msg += "\nDebe aceptar los términos y condiciones para registrar su cuenta";
        if (! msg.isEmpty())
            throw new BusinessException(msg);
    }
    
    private void validarDuplicidad(String correo)
        throws BusinessException {
        if (buscarCuenta(correo) != null){
            String msg = "La direccion de correo "+correo+ " ya ha sido registrada.";
            throw  new BusinessException(msg);
        }
    }
         
    public void registrarCuenta(String correo, String pass1, String pass2, String nombreHotel,
            String direccionClerk, String codigoUsuario, boolean terminosCondiciones)throws BusinessException{
       
        validarDatos(correo, pass1, pass2, nombreHotel, direccionClerk, terminosCondiciones);
        validarDuplicidad(correo);

        String estado = "A";
        String plan   = "G";
        String hora = "13";
        int dia = 2;
        
        Cliente cliente = new Cliente(codigoUsuario,correo, pass1, pass2,estado);
        
        getCuentas().add(cliente);

    }
    
    public Cliente buscarCuenta(String codigo) {
        // Buscar cuenta por correo
        for(Cliente cuenta : getCuentas())
            if (cuenta.getCodigo().equals(codigo)){
               return cuenta;
            }
        return null;
    }
        
    public boolean verificarCorreo(String correo){
        if(correo!=null){
            return true;
        }
          return false;
    }
    
     public int getClientes(){
        return 0;
    }
}
