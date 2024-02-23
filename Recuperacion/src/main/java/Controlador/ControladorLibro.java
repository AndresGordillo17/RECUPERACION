/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Libro;
import Vista.ConexionBDD;
import Vista.LibroVista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class ControladorLibro {
    private LibroVista libro;
    private ConexionBDD conectar = new ConexionBDD();
    private Connection conectado = conectar.conectar();
    private PreparedStatement iniciar;
    private ResultSet ejecutar;

   public LibroVista getlibro() {
        return libro;
    }

    public void setPracticante(LibroVista libro) {
        this.libro = libro;
    }

    // Método para crear un libro en la base de datos
    public void crearLibro(Libro libro) {
    try {
        String SQL = "CALL crear_libro(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        iniciar = conectado.prepareStatement(SQL);
        iniciar.setString(1, libro.getTitulo());
        iniciar.setString(2, libro.getAutor());
        iniciar.setString(3, libro.getIsbn());
        iniciar.setInt(4, libro.getPaginas());
        iniciar.setString(5, libro.getEdicion());
        iniciar.setString(6, libro.getEditorial());
        iniciar.setString(7, libro.getLugarCiudad());
        iniciar.setString(8, libro.getLugarPais());
        iniciar.setDate(9, java.sql.Date.valueOf(libro.getFechaEdicion()));

        int res = iniciar.executeUpdate();
        if (res > 0) {
            System.out.println("Libro creado correctamente.");
        } else {
            System.out.println("Error al crear el libro.");
        }
        iniciar.close();
    } catch (SQLException ex) {
        System.out.println("Error al crear el libro: " + ex.getMessage());
    }
}
public ArrayList<Object[]> datosLibro() {
        ArrayList<Object[]> listaTotalP = new ArrayList<>();
        try {
            String SQL = "call listar_libros()";
            iniciar = (PreparedStatement) conectado.prepareCall(SQL);
            //excuteQuery cuando consulto la bdd
            //Recibo un result set cuando consulto
            ResultSet res = iniciar.executeQuery();
            int cont = 1;
            while (res.next()) {
                Object[] fila = new Object[8];
                for (int i = 0; i < 8; i++) {
                    fila[i] = res.getObject(i + 1);
                }
                fila[0] = cont;
                listaTotalP.add(fila);
                cont++;
            }
            iniciar.close();

            return listaTotalP;
        } catch (SQLException e) {
            System.out.println("BDD" + e);
        }
        return null;
    }
    // Método para modificar un libro por su ISBN en la base de datos
    public void modificarLibroPorISBN(Libro libro) {
        try {
            iniciar = conectado.prepareCall("{CALL modificar_libro_por_isbn(?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            iniciar.setString(1, libro.getIsbn());
            iniciar.setString(2, libro.getTitulo());
            iniciar.setString(3, libro.getAutor());
            iniciar.setInt(4, libro.getPaginas());
            iniciar.setString(5, libro.getEdicion());
            iniciar.setString(6, libro.getEditorial());
            iniciar.setString(7, libro.getLugarCiudad());
            iniciar.setString(8, libro.getLugarPais());
            iniciar.setDate(9, java.sql.Date.valueOf(libro.getFechaEdicion()));
            iniciar.executeUpdate();
            System.out.println("Libro modificado correctamente.");
        } catch (SQLException ex) {
            System.out.println("Error al modificar el libro: " + ex.getMessage());
        }
    }

    // Método para eliminar un libro por su ISBN de la base de datos
    public void eliminarLibroPorISBN(String isbn) {
        try {
            iniciar = conectado.prepareCall("{CALL eliminar_libro_por_isbn(?)}");
            iniciar.setString(1, isbn);
            iniciar.executeUpdate();
            System.out.println("Libro eliminado correctamente.");
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el libro: " + ex.getMessage());
        }
    }

    // Método para buscar un libro por su ISBN en la base de datos
    public void buscarLibroPorISBN(String isbn) {
        try {
            iniciar = conectado.prepareCall("{CALL buscar_libro_por_isbn(?)}");
            iniciar.setString(1, isbn);
            ejecutar = iniciar.executeQuery();
            if (ejecutar.next()) {
                // Aquí puedes procesar los resultados obtenidos
                System.out.println("Libro encontrado: " + ejecutar.getString("titulo"));
            } else {
                System.out.println("No se encontró ningún libro con ese ISBN.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar el libro: " + ex.getMessage());
        }
    }

  
}
