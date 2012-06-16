package controladores;

import java.util.*;
import javax.swing.JOptionPane;
import modelos.*;

public class ControladorHotel {

    public static List<Cliente> clientes;
    public static List<Persona> personas= new ArrayList<Persona>();
    public static List<Reserva> reservas = new ArrayList<Reserva>();
    public static List<Map<String, Object>> mapaReservas = new ArrayList<Map<String, Object>>();
    public static List<Habitacion> habitaciones = new ArrayList<Habitacion>();
    public static List<TipoHabitacion> tiposHabitacion = new ArrayList<TipoHabitacion>();
    public static List<TipoPasajero> tiposPasajero;
    public static List<Moneda> monedas = new ArrayList<Moneda>();
    public static List<TipoDocumento> tipoDocumentos = new ArrayList<TipoDocumento>();
    public static List<Agencia> agencias = new ArrayList<Agencia>();
    public static List<Empresa> empresas = new ArrayList<Empresa>();

    public static void tiposHabitacionesDefecto() {
        tiposHabitacion.add(new TipoHabitacion("Simple"));
        tiposHabitacion.add(new TipoHabitacion("Doble"));
        tiposHabitacion.add(new TipoHabitacion("Suite"));
        tiposHabitacion.add(new TipoHabitacion("Departamento"));
        tiposHabitacion.add(new TipoHabitacion("Cabina"));
        tiposHabitacion.add(new TipoHabitacion("Sala de Reuniones"));
        tiposHabitacion.add(new TipoHabitacion("Presidenciales"));
    }

    public static void tipoDocumentosDefecto() {
        tipoDocumentos.add(new TipoDocumento("DNI"));
        tipoDocumentos.add(new TipoDocumento("PASAPORTE"));
        tipoDocumentos.add(new TipoDocumento("RUC"));
        tipoDocumentos.add(new TipoDocumento("RUC-PERSONA"));

    }

    public static TipoDocumento[] listaTipoDocumento() {
        if (tiposHabitacion.isEmpty()) {
            tipoDocumentosDefecto();
        }
        TipoDocumento[] listaString = listaStringTipoDoc(tipoDocumentos);
        return listaString;
    }
    
    public static String[] listaReservaTabla(){
        String[] reservaId = new String[mapaReservas.size()];
        for (int i = 0; i < mapaReservas.size(); i++) {
            reservaId[i] = mapaReservas.get(i).get("id").toString();
        }
        return reservaId;
    }

    public static TipoHabitacion[] listaTipoHabitaciones() {
        if (tiposHabitacion.isEmpty()) {
            tiposHabitacionesDefecto();
        }
        TipoHabitacion[] listaString = listaString(tiposHabitacion);
        return listaString;
    }

    public static Persona[] listaPersona() {
        Persona[] personasList = new Persona[1];
        if (!personas.isEmpty()) {
            personasList = listaPersonasString(personas);
        }
        return personasList;
    }
    
    public static Agencia[] listaAgencia() {
        Agencia[] personasList = new Agencia[1];
        if (!personas.isEmpty()) {
            personasList = listaAgenciaString(agencias);
        }
        return personasList;
    }
    
    public static Empresa[] listaEmpresa() {
        Empresa[] personasList = new Empresa[1];
        if (!personas.isEmpty()) {
            personasList = listaEmpresaString(empresas);
        }
        return personasList;
    }

    public static Persona[] listaPersonaPorEmpresa(Empresa empresa) {
        List<Persona> contacto=new ArrayList<Persona>();
        if (empresa != null) {
            contacto = empresa.getContacto();
        }
        Persona[] personasList = new Persona[1];
        if (!contacto.isEmpty()) {
            personasList = listaPersonasString(contacto);
        }
        return personasList;
    }

    public static Persona[] listaPersonaPorAgencia(Agencia agencia) {
        List<Persona> contacto=new ArrayList<Persona>();
        if (agencia != null) {
            contacto = agencia.getContacto();
        }
        Persona[] personasList = new Persona[1];
        if (!contacto.isEmpty()) {
            personasList = listaPersonasString(contacto);
        }
        return personasList;
    }

