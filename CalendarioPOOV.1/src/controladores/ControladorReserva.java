
package controladores;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alfredol
 */
public class ControladorReserva {
   public static String confirmarReserva(String confirma){
        String confirmado = " ";
        if(confirma.equals("NO CONFIRMADO")){
            confirmado = "CONFIRMADO";
        }else{
            System.out.println("La reserva ya esta confirmada");
            confirmado = confirma;
        }
        return confirmado;
    }

    public static String validaAutomaticoFecha(int dia, int mes, int anho, String estado, boolean check){
        String validado = "";
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

        if(fconfirmada > fsistema && check == false){
            validado = "CANCELADO AUTOMATICO";
        }else{
            validado = estado;
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

    public static String liberarReserva(String estado, boolean check) {
        if(estado.equals("CONFIRMADO") && check == true){
            estado = "CANCELADO";
        }else{
            System.out.println("Reserva NO Cancelada. Verifica estado y check In");
        }
        return estado;
    }


}
