package vista.wizard;

import controladores.ControladorHotel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelos.Moneda;
import modelos.TipoHabitacion;

/**
 * @author leyer
 */
public class TablaDefinirPrecios extends JFrame {

    private static final long serialVersionUID = 1L;
    protected JTable table = null;
    private JScrollPane scrollPane = null;
    public static boolean termino=false;

    private class TABLE_MODEL extends DefaultTableModel {

        public TABLE_MODEL() {
            this.addColumn(COLUMN1);
            this.addColumn(COLUMN2);
            this.addColumn(COLUMN3);
        }
        public static final String COLUMN1 = "Tipo de Habitacion";
        public static final String COLUMN2 = "Precio";
        public static final String COLUMN3 = "Moneda";

        public void addData(TipoHabitacion a, double b) {
            final Object rowData[] = {a, b, INITIAL_VALUE};
            this.addRow(rowData);
        }
    }
    private TABLE_MODEL model = new TABLE_MODEL();
    public static TipoHabitacion[] tiposHabitacion = ControladorHotel.listaTipoHabitaciones();
    public static Moneda[] monedas = ControladorHotel.listaMonedas();
    public static final Moneda INITIAL_VALUE = monedas[0];

    public TablaDefinirPrecios() {
        JComboBox comboBox = new JComboBox(monedas);
        DefaultCellEditor defaultCellEditor = new DefaultCellEditor(comboBox);
        table = new JTable(model);
        table.getColumnModel().getColumn(2).setCellEditor(defaultCellEditor);

        addListener();
        scrollPane = new JScrollPane(table);
        //scrollPane.add(table);
        JButton boton = new JButton("Actualizar");
        boton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarClicked(evt);
            }
        });
        boton.setSize(30, 30);
        scrollPane.add(boton);
        this.getContentPane().add(scrollPane);
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addData();
    }

    public void addData() {
        for (int i = 0; i < tiposHabitacion.length; i++) {
            model.addData(tiposHabitacion[i], tiposHabitacion[i].getPrecio());
        }
    }

    private void addListener() {
        table.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
    }

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {
        int columna = table.columnAtPoint(evt.getPoint());
        int fila = table.rowAtPoint(evt.getPoint());
        System.out.println(columna);
        System.out.println(fila);
    }

    private void actualizarClicked(java.awt.event.ActionEvent evt) {
        guardarCambios();
    }

    public void guardarCambios() {
        for (int i = 0; i < tiposHabitacion.length; i++) {
            if (Double.parseDouble(table.getValueAt(i, 1).toString())!= 0.0) {
                double precio = Double.parseDouble(table.getValueAt(i, 1).toString());
                ControladorHotel.asignarPrecios(precio, i, (Moneda) table.getValueAt(i, 2));
                WizardPaso3.termino=true;
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Debe definir todos los precios" + (i + 1), "Error ingreso de Datos", 2);
                WizardPaso3.termino=false;
                break;
            }
        }
    }

}
