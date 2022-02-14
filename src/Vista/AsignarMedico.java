/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Arbol_ListaEspera;
import Controlador.ListaConsultorios;
import Controlador.ListaEnlazadaMedicos;
import Modelo.Consultorios;
import Modelo.Dolencias;
import Modelo.Mascotas;
import Modelo.Medicos;
import static Vista.Interfaz.MostrarListaPacientes;
import static Vista.NuevoPaciente.colaMascotas;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class AsignarMedico extends javax.swing.JFrame {

    static int contador = 0;
    static ListaEnlazadaMedicos lista = new ListaEnlazadaMedicos();
    static Medicos medico1 = new Medicos(1, "Carlos", "Sánchez");
    static Medicos medico2 = new Medicos(2, "Mario", "García");
    static Medicos medico3 = new Medicos(3, "Laura", "Mendoza");
    static Medicos medico4 = new Medicos(4, "Maria", "Rodriguez");

    static ListaConsultorios consu = new ListaConsultorios();
    static Consultorios consul1 = new Consultorios(1, "Disponible", null, null, null);
    static Consultorios consul2 = new Consultorios(2, "Disponible", null, null, null);
    static Consultorios consul3 = new Consultorios(3, "Disponible", null, null, null);
    static Consultorios consul4 = new Consultorios(4, "Disponible", null, null, null);
    
    Arbol_ListaEspera arbolito = new Arbol_ListaEspera();

    static String Dolencias[] = {"Moquillo", "Hepatitis", "Leptospirosis", "Parvovirus", "Rabia", "Conjuntivitis", "Alergias cutáneas", "Diarrea", "Cáncer"};
    static Dolencias Dolen[] = {
        new Dolencias("Moquillo", " Esta enfermedad es causada por un virus de la familia Paramixoviridae, afecta al aparato digestivo y al aparato respiratorio."),
        new Dolencias("Hepatitis", "Enfermedad provocada por virus que ha afectado el higafo"),
        new Dolencias("Leptospirosis", "Es una enfermedad más frecuente en primavera y otoño, debido a las temperaturas moderadas y a la menor humedad."),
        new Dolencias("Conjuntivitis", "Se da producto de algún cuerpo extraño que se ha introducido en el ojo del animal. Sin embargo, también puede ser síntoma asociado de enfermedades graves como el virus del moquillo.")
    };

    public AsignarMedico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenedorImagemedico = new javax.swing.JPanel();
        ButtonCancelar = new javax.swing.JButton();
        ButtonAsignar = new javax.swing.JButton();
        LabelConsultorios = new javax.swing.JLabel();
        ScrollPaneConsultorios = new javax.swing.JScrollPane();
        textAreaConsultorios = new java.awt.TextArea();
        LabelMedicos = new javax.swing.JLabel();
        ScrollPaneMedicos = new javax.swing.JScrollPane();
        textAreaMostrarMedicos = new java.awt.TextArea();
        TxtConsultorio = new javax.swing.JTextField();
        TxtcodMedico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LabelTitulo = new javax.swing.JLabel();
        LabelFondoAsignar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        ContenedorImagemedico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonCancelar.setBackground(new java.awt.Color(255, 102, 102));
        ButtonCancelar.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        ButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCancelar.setText("CANCELAR");
        ButtonCancelar.setBorderPainted(false);
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });
        ContenedorImagemedico.add(ButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 120, 40));

        ButtonAsignar.setBackground(new java.awt.Color(204, 255, 204));
        ButtonAsignar.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        ButtonAsignar.setText("ACEPTAR");
        ButtonAsignar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ButtonAsignar.setBorderPainted(false);
        ButtonAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAsignarActionPerformed(evt);
            }
        });
        ContenedorImagemedico.add(ButtonAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 120, 40));

        LabelConsultorios.setBackground(new java.awt.Color(255, 255, 255));
        LabelConsultorios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelConsultorios.setForeground(new java.awt.Color(51, 153, 255));
        LabelConsultorios.setText(" Consultorios");
        ContenedorImagemedico.add(LabelConsultorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 120, 30));

        ScrollPaneConsultorios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ScrollPaneConsultorios.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPaneConsultorios.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        textAreaConsultorios.setEditable(false);
        textAreaConsultorios.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 15)); // NOI18N
        ScrollPaneConsultorios.setViewportView(textAreaConsultorios);

        ContenedorImagemedico.add(ScrollPaneConsultorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 190, 140));

        LabelMedicos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelMedicos.setForeground(new java.awt.Color(0, 204, 153));
        LabelMedicos.setText("Lista de Medicos");
        ContenedorImagemedico.add(LabelMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 150, 30));

        ScrollPaneMedicos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ScrollPaneMedicos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPaneMedicos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        textAreaMostrarMedicos.setEditable(false);
        textAreaMostrarMedicos.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 15)); // NOI18N
        ScrollPaneMedicos.setViewportView(textAreaMostrarMedicos);

        ContenedorImagemedico.add(ScrollPaneMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 280, 140));

        TxtConsultorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtConsultorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtConsultorioKeyTyped(evt);
            }
        });
        ContenedorImagemedico.add(TxtConsultorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 70, -1));

        TxtcodMedico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtcodMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcodMedicoActionPerformed(evt);
            }
        });
        TxtcodMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CodigoMedico(evt);
            }
        });
        ContenedorImagemedico.add(TxtcodMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 70, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("Seleccione Consultorio: ");
        ContenedorImagemedico.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 180, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("Seleccione el médico:");
        ContenedorImagemedico.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 190, 30));

        LabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(153, 255, 153));
        LabelTitulo.setText("Medicos del Hospital");
        ContenedorImagemedico.add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 270, 40));

        LabelFondoAsignar.setBackground(new java.awt.Color(51, 0, 0));
        LabelFondoAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoasignar.jpg"))); // NOI18N
        ContenedorImagemedico.add(LabelFondoAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenedorImagemedico, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenedorImagemedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAsignarActionPerformed

        Consultorios consultorio = new Consultorios();
        Medicos medico = new Medicos();
        Mascotas mascota = new Mascotas();

        try {
            if (NuevoPaciente.colaMascotas.estaVacia()) {

                JOptionPane.showMessageDialog(null, "No hay pacientes haciendo fila");

            } else {
                if (lista.Comprobacion(Integer.parseInt(TxtcodMedico.getText()))) {
                    int dato = 0;
                    do {

                        dato = Integer.parseInt(TxtConsultorio.getText());
                        consultorio.setNumerocon(dato);

                        if (dato < 0) {

                            JOptionPane.showMessageDialog(null, "El Numero de consultorio no corresponde a los consultorios asociados", "AVISO", JOptionPane.ERROR_MESSAGE);
                        } else if (dato > 4) {
                            JOptionPane.showMessageDialog(null, "El Numero de consultorio no corresponde a los consultorios asociados", "AVISO", JOptionPane.ERROR_MESSAGE);
                        }

                    } while (dato < 0 || dato > 4);

                    if (consu.Comprobar(consultorio.getNumerocon())) {

                        int a = (int) (Math.random() * Dolencias.length) + 0;// se le asigna una dolencia aleatoria

                        mascota = NuevoPaciente.colaMascotas.extraer();
                        mascota.setDolencia(Dolencias[a]);

                        consultorio.setMascota(mascota);
                        consultorio.setMedico(lista.Cambio(Integer.parseInt(TxtcodMedico.getText())));
                        consultorio.setEstado("Ocupado");
                        consu.Cambio2(Integer.parseInt(TxtConsultorio.getText()), consultorio);
                        //------------------------------------

                        textAreaConsultorios.setText(consu.MostarTodo());
                        textAreaMostrarMedicos.setText(lista.MostrarMedicos());
                        MostrarListaPacientes.setText(colaMascotas.imprimir());

                        int op = JOptionPane.showConfirmDialog(null, "¿Desea Asignar otro médico?", "Información", JOptionPane.YES_NO_OPTION);
                        if (op == JOptionPane.YES_OPTION) {
                            TxtcodMedico.setText(null);
                            TxtConsultorio.setText(null);

                        } else {
                            this.dispose();
                            new Interfaz().setVisible(true);
                            MostrarListaPacientes.setText(colaMascotas.imprimir());
                        }

                        this.addWindowListener(new WindowAdapter() {
                            public void windowClosing(WindowEvent evt) {
                                new Interfaz().setVisible(true);

                            }
                        });
                    } else {
                        JOptionPane.showMessageDialog(null, "Consultorio Ocupado\nUsar otro o Desocupar uno");
                    }
                    MostrarListaPacientes.setText(colaMascotas.imprimir());
                } else {
                    JOptionPane.showMessageDialog(null, "Medico Ocupado");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
        contador++;
        if (contador == 4) {
            System.out.println("EL CONTADOR ESTA EN 4");
            System.out.println("No hay consultorios ni doctores disponibles, agregando pacientes a lista de espera");
            for(int i=0;i<(NuevoPaciente.colaMascotas.TamanioFila()+1);i++){
            if (NuevoPaciente.colaMascotas.estaVacia()) {
                JOptionPane.showMessageDialog(null, "No hay pacientes para agregar");
            } else {
                mascota = NuevoPaciente.colaMascotas.extraer();
                arbolito.agregarNodo(mascota);
                
            }
          }
            arbolito.inOrden(arbolito.raiz);
        }
    }//GEN-LAST:event_ButtonAsignarActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        this.dispose();
        new Interfaz().setVisible(true);
        MostrarListaPacientes.setText(colaMascotas.imprimir());
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void CodigoMedico(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoMedico
        int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada 
        if (TxtcodMedico.getText().length() == 2) {
            evt.consume();
        }
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CodigoMedico

    private void TxtConsultorioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtConsultorioKeyTyped
        int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada 
        if (TxtConsultorio.getText().length() == 2) {
            evt.consume();
        }
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {//Si el caracter ingresado es una letra
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_TxtConsultorioKeyTyped

    private void TxtcodMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcodMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcodMedicoActionPerformed

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
            java.util.logging.Logger.getLogger(AsignarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAsignar;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JPanel ContenedorImagemedico;
    private javax.swing.JLabel LabelConsultorios;
    public static javax.swing.JLabel LabelFondoAsignar;
    private javax.swing.JLabel LabelMedicos;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JScrollPane ScrollPaneConsultorios;
    private javax.swing.JScrollPane ScrollPaneMedicos;
    private javax.swing.JTextField TxtConsultorio;
    public static javax.swing.JTextField TxtcodMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static java.awt.TextArea textAreaConsultorios;
    public static java.awt.TextArea textAreaMostrarMedicos;
    // End of variables declaration//GEN-END:variables
}
