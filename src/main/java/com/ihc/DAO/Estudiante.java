package com.ihc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Estudiante {
	public void agregarEstudiante(Estudiante estudiante) {
        String sql = "INSERT INTO estudiantes (nombre, apellido, fecha_nacimiento, genero, direccion, telefono, correo_electronico, grado, fecha_inscripcion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, estudiante.getNombre());
            stmt.setString(2, estudiante.getApellido());
            stmt.setDate(3, new java.sql.Date(estudiante.getFechaNacimiento().getTime()));
            stmt.setString(4, estudiante.getGenero());
            stmt.setString(5, estudiante.getDireccion());
            stmt.setString(6, estudiante.getTelefono());
            stmt.setString(7, estudiante.getCorreoElectronico());
            stmt.setString(8, estudiante.getGenero());
            stmt.setDate(9, new java.sql.Date(estudiante.getFechaInscripcion().getTime()));

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Date getFechaInscripcion() {
		
		return null;
	}

	private String getTelefono() {
		
		return null;
	}

	private String getCorreoElectronico() {
		
		return null;
	}

	private String getDireccion() {
		
		return null;
	}

	private String getGenero() {
		
		return null;
	}

	private Date getFechaNacimiento() {
		
		return null;
	}

	private String getApellido() {
		
		return null;
	}

	private String getNombre() {
		
		return null;
	}

	
    public Estudiante obtenerEstudiantePorId(int id) {
        String sql = "SELECT * FROM estudiantes WHERE id = ?";
        Estudiante estudiante = null;

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                estudiante = new Estudiante();
                estudiante.setId(rs.getInt("id"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                estudiante.setGenero(rs.getString("genero"));
                estudiante.setDireccion(rs.getString("direccion"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setCorreoElectronico(rs.getString("correo_electronico"));
                estudiante.setGenero(rs.getString("grado"));
                estudiante.setFechaInscripcion(rs.getDate("fecha_inscripcion"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiante;
    }

    
    private void setGenero(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setFechaNacimiento(java.sql.Date date) {
		// TODO Auto-generated method stub
		
	}

	private void setApellido(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setNombre(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setId(int int1) {
		// TODO Auto-generated method stub
		
	}

	public List<Estudiante> obtenerTodosLosEstudiantes() {
        String sql = "SELECT * FROM estudiantes";
        List<Estudiante> estudiantes = new ArrayList<>();

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Estudiante estudiante = new Estudiante();
                estudiante.setId(rs.getInt("id"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
                estudiante.setGenero(rs.getString("genero"));
                estudiante.setDireccion(rs.getString("direccion"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setCorreoElectronico(rs.getString("correo_electronico"));
                estudiante.setGenero(rs.getString("grado"));
                estudiante.setFechaInscripcion(rs.getDate("fecha_inscripcion"));
                estudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }

  
    private void setFechaInscripcion(java.sql.Date date) {
		// TODO Auto-generated method stub
		
	}

	private void setCorreoElectronico(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setTelefono(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setDireccion(String string) {
		// TODO Auto-generated method stub
		
	}

	public void actualizarEstudiante(Estudiante estudiante) {
        String sql = "UPDATE estudiantes SET nombre = ?, apellido = ?, fecha_nacimiento = ?, genero = ?, direccion = ?, telefono = ?, correo_electronico = ?, grado = ?, fecha_inscripcion = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, estudiante.getNombre());
            stmt.setString(2, estudiante.getApellido());
            stmt.setDate(3, new java.sql.Date(estudiante.getFechaNacimiento().getTime()));
            stmt.setString(4, estudiante.getGenero());
            stmt.setString(5, estudiante.getDireccion());
            stmt.setString(6, estudiante.getTelefono());
            stmt.setString(7, estudiante.getCorreoElectronico());
            stmt.setString(8, estudiante.getGenero());
            stmt.setDate(9, new java.sql.Date(estudiante.getFechaInscripcion().getTime()));
            stmt.setInt(10, estudiante.getId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void eliminarEstudiante(int id) {
        String sql = "DELETE FROM estudiantes WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
