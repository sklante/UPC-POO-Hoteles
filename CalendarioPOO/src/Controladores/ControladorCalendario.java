package Controladores;

import Modelos.Cliente;
import Modelos.Fecha;
import Modelos.Habitacion;
import Modelos.Mes;
import Modelos.Reserva;
import Modelos.TipoHabitacion;
import java.util.*;

public class ControladorCalendario {

    private List<Reserva> listaReserva = llenadoReservas();
    public static List<Habitacion> listaHabitacion = llenadoHabitaciones();

    public ControladorCalendario() {
    }

    public List<Reserva> llenadoReservas() {
        Cliente cliente1 = new Cliente("Jorge", "Chavez");
        Cliente cliente2 = new Cliente("Miguel", "Grau");
        Cliente cliente3 = new Cliente("Francisco", "Bolognesi");
        Cliente cliente4 = new Cliente("Manuel", "Prada");
        Cliente cliente5 = new Cliente("Jose", "Galvez");
        Cliente cliente6 = new Cliente("Cesar", "Vallejo");
        Cliente cliente7 = new Cliente("Jose", "Mariategui");
        Cliente cliente8 = new Cliente("Alfonso", "Ugarte");
        Cliente cliente9 = new Cliente("Jose", "Chocano");
        Cliente cliente10 = new Cliente("Alejandro", "Magno");
        Cliente cliente11 = new Cliente("Luis", "Miguel");
        Cliente cliente12 = new Cliente("Alan", "Garcia");
        Cliente cliente13 = new Cliente("Pedro", "Fernandez");

        listaReserva = new ArrayList<Reserva>();
        listaReserva.add(new Reserva(cliente1, listaHabitacion.get(1), 31, 5, 2012, "CONFIRMADA"));
        listaReserva.add(new Reserva(cliente2, listaHabitacion.get(2), 31, 5, 2012, "RESERVADA"));
        listaReserva.add(new Reserva(cliente3, listaHabitacion.get(4), 31, 5, 2012, "CHECK IN"));
        listaReserva.add(new Reserva(cliente4, listaHabitacion.get(5), 31, 5, 2012, "CHECK IN"));
        listaReserva.add(new Reserva(cliente5, listaHabitacion.get(9), 31, 5, 2012, "CHECK IN"));
        listaReserva.add(new Reserva(cliente5, listaHabitacion.get(10), 31, 5, 2012, "CONFIRMADA"));
        listaReserva.add(new Reserva(cliente6, listaHabitacion.get(11), 31, 5, 2012, "CONFIRMADA"));
        listaReserva.add(new Reserva(cliente7, listaHabitacion.get(12), 31, 5, 2012, "CONFIRMADA"));
        listaReserva.add(new Reserva(cliente8, listaHabitacion.get(21), 31, 5, 2012, "CONFIRMADA"));
        listaReserva.add(new Reserva(cliente9, listaHabitacion.get(22), 31, 5, 2012, "CONFIRMADA"));
        listaReserva.add(new Reserva(cliente10, listaHabitacion.get(23), 31, 5, 2012, "RESERVADA"));
        listaReserva.add(new Reserva(cliente10, listaHabitacion.get(24), 31, 5, 2012, "RESERVADA"));
        listaReserva.add(new Reserva(cliente10, listaHabitacion.get(24), 20, 6, 2012, "RESERVADA"));
        listaReserva.add(new Reserva(cliente10, listaHabitacion.get(23), 20, 6, 2012, "RESERVADA"));
        listaReserva.add(new Reserva(cliente11, listaHabitacion.get(29), 7, 6, 2012, "RESERVADA"));
        listaReserva.add(new Reserva(cliente12, listaHabitacion.get(10), 7, 6, 2012, "RESERVADA"));
        listaReserva.add(new Reserva(cliente13, listaHabitacion.get(11), 7, 6, 2012, "RESERVADA"));
        listaReserva.add(new Reserva(cliente13, listaHabitacion.get(11), 8, 6, 2012, "RESERVADA"));
        listaReserva.add(new Reserva(cliente13, listaHabitacion.get(11), 9, 6, 2012, "RESERVADA"));
        listaReserva.add(new Reserva(cliente13, listaHabitacion.get(11), 10, 6, 2012, "RESERVADA"));
        return this.listaReserva;
    }