    public static void agregarEmpresa(String nombre, Documento documento, String telefono,
            String correo, Medios medioDePago) {
        if (!estaRegistradaEmpresa(documento)) {
            Empresa empresa = new Empresa(nombre, documento, telefono, correo, medioDePago);
            empresas.add(empresa);
        }
    }

    public static boolean estaRegistradaEmpresa(Documento documento) {
        if (!empresas.isEmpty()) {
            for (int i = 0; i < empresas.size(); i++) {
                if (empresas.get(i).getIdentificacion().getNumeroDocumento().equals(
                        documento.getNumeroDocumento())) {
                    JOptionPane.showMessageDialog(null, "Empresa registrada", "Error de datos", 2);
                    return true;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista de empresas vacia", "Error de datos", 2);
        }
        return false;
    }

    public static void agregarEmpleado(Empresa empresa, Persona persona) {
        if (!empresas.isEmpty()) {
            for (int i = 0; i < empresas.size(); i++) {
                if (empresas.get(i).getIdentificacion().getNumeroDocumento().equals(
                        empresa.getIdentificacion().getNumeroDocumento())) {
                    empresas.get(i).getContacto().add(persona);
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista de empresas vacia", "Error de datos", 2);
        }
    }

    public static void agregarAgencia(String nombre, Documento documento, String telefono,
            String correo, Medios medioDePago) {
        if (estaRegistradaAgencia(documento)) {
            Agencia agencia1 = new Agencia(nombre, documento, telefono, correo, medioDePago);
            agencias.add(agencia1);
        }
    }

    public static boolean estaRegistradaAgencia(Documento documento) {
        if (!agencias.isEmpty()) {
            for (int i = 0; i < agencias.size(); i++) {
                if (agencias.get(i).getIdentificacion().getNumeroDocumento().equals(
                        documento.getNumeroDocumento())) {
                    JOptionPane.showMessageDialog(null, "Agencia registrada", "Error de datos", 2);
                    return true;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista de agencias vacia", "Error de datos", 2);
        }
        return false;
    }

    public static void agregarPasajero(Agencia agencia, Persona persona) {
        if (!agencias.isEmpty()) {
            for (int i = 0; i < agencias.size(); i++) {
                if (agencias.get(i).getIdentificacion().getNumeroDocumento().equals(
                        agencia.getIdentificacion().getNumeroDocumento())) {
                    agencias.get(i).getContacto().add(persona);
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista de empresas vacia", "Error de datos", 2);
        }
    }

    public static void agregarPersona() {
    }

    public static boolean estaRegistradaPersona(Documento documento) {
        if (!personas.isEmpty()) {
            for (int i = 0; i < personas.size(); i++) {
                if (personas.get(i).getDocumento().getNumeroDocumento().equals(
                        documento.getNumeroDocumento())) {
                    JOptionPane.showMessageDialog(null, "Persona registrada", "Error de datos", 2);
                    return true;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista de agencias vacia", "Error de datos", 2);
        }
        return false;
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

        monedas.add(new Moneda(nombreMoneda, simbolo, tipoCambio, predeterminado));

    }

    public static boolean esVacio(String campo) {
        if (campo.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaEnRangoFecha(int mes, Fecha fecha) {
        Date fechaLimiteSuperior = new Fecha(new Date()).add(mes, Calendar.MONTH).toDate();
        System.out.println(fechaLimiteSuperior);
        Date fechaHoy = (new Date());
        System.out.println(fecha.toFechaCompleta());
        if (fecha.toDate().getTime() >= new Date(fechaHoy.getYear(), fechaHoy.getMonth(), fechaHoy.getDate()).getTime()
                && fechaLimiteSuperior.getTime() > fecha.toDate().getTime()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Fecha fuera de rango, solo 12 meses hacia adelante, no puede ser de fechas anteriores", "Detalle de Reserva", 2);
            return false;
        }
    }

    /**
     * ***********COMENTARIO*************
     */
//agregar reserva a la tabla visual.
    public static void agregarReservaTabla(Habitacion habitacion, Fecha fecha, int dias, double descuento, Persona persona) {


        if (!esNulos(habitacion) && !esNulos(fecha) && dias >= 1) {
            if (reservaRepetida(habitacion.toString(), fecha.toFechaCompleta(), dias)) {
                Map<String, Object> mapa = new HashMap<String, Object>();
                mapa.put("id", generarId(habitacion, fecha, dias));
                mapa.put("habitacion", habitacion);
                mapa.put("fechaEntrada", fecha.toFechaCompleta());
                Fecha fecha1 = fecha.add(dias - 1, Calendar.DATE);
                mapa.put("fechaSalida", fecha1.toFechaCompleta());
                mapa.put("dias", dias);
                mapa.put("precioTotal", MetodosNegocio.calculoDePrecio(habitacion.getTipoHabitacion(), dias, descuento));
                mapa.put("descuento", descuento);
                mapa.put("eliminado", false);
                mapa.put("persona", persona);
                mapaReservas.add(mapa);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos", "Detalle de Reserva", 2);
        }

    }

    /**
     * ***********COMENTARIO*************
     */
//convertir el mapa al formato de la tabla visual.
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
                reservasObj[i][5] = false;
            }
        }
        return reservasObj;
    }

    /**
     * ***********COMENTARIO*************
     */
//agregar reserva preliminar de la lista de reservas.
    public static void AgregarReservaPreliminar(Habitacion habitacion, Fecha fecha, int dias, Persona persona) {


        if (esNulos(habitacion) && esNulos(fecha) && dias > 0) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos", "Detalle de Reserva", 2);
        } else {
            Fecha fechaid = fecha;
            for (int i = 0; i < dias; i++) {
                String idReserva = generarId(habitacion, fechaid, dias);
                Reserva reserva = new Reserva(idReserva, persona, habitacion, fecha.getDiaNumero(),
                        fecha.getMesNumero(), fecha.getAnio());
                reservas.add(reserva);
                fecha = fecha.add(1, Calendar.DATE);
            }
        }
    }

    /**
     * ***********COMENTARIO*************
     */
//eliminar reserva preliminar de la tabla visual.
    public static void quitarReservaTabla(String id) {

        if (!esNulos(id)) {
            if (!mapaReservas.isEmpty()) {
                for (int i = 0; i < mapaReservas.size(); i++) {
                    if (mapaReservas.get(i).get("id").toString().equals(id)) {
                        mapaReservas.remove(i);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existen Reservas a eliminar", "Detalle de Reserva", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos", "Detalle de Reserva", 2);
        }
    }

    public static Map<String, Object> buscarReservaTabla(String id) {
        Map<String, Object> reserva = new HashMap<String, Object>();
        if (!esNulos(id)) {
            if (!mapaReservas.isEmpty()) {
                for (int i = 0; i < mapaReservas.size(); i++) {
                    if (mapaReservas.get(i).get("id").toString().equals(id)) {
                        reserva = mapaReservas.get(i);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existen Reservas con ese id", "Detalle de Reserva", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos", "Detalle de Reserva", 2);
        }
        return reserva;
    }

    public static boolean reservaRepetida(String habitacion, String fecha, int dias) {
        Fecha fecha2 = ControladorHotel.formatoHaciaFecha(fecha);
        if (!reservas.isEmpty()) {
            for (int i = 0; i < dias; i++) {
                String idCorto = habitacion + "-" + fecha2.toFechaCompleta();
                for (int j = 0; j < reservas.size(); j++) {
                    String id = reservas.get(j).getHabitacion().toString() + "-" + reservas.get(j).getFecha().toFechaCompleta();
                    if (id.equals(idCorto)) {
                        JOptionPane.showMessageDialog(null, "No puedes reservar en esa fecha, la reserva se cruza con otra.", "Detalle de Reserva", 2);
                        return false;
                    }
                }
                fecha2 = (fecha2).add(1, Calendar.DATE);
            }
        }
        return true;
    }

    public static void editarReservaTabla(String idReservaAnterior, Habitacion habitacion, Fecha fecha,
            int dias, double descuento, Persona persona) {

        if (!esNulos(habitacion) && !esNulos(fecha) && dias >= 1) {
            if (!mapaReservas.isEmpty()) {
                Map<String, Object> tablaAnterior = buscarReservaTabla(idReservaAnterior);
                quitarReservaTabla(idReservaAnterior);
                eliminarReservaPreliminar(idReservaAnterior);
                if (reservaRepetida(habitacion.toString(), fecha.toFechaCompleta(), dias)) {

                    Habitacion habitacion1 = (Habitacion) tablaAnterior.get("habitacion");
                    Fecha fecha1 = formatoHaciaFecha(tablaAnterior.get("fechaEntrada").toString());
                    int dias1 = Integer.parseInt(tablaAnterior.get("dias").toString());
                    double descuento1 = numeroDecimalOpcional(tablaAnterior.get("descuento").toString());
                    Persona persona1 = (Persona) tablaAnterior.get("persona");
                    agregarReservaTabla(habitacion1, fecha1, dias1, descuento1, persona1);
                    AgregarReservaPreliminar(habitacion, fecha, dias, persona);

                } else {
                    agregarReservaTabla(habitacion, fecha, dias, descuento, persona);
                    AgregarReservaPreliminar(habitacion, fecha, dias, persona);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existen Reservas a editar", "Detalle de Reserva", 2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos", "Detalle de Reserva", 2);
        }
    }

    /**
     * ***********COMENTARIO*************
     */
//eliminar reserva preliminar de la lista de reservas
    /**
     * ***********COMENTARIO*************
     */
//funcionalidad erronea con lists: error encontrado al eliminar una lista con for()
//el tamaño de una lista es estatico es decir cuando elimines, el tamaño de la lista cambiara y 
//disminuira de acuerdo a los elementos eliminados, y al final siempre eliminaras solo dos o la mitad.
//debes hacerlo con iterator para eliminar varios elementos.                 
//                for (int i = 0; i < reservas.size(); i++) {
//                    System.out.println(i);
//                    String idReserva = reservas.get(i).getIdReserva().trim();
//                    String idReservaGenerado = generarId(habitacion, fecha, dias).trim();
//                    if (idReserva.equals(idReservaGenerado)) {
//                        reservas.remove(i);
//                    }
//                    System.out.println(i);
//                }
    public static void eliminarReservaPreliminar(String id) {
        if (esNulos(id)) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos", "Detalle de Reserva", 2);
        } else {
            if (reservas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existen Reservas a eliminar", "Detalle de Reserva", 2);
            } else {
                for (Iterator<Reserva> ha = reservas.iterator(); ha.hasNext();) {
                    Reserva reserva = ha.next();
                    if (reserva.getIdReserva().equals(id)) {
                        ha.remove();
                    }
                }
            }
        }
    }

    public static Reserva buscarReservaPreliminar(String id) {
        if (esNulos(id)) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos", "Detalle de Reserva", 2);
        } else {
            if (reservas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existen Reservas para buscar", "Detalle de Reserva", 2);
            } else {
                for (Iterator<Reserva> ha = reservas.iterator(); ha.hasNext();) {
                    Reserva reserva = ha.next();
                    if (reserva.getIdReserva().equals(id)) {
                        return reserva;
                    }
                }
            }
        }
        return null;
    }

    public static void editarReservaPreliminar(String idReservaAnterior, Habitacion habitacion, Fecha fecha, int dias, double descuento,
            Persona persona) {
        if (esNulos(habitacion) && esNulos(fecha) && dias > 0) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos", "Detalle de Reserva", 2);
        } else {
            if (reservas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existen Reservas a eliminar", "Detalle de Reserva", 2);
            } else {
                for (int i = 0; i < reservas.size(); i++) {
                    if (reservas.get(i).getIdReserva().equals(idReservaAnterior)) {
                        eliminarReservaPreliminar(idReservaAnterior);
                        AgregarReservaPreliminar(habitacion, fecha, dias, persona);
                        break;
                    }
                }
            }
        }
    }

    public static String generarId(Habitacion habitacion, Fecha fecha, int dias) {
        String id = "";
        String numeroHabitacion = habitacion.getNumHabitacion().toString();
        String fecha1 = fecha.toFechaCompleta();
        id = numeroHabitacion + "-" + fecha1 + "-" + dias;
        return id;
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

    public static boolean esNumeroDecimal(String numero) {
        if (!numero.equals("") || numero != null) {
            for (int i = 0; i < numero.length(); i++) {
                if (!((numero.charAt(i) > 47 && numero.charAt(i) < 58 || numero.charAt(i) == 46
                        || numero.charAt(i) == 44))) {
                    return false;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un numero", "Error ingreso de datos", 2);
        }
        return true;
    }

    public static double numeroDecimalOpcional(String numero) {
        if (!numero.isEmpty()) {
            return Double.parseDouble(numero);
        } else {
            return 0.0;
        }
    }

    public static double tipoDeCambio(String numero) {
        try {
            if (!numero.isEmpty()) {
                return Double.parseDouble(numero);
            } else {
                return 1.0;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero valido: " + ex.getMessage(), "Error ingreso de datos", 2);
        } finally {
            return 1.0;
        }
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

    private static TipoDocumento[] listaStringTipoDoc(List<TipoDocumento> listas) {
        TipoDocumento[] lista = new TipoDocumento[listas.size()];
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

    public static void main(String[] args) {
        TipoDocumento[] listaTipoDocumento = ControladorHotel.listaTipoDocumento();
        for (TipoDocumento tipoDocumento : listaTipoDocumento) {
            System.out.println(tipoDocumento);
        }
//        boolean estaEnRangoFecha = estaEnRangoFecha(12, new Fecha(10, 06, 2012));
//        System.out.println(estaEnRangoFecha);
//        //        Fecha fecha = new Fecha(12, 6, 2012);
        //        Habitacion habitacion = new Habitacion(103, new TipoHabitacion("Suite", 50.00));
        //        agregarReservaTabla(habitacion, fecha, 3, 0.0, null);
        //        AgregarReservaPreliminar(habitacion, fecha, 3, null);
        //        System.out.println(reservaRepetida);
        //
        //        boolean reservaRepetida = reservaRepetida(habitacion.toString(), new Fecha(15, 6, 2012).toFechaCompleta(), 3);
        //        System.out.println(reservaRepetida);
        //
        //        System.out.println(mapaReservas.size());
        //        quitarReservaTabla(id);
        //        System.out.println(mapaReservas.size());
        //
        //                for (Reserva reser : reservas) {
        //                    System.out.println(reser.getFecha().toFechaCompleta());
        //                }
        //        editarReservaPreliminar(id, habitacion, fecha.add(1, Calendar.DATE), 5, 1.5, null);
        //
        //        for (Reserva reser : reservas) {
        //            System.out.println(reser.getIdReserva());
        //        }
        //        for (Map<String, Object> string : mapaReservas) {
        //            System.out.println(string.get("habitacion"));
        //            System.out.println(string.get("fechaEntrada"));
        //            System.out.println(string.get("fechaSalida"));
        //            System.out.println(string.get("dias"));
        //            System.out.println(string.get("precioTotal"));
        //            System.out.println(string.get("descuento"));
        //        }
        //
        //        editarReservaTabla(generarId(habitacion, fecha, 4),habitacion, fecha.add(2, Calendar.DATE), 3, 0.0);
        //        System.out.println(mapaReservas.size());
        //        for (Map<String, Object> string : mapaReservas) {
        //            System.out.println(string.get("habitacion"));
        //            System.out.println(string.get("fechaEntrada"));
        //            System.out.println(string.get("fechaSalida"));
        //            System.out.println(string.get("dias"));
        //            System.out.println(string.get("precioTotal"));
        //            System.out.println(string.get("descuento"));
        //        }

    }

    private static Persona[] listaPersonasString(List<Persona> listas) {
        Persona[] lista = new Persona[listas.size()];
        for (int i = 0; i < listas.size(); i++) {
            lista[i] = listas.get(i);
        }
        return lista;
    }

    private static Agencia[] listaAgenciaString(List<Agencia> listas) {
        Agencia[] lista = new Agencia[listas.size()];
        for (int i = 0; i < listas.size(); i++) {
            lista[i] = listas.get(i);
        }
        return lista;
    }
    
    private static Empresa[] listaEmpresaString(List<Empresa> listas) {
        Empresa[] lista = new Empresa[listas.size()];
        for (int i = 0; i < listas.size(); i++) {
            lista[i] = listas.get(i);
        }
        return lista;
    }

    public static boolean verificaNombreHotel(String nombreh){
        boolean valido = false;
       // this.password = null;
        if(nombreh != null){
            valido = true;
        }
        return valido;
    }
}
