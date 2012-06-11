
package modelos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Reserva implements InterfaceGeneral{
    
    private static int id=1;
    private int idReserva;
    private Pasajero cliente;
    private Habitacion habitacion;
    private int dia;
    private int mes;
    private int anio;
    private EstadoReserva estado;
    private boolean check;
    private boolean errorInt;
    private boolean errorObject;
    //private Fecha fecha;
    
    public Reserva(Pasajero cliente, Habitacion habitacion, int dia, int mes, int anio){
        this.cliente=cliente;
        this.habitacion=habitacion;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.idReserva=id;
        id++;
    }
    
    public Reserva(Pasajero cliente, Habitacion habitacion, int dia, int mes, int anio,
            String estadoReserva){
        this.cliente=cliente;
        this.habitacion=habitacion;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.idReserva=id;
        this.estado = new EstadoReserva(estadoReserva);
        id++;
    }

    public Reserva(Pasajero cliente, Habitacion habitacion, int dia, int mes, int anio,
            String estadoReserva, boolean check){
        this.cliente=cliente;
        this.habitacion=habitacion;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.idReserva=id;
        this.estado = new EstadoReserva(estadoReserva);
        this.check = check;
        id++;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }



    public Fecha getFecha() {
        return new Fecha(this.dia, this.mes, this.anio);
    }
    
    public int getIdReserva() {
        return idReserva;
    }
    
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Pasajero getCliente() {
        return cliente;
    }

    public void setCliente(Pasajero cliente) {
        this.cliente = cliente;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public String toString(){
        return "Reservado";
    }
    
    public String toDetail(){
        return "El Hotel 'TU CASA' te da la bienvenida\n\n\n"+
                "Detalle de factura\n\n"+
                "Fecha de emsión:\t\t\t" + new Fecha(new Date()).toComplet()+
                "\nId de Reserva:\t\t\t" + this.idReserva +
                "\nNombre de Cliente:\t\t\t" + this.getCliente().toString() +
                "\nNumero de Habitacion:\t\t\t" + this.getHabitacion().getNumHabitacion() +
                "\nTipo de Habitacion:\t\t\t" + this.getHabitacion().getTipoHabitacion().toString() +
                "\nPrecio por Dia:\t\t\t" + this.getHabitacion().getTipoHabitacion().getPrecio() +
                "\nDescuento:\t\t\t" + "0.00" +
                "\nFecha de Reserva:\t\t\t" + this.dia+"/"+this.mes+"/"+this.anio +
                "\nUsuario del sistema:\t\t\t" + "Cgarrido" + 
                "\nEstado de la reserva:\t\t\t" + this.estado +
                "\n\n\nVisitenos nuevamente.";
               
    }
    
    @Override
    public boolean isErrorInt() {
        return errorInt;
    }

    @Override
    public boolean isErrorObject() {
        return errorObject;
    }

    @Override
    public boolean validarNulos(Object campo) {
        if (campo != null) {
            return true;
        } else {
            errorObject = true;
            return false;
        }
    }

    @Override
    public boolean validarIgualesObject(Object variable1, Object variable2) {
        if (variable1.equals(variable2)) {
            return true;
        } else {
            errorObject = true;
            return false;
        }
    }

    @Override
    public boolean validarNumerosValidos(int numero) {
        if (numero <= 0) {
            errorInt = true;
            return false;
        }
        return true;
    }

    public String confirmarReserva(String confirma){
        String confirmado = " ";
        if(confirma.equals("NO CONFIRMADO")){
            confirmado = "CONFIRMADO";
        }else{
            System.out.println("La reserva ya esta confirmada");
            confirmado = confirma;
        }
        return confirmado;
    }

    public String validaAutomaticoFecha(int dia, int mes, int anho, String estado, boolean check){
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

    public boolean realizaCheckInOut(boolean check) {
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

    public String liberarReserva(String estado, boolean check) {
        if(estado.equals("CONFIRMADO") && check == true){
            estado = "CANCELADO";
        }else{
            System.out.println("Verifica estado y check In");
        }
        return estado;
    }


}
