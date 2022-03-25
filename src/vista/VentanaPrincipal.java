
package vista;

import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.Paciente;
import modelo.SQLUsuario;

public class VentanaPrincipal extends javax.swing.JFrame {
    private void limpiarCajas() {
        cajaNombrePacientes.setText("");
        cajaApellidoPacientes.setText("");
        cajaDNIPacientes.setText("");
        cajaEdadPacientes.setText("");
        jdcFechaNacimientoPacientes.setDate(null);
        cajaDomicilioPacientes.setText("");
        cajaCelularPacientes.setText("");
        cajaCorreoPacientes.setText("");
    }    
    
    public Date formatedDate(java.util.Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat.format(date);
        Date fechaNacimiento = Date.valueOf(formattedDate);
        
        return fechaNacimiento;
    }
    
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVentanaPrincipal = new javax.swing.JPanel();
        tabbedPanePrincipal = new javax.swing.JTabbedPane();
        scrollPaneTurnos = new javax.swing.JScrollPane();
        panelTurnos = new javax.swing.JPanel();
        eNuevoTurno = new javax.swing.JLabel();
        eDNI = new javax.swing.JLabel();
        cajaDNI = new javax.swing.JTextField();
        eNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        eApellido = new javax.swing.JLabel();
        cajaApellido = new javax.swing.JTextField();
        jdcNuevoTurno = new com.toedter.calendar.JDateChooser();
        cboHora = new javax.swing.JComboBox<>();
        eFecha = new javax.swing.JLabel();
        eHora = new javax.swing.JLabel();
        btnAgendar = new javax.swing.JButton();
        eTurnosDelDia = new javax.swing.JLabel();
        separadorTurnos = new javax.swing.JSeparator();
        jdcTurno = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTurnos = new javax.swing.JTable();
        scrollPanePacientes = new javax.swing.JScrollPane();
        panelPacientes = new javax.swing.JPanel();
        eBuscarPaciente = new javax.swing.JLabel();
        enombrePacientes = new javax.swing.JLabel();
        cajaNombrePacientes = new javax.swing.JTextField();
        eApellidoPacientes = new javax.swing.JLabel();
        cajaApellidoPacientes = new javax.swing.JTextField();
        eDNIPacientes = new javax.swing.JLabel();
        cajaDNIPacientes = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JToggleButton();
        eEdadPacientes = new javax.swing.JLabel();
        cajaEdadPacientes = new javax.swing.JTextField();
        eFechaNacimientoPacientes = new javax.swing.JLabel();
        eDomiciliosPacientes = new javax.swing.JLabel();
        cajaDomicilioPacientes = new javax.swing.JTextField();
        jdcFechaNacimientoPacientes = new com.toedter.calendar.JDateChooser();
        eCelularPacientes = new javax.swing.JLabel();
        cajaCelularPacientes = new javax.swing.JTextField();
        eCorreoPacientes = new javax.swing.JLabel();
        cajaCorreoPacientes = new javax.swing.JTextField();
        btnCargar = new javax.swing.JToggleButton();
        btnActualizar = new javax.swing.JToggleButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnNuevoRegistro = new javax.swing.JButton();
        barraMenuPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eNuevoTurno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eNuevoTurno.setText("Nuevo Turno");

        eDNI.setText("DNI:");

        eNombre.setText("Nombre:");

        eApellido.setText("Apellido:");

        cboHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00" }));

        eFecha.setText("Fecha:");

        eHora.setText("Hora:");

        btnAgendar.setText("Agendar");

        eTurnosDelDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eTurnosDelDia.setText("Turnos del día");

        tablaTurnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaTurnos);

        javax.swing.GroupLayout panelTurnosLayout = new javax.swing.GroupLayout(panelTurnos);
        panelTurnos.setLayout(panelTurnosLayout);
        panelTurnosLayout.setHorizontalGroup(
            panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTurnosLayout.createSequentialGroup()
                .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTurnosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eTurnosDelDia)
                            .addComponent(eNuevoTurno)
                            .addGroup(panelTurnosLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eDNI)
                                    .addComponent(eFecha))
                                .addGap(18, 18, 18)
                                .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jdcNuevoTurno, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(cajaDNI))
                                .addGap(18, 18, 18)
                                .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelTurnosLayout.createSequentialGroup()
                                        .addComponent(eNombre)
                                        .addGap(18, 18, 18)
                                        .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelTurnosLayout.createSequentialGroup()
                                        .addComponent(eHora)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(eApellido)
                                .addGap(18, 18, 18)
                                .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTurnosLayout.createSequentialGroup()
                                .addComponent(separadorTurnos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelTurnosLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        panelTurnosLayout.setVerticalGroup(
            panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTurnosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eHora))
                    .addGroup(panelTurnosLayout.createSequentialGroup()
                        .addComponent(eNuevoTurno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eDNI)
                            .addComponent(cajaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eNombre)
                            .addComponent(eApellido)
                            .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcNuevoTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eFecha))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(separadorTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgendar))
                .addGap(19, 19, 19)
                .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eTurnosDelDia)
                    .addComponent(jdcTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        scrollPaneTurnos.setViewportView(panelTurnos);

        tabbedPanePrincipal.addTab("Turnos", scrollPaneTurnos);

        panelPacientes.setPreferredSize(new java.awt.Dimension(600, 336));

        eBuscarPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eBuscarPaciente.setText("Buscar Paciente");

        enombrePacientes.setText("Nombre:");

        eApellidoPacientes.setText("Apellido:");

        eDNIPacientes.setText("DNI:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        eEdadPacientes.setText("Edad:");

        eFechaNacimientoPacientes.setText("Fecha Nacimiento:");

        eDomiciliosPacientes.setText("Domicilio:");

        eCelularPacientes.setText("Celular");

        eCorreoPacientes.setText("Correo: ");

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Historia Clínica");

        btnNuevoRegistro.setText("Nuevo Registro");

        javax.swing.GroupLayout panelPacientesLayout = new javax.swing.GroupLayout(panelPacientes);
        panelPacientes.setLayout(panelPacientesLayout);
        panelPacientesLayout.setHorizontalGroup(
            panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(panelPacientesLayout.createSequentialGroup()
                        .addGroup(panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eBuscarPaciente)
                            .addGroup(panelPacientesLayout.createSequentialGroup()
                                .addComponent(eCelularPacientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaCelularPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eCorreoPacientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaCorreoPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPacientesLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(117, 117, 117)
                                .addComponent(btnNuevoRegistro))
                            .addGroup(panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelPacientesLayout.createSequentialGroup()
                                    .addComponent(eEdadPacientes)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cajaEdadPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(eFechaNacimientoPacientes)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jdcFechaNacimientoPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(eDomiciliosPacientes)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cajaDomicilioPacientes))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPacientesLayout.createSequentialGroup()
                                    .addComponent(enombrePacientes)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cajaNombrePacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(eApellidoPacientes)
                                    .addGap(18, 18, 18)
                                    .addComponent(cajaApellidoPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(eDNIPacientes)
                                    .addGap(18, 18, 18)
                                    .addComponent(cajaDNIPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnLimpiar))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPacientesLayout.setVerticalGroup(
            panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eBuscarPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPacientesLayout.createSequentialGroup()
                        .addGroup(panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eApellidoPacientes)
                            .addComponent(cajaNombrePacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaApellidoPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eDNIPacientes)
                            .addComponent(cajaDNIPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enombrePacientes)
                            .addComponent(btnBuscar)
                            .addComponent(btnLimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eFechaNacimientoPacientes)
                            .addComponent(cajaEdadPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eDomiciliosPacientes)
                            .addComponent(cajaDomicilioPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eEdadPacientes)))
                    .addComponent(jdcFechaNacimientoPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eCelularPacientes)
                    .addComponent(cajaCelularPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eCorreoPacientes)
                    .addComponent(cajaCorreoPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargar)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnNuevoRegistro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        scrollPanePacientes.setViewportView(panelPacientes);

        tabbedPanePrincipal.addTab("Pacientes", scrollPanePacientes);

        javax.swing.GroupLayout panelVentanaPrincipalLayout = new javax.swing.GroupLayout(panelVentanaPrincipal);
        panelVentanaPrincipal.setLayout(panelVentanaPrincipalLayout);
        panelVentanaPrincipalLayout.setHorizontalGroup(
            panelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPanePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        panelVentanaPrincipalLayout.setVerticalGroup(
            panelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenu1.setText("File");
        barraMenuPrincipal.add(jMenu1);

        jMenu2.setText("Edit");
        barraMenuPrincipal.add(jMenu2);

        setJMenuBar(barraMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelVentanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        int edad = Integer.parseInt(cajaEdadPacientes.getText());
        Date fechaNacimiento = formatedDate(jdcFechaNacimientoPacientes.getDate());
        SQLUsuario sqlPaciente = new SQLUsuario();
        Paciente paciente = null;
        
        if (cajaNombrePacientes.getText().equals("") || cajaApellidoPacientes.getText().equals("") || cajaDNIPacientes.getText().equals("") || cajaEdadPacientes.getText().equals("") || jdcFechaNacimientoPacientes.getDate().equals("") || cajaDomicilioPacientes.getText().equals("") || cajaCelularPacientes.getText().equals("") || cajaCorreoPacientes.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Falta completar uno o más campos");
        }
        else{
            
            if (sqlPaciente.verificarPersona(cajaDNIPacientes.getText()) == 0) {
                if (sqlPaciente.comprobarCorreo(cajaCorreoPacientes.getText())){
                  paciente = new Paciente(cajaNombrePacientes.getText(), cajaApellidoPacientes.getText(), cajaDNIPacientes.getText(), edad, fechaNacimiento, cajaDomicilioPacientes.getText(), cajaCelularPacientes.getText(), cajaCorreoPacientes.getText());
                sqlPaciente.cargarPaciente(paciente);  
                }
                else{
                    JOptionPane.showMessageDialog(null, "El e-mail ingresado es incorrecto");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "El paciente ya existe");
            }
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        SQLUsuario sqlPaciente = new SQLUsuario();
        Paciente paciente = new Paciente();
        paciente.setDni(cajaDNIPacientes.getText());
        
        if (sqlPaciente.buscarPaciente(paciente)) {
            cajaNombrePacientes.setText(paciente.getNombre());
            cajaApellidoPacientes.setText(paciente.getApellido());
            cajaDNIPacientes.setText(paciente.getDni());
            cajaEdadPacientes.setText(String.valueOf(paciente.getEdad()));
            jdcFechaNacimientoPacientes.setDate(paciente.getFechaNacimiento());
            cajaDomicilioPacientes.setText(paciente.getDomicilio());
            cajaCelularPacientes.setText(paciente.getCelular());
            cajaCorreoPacientes.setText(paciente.getCorreo());
        }
        else{
            JOptionPane.showMessageDialog(null, "No existe paciente con el DNI ingresado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        SQLUsuario sqlPaciente = new SQLUsuario();
        Date fechaNacimiento = formatedDate(jdcFechaNacimientoPacientes.getDate());
        Paciente paciente = new Paciente();        
                  
        paciente.setDni(cajaDNIPacientes.getText());
        paciente.setNombre(cajaNombrePacientes.getText());
        paciente.setApellido(cajaApellidoPacientes.getText());
        paciente.setEdad(Integer.parseInt(cajaEdadPacientes.getText()));
        paciente.setFechaNacimiento(fechaNacimiento);
        paciente.setDomicilio(cajaDomicilioPacientes.getText());
        paciente.setCelular(cajaCelularPacientes.getText());
        paciente.setCorreo(cajaCorreoPacientes.getText());
        
        sqlPaciente.actualizarPaciente(paciente);        
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenuPrincipal;
    public javax.swing.JToggleButton btnActualizar;
    private javax.swing.JButton btnAgendar;
    public javax.swing.JToggleButton btnBuscar;
    public javax.swing.JToggleButton btnCargar;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnNuevoRegistro;
    private javax.swing.JTextField cajaApellido;
    public javax.swing.JTextField cajaApellidoPacientes;
    public javax.swing.JTextField cajaCelularPacientes;
    public javax.swing.JTextField cajaCorreoPacientes;
    private javax.swing.JTextField cajaDNI;
    public javax.swing.JTextField cajaDNIPacientes;
    public javax.swing.JTextField cajaDomicilioPacientes;
    public javax.swing.JTextField cajaEdadPacientes;
    private javax.swing.JTextField cajaNombre;
    public javax.swing.JTextField cajaNombrePacientes;
    private javax.swing.JComboBox<String> cboHora;
    private javax.swing.JLabel eApellido;
    private javax.swing.JLabel eApellidoPacientes;
    private javax.swing.JLabel eBuscarPaciente;
    private javax.swing.JLabel eCelularPacientes;
    private javax.swing.JLabel eCorreoPacientes;
    private javax.swing.JLabel eDNI;
    private javax.swing.JLabel eDNIPacientes;
    private javax.swing.JLabel eDomiciliosPacientes;
    private javax.swing.JLabel eEdadPacientes;
    private javax.swing.JLabel eFecha;
    private javax.swing.JLabel eFechaNacimientoPacientes;
    private javax.swing.JLabel eHora;
    private javax.swing.JLabel eNombre;
    private javax.swing.JLabel eNuevoTurno;
    private javax.swing.JLabel eTurnosDelDia;
    private javax.swing.JLabel enombrePacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    public com.toedter.calendar.JDateChooser jdcFechaNacimientoPacientes;
    private com.toedter.calendar.JDateChooser jdcNuevoTurno;
    private com.toedter.calendar.JDateChooser jdcTurno;
    private javax.swing.JPanel panelPacientes;
    private javax.swing.JPanel panelTurnos;
    private javax.swing.JPanel panelVentanaPrincipal;
    private javax.swing.JScrollPane scrollPanePacientes;
    private javax.swing.JScrollPane scrollPaneTurnos;
    private javax.swing.JSeparator separadorTurnos;
    private javax.swing.JTabbedPane tabbedPanePrincipal;
    private javax.swing.JTable tablaTurnos;
    // End of variables declaration//GEN-END:variables
}
