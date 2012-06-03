
package Vista;
import Controladores.BusinessException;
import Controladores.controllerCuenta;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelos.Hotel;
import Modelos.Cliente;
import sun.applet.Main;

public class Ingreso {


    public static void main(String[] args) {

        String termCondiciones;
        boolean terminosCondiciones = false;
        boolean valcorreo = false;
        boolean validaCon = true;
        String pass1, pass2;

        Scanner in = new Scanner(System.in);
        Cliente usuario = new Cliente();
        Hotel hotel = new Hotel(null, null, null);

        System.out.println("INFORMACIÓN PERSONAL");

        
        do {
            System.out.println("Correo Electronico");
            usuario.setCorreoElectronico(in.next());
            valcorreo = usuario.verificaCorreo(usuario.getCorreoElectronico());
            if(valcorreo == false)
                System.out.println("Debe ingresar Correo");
            validaCon = usuario.validarCorreo(usuario.getCorreoElectronico());
            if(validaCon == false)
                System.out.println("Correo incorrecto, vuelva a ingresar");

        }while(valcorreo == false || validaCon == false);
        
        boolean pass = false;
        do {
        System.out.println("Escoje tu Contraseña");
        pass1 = in.next();
        System.out.println("Repite tu Contraseña");
        pass2 = in.next();

        pass = usuario.validaSiCoinciden(pass1, pass2);
        if(pass == false)
            System.out.println("Dartos no coinciden");
        }while(pass == false);

        System.out.println("INFORMACIÓN DEL HOTEL");

        System.out.println("Nombre del Hotel");
        hotel.setNombre(in.next());
        System.out.println("Nombre seleccione una recomendación");
        hotel.setDireccionClerk(hotel.seleccionNombre(hotel.getNombre()));
        System.out.println("Su dirección será:");
        System.out.println("http://"+hotel.getDireccionClerk()+".clerk.im");

        //System.out.println("Escoje tu direccion en Clerk");
        //hotel.setDireccion(in.next());

        System.out.println("He leido y acepto todos los Terminos y Condiciones. (s/n)");
        termCondiciones = in.next();
        char decision;

        decision = termCondiciones.charAt(0) ;

             switch(decision){
             case 's':
                    terminosCondiciones = true;
                    break;
             case 'n':
                    terminosCondiciones = false;
                    System.out.println("Para registrar Cuenta debe de Aceptar Terminos y Condiciones");
                    break;
             default:
                    System.out.println("ERROR de ingreso");
                    break;
            }

        controllerCuenta cuenta = new controllerCuenta();

        try {

           cuenta.registrarCuenta(usuario.getCorreoElectronico(), pass1, pass2, hotel.getNombre(), hotel.getDireccionClerk(), usuario.getCodigo(), terminosCondiciones);

        System.out.println("Cuenta Registrada Satisfactoriamente:");
        System.out.println("Tiene que confimar su correo en un plazo de 24 horas");
        System.out.println("Ha ingresado a su plan gratuito hasta que decida cambiar a aun plan con costo");

        //System.out.println(correo);
        } catch (BusinessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    }

