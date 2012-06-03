/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Modelos;

import Controladores.Traductor;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Fecha {

    private String dia;
    private int diaNumero;
    private String mes;
    private int mesNumero;
    private int anio;
    public static boolean traductoActivado;

    public Fecha(int diaNumero, int mesNumero, int anio) {
        this.diaNumero = diaNumero;
        this.mesNumero = mesNumero;
        this.anio = anio;
        fechaCompleta();
    }

    public Fecha(Date date) {
        this.diaNumero = date.getDate();
        this.mesNumero = date.getMonth() + 1;
        this.anio = anio = date.getYear() + 1900;
        fechaCompleta();
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getDiaNumero() {
        return diaNumero;
    }

    public void setDiaNumero(int diaNumero) {
        this.diaNumero = diaNumero;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getMesNumero() {
        return mesNumero;
    }

    public void setMesNumero(int mesNumero) {
        this.mesNumero = mesNumero;
    }

    private void fechaCompleta() {
        SimpleDateFormat day = new SimpleDateFormat("EEEE", new Locale("es_ES"));
        SimpleDateFormat month = new SimpleDateFormat("MMMM", new Locale("es_ES"));
        this.dia = day.format(new Date(this.anio - 1900, this.mesNumero - 1, this.diaNumero));
        this.mes = month.format(new Date(anio - 1900, this.mesNumero - 1, this.diaNumero));
    }

    public Fecha add(int numeroDias, int Calendar_TYPE) {
        Fecha fecha;
        Date date = new Date(this.anio - 1900, this.mesNumero - 1, this.diaNumero);
        Calendar hoy = Calendar.getInstance();
        hoy.setTime(date);
        hoy.add(Calendar_TYPE, numeroDias);
        fecha = new Fecha(hoy.getTime());
        return fecha;
    }

    public String toFormatMonth(){
        return Traductor.traduccion(this.mes, traductoActivado) + " \n" + this.anio;
    }
    
    public String toFormatCal() {
        return Traductor.traduccion(this.dia, traductoActivado) + " \n" + this.diaNumero;
    }

    public String toComplet() {
        return Traductor.traduccion(this.dia, traductoActivado) + " " + this.diaNumero + " de " + Traductor.traduccion(this.mes, traductoActivado) + " de " + this.anio;
    }

    public String toString() {
        return Traductor.traduccion(this.dia, traductoActivado) + " " + this.diaNumero + " " + Traductor.traduccion(this.mes, traductoActivado);
    }

    public String toFormat(String formato) {
        SimpleDateFormat simpleDate = new SimpleDateFormat(formato, new Locale("es_ES"));
        return simpleDate.format(new Date(this.anio - 1900, this.mesNumero - 1, this.diaNumero));
    }

    public Date toDate() {
        return new Date(this.anio - 1900, this.mesNumero - 1, this.diaNumero);
    }
    
}
