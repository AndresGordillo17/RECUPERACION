/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
import java.util.Date;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int paginas;
    private String edicion;
    private String editorial;
    private String lugarCiudad;
    private String lugarPais;
    private String fechaEdicion;

    public Libro(String titulo, String autor, String isbn, int paginas, String edicion, String editorial,
                 String lugarCiudad, String lugarPais, String fechaEdicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.edicion = edicion;
        this.editorial = editorial;
        this.lugarCiudad = lugarCiudad;
        this.lugarPais = lugarPais;
        this.fechaEdicion = fechaEdicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getLugarCiudad() {
        return lugarCiudad;
    }

    public void setLugarCiudad(String lugarCiudad) {
        this.lugarCiudad = lugarCiudad;
    }

    public String getLugarPais() {
        return lugarPais;
    }

    public void setLugarPais(String lugarPais) {
        this.lugarPais = lugarPais;
    }

    public String getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(String fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

   
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", isbn='" + isbn + '\'' +
                ", paginas=" + paginas +
                ", edicion='" + edicion + '\'' +
                ", editorial='" + editorial + '\'' +
                ", lugarCiudad='" + lugarCiudad + '\'' +
                ", lugarPais='" + lugarPais + '\'' +
                ", fechaEdicion='" + fechaEdicion + '\'' +
                '}';
    }
}