package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class SQLUsuario extends Conexion {

    PreparedStatement ps;
    ResultSet rs;

    public int getIdProfesional() {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int idProfesional = 0;

        try {
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("SELECT MAX(idProfesional) AS id FROM profesional");
            rs = ps.executeQuery();
            while (rs.next()) {
                idProfesional = rs.getInt(1);
            }

        } catch (Exception ex) {
            System.err.println("Error, " + ex);

        }
        return idProfesional;
    }

    public int getIdPersona() {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int idPersona = 0;

        try {
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("SELECT MAX(idPersona) AS id FROM persona");
            rs = ps.executeQuery();
            while (rs.next()) {
                idPersona = rs.getInt(1);
            }

        } catch (Exception ex) {
            System.err.println("Error, " + ex);

        }
        return idPersona;
    }

    public boolean registrar(Usuario usuario) {
        Conexion con = new Conexion();
        PreparedStatement ps2 = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps = null;
        Connection conexion = con.getConnection();

        try {
            ps2 = conexion.prepareStatement("insert into persona (nombre, apellido, dni, edad, correo) values (?,?,?,?,?)");
            ps2.setString(1, usuario.getNombre());
            ps2.setString(2, usuario.getApellido());
            ps2.setString(3, usuario.getDni());
            ps2.setInt(4, usuario.getEdad());
            ps2.setString(5, usuario.getCorreo());
            ps2.executeUpdate();
            ps1 = conexion.prepareStatement("insert into profesional (profesion, especialidad, matricula, idPersona) values(?,?,?,?)");
            ps1.setString(1, usuario.getProfesion());
            ps1.setString(2, usuario.getEspecialidad());
            ps1.setInt(3, usuario.getMatricula());
            ps1.setInt(4, getIdPersona());
            ps1.executeUpdate();
            ps = conexion.prepareStatement("insert into usuario (nombreUsuario, contraseña, id_tipo_usuario, idProfesional) values (?,?,?,?)");
            ps.setString(1, usuario.getNombreUsuario());
            ps.setString(2, usuario.getContraseña());
            ps.setInt(3, usuario.getIdTipoUsuario());
            ps.setInt(4, getIdProfesional());
            int resultado = ps.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar el usuario");
                return false;
            }
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

    public int verificarUsuario(String usuario) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("select count(idUsuario) from usuario where nombreUsuario=?");
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return 1;
        }
    }

    public boolean comprobarCorreo(String correo) {
        Pattern patron = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);

        Matcher matcher = patron.matcher(correo);
        return matcher.find();
    }

    public boolean iniciarSesion(Usuario usuario) {
        Connection conexion = getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conexion.prepareStatement("select idUsuario, nombreUsuario, contraseña, id_tipo_usuario from usuario where nombreUsuario=?");
            ps.setString(1, usuario.getNombreUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usuario.getContraseña().equals(rs.getString("contraseña"))) {
                    usuario.setIdUsuario(rs.getInt("idUsuario"));
                    usuario.setNombreUsuario(rs.getString("nombreUsuario"));
                    usuario.setIdTipoUsuario(rs.getInt("id_tipo_usuario"));
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return false;
        }
    }

    public boolean cargarPaciente(Paciente paciente) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        PreparedStatement ps1 = null;
        Connection conexion = con.getConnection();

        try {
            ps = conexion.prepareStatement("insert into persona (nombre, apellido, dni, edad, fechaNacimiento, domicilio, celular, correo) values(?,?,?,?,?,?,?,?)");
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getDni());
            ps.setInt(4, paciente.getEdad());
            ps.setDate(5, paciente.getFechaNacimiento());
            ps.setString(6, paciente.getDomicilio());
            ps.setString(7, paciente.getCelular());
            ps.setString(8, paciente.getCorreo());

            int resultado = ps.executeUpdate();

            if (resultado > 0) {
                ps1 = conexion.prepareStatement("insert into paciente (idPersona) values(?)");
                ps1.setInt(1, getIdPersona());

                int resultado1 = ps1.executeUpdate();

                if (resultado1 > 0) {
                    JOptionPane.showMessageDialog(null, "Paciente cargado correctamente");
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo cargar el paciente");
                    return false;
                }

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo cargar el paciente");
                return false;
            }
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

    public int verificarPersona(String persona) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("select count(idPersona) from persona where nombre=?");
            ps.setString(1, persona);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (Exception ex) {
            System.err.println("Error, " + ex);
            return 1;
        }
    }

    public boolean buscarPersona(Paciente paciente) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        PreparedStatement ps1 = null;
        Connection conexion = con.getConnection();

        try {
            ps = conexion.prepareStatement("select * from persona where dni=?");
            ps.setString(1, paciente.getDni());
            rs = ps.executeQuery();

            if (rs.next()) {
                paciente.setIdPersona(rs.getInt("idPersona"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setDni(rs.getString("dni"));
                paciente.setEdad(rs.getInt("edad"));
                paciente.setFechaNacimiento(rs.getDate("fechaNacimiento"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setCelular(rs.getString("celular"));
                paciente.setCorreo(rs.getString("correo"));

                return true;
            } else {
                return false;
            }
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

    public boolean actualizarPaciente(Paciente paciente) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        Connection conexion = con.getConnection();

        try {
            ps = conexion.prepareStatement("update persona set nombre=?, apellido=?, dni=?, edad=?, fechaNacimiento=?, domicilio=?, celular=?, correo=? where dni=?");
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getDni());
            ps.setInt(4, paciente.getEdad());
            ps.setDate(5, paciente.getFechaNacimiento());
            ps.setString(6, paciente.getDomicilio());
            ps.setString(7, paciente.getCelular());
            ps.setString(8, paciente.getCorreo());
            ps.setString(9, paciente.getDni());

            int resultado = ps.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Paciente actualizado correctamente");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el paciente");
                return false;
            }
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

    public int buscarPaciente(Paciente paciente) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conexion = con.getConnection();
        int idPaciente = 0;

        try {
            ps = conexion.prepareStatement("select idPaciente from Paciente where idPersona=?");
            ps.setInt(1, paciente.getIdPersona());
            rs = ps.executeQuery();

            if (rs.next()) {
                idPaciente = rs.getInt("idPaciente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo entcontrar paciente");
            }
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.err.println("Error, " + ex);
            }
        }
        return idPaciente;
    }

    public Date formatedDate(java.util.Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat.format(date);
        Date fechaNacimiento = Date.valueOf(formattedDate);

        return fechaNacimiento;
    }

    public boolean cargarRegistro(HistoriaClinica hc) {
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        Connection conexion = con.getConnection();

        try {
            ps = conexion.prepareStatement("insert into historiaclinica (fechaRegistro, registro, medicacion, idPaciente) values(?,?,?,?)");
            ps.setDate(1, hc.getFechaRegistro());
            ps.setString(2, hc.getRegistro());
            ps.setString(3, hc.getMedicacion());
            ps.setInt(4, hc.getIdPaciente());

            int resultado = ps.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro cargado correctamente");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo cargar el registro");
                return false;
            }
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
}
