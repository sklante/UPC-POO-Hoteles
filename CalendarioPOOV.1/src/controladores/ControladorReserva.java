
package controladores;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alfredol
 */
public class ControladorReserva {

   public static boolean confirmarReserva(boolean confirma){
        boolean confirmado = false;
        if(confirma == false){
            confirmado = true;
        }else{
            System.out.println("La reserva ya esta confirmada");
            confirmado = true;
        }
        return confirmado;
    }

    public static boolean validaAutomaticoFecha(int dia, int mes, int anho, boolean estado, boolean check){
        boolean validado;
        String diaConfirmado, mesConfirmado = " ";
        if(dia > 9){
            diaConfirmado = Integer.toString(dia);
        }else{
            diaConfirmado = "0" + Integer.toString(dia);
        }
        if(mes > 9){
            mesConfirmado = Integer.toString(mes);
        }else{
            mesConfirmado = "0" + Integer.toString(mes);
        }

        String anhoConfirmado = Integer.toString(anho);
        String fechaConfirmada = anhoConfirmado + mesConfirmado + diaConfirmado;

        int fconfirmada = Integer.parseInt(fechaConfirmada);

        Date fechaActual = new Date();
        SimpleDateFormat formatoAnho = new SimpleDateFormat("yyyy");
        String fechaAnho = formatoAnho.format(fechaActual);
        SimpleDateFormat formatoMes = new SimpleDateFormat("MM");
        String fechaMes = formatoMes.format(fechaActual);
        SimpleDateFormat formatoDia = new SimpleDateFormat("dd");
        String fechaDia = formatoDia.format(fechaActual);

        String fechaSistema = fechaAnho+fechaMes+fechaDia;
        int fsistema = Integer.parseInt(fechaSistema);

        if(fconfirmada < fsistema && check == false){
            validado = false;
        }else{
            validado = true;
        }

        return validado;
    }

     public static boolean realizaCheckInOut(boolean check) {
        boolean efectuaReserva;
        if(check == false){
            efectuaReserva = true;
            System.out.println("Se tomó la Reserva");
        } else{
            efectuaReserva = false;
            System.out.println("Se liberó la Reserva");
        }
        return efectuaReserva;
    }

    public static boolean liberarReserva(boolean estado, boolean check) {

        if(estado = true && check == true){
            estado = false;
        }else{
            System.out.println("Reserva NO Cancelada. Verifica estado y check In");
            estado = true;
        }
        return estado;
    }


}
