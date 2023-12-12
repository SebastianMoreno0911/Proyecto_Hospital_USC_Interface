package Interface;

import com.mycompany.trabajofinal1.Paciente;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author SEBASTIAN MORENO
 * @id: 1192792720
 * @fecha: 25/noviembre/2023
 *
 */

public class PacienteInterface extends javax.swing.JFrame {

    /**
     * Creates new form Paciente
     */
    public PacienteInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonClosePaciente = new javax.swing.JButton();
        jTextFieldNombreyApellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooserPaciente = new com.toedter.calendar.JDateChooser();
        jTextFieldIdPaciente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelRegimen = new javax.swing.JLabel();
        jTextFieldEdadPaciente = new javax.swing.JTextField();
        jComboBoxRegimen = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxEstrato = new javax.swing.JComboBox<>();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonSavePaciente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButtonClosePaciente.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButtonClosePaciente.setText("CERRAR");
        jButtonClosePaciente.setToolTipText("Cerrar ventana");
        jButtonClosePaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClosePacienteMouseClicked(evt);
            }
        });

        jTextFieldNombreyApellidos.setToolTipText("Ingresa sus nombre y apeliidos");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\SEBASTIAN MORENO\\Downloads\\Paciente.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel5.setText("NOMBRE Y APELLIDOS");

        jDateChooserPaciente.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N

        jTextFieldIdPaciente.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel10.setText("CLINICA U.S.C");

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel6.setText("EDAD");

        jLabelRegimen.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabelRegimen.setText("REGIMEN");

        jTextFieldEdadPaciente.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N

        jComboBoxRegimen.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jComboBoxRegimen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------------", "Subsidiado", "Contributivo" }));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel7.setText("GENERO");

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel1.setText("NUEVO PACIENTE");

        jComboBoxGenero.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----------", "Masculino", "Femenino" }));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel2.setText("ESTRATO");

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel9.setText("DIRECCION");

        jComboBoxEstrato.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jComboBoxEstrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------", "0", "1", "2", "3", "4" }));

        jTextFieldDireccion.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel3.setText("FECHA CREACION");

        jButtonSavePaciente.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButtonSavePaciente.setText("GUARDAR");
        jButtonSavePaciente.setToolTipText("Guardar datos del paciente");
        jButtonSavePaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSavePacienteMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jLabel4.setText("IDENTIFICACION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jButtonClosePaciente))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelRegimen, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxEstrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSavePaciente)
                            .addComponent(jComboBoxRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEdadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombreyApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(45, 45, 45)))
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreyApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldEdadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jDateChooserPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegimen)
                    .addComponent(jComboBoxRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxEstrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClosePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSavePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClosePacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClosePacienteMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonClosePacienteMouseClicked

    private void jButtonSavePacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSavePacienteMouseClicked

        if (jTextFieldNombreyApellidos.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese Sus Nombres y Apellidos");
            return;
        }

        if (jTextFieldIdPaciente.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese su Identificacion");
            return;
        }

        try {
            int id = Integer.parseInt(jTextFieldIdPaciente.getText());
            if (id > 999999999) {
                JOptionPane.showMessageDialog(null, "Identificacion no Valida");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numerico valido en Identificacion");
            return;
        }

        if (jTextFieldEdadPaciente.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese Su Edad");
            return;
        }

        if (jDateChooserPaciente.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese Su Fecha de Consulta");
            return;
            
        }

        if (jComboBoxGenero.getSelectedItem().toString().startsWith("---")) {
            JOptionPane.showMessageDialog(null, "Seleccione un Genero");
            return;
        }

        if (jTextFieldDireccion.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingrese una direccion");
            return;
        }

        if (jComboBoxRegimen.getSelectedItem().toString().startsWith("---")) {
            JOptionPane.showMessageDialog(null, "Seleccione un Regimen Correcto");
            return;
        }

        if (jComboBoxEstrato.getSelectedItem().toString().startsWith("---")) {
            JOptionPane.showMessageDialog(null, "Seleccione un Estrato");
            return;
        }

        //obtener datos
        Paciente objPaciente = new Paciente();
        objPaciente.setNombre(jTextFieldNombreyApellidos.getText());
        objPaciente.setIdentifiacion(Integer.parseInt(jTextFieldIdPaciente.getText()));
        objPaciente.setEdad(Integer.parseInt(jTextFieldEdadPaciente.getText()));
        
        //obtener dato del jDatechooser y convertirlo para luego guardarlo en el archivo
        Date fechaConsulta = jDateChooserPaciente.getDate();
        //pasarlo a String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaConsultaString = sdf.format(fechaConsulta);
        //get fecha
        objPaciente.setFechaConsulta(fechaConsultaString);
        
        objPaciente.setGenero(jComboBoxGenero.getSelectedItem().toString());
        objPaciente.setDireccion(jTextFieldDireccion.getText());
        objPaciente.setRegimen(jComboBoxRegimen.getSelectedItem().toString());
        objPaciente.setEstrato(Integer.parseInt(jComboBoxEstrato.getSelectedItem().toString()));

        if (objPaciente.existePaciente(objPaciente.getIdentifiacion())) {//hacer oara cada clase
            JOptionPane.showMessageDialog(null, "El dato existe");
            return;
        }
        
        if (objPaciente.almacenarDatosPaciente(objPaciente)) {
            JOptionPane.showMessageDialog(null, "El paciente fue Guardado");
            cleanScreen();
        }


    }//GEN-LAST:event_jButtonSavePacienteMouseClicked

    private void cleanScreen() {
        jTextFieldEdadPaciente.setText("");
        jTextFieldDireccion.setText("");
        jComboBoxGenero.setSelectedIndex(0);
        jTextFieldNombreyApellidos.setText("");
        jTextFieldIdPaciente.setText("");
        jTextFieldEdadPaciente.setText("");
        jComboBoxRegimen.setSelectedIndex(0);
        jComboBoxEstrato.setSelectedIndex(0);
        jDateChooserPaciente.setDate(null);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PacienteInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacienteInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacienteInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacienteInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PacienteInterface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClosePaciente;
    private javax.swing.JButton jButtonSavePaciente;
    private javax.swing.JComboBox<String> jComboBoxEstrato;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JComboBox<String> jComboBoxRegimen;
    private com.toedter.calendar.JDateChooser jDateChooserPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelRegimen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldEdadPaciente;
    private javax.swing.JTextField jTextFieldIdPaciente;
    private javax.swing.JTextField jTextFieldNombreyApellidos;
    // End of variables declaration//GEN-END:variables
}
