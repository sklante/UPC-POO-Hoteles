package vista.wizard;

import controladores.ControladorHotel;
import controladores.MetodosGenerales;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelos.Habitacion;
import modelos.TipoHabitacion;

/**
 * @author leyer
 */
public class TablaTipoHabitaciones extends JFrame {

    private static final long serialVersionUID = 1L;
    protected JTable table = null;
    private JScrollPane scrollPane = null;

    private class TABLE_MODEL extends DefaultTableModel {

        public TABLE_MODEL() {
            this.addColumn(COLUMN1);
            this.addColumn(COLUMN2);
            this.addColumn(COLUMN3);
        }
        public static final String COLUMN1 = "Nombre de Habitacion";
        public static final String COLUMN2 = "Tipo de Habitacion";
        public static final String COLUMN3 = "Seleccionado";

        public void addData(String a) {
            final Object rowData[] = {a, INITIAL_VALUE};
            this.addRow(rowData);
        }
    }
    private TABLE_MODEL model = new TABLE_MODEL();
    public static TipoHabitacion[] tiposHabitacion = ControladorHotel.listaTipoHabitaciones();
    public static String[] seleccionado = {"Seleccionado"};
    public static String[] habitaciones = new String[MetodosGenerales.hotelGlobal.getCantidadHabitaciones()];
//    public static String[] habitaciones = new String[45];
    public static final TipoHabitacion INITIAL_VALUE = tiposHabitacion[0];

    public TablaTipoHabitaciones() {
        JComboBox comboBox = new JComboBox(tiposHabitacion);
        JComboBox comboBox1 = new JComboBox(seleccionado);
        DefaultCellEditor defaultCellEditor = new DefaultCellEditor(comboBox);
        DefaultCellEditor defaultCellEditor1 = new DefaultCellEditor(comboBox1);
        table = new JTable(model);
        table.getColumnModel().getColumn(1).setCellEditor(defaultCellEditor);
        table.getColumnModel().getColumn(2).setCellEditor(defaultCellEditor1);
        
        addListener();
        scrollPane = new JScrollPane(table);
        //scrollPane.add(table);
        JButton boton = new JButton("Actualizar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarClicked(evt);
            }
        });
        boton.setSize(30,30);
        scrollPane.add(boton);
        this.getContentPane().add(scrollPane);
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addData();
    }

    public void addData() {
        for (int i = 0; i < habitaciones.length; i++) {
            model.addData(habitaciones[i]);
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
    
    public void guardarCambios(){
        ControladorHotel.habitaciones = new ArrayList<Habitacion>();
        for (int i = 0; i < habitaciones.length; i++) {
            if(table.getValueAt(i, 0) != null){
            habitaciones[i]=table.getValueAt(i, 0).toString();
            ControladorHotel.crearHabitaciones(table.getValueAt(i, 0).toString(), (TipoHabitacion)table.getValueAt(i, 1));
            }else{
                JOptionPane.showMessageDialog(this, "Debe colocar todos los nombre a las habitaciones " + (i+1), "Error ingreso de Datos", 2);
            }
        }
        for (String habitacion : habitaciones) {
            System.out.println(habitacion);
        }
        for (int i = 0; i < ControladorHotel.habitaciones.size(); i++) {
            TipoHabitacion tipoHabitacion = ControladorHotel.habitaciones.get(i).getTipoHabitacion();
            System.out.println(tipoHabitacion);
            
        }
    }
    
}
