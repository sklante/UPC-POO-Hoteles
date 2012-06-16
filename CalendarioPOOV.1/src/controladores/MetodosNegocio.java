package controladores;

import javax.swing.JOptionPane;
import modelos.Moneda;
import modelos.TipoHabitacion;

public class MetodosNegocio {

    public static double calculoDePrecio(TipoHabitacion tipo, int dias, double descuento) {
        double precioFinal;

        if (tipo.getPrecio() != 0.0 && dias >= 2) {
            precioFinal = tipo.getPrecio()*dias;
            precioFinal = precioFinal - calculoDeDescuento(tipo.getPrecio(), dias, descuento);
            return precioFinal;
        } else {
            JOptionPane.showMessageDialog(null, "Error en el ingreso de datos.", "Aviso de Error", 1);
            return 0.0;
        }
    }
    
    public static double calculoDeDescuento(double precio, int dias, double descuento){
        double desc = descuento / 100;
        return precio * (dias - 1) * desc;
    }
    
    public static double calculoImpuesto(double precioFinal, double impuesto){
        double tasa = impuesto/100;
        return precioFinal*tasa;
    }
    
    public static String presentacionPreciosFactura(TipoHabitacion tipo, int dias, double descuento, double impuesto){
        
        String factura = "Precio de Habitaciones: " + tipo.getPrecio()*dias + " " +tipo.getMoneda() + "\n"
                        +"Total descuentos: " + calculoDeDescuento(tipo.getPrecio(), dias, descuento) + " " + tipo.getMoneda() +"\n"
                        +"Precio total: " + calculoDePrecio(tipo, dias, descuento) + " " + tipo.getMoneda() + "\n"
                        +"Calculo de Impuesto: " + calculoImpuesto(calculoDePrecio(tipo, dias, descuento), impuesto) + " " + tipo.getMoneda() +"\n"
                        +"Precio total con IGV: " + (calculoDePrecio(tipo, dias, descuento)+
                calculoImpuesto(calculoDePrecio(tipo, dias, descuento), impuesto)) + " " +tipo.getMoneda();
        return factura;
    }
    
    public static void main(String[] args) {
        TipoHabitacion tipo = new TipoHabitacion("", 180);
        tipo.setMoneda(new Moneda("PEN", "S/.", 1, true));
        String presentacionPreciosFactura = presentacionPreciosFactura(tipo, 3, 10.00, 18.00);
        System.err.println(presentacionPreciosFactura);
    }
}
