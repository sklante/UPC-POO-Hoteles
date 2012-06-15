package controladores;

import java.util.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelos.*;
import vista.anadirHabitacion;
import vista.wizard.TablaDefinirPrecios;

public class ControladorHotel {

    public static List<Cliente> clientes;
    public static List<Persona> pasajeros;
    public static List<Reserva> reservas = new ArrayList<Reserva>();
    public static List<Map<String, Object>> mapaReservas = new ArrayList<Map<String, Object>>();
    public static List<Habitacion> habitaciones = new ArrayList<Habitacion>();
    public static List<TipoHabitacion> tiposHabitacion = new ArrayList<TipoHabitacion>();
    public static List<TipoPasajero> tiposPasajero;
    public static List<Moneda> monedas = new ArrayList<Moneda>();

    public static void tiposHabitacionesDefecto() {
        tiposHabitacion.add(new TipoHabitacion("Simple"));
        tiposHabitacion.add(new TipoHabitacion("Doble"));
        tiposHabitacion.add(new TipoHabitacion("Suite"));
        tiposHabitacion.add(new TipoHabitacion("Departamento"));
        tiposHabitacion.add(new TipoHabitacion("Cabina"));
        tiposHabitacion.add(new TipoHabitacion("Sala de Reuniones"));
        tiposHabitacion.add(new TipoHabitacion("Presidenciales"));
    }

    public static TipoHabitacion[] listaTipoHabitaciones() {
        if (tiposHabitacion.isEmpty()) {
            tiposHabitacionesDefecto();
        }
        TipoHabitacion[] listaString = listaString(tiposHabitacion);
        return listaString;
    }

    public static void siListaMonedasVacia() {

        TablaDefinirPrecios definir = new TablaDefinirPrecios();
        definir.setLocationRelativeTo(null);
        definir.setVisible(true);

    }

    public static void agregarTiposHabitacion(String tipo) {

        tiposHabitacion.add(new TipoHabitacion(tipo));

    }

    public static Moneda[] listaMonedas() {
        return listaMonedas(monedas);
    }

    public static Habitacion[] listaHabitaciones() {
        return listaHabitaciones(habitaciones);
    }

    public static void agregarMoneda(String nombreMoneda, String simbolo, int tipoCambio, boolean predeterminado) {
       
        if(monedas.size() < 3 ){
            monedas.add(new Moneda(nombreMoneda, simbolo, tipoCambio, predeterminado));
        }else{
            System.out.println("Solo se permite hasta tres monedas");
        }
    }

    public static void agregarReservaTabla(Habitacion habitacion, Fecha fecha, int dias) {
        if (!esNulos(habitacion) && !esNulos(fecha) && dias >= 1) {
            Map<String, Object> mapa = new HashMap<String, Object>();
            mapa.put("habitacion", habitacion);
            mapa.put("fechaEntrada", fecha.toFechaCompleta());
            Fecha fecha1 = fecha.add(dias - 1, Calendar.DATE);
            mapa.put("fechaSalida", fecha1.toFechaCompleta());
            mapa.put("dias", dias);
            mapa.put("precioTotal", habitacion.getTipoHabitacion().getPrecio() * dias);
            mapaReservas.add(mapa);
        } else {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos", "Detalle de Reserva", 2);
        }
    }

