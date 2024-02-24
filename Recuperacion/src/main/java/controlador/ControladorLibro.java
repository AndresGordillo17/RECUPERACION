/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Libro;

/**
 *
 * @author usuario
 */
public class ControladorLibro {
    public static void insertarLibro(Libro libro) {
        try (Connection con = Conexion.getConnection();
             CallableStatement cs = con.prepareCall("{CALL IngresarLibro(?, ?, ?, ?, ?, ?, ?, ?)}")) {
            cs.setString(1, libro.getTitulo());
            cs.setString(2, libro.getAutor());
            cs.setString(3, libro.getISBN());
            cs.setInt(4, libro.getPaginas());
            cs.setString(5, libro.getEdicion());
            cs.setString(6, libro.getEditorial());
            cs.setString(7, libro.getLugar());
            cs.setString(8, libro.getFecha());
            cs.execute();
            System.out.println("Libro ingresado correctamente a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al insertar libro en la base de datos: " + e.getMessage());
        }
    }
    
    public static void insertarAutor(String cedula, String nombre) {
        try (Connection con = Conexion.getConnection();
             CallableStatement cs = con.prepareCall("{CALL InsertarPersona(?, ?)}")) {
            cs.setString(1, cedula);
            cs.setString(2, nombre);
            cs.execute();
            System.out.println("Autor ingresado correctamente a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al insertar autor en la base de datos: " + e.getMessage());
        }
    }
}
