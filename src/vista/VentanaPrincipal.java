package vista;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Paciente;
import modelo.SQLModelo;
import static vista.VentanaInicio.diseño;

public class VentanaPrincipal extends javax.swing.JFrame {

    boolean pacienteNuevo;
    SQLModelo modelo = new SQLModelo();
    Conexion con = new Conexion();
    PreparedStatement ps = null;
    ResultSet rs = null;
    ZoneId defaultZoneId = ZoneId.systemDefault();
    LocalDate localDate = LocalDate.now();
    java.util.Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());

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

    public VentanaPrincipal() {
        diseño();
        initComponents();
        setLocationRelativeTo(null);
        jdcNuevoTurno.setDate(date);
        jdcTurno.setDate(date);
        jdcFechaNacimientoPacientes.setDate(date);
    }

    public boolean cargarHistoriaClinica(int idPaciente) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaHistoriaClinica.setModel(modeloTabla);
        tablaHistoriaClinica.setRowHeight(100);
        Connection conexion = con.getConnection();
        try {
            ps = conexion.prepareStatement("select fechaRegistro, registro, medicacion from historiaclinica where idPaciente=?");
            ps.setInt(1, idPaciente);
            rs = ps.executeQuery();
            ResultSetMetaData rsMD = rs.getMetaData();
            modeloTabla.addColumn("Fecha");
            modeloTabla.addColumn("Registro");
            modeloTabla.addColumn("Medicacion");
            int anchos[] = {75, 150, 150};
            int cantColumn = rsMD.getColumnCount();
            for (int i = 0; i < cantColumn; i++) {
                tablaHistoriaClinica.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object fila[] = new Object[3];
                for (int i = 0; i < cantColumn; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }
            return true;
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error, " + ex);
            }
        }
    }

    public boolean cargarTurnos(Timestamp fecha) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaTurnos.setModel(modeloTabla);
        Connection conexion = con.getConnection();
        try {
            ps = conexion.prepareStatement("select t.fechaHora, p.idPaciente, pe.nombre, pe.apellido from turno as t inner join paciente as p on t.idPaciente = p.idPaciente inner join persona as pe on p.idPersona = pe.idPersona where fechaHora BETWEEN ? AND '2038-01-17 03:14:07.999999' order by fechaHora;");
            ps.setTimestamp(1, fecha);
            rs = ps.executeQuery();
            ResultSetMetaData rsMD = rs.getMetaData();
            modeloTabla.addColumn("Fecha y Hora");
            modeloTabla.addColumn("ID");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Apellido");
            int anchos[] = {150, 5, 100, 100};
            int cantColumn = rsMD.getColumnCount();
            for (int i = 0; i < cantColumn; i++) {
                tablaTurnos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object fila[] = new Object[cantColumn];
                for (int i = 0; i < cantColumn; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloTabla.addRow(fila);
            }
            return true;
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error, " + ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVentanaPrincipal = new javax.swing.JPanel();
        tabbedPanePrincipal = new javax.swing.JTabbedPane();
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
        tablaHistoriaClinica = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnNuevoRegistro = new javax.swing.JButton();
        eGenero = new javax.swing.JLabel();
        cboGenero = new javax.swing.JComboBox<>();
        cajaIdPersona = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
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
        btnCargarTurnos = new javax.swing.JButton();
        barraMenuPrincipal = new javax.swing.JMenuBar();
        menuB1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuB2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        tablaHistoriaClinica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha", "Registro", "Medicación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaHistoriaClinica);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Historia Clínica");

        btnNuevoRegistro.setText("Nuevo Registro");
        btnNuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoRegistroActionPerformed(evt);
            }
        });

        eGenero.setText("Género:");

        cboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "M", "F", "O" }));

        jLabel2.setText("ID:");

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
                            .addGroup(panelPacientesLayout.createSequentialGroup()
                                .addComponent(eEdadPacientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajaEdadPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eFechaNacimientoPacientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jdcFechaNacimientoPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eGenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eDomiciliosPacientes)
                                .addGap(18, 18, 18)
                                .addComponent(cajaDomicilioPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPacientesLayout.createSequentialGroup()
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
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar)))
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addGroup(panelPacientesLayout.createSequentialGroup()
                        .addComponent(eBuscarPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cajaIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelPacientesLayout.setVerticalGroup(
            panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eBuscarPaciente)
                    .addComponent(cajaIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPacientesLayout.createSequentialGroup()
                        .addGroup(panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiar)
                            .addGroup(panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(eApellidoPacientes)
                                .addComponent(cajaNombrePacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cajaApellidoPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eDNIPacientes)
                                .addComponent(cajaDNIPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(enombrePacientes)
                                .addComponent(btnBuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eFechaNacimientoPacientes)
                            .addComponent(cajaEdadPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eDomiciliosPacientes)
                            .addComponent(cajaDomicilioPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eEdadPacientes)
                            .addComponent(eGenero)
                            .addComponent(cboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jdcFechaNacimientoPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eCelularPacientes)
                    .addComponent(cajaCelularPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eCorreoPacientes)
                    .addComponent(cajaCorreoPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargar)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(panelPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnNuevoRegistro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        scrollPanePacientes.setViewportView(panelPacientes);

        tabbedPanePrincipal.addTab("Pacientes", scrollPanePacientes);

        eNuevoTurno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eNuevoTurno.setText("Nuevo Turno");

        eDNI.setText("DNI:");

        cajaDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cajaDNIKeyPressed(evt);
            }
        });

        eNombre.setText("Nombre:");

        eApellido.setText("Apellido:");

        cboHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "07:00:00", "07:30:00", "08:00:00", "08:30:00", "09:00:00", "09:30:00", "10:00:00", "10:30:00", "11:00:00", "11:30:00", "12:00:00", "12:30:00", "13:00:00", "13:30:00", "14:00:00", "14:30:00", "15:00:00", "15:30:00", "16:00:00", "16:30:00", "17:00:00", "17:30:00", "18:00:00", "18:30:00", "19:00:00", "19:30:00", "20:00:00", "20:30:00", "21:00:00", "21:30:00" }));

        eFecha.setText("Fecha:");

        eHora.setText("Hora:");

        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        eTurnosDelDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eTurnosDelDia.setText("Turnos ");

        tablaTurnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaTurnos);

        btnCargarTurnos.setText("Cargar Turnos");
        btnCargarTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarTurnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTurnosLayout = new javax.swing.GroupLayout(panelTurnos);
        panelTurnos.setLayout(panelTurnosLayout);
        panelTurnosLayout.setHorizontalGroup(
            panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTurnosLayout.createSequentialGroup()
                .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTurnosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelTurnosLayout.createSequentialGroup()
                                .addComponent(eTurnosDelDia)
                                .addGap(193, 193, 193)
                                .addComponent(jdcTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelTurnosLayout.createSequentialGroup()
                                        .addComponent(eApellido)
                                        .addGap(18, 18, 18)
                                        .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(separadorTurnos)))
                    .addGroup(panelTurnosLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCargarTurnos)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        panelTurnosLayout.setVerticalGroup(
            panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTurnosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eHora)
                        .addComponent(cboHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgendar))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(separadorTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(panelTurnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eTurnosDelDia)
                    .addComponent(jdcTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargarTurnos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        scrollPaneTurnos.setViewportView(panelTurnos);

        tabbedPanePrincipal.addTab("Turnos", scrollPaneTurnos);

        javax.swing.GroupLayout panelVentanaPrincipalLayout = new javax.swing.GroupLayout(panelVentanaPrincipal);
        panelVentanaPrincipal.setLayout(panelVentanaPrincipalLayout);
        panelVentanaPrincipalLayout.setHorizontalGroup(
            panelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVentanaPrincipalLayout.createSequentialGroup()
                .addComponent(tabbedPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelVentanaPrincipalLayout.setVerticalGroup(
            panelVentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        menuB1.setText("Menu");
        menuB1.add(jMenuItem1);

        barraMenuPrincipal.add(menuB1);

        menuB2.setText("Ayuda");
        barraMenuPrincipal.add(menuB2);

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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Paciente paciente = new Paciente();
        paciente.setDni(cajaDNIPacientes.getText());

        if (modelo.buscarPersona(paciente)) {
            // int index = seleccionarCboGenero(paciente.getGenero());
            cajaIdPersona.setText(String.valueOf(paciente.getIdPersona()));
            cajaNombrePacientes.setText(paciente.getNombre());
            cajaApellidoPacientes.setText(paciente.getApellido());
            cajaDNIPacientes.setText(paciente.getDni());
            cajaEdadPacientes.setText(String.valueOf(paciente.getEdad()));
            //cboGenero.setSelectedIndex(index);
            jdcFechaNacimientoPacientes.setDate(paciente.getFechaNacimiento());
            cajaDomicilioPacientes.setText(paciente.getDomicilio());
            cajaCelularPacientes.setText(paciente.getCelular());
            cajaCorreoPacientes.setText(paciente.getCorreo());
        } else {
            JOptionPane.showMessageDialog(null, "No existe paciente con el DNI ingresado");
        }

        if (modelo.buscarPaciente(paciente)) {
            cargarHistoriaClinica(paciente.getIdPaciente());
        } else {
            System.out.println("El paciente no existe como tal");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Date fechaNacimiento = modelo.formatedDate(jdcFechaNacimientoPacientes.getDate());
        Paciente paciente = new Paciente();

        paciente.setDni(cajaDNIPacientes.getText());
        paciente.setNombre(cajaNombrePacientes.getText());
        paciente.setApellido(cajaApellidoPacientes.getText());
        paciente.setEdad(Integer.parseInt(cajaEdadPacientes.getText()));
        paciente.setFechaNacimiento(fechaNacimiento);
        paciente.setDomicilio(cajaDomicilioPacientes.getText());
        paciente.setCelular(cajaCelularPacientes.getText());
        paciente.setCorreo(cajaCorreoPacientes.getText());

        modelo.actualizarPaciente(paciente);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        //String genero = seleccionarGenero();
        if (!cajaEdadPacientes.getText().equals("") || !cajaNombrePacientes.getText().equals("") || !cajaApellidoPacientes.getText().equals("") || !cajaDNIPacientes.getText().equals("") || !cajaDomicilioPacientes.getText().equals("") || !cajaCelularPacientes.getText().equals("") || !cajaCorreoPacientes.getText().equals("")) {
            Paciente paciente = null;
            int edad = Integer.parseInt(cajaEdadPacientes.getText());
            Date fechaNacimiento = modelo.formatedDate(jdcFechaNacimientoPacientes.getDate());
           

            if (modelo.comprobarCorreo(cajaCorreoPacientes.getText())) {
                if (modelo.verificarPersona(cajaDNIPacientes.getText()) == 0) {
                    if (modelo.verificarPaciente(paciente.getIdPersona()) == 0) {
                         paciente = new Paciente(cajaNombrePacientes.getText(), cajaApellidoPacientes.getText(), cajaDNIPacientes.getText(), edad, fechaNacimiento, cajaDomicilioPacientes.getText(), cajaCelularPacientes.getText(), cajaCorreoPacientes.getText());
                        modelo.cargarPaciente(paciente);
                    }else{
                        JOptionPane.showMessageDialog(null, "El paciente ya está cargado");
                    }
                } else {
                    int idPersona = Integer.parseInt(cajaIdPersona.getText());
                    if (modelo.verificarPaciente(idPersona) == 0) {
                        paciente = new Paciente(idPersona);
                        if (modelo.cargarPacientePersona(paciente)) {
                            JOptionPane.showMessageDialog(null, "Se cargó el paciente");
                        }                  
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "El paciente ya existe");
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "El e-mail ingresado es incorrecto");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Falta completar uno o más campos");
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnNuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRegistroActionPerformed
        Paciente p = new Paciente();
        p.setDni(cajaDNIPacientes.getText());
        modelo.buscarPersona(p);

        if (modelo.buscarPaciente(p)) {
            RegistroHistoriaClinica rhc = new RegistroHistoriaClinica(this, true, p.getIdPaciente());
            rhc.setVisible(true);
        }
    }//GEN-LAST:event_btnNuevoRegistroActionPerformed

    private void cajaDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaDNIKeyPressed
        if (evt.getKeyChar() == '\n') {
            SQLModelo modelo = new SQLModelo();
            Paciente paciente = new Paciente();
            paciente.setDni(cajaDNI.getText());

            if (modelo.buscarPersona(paciente)) {
                cajaNombre.setText(paciente.getNombre());
                cajaApellido.setText(paciente.getApellido());
                pacienteNuevo = false;
            } else {
                JOptionPane.showMessageDialog(null, "Paciente Nuevo");
                pacienteNuevo = true;
            }
        }
    }//GEN-LAST:event_cajaDNIKeyPressed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        if (cboHora.getSelectedIndex() != 0) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = modelo.formatedDate(jdcNuevoTurno.getDate());

            String fechaTurno = dateFormat.format(date);
            String horaTurno = cboHora.getSelectedItem().toString();

            Timestamp turno = Timestamp.valueOf(fechaTurno + " " + horaTurno + ".000000000");

            if (pacienteNuevo) {
                Paciente paciente = null;

                if (cajaNombre.getText().equals("") || cajaApellido.getText().equals("") || cajaDNI.getText().equals("") || cboHora.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Falta completar uno o más campos");
                } else {
                    if (modelo.verificarTurno(turno) == 0) {
                        paciente = new Paciente(cajaNombre.getText(), cajaApellido.getText(), cajaDNIPacientes.getText());
                        modelo.cargarPaciente(paciente);
                        modelo.crearTurno(paciente.getIdPaciente(), turno);
                    } else {
                        JOptionPane.showMessageDialog(null, "El turno no está disponible");
                    }
                }
            } else {
                if (modelo.verificarTurno(turno) == 0) {
                    Paciente paciente = new Paciente();
                    paciente.setDni(cajaDNI.getText());
                    modelo.buscarPersona(paciente);
                    modelo.buscarPaciente(paciente);
                    modelo.crearTurno(paciente.getIdPaciente(), turno);
                } else {
                    JOptionPane.showMessageDialog(null, "El turno no está disponible");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar la hora del turno");
        }
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnCargarTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTurnosActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = modelo.formatedDate(jdcTurno.getDate());

        String fechaTurno = dateFormat.format(date);

        Timestamp fecha = Timestamp.valueOf(fechaTurno + " " + "00:00:00.000000000");

        if (cargarTurnos(fecha)) {

        } else {
            JOptionPane.showMessageDialog(null, "No se pudo cargar turnos");
        }
    }//GEN-LAST:event_btnCargarTurnosActionPerformed

    public static void main(String args[]) {
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
    private javax.swing.JButton btnCargarTurnos;
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
    private javax.swing.JTextField cajaIdPersona;
    private javax.swing.JTextField cajaNombre;
    public javax.swing.JTextField cajaNombrePacientes;
    private javax.swing.JComboBox<String> cboGenero;
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
    private javax.swing.JLabel eGenero;
    private javax.swing.JLabel eHora;
    private javax.swing.JLabel eNombre;
    private javax.swing.JLabel eNuevoTurno;
    private javax.swing.JLabel eTurnosDelDia;
    private javax.swing.JLabel enombrePacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public com.toedter.calendar.JDateChooser jdcFechaNacimientoPacientes;
    private com.toedter.calendar.JDateChooser jdcNuevoTurno;
    private com.toedter.calendar.JDateChooser jdcTurno;
    private javax.swing.JMenu menuB1;
    private javax.swing.JMenu menuB2;
    private javax.swing.JPanel panelPacientes;
    private javax.swing.JPanel panelTurnos;
    private javax.swing.JPanel panelVentanaPrincipal;
    private javax.swing.JScrollPane scrollPanePacientes;
    private javax.swing.JScrollPane scrollPaneTurnos;
    private javax.swing.JSeparator separadorTurnos;
    private javax.swing.JTabbedPane tabbedPanePrincipal;
    public javax.swing.JTable tablaHistoriaClinica;
    private javax.swing.JTable tablaTurnos;
    // End of variables declaration//GEN-END:variables
}
