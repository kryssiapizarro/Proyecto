
package Vista;

import Controlador.ColaMascotas;
import Modelo.Mascotas;
import static Vista.Interfaz.MostrarListaPacientes;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class NuevoPaciente extends javax.swing.JFrame {

    public static ColaMascotas colaMascotas = new ColaMascotas();
    

    static String Clasificacion [] ={"Gato", "Perro", "Ave", "Roedor", "Exóticos"};
    public NuevoPaciente() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EdadMascota1 = new javax.swing.JLabel();
        LabelMascotas = new javax.swing.JLabel();
        JContenNuevoPaciente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NombreMascota = new javax.swing.JLabel();
        LblRaza = new javax.swing.JLabel();
        LblEdadMascota = new javax.swing.JLabel();
        TextFieldNombreMascota = new javax.swing.JTextField();
        TextFieldEdadMascota = new javax.swing.JTextField();
        TextFieldRaza = new javax.swing.JTextField();
        LblClasificacion = new javax.swing.JLabel();
        ComboBox_Clasificación = new javax.swing.JComboBox<>();
        LabelDueno = new javax.swing.JLabel();
        TextFieldDueno = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        ButtonCancelar = new javax.swing.JButton();
        BtnGuardarPaciente = new javax.swing.JButton();

        EdadMascota1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        EdadMascota1.setText("Edad:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Pacientes");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 153, 153));
        setResizable(false);
        setSize(new java.awt.Dimension(680, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelMascotas.setBackground(new java.awt.Color(255, 255, 255));
        LabelMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/galifauna-mascotas.jpg"))); // NOI18N
        getContentPane().add(LabelMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 580, 180));

        JContenNuevoPaciente.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.desktop);
        jLabel1.setText("Información del Paciente");

        NombreMascota.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        NombreMascota.setText("Nombre:");

        LblRaza.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        LblRaza.setText("Raza:");

        LblEdadMascota.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        LblEdadMascota.setText("Edad:");

        TextFieldNombreMascota.setBackground(java.awt.SystemColor.control);
        TextFieldNombreMascota.setColumns(10);
        TextFieldNombreMascota.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        TextFieldNombreMascota.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TextFieldNombreMascota.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        TextFieldNombreMascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldNombreMascotaKeyTyped(evt);
            }
        });

        TextFieldEdadMascota.setBackground(java.awt.SystemColor.control);
        TextFieldEdadMascota.setColumns(10);
        TextFieldEdadMascota.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        TextFieldEdadMascota.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TextFieldEdadMascota.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        TextFieldEdadMascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldEdadMascotaKeyTyped(evt);
            }
        });

        TextFieldRaza.setBackground(java.awt.SystemColor.control);
        TextFieldRaza.setColumns(10);
        TextFieldRaza.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        TextFieldRaza.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TextFieldRaza.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        TextFieldRaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldRazaKeyTyped(evt);
            }
        });

        LblClasificacion.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        LblClasificacion.setText("Clasificación:");

        ComboBox_Clasificación.setBackground(java.awt.SystemColor.control);
        ComboBox_Clasificación.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        ComboBox_Clasificación.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gato", "Perro", "Ave", "Roedor", "Exóticos" }));
        ComboBox_Clasificación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_ClasificaciónActionPerformed(evt);
            }
        });

        LabelDueno.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        LabelDueno.setText("Dueño:");

        TextFieldDueno.setBackground(java.awt.SystemColor.control);
        TextFieldDueno.setColumns(10);
        TextFieldDueno.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        TextFieldDueno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TextFieldDueno.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        TextFieldDueno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldDuenoKeyTyped(evt);
            }
        });

        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jSeparator2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        ButtonCancelar.setBackground(new java.awt.Color(255, 102, 102));
        ButtonCancelar.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        ButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCancelar.setText("CANCELAR");
        ButtonCancelar.setBorderPainted(false);
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        BtnGuardarPaciente.setBackground(new java.awt.Color(0, 204, 51));
        BtnGuardarPaciente.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        BtnGuardarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardarPaciente.setText("GUARDAR");
        BtnGuardarPaciente.setBorderPainted(false);
        BtnGuardarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JContenNuevoPacienteLayout = new javax.swing.GroupLayout(JContenNuevoPaciente);
        JContenNuevoPaciente.setLayout(JContenNuevoPacienteLayout);
        JContenNuevoPacienteLayout.setHorizontalGroup(
            JContenNuevoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JContenNuevoPacienteLayout.createSequentialGroup()
                .addGroup(JContenNuevoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JContenNuevoPacienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JContenNuevoPacienteLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JContenNuevoPacienteLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(JContenNuevoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JContenNuevoPacienteLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(JContenNuevoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelDueno, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JContenNuevoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextFieldNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldDueno, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(JContenNuevoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JContenNuevoPacienteLayout.createSequentialGroup()
                                        .addComponent(LblEdadMascota)
                                        .addGap(28, 28, 28)
                                        .addComponent(TextFieldEdadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(JContenNuevoPacienteLayout.createSequentialGroup()
                                        .addComponent(LblClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboBox_Clasificación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(JContenNuevoPacienteLayout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JContenNuevoPacienteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnGuardarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(ButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        JContenNuevoPacienteLayout.setVerticalGroup(
            JContenNuevoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JContenNuevoPacienteLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JContenNuevoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JContenNuevoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextFieldEdadMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblEdadMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JContenNuevoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextFieldNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(JContenNuevoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_Clasificación, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JContenNuevoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDueno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JContenNuevoPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGuardarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        getContentPane().add(JContenNuevoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBox_ClasificaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_ClasificaciónActionPerformed
       
    }//GEN-LAST:event_ComboBox_ClasificaciónActionPerformed

    private void TextFieldNombreMascotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldNombreMascotaKeyTyped
        char c = evt.getKeyChar();
            if(Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "No puede ingresar números!!!", "Alerta", JOptionPane.ERROR_MESSAGE);
		}
			
    }//GEN-LAST:event_TextFieldNombreMascotaKeyTyped

    private void TextFieldRazaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldRazaKeyTyped
        char c = evt.getKeyChar();
            if(Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "No puede ingresar números!!!", "Alerta", JOptionPane.ERROR_MESSAGE);
		}
    }//GEN-LAST:event_TextFieldRazaKeyTyped

    private void TextFieldDuenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldDuenoKeyTyped
      char c = evt.getKeyChar();
            if(Character.isDigit(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "No puede ingresar números!!!", "Alerta", JOptionPane.ERROR_MESSAGE);
		}
    }//GEN-LAST:event_TextFieldDuenoKeyTyped

    private void TextFieldEdadMascotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldEdadMascotaKeyTyped
      int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada 
		 if(TextFieldEdadMascota.getText().length()==2)
		 evt.consume();
		         if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {//Si el caracter ingresado es una letra
		             evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
		             JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Alerta", JOptionPane.ERROR_MESSAGE);
			}
    }//GEN-LAST:event_TextFieldEdadMascotaKeyTyped

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        this.dispose();
        new Interfaz().setVisible(true);
        MostrarListaPacientes.setText(colaMascotas.imprimir());
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void BtnGuardarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarPacienteActionPerformed
            Mascotas Paciente= new Mascotas();
            Paciente.setNombre(TextFieldNombreMascota.getText());
            Paciente.setEdad(Integer.parseInt(TextFieldEdadMascota.getText()));
            Paciente.setRaza(TextFieldRaza.getText());
            Paciente.setDueño(TextFieldDueno.getText());
            Paciente.setClasificacion((String) ComboBox_Clasificación.getSelectedItem());
                
            
            colaMascotas.insertar(Paciente);
            
            JOptionPane.showMessageDialog(null, "El paciente esta registrado. \tUsted esta haciendo fila en la posicion: "+colaMascotas.TamanioFila());
            MostrarListaPacientes.setText(colaMascotas.imprimir());
            //Paciente.setCodPaciente(colaMascotas.generarCod());
            
            int op = JOptionPane.showConfirmDialog(null, "¿Desea registrar otro paciente?", "Información", JOptionPane.YES_NO_OPTION);

				if(op == JOptionPane.YES_OPTION) {
					TextFieldNombreMascota.setText(null);
					TextFieldEdadMascota.setText(null);
					TextFieldDueno.setText(null);
					TextFieldRaza.setText(null);
                                        MostrarListaPacientes.setText(colaMascotas.imprimir());
				}else {
					this.dispose();
					new Interfaz().setVisible(true);
                                        MostrarListaPacientes.setText(colaMascotas.imprimir());
				}
                                
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing( WindowEvent evt ) {
				new Interfaz().setVisible(true);
                                
			}
		});                
    }//GEN-LAST:event_BtnGuardarPacienteActionPerformed

    /**
     * @param args the command line arguments
     * int codigoPaciente=(int) (Math.random()*10+1);
            Paciente.CodPaciente= codigoPaciente;
        
            Paciente.setCodPaciente(codigoPaciente);
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
            java.util.logging.Logger.getLogger(NuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoPaciente().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardarPaciente;
    private javax.swing.JButton ButtonCancelar;
    public static javax.swing.JComboBox<String> ComboBox_Clasificación;
    private javax.swing.JLabel EdadMascota1;
    private javax.swing.JPanel JContenNuevoPaciente;
    private javax.swing.JLabel LabelDueno;
    private javax.swing.JLabel LabelMascotas;
    private javax.swing.JLabel LblClasificacion;
    private javax.swing.JLabel LblEdadMascota;
    private javax.swing.JLabel LblRaza;
    private javax.swing.JLabel NombreMascota;
    public javax.swing.JTextField TextFieldDueno;
    public javax.swing.JTextField TextFieldEdadMascota;
    public javax.swing.JTextField TextFieldNombreMascota;
    public javax.swing.JTextField TextFieldRaza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
