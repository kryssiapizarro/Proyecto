/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Consultorios;
import Modelo.Hospital;
import Modelo.Mascotas;
import Modelo.NodoConsultorio;
import Modelo.NodoListaEspera;
import static Vista.AsignarMedico.arbolito;
import static Vista.AsignarMedico.consu;
import static Vista.AsignarMedico.lista;
import static Vista.AsignarMedico.textAreaMostrarMedicos;
import static Vista.Interfaz.MostrarListaEspera;
import static Vista.Interfaz.MostrarListaPacientes;
import static Vista.Interfaz.hospi;
import static Vista.Interfaz.li;
import static Vista.Interfaz.receta;
import static Vista.NuevoPaciente.colaMascotas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Kryssia Pizarro
 */
public class Desocupar extends javax.swing.JFrame {

    AsignarMedico medico = new AsignarMedico();
    Timer stopwatch;

    /**
     * Creates new form Desocupar
     */
    public Desocupar() {
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
        textAreaConsultoriosOcupados = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        ButtonDesocupar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAreaConsultoriosOcupados.setEditable(false);
        textAreaConsultoriosOcupados.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jPanel1.add(textAreaConsultoriosOcupados, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 239, 233));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultorios Ocupados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 188, -1));

        ButtonDesocupar.setBackground(new java.awt.Color(0, 204, 102));
        ButtonDesocupar.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        ButtonDesocupar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDesocupar.setText("DESOCUPAR");
        ButtonDesocupar.setBorderPainted(false);
        ButtonDesocupar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDesocuparActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonDesocupar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 120, 40));

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
        jPanel1.add(ButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonDesocuparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDesocuparActionPerformed
        if (textAreaConsultoriosOcupados.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los consultorios se encuentran disponibles. No hay consultorios para desocupar");
        } else {
            desocupar();
        }

    }//GEN-LAST:event_ButtonDesocuparActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        this.dispose();
        new Interfaz().setVisible(true);
        MostrarListaPacientes.setText(colaMascotas.imprimir());
        MostrarListaEspera.setText(arbolito.toString());
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    public void desocupar() {
        ActionListener action = new ActionListener() {
            NodoConsultorio temp = Vista.AsignarMedico.consu.Inicio;
            public void actionPerformed(ActionEvent e) {
                int a = (int) (Math.random() * receta.length) + 0;
                int numeroDeConsultorio = (int) (Math.random() * 4 + 1);
                Mascotas mascota = new Mascotas();
                NodoListaEspera listaEspera = new NodoListaEspera(mascota);
                while (temp != null) {
                    if (temp.getDato().getNumerocon() == numeroDeConsultorio && temp.getDato().getEstado() == "Ocupado") {
                        try {
                            Hospital hos = new Hospital();
                            Consultorios con = consu.Cambio(numeroDeConsultorio);

                            hos.setCod(li);
                            hos.setConsultorio(con);
                            hos.setReceta(receta[a]);

                            hospi.insertarRecuperar(hos);
                          

                            textAreaMostrarMedicos.setText(lista.MostrarMedicos());
                            System.out.println("Se ha desocupado el consultorio " + numeroDeConsultorio);
                            JOptionPane.showMessageDialog(null, "Se ha desocupado el consultorio " + numeroDeConsultorio);
                            li = li + 1;
                        listaEspera = medico.arbolito.raiz;
                        listaEspera.setCodigoDelPaciente(temp.getDato().getMascota().getCodPaciente());
                        System.out.println("-------------RAIZ EN DESOCUPAR--------------");
                        System.out.println(medico.arbolito.raiz.getDato());
                        System.out.println("--------------------------------------------");
                        if(medico.arbolito.estaVacio()){
                            System.out.println("ESTA VACIO EL ARBOL");
                            JOptionPane.showMessageDialog(null, "No hay clientes en espera");
                        }else{
                        mascota = medico.arbolito.eliminar(listaEspera, temp);
                        colaMascotas.insertar(mascota);
                        MostrarListaPacientes.setText(colaMascotas.imprimir());
                        }
                            MostrarListaPacientes.setText(NuevoPaciente.colaMascotas.imprimir());
                            textAreaConsultoriosOcupados.setText(consu.mostrarOcupados());
                            temp = null;
                            break;

                        } catch (Exception ex) {
                            Logger.getLogger(Desocupar.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                        //return;
                    } else if (temp.getDato().getNumerocon() == numeroDeConsultorio && temp.getDato().getEstado() == "Disponible") {
                        temp = temp.Siguiente;
                        System.out.println(temp.getDato().getNumerocon());
                        numeroDeConsultorio = (int) (Math.random() * 4 + 1);
                    } else if (temp.getDato().getNumerocon() != numeroDeConsultorio && temp.getDato().getEstado() == "Disponible") {
                        temp = temp.Siguiente;
                        System.out.println(temp.getDato().getNumerocon());
                        numeroDeConsultorio = (int) (Math.random() * 4 + 1);
                    } else if (temp.getDato().getNumerocon() != numeroDeConsultorio && temp.getDato().getEstado() == "Ocupado") {
                        System.out.println(temp.getDato().getNumerocon());
                        numeroDeConsultorio = (int) (Math.random() * 4 + 1);
                    }
                }
                temp = null;
            }
        };
        stopwatch = new Timer(0, action);
        stopwatch.start();
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
            java.util.logging.Logger.getLogger(Desocupar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desocupar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desocupar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desocupar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desocupar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonDesocupar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static java.awt.TextArea textAreaConsultoriosOcupados;
    // End of variables declaration//GEN-END:variables
}
