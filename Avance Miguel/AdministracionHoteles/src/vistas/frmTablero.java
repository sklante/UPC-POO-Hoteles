/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package vistas;

import modelos.Fecha;
import modelos.Mes;
import modelos.Reserva;
import controladoras.ControladorCalendario;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pc
 */
public class frmTablero extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    public frmTablero() {
        initComponents();
        iniciarCalendario();
        iniciarComboBoxs();
        
    }

    private void iniciarCalendario() {
        //al iniciar calendario estará en la fecha de hoy
        Date date = new Date();
        int dia = date.getDate();
        int mes = date.getMonth() + 1;
        int anio = date.getYear() + 1900;
        tablaCalendario = new ControladorCalendario();
        //Fechas en español
        Fecha.traductoActivado = true;
        //Llenado de columna de la tabla calendario
        iniciarTablaCalendario(tabListaHabitaciones, tabCalendarioReservas, 1, dia, mes, anio,
                listaHabitacionesTablaSelected, radBtnOrdenarHabTipo.isSelected());

    }

    private void iniciarComboBoxs() {
        Fecha fecha = fechaSelected;
        Mes[] mesesComboBox = tablaCalendario.ListaDeMeses(fecha);
        cbxMesActual.setModel(new javax.swing.DefaultComboBoxModel(mesesComboBox));
        cbxMesActual.setSelectedIndex(6);
        cbxFiltroAvance.setSelectedIndex(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        cbxMesActual = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnUnaSemana = new javax.swing.JButton();
        btnDosSemanas = new javax.swing.JButton();
        BtnTresSemanas = new javax.swing.JButton();
        btnUnMes = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnHoy = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabCalendarioReservas = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabListaHabitaciones = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        }
        ;
        radBtnOrdenarHabTipo = new javax.swing.JRadioButton();
        proBarAvanceDeMesTab = new javax.swing.JProgressBar();
        labFechaPrimeraTabla = new javax.swing.JLabel();
        labFechaUltimaTabla = new javax.swing.JLabel();
        cbxFiltroAvance = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(153, 204, 255));

        cbxMesActual.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxMesActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMesActualActionPerformed(evt);
            }
        });
        cbxMesActual.setBounds(10, 10, 130, 20);
        jDesktopPane1.add(cbxMesActual, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("Ver:");
        jLabel1.setBounds(150, 10, 20, 20);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnUnaSemana.setText("Una semana");
        btnUnaSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnaSemanaActionPerformed(evt);
            }
        });
        btnUnaSemana.setBounds(170, 10, 91, 23);
        jDesktopPane1.add(btnUnaSemana, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnDosSemanas.setText("Dos semanas");
        btnDosSemanas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosSemanasActionPerformed(evt);
            }
        });
        btnDosSemanas.setBounds(260, 10, 95, 23);
        jDesktopPane1.add(btnDosSemanas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BtnTresSemanas.setText("Tres semanas");
        BtnTresSemanas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTresSemanasActionPerformed(evt);
            }
        });
        BtnTresSemanas.setBounds(360, 10, 100, 23);
        jDesktopPane1.add(BtnTresSemanas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnUnMes.setText("Un mes");
        btnUnMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnMesActionPerformed(evt);
            }
        });
        btnUnMes.setBounds(460, 10, 80, 23);
        jDesktopPane1.add(btnUnMes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        btnAnterior.setBounds(820, 10, 71, 23);
        jDesktopPane1.add(btnAnterior, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnHoy.setText("Hoy");
        btnHoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoyActionPerformed(evt);
            }
        });
        btnHoy.setBounds(890, 10, 51, 23);
        jDesktopPane1.add(btnHoy, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        btnSiguiente.setBounds(940, 10, 80, 23);
        jDesktopPane1.add(btnSiguiente, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tabCalendarioReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabCalendarioReservas.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(tabCalendarioReservas);

        jScrollPane2.setBounds(70, 110, 950, 510);
        jDesktopPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tabListaHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Numero de Hab."
            }
        ));
        tabListaHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabListaHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabListaHabitaciones);

        jScrollPane1.setBounds(10, 110, 60, 510);
        jDesktopPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        radBtnOrdenarHabTipo.setText("Ordenar habitacion por Tipo");
        radBtnOrdenarHabTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnOrdenarHabTipoActionPerformed(evt);
            }
        });
        radBtnOrdenarHabTipo.setBounds(20, 50, 170, 23);
        jDesktopPane1.add(radBtnOrdenarHabTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        proBarAvanceDeMesTab.setBounds(70, 99, 950, 10);
        jDesktopPane1.add(proBarAvanceDeMesTab, javax.swing.JLayeredPane.DEFAULT_LAYER);

        labFechaPrimeraTabla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labFechaPrimeraTabla.setText(mesStringActual);
        labFechaPrimeraTabla.setBounds(70, 80, 110, 14);
        jDesktopPane1.add(labFechaPrimeraTabla, javax.swing.JLayeredPane.DEFAULT_LAYER);

        labFechaUltimaTabla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labFechaUltimaTabla.setText(mesStringFinal);
        labFechaUltimaTabla.setBounds(924, 80, 90, 14);
        jDesktopPane1.add(labFechaUltimaTabla, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cbxFiltroAvance.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mes", "Dia" }));
        cbxFiltroAvance.setBounds(820, 40, 80, 20);
        jDesktopPane1.add(cbxFiltroAvance, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("DASHBOARD", jDesktopPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnaSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnaSemanaActionPerformed

        iniciarTablaCalendario(tabListaHabitaciones, tabCalendarioReservas, 1, fechaSelected.getDiaNumero(),
                fechaSelected.getMesNumero(), fechaSelected.getAnio(), listaHabitacionesTablaSelected, radBtnOrdenarHabTipo.isSelected());
        vistaSemanasSelected = 1;

    }//GEN-LAST:event_btnUnaSemanaActionPerformed

    private void cbxMesActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMesActualActionPerformed
        mesActualFlag = this.cbxMesActual.getSelectedIndex();
        if (mesActualFlag != mesAnteriorFlag) {
            Mes selectedItem = (Mes) this.cbxMesActual.getSelectedItem();
            int mes1 = selectedItem.getFecha().getMesNumero();
            int anio1 = selectedItem.getFecha().getAnio();
            fechaSelected = new Fecha(fechaSelected.getDiaNumero(), mes1, anio1);
            iniciarTablaCalendario(tabListaHabitaciones, tabCalendarioReservas, vistaSemanasSelected, fechaSelected.getDiaNumero(),
                    fechaSelected.getMesNumero(), fechaSelected.getAnio(), listaHabitacionesTablaSelected,
                    radBtnOrdenarHabTipo.isSelected());
        }
        mesAnteriorFlag = mesActualFlag;
    }//GEN-LAST:event_cbxMesActualActionPerformed

    private void btnDosSemanasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosSemanasActionPerformed

        iniciarTablaCalendario(tabListaHabitaciones, tabCalendarioReservas, 2, fechaSelected.getDiaNumero(),
                fechaSelected.getMesNumero(), fechaSelected.getAnio(), listaHabitacionesTablaSelected,
                radBtnOrdenarHabTipo.isSelected());
        vistaSemanasSelected = 2;

    }//GEN-LAST:event_btnDosSemanasActionPerformed

    private void BtnTresSemanasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTresSemanasActionPerformed

        iniciarTablaCalendario(tabListaHabitaciones, tabCalendarioReservas, 3, fechaSelected.getDiaNumero(),
                fechaSelected.getMesNumero(), fechaSelected.getAnio(), listaHabitacionesTablaSelected,
                radBtnOrdenarHabTipo.isSelected());
        vistaSemanasSelected = 3;
    }//GEN-LAST:event_BtnTresSemanasActionPerformed

    private void btnUnMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnMesActionPerformed

        iniciarTablaCalendario(tabListaHabitaciones, tabCalendarioReservas, 4, fechaSelected.getDiaNumero(),
                fechaSelected.getMesNumero(), fechaSelected.getAnio(), listaHabitacionesTablaSelected,
                radBtnOrdenarHabTipo.isSelected());
        vistaSemanasSelected = 4;
    }//GEN-LAST:event_btnUnMesActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        int avance = Calendar.MONTH;
        if (cbxFiltroAvance.getSelectedIndex() == 1) {
            avance = Calendar.DATE;
        }
        fechaSelected = fechaSelected.add(-1, avance);
        iniciarTablaCalendario(tabListaHabitaciones, tabCalendarioReservas, vistaSemanasSelected, fechaSelected.getDiaNumero(),
                fechaSelected.getMesNumero(), fechaSelected.getAnio(), listaHabitacionesTablaSelected,
                radBtnOrdenarHabTipo.isSelected());
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnHoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoyActionPerformed
        iniciarCalendario();
    }//GEN-LAST:event_btnHoyActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        int avance = Calendar.MONTH;
        if (cbxFiltroAvance.getSelectedIndex() == 1) {
            avance = Calendar.DATE;
        }
        fechaSelected = fechaSelected.add(1, avance);
        iniciarTablaCalendario(tabListaHabitaciones, tabCalendarioReservas, vistaSemanasSelected, fechaSelected.getDiaNumero(),
                fechaSelected.getMesNumero(), fechaSelected.getAnio(), listaHabitacionesTablaSelected,
                radBtnOrdenarHabTipo.isSelected());
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void radBtnOrdenarHabTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnOrdenarHabTipoActionPerformed
        iniciarTablaCalendario(tabListaHabitaciones, tabCalendarioReservas, vistaSemanasSelected, fechaSelected.getDiaNumero(),
                fechaSelected.getMesNumero(), fechaSelected.getAnio(), listaHabitacionesTablaSelected,
                radBtnOrdenarHabTipo.isSelected());
    }//GEN-LAST:event_radBtnOrdenarHabTipoActionPerformed

    private void tabListaHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabListaHabitacionesMouseClicked
        if (evt.getClickCount() == 2) {
            int columna = tabListaHabitaciones.columnAtPoint(evt.getPoint());
            int fila = tabListaHabitaciones.rowAtPoint(evt.getPoint());
            try {
                Reserva valueAt = (Reserva) tabListaHabitaciones.getValueAt(fila, columna);
                JOptionPane.showMessageDialog(this, valueAt.toDetail(), "Detalle de Reserva", 2);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "No hay reservación", "Detalle de Reserva", 1);
            }
        }
    }//GEN-LAST:event_tabListaHabitacionesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new frmTablero().setVisible(true);
            }
        });
    }

    private void iniciarTablaCalendario(JTable jtableCalendario, JTable jtableHabitaciones, int nroSemanas, int dia,
            int mes, int anio, Object[][] listaHabitacionesTab, boolean ordernadoPorHabitacion) {
        Fecha.traductoActivado = true;
        Fecha[] titulos2 = tablaCalendario.listaDeDiasDeSemana(nroSemanas, dia, mes, anio);
        String mesInicial = "";
        int conteoMesInicial = 0;
        String mesFinal = "";
        mesInicial = titulos2[0].getMes();
        for (Fecha fecha : titulos2) {
            if (mesInicial.equals(fecha.getMes())) {
                conteoMesInicial++;
            } else {
                mesFinal = fecha.getMes();
            }
        }

        mesIntInicial = conteoMesInicial;
        proBarAvanceDeMesTab.setMaximum(titulos2.length);
        labFechaPrimeraTabla.setText(mesInicial);
        labFechaUltimaTabla.setText(mesFinal);
        proBarAvanceDeMesTab.setValue(mesIntInicial);
        if (!ordernadoPorHabitacion) {
            listaHabitacionesTab = tablaCalendario.listaHabitacionesTab();
            //String[] titulos = tablaCalendario.diasDeSemanasString(nroSemanas, dia, mes, anio);

            Object[][] LlenadoDeCalendario = tablaCalendario.LlenadoDeCalendario(nroSemanas, dia, mes, anio);
            jtableHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
                    listaHabitacionesTab,
                    new String[]{
                        "Numero de Hab."
                    }));

            jScrollPane1.setViewportView(jtableHabitaciones);

            jtableCalendario.setModel(new javax.swing.table.DefaultTableModel(
                    LlenadoDeCalendario,
                    titulos2));
        } else {
            listaHabitacionesTab = tablaCalendario.listaHabitacionesTabOrdenado();
            Object[][] LlenadoDeCalendario = tablaCalendario.LlenadoDeCalendarioOrdenado(nroSemanas, dia, mes, anio);
            DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
                    listaHabitacionesTab,
                    new String[]{
                        "Numero de Hab."
                    }) {

                @Override
                public boolean isCellEditable(int fila, int columna) {
                    return false;
                }
            };

            jtableHabitaciones.setModel(modelo);

            jScrollPane1.setViewportView(jtableHabitaciones);
            DefaultTableModel modelo1 = new javax.swing.table.DefaultTableModel(
                    LlenadoDeCalendario,
                    titulos2) {

                @Override
                public boolean isCellEditable(int fila, int columna) {
                    return false;
                }
            };
            jtableCalendario.setModel(modelo1);
        }
        jScrollPane2.setViewportView(jtableCalendario);
        listaHabitacionesTablaSelected = listaHabitacionesTab;
        fechaSelected = tablaCalendario.fijarFechaActualEnTabla(titulos2);



    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnTresSemanas;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnDosSemanas;
    private javax.swing.JButton btnHoy;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUnMes;
    private javax.swing.JButton btnUnaSemana;
    private javax.swing.JComboBox cbxFiltroAvance;
    private javax.swing.JComboBox cbxMesActual;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labFechaPrimeraTabla;
    private javax.swing.JLabel labFechaUltimaTabla;
    private javax.swing.JProgressBar proBarAvanceDeMesTab;
    private javax.swing.JRadioButton radBtnOrdenarHabTipo;
    private javax.swing.JTable tabCalendarioReservas;
    private javax.swing.JTable tabListaHabitaciones;
    // End of variables declaration//GEN-END:variables
    private ControladorCalendario tablaCalendario;
    private static Object[][] listaHabitacionesTablaSelected;
    private static Fecha fechaSelected;
    private static int vistaSemanasSelected = 1;
    private static int mesActualFlag;
    private static int mesAnteriorFlag;
    private static String mesStringActual;
    private static String mesStringFinal;
    private int mesIntInicial;
}
