/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import static Vista.AsignarMedico.arbolito;
import static Vista.AsignarMedico.consu;
import static Vista.Interfaz.MostrarListaEspera;
import static Vista.Interfaz.MostrarListaPacientes;
import static Vista.NuevoPaciente.colaMascotas;
import javax.swing.JOptionPane;

/**
 *
 * @author Kryssia Pizarro
 */
public class ConsultarOcupacion extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarOcupacion
     */
    public ConsultarOcupacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelConsultar = new javax.swing.JPanel();
        ScrollPaneconsulta = new javax.swing.JScrollPane();
        textAreaConsulta = new java.awt.TextArea();
        jButtonDictamen = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        LabelTituloConsulta1 = new javax.swing.JLabel();
        LabelTituloConsulta2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PanelConsultar.setBackground(new java.awt.Color(0, 153, 153));
        PanelConsultar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollPaneconsulta.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        ScrollPaneconsulta.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPaneconsulta.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ScrollPaneconsulta.setName(""); // NOI18N
        ScrollPaneconsulta.setViewportView(textAreaConsulta);

        textAreaConsulta.setColumns(10);
        textAreaConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textAreaConsulta.setEditable(false);
        textAreaConsulta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textAreaConsulta.setRows(10);
        textAreaConsulta.setSelectionStart(-1);
        ScrollPaneconsulta.setViewportView(textAreaConsulta);

        PanelConsultar.add(ScrollPaneconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 290, 310));

        jButtonDictamen.setBackground(new java.awt.Color(0, 204, 102));
        jButtonDictamen.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButtonDictamen.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDictamen.setText("DICTAMEN");
        jButtonDictamen.setActionCommand("");
        jButtonDictamen.setBorderPainted(false);
        jButtonDictamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDictamenActionPerformed(evt);
            }
        });
        PanelConsultar.add(jButtonDictamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 140, 40));

        ButtonCancelar.setBackground(new java.awt.Color(255, 102, 102));
        ButtonCancelar.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        ButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCancelar.setText("REGRESAR");
        ButtonCancelar.setBorderPainted(false);
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });
        PanelConsultar.add(ButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 120, 40));

        LabelTituloConsulta1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 22)); // NOI18N
        LabelTituloConsulta1.setForeground(new java.awt.Color(255, 255, 255));
        LabelTituloConsulta1.setText("Consulta De Ocupación");
        PanelConsultar.add(LabelTituloConsulta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 270, 30));

        LabelTituloConsulta2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        LabelTituloConsulta2.setForeground(new java.awt.Color(255, 255, 255));
        LabelTituloConsulta2.setText("Pacientes Recibiendo Atención");
        PanelConsultar.add(LabelTituloConsulta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 300, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDictamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDictamenActionPerformed
   JOptionPane.showMessageDialog(null, "Se ha generado el dictamen. Lo encuentras en Información diágnosticos");  
    }//GEN-LAST:event_jButtonDictamenActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        this.dispose();
        new Interfaz().setVisible(true);
        MostrarListaPacientes.setText(colaMascotas.imprimir());
        MostrarListaEspera.setText(arbolito.toString());
    }//GEN-LAST:event_ButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarOcupacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarOcupacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarOcupacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarOcupacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarOcupacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JLabel LabelTituloConsulta1;
    private javax.swing.JLabel LabelTituloConsulta2;
    private javax.swing.JPanel PanelConsultar;
    public static javax.swing.JScrollPane ScrollPaneconsulta;
    private javax.swing.JButton jButtonDictamen;
    public static java.awt.TextArea textAreaConsulta;
    // End of variables declaration//GEN-END:variables
}
