package controladoras;

import modelos.Pasajero;
import modelos.Fecha;
import modelos.Habitacion;
import modelos.Mes;
import modelos.Reserva;
import modelos.TipoHabitacion;
import java.util.*;

public class ControladorCalendario {

    private List<Reserva> listaReserva = llenadoReservas();
    public static List<Habitacion> listaHabitaciones = llenadoHabitaciones();

    public ControladorCalendario() {
    }

    public List<Reserva> llenadoReservas() {
        Pasajero cliente1 = new Pasajero("Jorge", "Chavez");
        Pasajero cliente2 = new Pasajero("Miguel", "Grau");
        Pasajero cliente3 = new Pasajero("Francisco", "Bolognesi");
        Pasajero cliente4 = new Pasajero("Manuel", "Prada");
        Pasajero cliente5 = new Pasajero("Jose", "Galvez");
        Pasajero cliente6 = new Pasajero("Cesar", "Vallejo");
        Pasajero cliente7 = new Pasajero("Jose", "Mariategui");
        Pasajero cliente8 = new Pasajero("Alfonso", "Ugarte");
        Pasajero cliente9 = new Pasajero("Jose", "Chocano");
        Pasajero cliente10 = new Pasajero("Alejandro", "Magno");

        listaReserva = new ArrayList<Reserva>();
        listaReserva.add(new Reserva(cliente1, listaHabitaciones.get(1), 28, 5, 2012, "CONFIRMADA"));
        listaReserva.add(new Reserva(cliente2, listaHabitaciones.get(2), 28, 5, 2012, "RESERVADA"));
        listaReserva.add(new Reserva(cliente3, listaHabitaciones.get(4), 28, 5, 2012, "CHECK IN"));
        listaReserva.add(new Reserva(cliente4, listaHabitaciones.get(5), 28, 5, 2012, "CHECK IN"));
        listaReserva.add(new Reserva(cliente5, listaHabitaciones.get(9), 28, 5, 2012, "CHECK IN"));
        listaReserva.add(new Reserva(cliente5, listaHabitaciones.get(10), 28, 5, 2012, "CONFIRMADA"));
        listaReserva.add(new Reserva(cliente6, listaHabitaciones.get(11), 28, 5, 2012, "CONFIRMADA"));
        listaReserva.add(new Reserva(cliente7, listaHabitaciones.get(12), 28, 5, 2012, "CONFIRMADA"));
        listaReserva.add(new Reserva(cliente8, listaHabitaciones.get(21), 28, 5, 2012, "CONFIRMADA"));
        listaReserva.add(new Reserva(cliente9, listaHabitaciones.get(22), 28, 5, 2012, "CONFIRMADA"));
        listaReserva.add(new Reserva(cliente10, listaHabitaciones.get(23), 28, 5, 2012, "RESERVADA"));
        listaReserva.add(new Reserva(cliente10, listaHabitaciones.get(24), 28, 5, 2012, "RESERVADA"));
        listaReserva.add(new Reserva(cliente10, listaHabitaciones.get(24), 20, 6, 2012, "RESERVADA"));
        listaReserva.add(new Reserva(cliente10, listaHabitaciones.get(23), 20, 6, 2012, "RESERVADA"));
        return this.listaReserva;
    }

    public static List<Habitacion> llenadoHabitaciones() {
        listaHabitaciones = new ArrayList<Habitacion>();
        int i = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        while (i < 30) {
            if (i < 10) {
                
                            TipoHabitacion tipoHabitacion = new TipoHabitacion("NORMAL", 50.00, null);
                
              //  TipoHabitacion tipoHabitacion = new TipoHabitacion("NORMAL", 50.00);
                            
                              Habitacion habitacion = new Habitacion("301" + a, tipoHabitacion, null);
                              
                //Habitacion habitacion = new Habitacion(301 + a, tipoHabitacion);
                listaHabitaciones.add(habitacion);
                a++;
            } else if (i < 20) {
                
                TipoHabitacion tipoHabitacion = new TipoHabitacion("DOUBLE", 100.00, null);
                
               // TipoHabitacion tipoHabitacion = new TipoHabitacion("DOBLE", 100.00);
                  Habitacion habitacion = new Habitacion("" + b, tipoHabitacion, null);
                
                  //Habitacion habitacion = new Habitacion(201 + b, tipoHabitacion);
                listaHabitaciones.add(habitacion);
                b++;
            } else {
                
                 TipoHabitacion tipoHabitacion = new TipoHabitacion("PRESIDENCIAL", 200.00,null);
               
               //  TipoHabitacion tipoHabitacion = new TipoHabitacion("PRESIDENCIAL", 200.00);
                
                Habitacion habitacion = new Habitacion("101" + c, tipoHabitacion, null);
                
               // Habitacion habitacion = new Habitacion(101 + c, tipoHabitacion);
                listaHabitaciones.add(habitacion);
                c++;
            }
            i++;
        }
        return listaHabitaciones;
    }

    public Object[][] listaHabitacionesTab() {
        List<Habitacion> listaHabitacion = listaHabitaciones;
        Object[][] guia = new Object[listaHabitacion.size()][1];
        for (int i = 0; i < listaHabitacion.size(); i++) {
            guia[i][0] = listaHabitacion.get(i).getNumHabitacion();
        }
        return guia;
    }

    public Object[][] listaHabitacionesTabOrdenado() {
        List<Habitacion> listaHabitacion = listaHabitaciones;
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

    public Object[][] listaHabitacionesCom() {
        List<Habitacion> listaHabitacion = listaHabitaciones;
        Object[][] guia = new Object[1][listaHabitacion.size()];
        for (int i = 0; i < listaHabitacion.size(); i++) {
            guia[0][i] = listaHabitacion.get(i);
        }
        return guia;
    }

    public Object[][] listaHabitacionesComOrdenado() {
        List<Habitacion> listaHabitacion = listaHabitaciones;
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
        
        Object[][] listaHabitacionesTabla = listaHabitacionesCom();
        Object[] guia = new Object[30];
        System.arraycopy(listaHabitacionesTabla[0], 0, guia, 0, guia.length);
        Fecha[] diasDeSemanasFecha = listaDeDiasDeSemana(nroSemanas, dia, mes, anio);

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
        
        Object[][] listaHabitacionesTabla = listaHabitacionesComOrdenado();
        Object[] guia = new Object[30];
        System.arraycopy(listaHabitacionesTabla[0], 0, guia, 0, guia.length);
        Arrays.sort(guia);
        Fecha[] diasDeSemanasFecha = listaDeDiasDeSemana(nroSemanas, dia, mes, anio);

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

    public Fecha[] listaDeDiasDeSemana(int nroSemanas, int dia, int mes, int anio) {
        
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

    public Mes[] ListaDeMeses(Fecha fecha) {
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
        System.out.println(fecha);
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