    public static void quitarReservaTabla(Habitacion habitacion, Fecha fecha, int dias) {
        if (!esNulos(habitacion) && !esNulos(fecha) && dias >= 1) {
            if (mapaReservas.isEmpty()) {
                for (Map<String, Object> mapa : mapaReservas) {
                    if (((Habitacion) mapa.get("habitacion")).equals(habitacion)
                            && ((Fecha) mapa.get("fechaEntrada")).equals(mapa)
                            && Integer.parseInt(mapa.get("dias").toString()) == dias) {
                        mapaReservas.remove(mapa);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existen Reservas a eliminar", "Detalle de Reserva", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos", "Detalle de Reserva", 2);
        }
    }

    public static Object[][] mapaReservasObject() {
        Object[][] reservasObj = null;
        if (mapaReservas.isEmpty()) {
            reservasObj = new Object[1][6];
            JOptionPane.showMessageDialog(null, "No se tiene reservas", "Detalle de Reserva", 2);
        } else {
            reservasObj = new Object[mapaReservas.size()][6];
            for (int i = 0; i < mapaReservas.size(); i++) {
                reservasObj[i][0] = mapaReservas.get(i).get("habitacion");
                reservasObj[i][1] = mapaReservas.get(i).get("fechaEntrada");
                reservasObj[i][2] = mapaReservas.get(i).get("fechaSalida");
                reservasObj[i][3] = mapaReservas.get(i).get("dias");
                reservasObj[i][4] = mapaReservas.get(i).get("precioTotal");
                reservasObj[i][5] = null;
            }
        }
        return reservasObj;
    }

    public static void AgregarReservaPreliminar(Habitacion habitacion, Fecha fecha, int dias) {
        if (esNulos(habitacion) && esNulos(fecha) && dias > 0) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos", "Detalle de Reserva", 2);
        } else {
            for (int i = 0; i < dias; i++) {
                Reserva reserva = new Reserva(null, habitacion, fecha.getDiaNumero(),
                        fecha.getMesNumero(), fecha.getAnio());
                reservas.add(reserva);
                fecha = fecha.add(1, Calendar.DATE);
            }
        }
    }

    public static void crearHabitaciones(String nombre, TipoHabitacion tipo) {

        habitaciones.add(new Habitacion(nombre, tipo));

    }

    public static void asignarPrecios(double precio, int indice, Moneda moneda) {

        listaTipoHabitaciones()[indice].setPrecio(precio);
        listaTipoHabitaciones()[indice].setMoneda(moneda);

    }

    public static boolean esNulos(String campo) {
        if (campo.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esNulos(Object campo) {
        if (campo == null) {
            return true;
        } else {
            return false;
        }
    }
    //ascii 48 al 57 (numeros) 46= .  44= ,
    public static boolean esNumeroDecimal(String numero) {
        for (int i = 0; i < numero.length(); i++) {
            if (!((numero.charAt(i) > 47 && numero.charAt(i) < 58 || numero.charAt(i) == 46
                    || numero.charAt(i) == 44))) {
                return false;
            }
        }
        return true;
    }

    public static boolean esNumeroHabValido(String numero) {
        for (int i = 0; i < numero.length(); i++) {
            if (!((numero.charAt(i) > 47 && numero.charAt(i) < 58))) {
                return false;
            }
        }
        return true;
    }

    public static boolean esNumeroHabLicencia(int numero) {
        if (numero < 31 && numero > 0) {
            return true;
        }
        return false;
    }

    private static Moneda[] listaMonedas(List<Moneda> listas) {
        Moneda[] lista = new Moneda[listas.size()];
        for (int i = 0; i < listas.size(); i++) {
            lista[i] = listas.get(i);
        }
        return lista;
    }

    private static Habitacion[] listaHabitaciones(List<Habitacion> listas) {
        Habitacion[] lista = new Habitacion[listas.size()];
        for (int i = 0; i < listas.size(); i++) {
            lista[i] = listas.get(i);
        }
        return lista;
    }

    private static TipoHabitacion[] listaString(List<TipoHabitacion> listas) {
        TipoHabitacion[] lista = new TipoHabitacion[listas.size()];
        for (int i = 0; i < listas.size(); i++) {
            lista[i] = listas.get(i);
        }
        return lista;
    }

    public static Fecha formatoHaciaFecha(String formato) {
        Fecha fecha = null;
        try {
            String dia1 = formato.substring(0, formato.indexOf('/'));
            formato = formato.substring(formato.indexOf('/') + 1);
            String mes1 = formato.substring(0, formato.indexOf('/'));
            String anio1 = formato.substring(formato.indexOf('/') + 1);
            int diaInt = Integer.parseInt(dia1);
            int mesInt = Integer.parseInt(mes1);
            int anioInt = Integer.parseInt(anio1);
            fecha = new Fecha(diaInt, mesInt, anioInt);
        } catch (StringIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese en el formato solicitado", "Aviso de Error", 1);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese los fecha en numeros", "Aviso de Error", 1);
        }
        return fecha;
    }
    public static boolean verificaNombreHotel(String nombreh){
        boolean valido = false;
       // this.password = null;
        if(nombreh != null){
            valido = true;
        }
        return valido;
    }


    public static void main(String[] args) {
        
        
        System.out.println('.'==46);
        System.out.println(','==44);
        System.out.println('9'==57);
//                Fecha fecha = new Fecha(12, 6, 2012);
//                Habitacion habitacion = new Habitacion(103, new TipoHabitacion("Suite", 50.00));
//                agregarReservaTabla(habitacion, fecha, 3);
//                AgregarReservaPreliminar(habitacion, fecha, 3);
//        
//                for (Map<String, Object> string : mapaReservas) {
//                    System.out.println(string.get("habitacion"));
//                    System.out.println(string.get("fechaEntrada"));
//                    System.out.println(string.get("fechaSalida"));
//                    System.out.println(string.get("dias"));
//                    System.out.println(string.get("precioTotal"));
//                }
        
//                for (Reserva string : reservas) {
//                    System.out.println(string.getIdReserva());
//                    System.out.println(string.getFecha().toFechaCompleta());
//                    System.out.println(string.getHabitacion());
//                    System.out.println(string.getHabitacion().getTipoHabitacion().getPrecio());
//                }
    }
}
