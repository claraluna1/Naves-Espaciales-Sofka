
package ventana;

import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class Ventana extends javax.swing.JFrame {
    
    private DefaultComboBoxModel<Naves> modelo = new DefaultComboBoxModel <Naves>();
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public Ventana() {
        
        llenarModeloComboBox();
        agregarModeloTabla();
        
        
        initComponents();
        
        setLocationRelativeTo(null);
    }
    
    private void agregarModeloTabla(){
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Pais");
        modeloTabla.addColumn("Tipo de Nave");
        modeloTabla.addColumn("Combustible");
        modeloTabla.addColumn("Descripción");
    }
    
    private void llenarModeloComboBox(){
        
        modelo.addElement(new Naves("Saturno V","EE.UU","Vehiculos Lanzadera","Queroseno","El cohete mas potente jamas contruido, con un peso de 3500 toneladas y empuje de 2900 toneladas"));
        modelo.addElement(new Naves("Soyuz U","Rusia","Vehiculos Lanzadera","Queroseno","Se trata de un cohete autopropulsado que sirve para lanzar una carga útil al espacio"));
        modelo.addElement(new Naves("Larga Marcha 3B","China","Vehiculos Lanzadera","UDMH+N204","Se trata de un cohete autopropulsado que sirve para lanzar una carga útil al espacio"));
        
        modelo.addElement(new Naves("Curiosidad","EE.UU","No tripuladas","PuO2","Emplea celdas fotovoltaicas y se desplazan aproximadamente a 12000 km/h)."));
        modelo.addElement(new Naves("Luna IX","Rusia","No tripuladas","N2H4 + Amina","Su principal objetivo estriba en estudiar otros cuerpos celestes"));
        modelo.addElement(new Naves("ATV","Europa","No tripuladas","MMH + NO","Estudiar Jupiter, Marte y Saturno"));
        
        modelo.addElement(new Naves("Apolo","EE.UU","Tripuladas","NO4 + UDMH","Misiones lunares"));
        modelo.addElement(new Naves("Vostok","Rusia","Tripuladas","NO + Amina","Experimentación y estudio del comportamiento humano en condiciones ingrávidas"));
        modelo.addElement(new Naves("Mercury","EE.UU","Tripuladas","Sólido","Mantenimiento de satélites, probar acoplamiento con otras naves y equipos"));
        
        
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panel = new javax.swing.JPanel();
        etiquetaNave = new javax.swing.JLabel();
        botonInsertar = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        etiquetaDatos = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaPais = new javax.swing.JLabel();
        cajaPais = new javax.swing.JTextField();
        etiquetaCombustible = new javax.swing.JLabel();
        cajaCombus = new javax.swing.JTextField();
        etiquetaTipoNave = new javax.swing.JLabel();
        cajaTipoNaves = new javax.swing.JTextField();
        etiquetaDescripcion = new javax.swing.JLabel();
        cajaDescripcion = new javax.swing.JTextField();
        comboNaves = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botonAgregarNave = new javax.swing.JButton();
        botonConsultar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaNave.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        etiquetaNave.setText("Nave Sofka");

        botonInsertar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        botonInsertar.setText("Insertar Nave Espacial");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        etiquetaDatos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        etiquetaDatos.setText("Datos de las Naves Espaciales");

        etiquetaNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        etiquetaNombre.setText("Nombre");

        cajaNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });

        etiquetaPais.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        etiquetaPais.setText("Pais");

        cajaPais.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        etiquetaCombustible.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        etiquetaCombustible.setText("Combustible");

        cajaCombus.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        etiquetaTipoNave.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        etiquetaTipoNave.setText("Tipo de Nave Espacial");

        cajaTipoNaves.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cajaTipoNaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTipoNavesActionPerformed(evt);
            }
        });

        etiquetaDescripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        etiquetaDescripcion.setText("Descripción");

        cajaDescripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        comboNaves.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        comboNaves.setModel(modelo);
        comboNaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNavesActionPerformed(evt);
            }
        });

        tabla.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        tabla.setModel(modeloTabla);
        ListSelectionListener oyenteSeleccion = new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if(e.getValueIsAdjusting()) {
                    int filaSeleccionada = tabla.getSelectedRow();

                    String nombre = (String) modeloTabla.getValueAt(filaSeleccionada, 0);
                    String pais = (String) modeloTabla.getValueAt(filaSeleccionada, 1);
                    String tipoNave = (String) modeloTabla.getValueAt(filaSeleccionada, 2);
                    String combustible = (String) modeloTabla.getValueAt(filaSeleccionada, 3);
                    String descripcion = (String) modeloTabla.getValueAt(filaSeleccionada, 4);

                    cajaNombre.setText(nombre);
                    cajaPais.setText(pais);
                    cajaTipoNaves.setText(tipoNave);
                    cajaCombus.setText(combustible);
                    cajaDescripcion.setText(descripcion);
                }  
            }
        };

        tabla.getSelectionModel().addListSelectionListener(oyenteSeleccion);
        jScrollPane2.setViewportView(tabla);

        botonAgregarNave.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        botonAgregarNave.setText("Agregar nueva nave espacial");
        botonAgregarNave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarNaveActionPerformed(evt);
            }
        });

        botonConsultar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        botonConsultar.setText("Consultar naves agregadas");
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                    .addComponent(comboNaves, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(138, 138, 138)
                                    .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61))
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap()))
                            .addComponent(etiquetaNave, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cajaDescripcion)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cajaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                    .addComponent(etiquetaTipoNave, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaTipoNaves))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etiquetaPais, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(etiquetaCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(202, 202, 202))
                                    .addComponent(cajaPais, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                    .addComponent(cajaCombus))))
                        .addContainerGap())
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(etiquetaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(botonAgregarNave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonConsultar)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(etiquetaNave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboNaves, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaDatos)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(etiquetaPais, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaPais, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(cajaNombre))
                .addGap(24, 24, 24)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCombustible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaTipoNave))
                .addGap(11, 11, 11)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaCombus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaTipoNaves, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(etiquetaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarNave, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Naves n = (Naves)comboNaves.getSelectedItem();
        
        String nombre = n.getNombre();
        String pais = n.getPais();
        String tipoNave = n.getTipoNave();
        String combustible = n.getCombustible();
        String descripcion = n.getDescripcion();
        
        String [] naves = {nombre,pais,tipoNave,combustible,descripcion};
        
        modeloTabla.addRow(naves);
        
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void cajaTipoNavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTipoNavesActionPerformed
        
    }//GEN-LAST:event_cajaTipoNavesActionPerformed

    private void comboNavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNavesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNavesActionPerformed

    private void botonAgregarNaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarNaveActionPerformed
        Archivo archivo = new Archivo();
        archivo.crearArchivo();
        
        String nombre, pais, tipoNave, combustible, descripcion;
        
        //obtenemos los datos de las cajas de texto
        nombre = cajaNombre.getText();
        pais = cajaPais.getText();
        tipoNave = cajaTipoNaves.getText();
        combustible = cajaCombus.getText();
        descripcion = cajaDescripcion.getText();
        
        //creamos objeto nave
        Naves nave = new Naves(nombre, pais, tipoNave, combustible, descripcion);
        
        //escribimos datos de las naves en el archivo de texto
        archivo.escribirTexto(nave);
        
        //vaciamos las cajas
        cajaNombre.setText("");
        cajaPais.setText("");
        cajaTipoNaves.setText("");
        cajaCombus.setText("");
        cajaDescripcion.setText("");
        
    }//GEN-LAST:event_botonAgregarNaveActionPerformed

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        VentanaNaves ventanaN = new VentanaNaves(this, true);
        ventanaN.setVisible(true);
        
    }//GEN-LAST:event_botonConsultarActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarNave;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JTextField cajaCombus;
    private javax.swing.JTextField cajaDescripcion;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPais;
    private javax.swing.JTextField cajaTipoNaves;
    private javax.swing.JComboBox<Naves> comboNaves;
    private javax.swing.JLabel etiquetaCombustible;
    private javax.swing.JLabel etiquetaDatos;
    private javax.swing.JLabel etiquetaDescripcion;
    private javax.swing.JLabel etiquetaNave;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPais;
    private javax.swing.JLabel etiquetaTipoNave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panel;
    private javax.swing.JSeparator separador;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
