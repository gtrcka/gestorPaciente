package vista;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import modelo.HistoriaClinica;
import modelo.Paciente;
import modelo.SQLModelo;

public class RegistroHistoriaClinica extends javax.swing.JDialog {
    private int idPaciente;
    
    public RegistroHistoriaClinica(java.awt.Frame parent, boolean modal, int idPaciente) {
        super(parent, modal);;
        initComponents();
        this.idPaciente = idPaciente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNuevoRegistro = new javax.swing.JPanel();
        eNuevoRegistro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taNuevoRegistro = new javax.swing.JTextArea();
        eMedicacion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taMedicacion = new javax.swing.JTextArea();
        btnGuardarRegistro = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        eNuevoRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eNuevoRegistro.setText("Nuevo Registro");

        taNuevoRegistro.setColumns(20);
        taNuevoRegistro.setRows(5);
        jScrollPane1.setViewportView(taNuevoRegistro);

        eMedicacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eMedicacion.setText("Medicación");

        taMedicacion.setColumns(20);
        taMedicacion.setRows(5);
        jScrollPane2.setViewportView(taMedicacion);

        btnGuardarRegistro.setText("Guardar Registro");
        btnGuardarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNuevoRegistroLayout = new javax.swing.GroupLayout(panelNuevoRegistro);
        panelNuevoRegistro.setLayout(panelNuevoRegistroLayout);
        panelNuevoRegistroLayout.setHorizontalGroup(
            panelNuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevoRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNuevoRegistroLayout.createSequentialGroup()
                        .addComponent(eMedicacion)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevoRegistroLayout.createSequentialGroup()
                        .addGroup(panelNuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelNuevoRegistroLayout.createSequentialGroup()
                                .addComponent(eNuevoRegistro)
                                .addGap(0, 286, Short.MAX_VALUE))
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevoRegistroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardarRegistro)
                        .addGap(20, 20, 20))))
        );
        panelNuevoRegistroLayout.setVerticalGroup(
            panelNuevoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevoRegistroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(eNuevoRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eMedicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnGuardarRegistro)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNuevoRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelNuevoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegistroActionPerformed
        HistoriaClinica hc = null;
        SQLModelo modelo = new SQLModelo();       
        LocalDateTime date = LocalDateTime.now();        
        Date fechaRegistro = Date.valueOf(date.toLocalDate());
        
        if (taNuevoRegistro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe completar, al menos, el nuevo registro");
        }else{
            hc = new HistoriaClinica(fechaRegistro, taNuevoRegistro.getText(), taMedicacion.getText(), idPaciente);
            modelo.cargarRegistro(hc);
            dispose();
        }
    }//GEN-LAST:event_btnGuardarRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroHistoriaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroHistoriaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroHistoriaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroHistoriaClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistroHistoriaClinica dialog = new RegistroHistoriaClinica(new javax.swing.JFrame(), true, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnGuardarRegistro;
    private javax.swing.JLabel eMedicacion;
    private javax.swing.JLabel eNuevoRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelNuevoRegistro;
    private javax.swing.JTextArea taMedicacion;
    private javax.swing.JTextArea taNuevoRegistro;
    // End of variables declaration//GEN-END:variables

}
