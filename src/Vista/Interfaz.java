
package Vista;


import Controlador.Arbol_ListaEspera;
import Controlador.ColaMascotas;
import Controlador.ListaHospital;
import Modelo.Consultorios;
import Modelo.Hospital;
import Modelo.Mascotas;
import Modelo.Receta;
import static Vista.AsignarMedico.consu;
import static Vista.AsignarMedico.consul1;
import static Vista.AsignarMedico.consul2;
import static Vista.AsignarMedico.consul3;
import static Vista.AsignarMedico.consul4;
import static Vista.AsignarMedico.lista;
import static Vista.AsignarMedico.medico1;
import static Vista.AsignarMedico.medico2;
import static Vista.AsignarMedico.medico3;
import static Vista.AsignarMedico.medico4;
import static Vista.AsignarMedico.textAreaConsultorios;
import static Vista.AsignarMedico.textAreaMostrarMedicos;
import static Vista.ConsultarOcupacion.textAreaConsulta;
import static Vista.Desocupar.textAreaConsultoriosOcupados;
import static Vista.MostrarInfoHospital.textAreaInformación;
import static Vista.Recuperar_Datos.jTextAreaDatosRecuperados;

import javax.swing.JOptionPane;


public class Interfaz extends javax.swing.JFrame {
        ColaMascotas colaDeMascotas = new ColaMascotas();
        Arbol_ListaEspera arbolito = new Arbol_ListaEspera();
        static Receta receta [] = {
        new Receta(1, "Promax", 50, 3), 
	new Receta(2, "Synoquin", 150, 2), 
	new Receta(3, "Alcatran", 80, 5), 
	new Receta(4, "Mecadin", 200, 2), 
	new Receta(5, "Holix", 250, 3)};   
        static ListaHospital hospi = new ListaHospital();
        static int lim = 4, li=1;
        public static int cod=1000;
        
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        Contenedor = new javax.swing.JPanel();
        PanelMenu = new javax.swing.JPanel();
        NuevoPaciente = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        Asignar_Medico = new javax.swing.JLabel();
        Desocupar_Consultorio = new javax.swing.JLabel();
        Consultar1 = new javax.swing.JLabel();
        LabelListaPacientes = new javax.swing.JLabel();
        LabelListaPacientes1 = new javax.swing.JLabel();
        MostrarListaPacientes = new java.awt.TextArea();
        MostrarListaEspera = new java.awt.TextArea();
        LabelListaPacientes2 = new javax.swing.JLabel();
        jMenuBarArriba = new javax.swing.JMenuBar();
        jMenuHospital = new javax.swing.JMenu();
        jMenuItemDiagnosticos = new javax.swing.JMenuItem();
        Archivos = new javax.swing.JMenu();
        jMenuItemAlmacenar = new javax.swing.JMenuItem();
        jMenuItemRecuperar = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 51, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));

        PanelMenu.setBackground(new java.awt.Color(153, 204, 255));

        NuevoPaciente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NuevoPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/kit-de-primeros-auxilios_64.png"))); // NOI18N
        NuevoPaciente.setText("Nuevo Paciente");
        NuevoPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevoPacienteMouseClicked(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        Asignar_Medico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Asignar_Medico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinaria.png"))); // NOI18N
        Asignar_Medico.setText("Asignar Medico");
        Asignar_Medico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Asignar_MedicoMouseClicked(evt);
            }
        });

        Desocupar_Consultorio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Desocupar_Consultorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clinica-de-animales (1).png"))); // NOI18N
        Desocupar_Consultorio.setText("Desocupar Consultorio");
        Desocupar_Consultorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Desocupar_ConsultorioMouseClicked(evt);
            }
        });

        Consultar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Consultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veterinario (5).png"))); // NOI18N
        Consultar1.setText("Consultar");
        Consultar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Consultar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addComponent(Asignar_Medico)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NuevoPaciente)
                    .addComponent(Desocupar_Consultorio)
                    .addComponent(Consultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(NuevoPaciente)
                .addGap(26, 26, 26)
                .addComponent(Asignar_Medico)
                .addGap(34, 34, 34)
                .addComponent(Desocupar_Consultorio)
                .addGap(37, 37, 37)
                .addComponent(Consultar1)
                .addGap(33, 33, 33)
                .addComponent(btnSalir)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        NuevoPaciente.getAccessibleContext().setAccessibleName("");

        LabelListaPacientes.setFont(new java.awt.Font("Tw Cen MT", 0, 22)); // NOI18N
        LabelListaPacientes.setForeground(new java.awt.Color(102, 153, 255));
        LabelListaPacientes.setText("Lista de Pacientes");

        LabelListaPacientes1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        LabelListaPacientes1.setForeground(new java.awt.Color(102, 102, 102));
        LabelListaPacientes1.setText("Hospital Veterinario");

        MostrarListaPacientes.setColumns(10);
        MostrarListaPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        MostrarListaPacientes.setEditable(false);
        MostrarListaPacientes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        MostrarListaPacientes.setRows(10);
        MostrarListaPacientes.setSelectionStart(-1);

        MostrarListaEspera.setEditable(false);
        MostrarListaEspera.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N

        LabelListaPacientes2.setFont(new java.awt.Font("Tw Cen MT", 0, 22)); // NOI18N
        LabelListaPacientes2.setForeground(new java.awt.Color(102, 153, 255));
        LabelListaPacientes2.setText("Lista de Espera");

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelListaPacientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelListaPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MostrarListaPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(MostrarListaEspera, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(27, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelListaPacientes2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))))))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelListaPacientes1)
                .addGap(26, 26, 26)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelListaPacientes2)
                    .addComponent(LabelListaPacientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MostrarListaEspera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MostrarListaPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 510));

        jMenuBarArriba.setBackground(new java.awt.Color(204, 233, 248));
        jMenuBarArriba.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jMenuBarArriba.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBarArriba.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuHospital.setBorder(null);
        jMenuHospital.setText("Hospital");
        jMenuHospital.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N

        jMenuItemDiagnosticos.setText("Información Diagnosticos");
        jMenuItemDiagnosticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDiagnosticosActionPerformed(evt);
            }
        });
        jMenuHospital.add(jMenuItemDiagnosticos);

        jMenuBarArriba.add(jMenuHospital);

        Archivos.setText("Archivos");
        Archivos.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N

        jMenuItemAlmacenar.setText("Almacenar");
        jMenuItemAlmacenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlmacenarActionPerformed(evt);
            }
        });
        Archivos.add(jMenuItemAlmacenar);

        jMenuItemRecuperar.setText("Recuperar");
        jMenuItemRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRecuperarActionPerformed(evt);
            }
        });
        Archivos.add(jMenuItemRecuperar);

        jMenuBarArriba.add(Archivos);

        setJMenuBar(jMenuBarArriba);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoPacienteMouseClicked
   	this.setVisible(false);
        NuevoPaciente crearpaciente= new NuevoPaciente();
        crearpaciente.setVisible(true);
        crearpaciente.setLocationRelativeTo(null);
    }//GEN-LAST:event_NuevoPacienteMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
        JOptionPane.showMessageDialog(null, "Saliendo del programa...Hasta pronto.");
    }//GEN-LAST:event_btnSalirMouseClicked
    
    private void Asignar_MedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Asignar_MedicoMouseClicked
       this.setVisible(false);
        AsignarMedico asignar= new AsignarMedico();
        asignar.setVisible(true);
        asignar.setLocationRelativeTo(null);
        textAreaConsultorios.setText(consu.MostarTodo());
        textAreaMostrarMedicos.setText(lista.MostrarMedicos());
        
    }//GEN-LAST:event_Asignar_MedicoMouseClicked
    
    private void Desocupar_ConsultorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Desocupar_ConsultorioMouseClicked
     this.setVisible(false);
       Desocupar desocupa= new Desocupar();
       desocupa.setVisible(true);
       desocupa.setLocationRelativeTo(null);
       textAreaConsultoriosOcupados.setText(consu.ListaOcupados().MostarTodo());
    }//GEN-LAST:event_Desocupar_ConsultorioMouseClicked

    private void Consultar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Consultar1MouseClicked
        this.setVisible(false);
        ConsultarOcupacion consulta= new ConsultarOcupacion();
        consulta.setVisible(true);
        consulta.setLocationRelativeTo(null);
        textAreaConsulta.setText(consu.ListaOcupados().MuestraConsultorios());
    }//GEN-LAST:event_Consultar1MouseClicked

    private void jMenuItemAlmacenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlmacenarActionPerformed
      this.setVisible(false);
      hospi.escritura();
      new Interfaz().setVisible(true);
    }//GEN-LAST:event_jMenuItemAlmacenarActionPerformed

    private void jMenuItemDiagnosticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDiagnosticosActionPerformed
      this.setVisible(false);
      MostrarInfoHospital info= new MostrarInfoHospital();
      info.setVisible(true);
      info.setLocationRelativeTo(null);
      textAreaInformación.setText(hospi.Mostrar());
    }//GEN-LAST:event_jMenuItemDiagnosticosActionPerformed

    private void jMenuItemRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRecuperarActionPerformed
      this.setVisible(false);
      Recuperar_Datos recupera= new Recuperar_Datos();
      recupera.setVisible(true);
      recupera.setLocationRelativeTo(null);
      
       hospi.lectura();
       jTextAreaDatosRecuperados.setText(hospi.MostrarRecuperado());
    }//GEN-LAST:event_jMenuItemRecuperarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Interfaz().setVisible(true);
            lista.agregarAlInicio(medico1);
            lista.agregarAlInicio(medico2);
            lista.agregarAlInicio(medico3);
            lista.agregarAlInicio(medico4);
            
            consu.agregarAlInicio(consul1);
            consu.agregarAlInicio(consul2);
            consu.agregarAlInicio(consul3);
            consu.agregarAlInicio(consul4);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivos;
    private javax.swing.JLabel Asignar_Medico;
    private javax.swing.JLabel Consultar1;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel Desocupar_Consultorio;
    private javax.swing.JLabel LabelListaPacientes;
    private javax.swing.JLabel LabelListaPacientes1;
    private javax.swing.JLabel LabelListaPacientes2;
    public static java.awt.TextArea MostrarListaEspera;
    public static java.awt.TextArea MostrarListaPacientes;
    public javax.swing.JLabel NuevoPaciente;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JMenuBar jMenuBarArriba;
    private javax.swing.JMenu jMenuHospital;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAlmacenar;
    private javax.swing.JMenuItem jMenuItemDiagnosticos;
    private javax.swing.JMenuItem jMenuItemRecuperar;
    // End of variables declaration//GEN-END:variables




}