    public static List<Habitacion> llenadoHabitaciones() {
        listaHabitacion = new ArrayList<Habitacion>();
        int i = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        while (i < 30) {
            if (i < 10) {
                TipoHabitacion tipoHabitacion = new TipoHabitacion("NORMAL", 50.00);
                Habitacion habitacion = new Habitacion(301 + a, tipoHabitacion);
                listaHabitacion.add(habitacion);
                a++;
            } else if (i < 20) {
                TipoHabitacion tipoHabitacion = new TipoHabitacion("DOBLE", 100.00);
                Habitacion habitacion = new Habitacion(201 + b, tipoHabitacion);
                listaHabitacion.add(habitacion);
                b++;
            } else {
                TipoHabitacion tipoHabitacion = new TipoHabitacion("PRESIDENCIAL", 200.00);
                Habitacion habitacion = new Habitacion(101 + c, tipoHabitacion);
                listaHabitacion.add(habitacion);
                c++;
            }
            i++;
        }
        return listaHabitacion;
    }

    public Object[][] listaHabitacionesTab(List<Habitacion> listaHabitacion) {
        Object[][] guia = new Object[listaHabitacion.size()][1];
        for (int i = 0; i < listaHabitacion.size(); i++) {
            guia[i][0] = listaHabitacion.get(i).getNumHabitacion();
        }
        return guia;
    }

    public Object[][] listaHabitacionesTabOrdenado(List<Habitacion> listaHabitacion) {
        Object[][] guia = new Object[listaHabitacion.size()][1];
        for (int i = 0; i < listaHabitacion.size(); i++) {
            guia[i][0] = listaHabitacion.get(i);
        }
        Object[] guia2 = new Object[listaHabitacion.size()];
        Object[][] datosFinal = new Object[listaHabitacion.size()][1];
        for (int i = 0; i < guia.length; i++) {
            guia2[i] = ((Habitacion) guia[i][0]).getNumHabitacion();
        }
        Arrays.sort(guia2);
        for (int i = 0; i < datosFinal.length; i++) {
            datosFinal[i][0] = guia2[i];
        }
        return datosFinal;
    }

    public Object[][] listaHabitacionesCom(List<Habitacion> listaHabitacion) {
        Object[][] guia = new Object[1][listaHabitacion.size()];
        for (int i = 0; i < listaHabitacion.size(); i++) {
            guia[0][i] = listaHabitacion.get(i);
        }
        return guia;
    }

    public Object[][] listaHabitacionesComOrdenado(List<Habitacion> listaHabitacion) {
        Object[][] guia = new Object[1][listaHabitacion.size()];
        for (int i = 0; i < listaHabitacion.size(); i++) {
            guia[0][i] = listaHabitacion.get(i).getNumHabitacion();
        }
        //Arrays.sort(guia);
        return guia;
    }

    public Object[][] ordenarHabitacionesPorTipo(Object[][] listaHabitacion) {
        Object[] guia = listaHabitacion[0];
        Arrays.sort(guia);
        return listaHabitacion;
    }

    public Object[][] ordenarArrayPorUnaFila(Object[][] calendarioTabla) {

        Object[] guia = new Object[calendarioTabla[0].length];
        System.arraycopy(calendarioTabla[0], 0, guia, 0, guia.length);
        Object[][] dadosFinal = new Object[calendarioTabla.length][calendarioTabla[0].length];
        Arrays.sort(guia);
        for (int i = 0; i < calendarioTabla[0].length; i++) {
            for (int j = 0; j < calendarioTabla[0].length; j++) {
                if (guia[i].equals(calendarioTabla[0][j])) {
                    for (int k = 0; k < dadosFinal.length; k++) {
                        dadosFinal[k][i] = calendarioTabla[k][j];
                    }
                }
            }
        }
        return dadosFinal;
    }

    public Object[][] ordenarArrayPorUnaColumna(Object[][] calendarioTabla) {

        Object[] guia = new Object[calendarioTabla.length];
        Object[][] datosFinal = new Object[calendarioTabla.length][1];
        for (int i = 0; i < calendarioTabla.length; i++) {
            guia[i] = ((Habitacion) calendarioTabla[i][0]).getNumHabitacion();
        }
        Arrays.sort(guia);
        for (int i = 0; i < datosFinal.length; i++) {
            datosFinal[i][0] = guia[i];
        }
        return datosFinal;
    }

    public Object[][] ordenarDosArray(Object[][] calendarioHabitaciones, Object[][] calendarioTabla) {

        Object[] guia = new Object[calendarioHabitaciones[0].length];
        System.arraycopy(calendarioHabitaciones[0], 0, guia, 0, guia.length);
        Object[][] datosFinal = new Object[calendarioHabitaciones.length][calendarioHabitaciones[0].length];
        Arrays.sort(guia);
        for (int i = 0; i < calendarioHabitaciones[0].length; i++) {
            for (int j = 0; j < calendarioHabitaciones[0].length; j++) {
                if (guia[i].equals(calendarioHabitaciones[0][j])) {
                    datosFinal[0][i] = calendarioHabitaciones[0][j];
                    datosFinal[1][i] = calendarioHabitaciones[1][j];
                    for (int k = 0; k < calendarioTabla.length; k++) {
                        datosFinal[k][i] = calendarioHabitaciones[k][j];
                    }
                }
            }
        }
        return datosFinal;
    }

