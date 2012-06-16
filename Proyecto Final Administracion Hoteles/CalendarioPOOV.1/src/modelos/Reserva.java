
package modelos;

import java.util.Date;


public class Reserva implements InterfaceGeneral{
    
    private String idReserva;
    private Entidad cliente;
    private Agencia agencia;
    private Empresa empresa;
    private Habitacion habitacion;
    private int dia;
    private int mes;
    private int anio;
    private boolean checkOut=false;
    private boolean checkIn=false;
    private boolean pendiente;
    private boolean confirmado=false;
    private boolean errorInt;
    private boolean errorObject;
    //private Fecha fecha;
    
    public Reserva(String id, Entidad cliente, Habitacion habitacion, int dia, int mes, int anio){
        if(cliente == null){
            this.pendiente = false;
        }else{
            this.pendiente = true;
        }
        this.cliente=cliente;
        this.habitacion=habitacion;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.idReserva=id;
        
    }

    public Fecha getFecha() {
        return new Fecha(this.dia, this.mes, this.anio);
    }
    
    public String getIdReserva() {
        return idReserva;
    }
    
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Entidad getCliente() {
        return cliente;
    }

    public void setCliente(Entidad cliente) {
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

    public boolean isCheckIn() {
        return checkIn;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

    public boolean isPendiente() {
        return pendiente;
    }

    public void setPendiente(boolean pendiente) {
        this.pendiente = pendiente;
    }
    
    public String toString(){
        if(this.cliente == null){
            return "No confirmado";
        }else{
            return "Reservado: " + cliente.getNombre();
        }
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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
    
}