    public Object[][] LlenadoDeCalendario(int nroSemanas, int dia, int mes, int anio) {
        
        Object[][] listaHabitacionesTabla = listaHabitacionesCom(listaHabitacion);
        Object[] guia = new Object[30];
        System.arraycopy(listaHabitacionesTabla[0], 0, guia, 0, guia.length);
        Fecha[] diasDeSemanasFecha = diasDeSemanasFecha(nroSemanas, dia, mes, anio);

        Object[][] tablaCompleta = new Object[guia.length][diasDeSemanasFecha.length];

        for (int i = 0; i < guia.length; i++) {
            for (int j = 0; j < diasDeSemanasFecha.length; j++) {
                for (Reserva reserva : listaReserva) {
                    if (((Habitacion) guia[i]).getNumHabitacion() == reserva.getHabitacion().getNumHabitacion()) {
                        if (diasDeSemanasFecha[j].toDate().equals(reserva.getFecha().toDate())) {
                            tablaCompleta[i][j] = reserva;
                        }
                    }
                }
            }
        }
        return tablaCompleta;
    }

    public Object[][] LlenadoDeCalendarioOrdenado(int nroSemanas, int dia, int mes, int anio) {
        
        Object[][] listaHabitacionesTabla = listaHabitacionesComOrdenado(listaHabitacion);
        Object[] guia = new Object[30];
        System.arraycopy(listaHabitacionesTabla[0], 0, guia, 0, guia.length);
        Arrays.sort(guia);
        Fecha[] diasDeSemanasFecha = diasDeSemanasFecha(nroSemanas, dia, mes, anio);

        Object[][] tablaCompleta = new Object[guia.length][diasDeSemanasFecha.length];

        for (int i = 0; i < guia.length; i++) {
            for (int j = 0; j < diasDeSemanasFecha.length; j++) {
                for (Reserva reserva : listaReserva) {
                    if (Integer.parseInt(guia[i].toString()) == reserva.getHabitacion().getNumHabitacion()) {
                        if (diasDeSemanasFecha[j].toDate().equals(reserva.getFecha().toDate())) {
                            tablaCompleta[i][j] = reserva;
                        }
                    }
                }
            }
        }
        return tablaCompleta;
    }

    public Fecha[] diasDeSemanasFecha(int nroSemanas, int dia, int mes, int anio) {
        
        int nroDias = nroSemanas * 7;
        Fecha[] semanas = new Fecha[nroDias];
        Date date = new Date(anio - 1900, mes - 1, dia);
        Calendar hoy = Calendar.getInstance();
        hoy.setTime(date);
        int i = 0;
        semanas[0] = new Fecha(hoy.getTime());
        i++;
        while (i < nroDias) {
            hoy.add(Calendar.DATE, 1);
            semanas[i] = new Fecha(hoy.getTime());
            i++;
        }
        return semanas;
    }

    public Mes[] mesesComboBox(Fecha fecha) {
        Mes[] mesesString = new Mes[13];
        fecha = fecha.add(-7, Calendar.MONTH);

        for (int i = 0; i < mesesString.length; i++) {
            fecha = fecha.add(1, Calendar.MONTH);
            Mes mes = new Mes(fecha.toDate());
            mesesString[i] = mes;
        }
        return mesesString;
    }

    public Fecha fijarFechaActualEnTabla(Fecha[] diasDeSemanasFecha) {
        Fecha fecha;
        fecha = diasDeSemanasFecha[0];
        return fecha;
    }

//    public String[] diasDeSemanasString(int nroSemanas, int dia, int mes, int anio) {
//        int nroDias = nroSemanas * 7;
//        String[] semanas = new String[nroDias];
//        Date date = new Date(anio - 1900, mes - 1, dia);
//        Calendar hoy = Calendar.getInstance();
//        hoy.setTime(date);
//        int i = 0;
//        semanas[0] = new Fecha(hoy.getTime()).toFormatCal();
//        i++;
//        while (i < nroDias) {
//            hoy.add(Calendar.DATE, 1);
//            semanas[i] = new Fecha(hoy.getTime()).toFormatCal();
//            i++;
//        }
//        return semanas;
//    }
 
}
