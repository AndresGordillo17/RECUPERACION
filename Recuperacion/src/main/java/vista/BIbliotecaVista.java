/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;
import modelo.Libro;
import controlador.Conexion;
import java.awt.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Libro;

    
public class BIbliotecaVista extends javax.swing.JInternalFrame {
 
private ArrayList<Libro> libros = new ArrayList<>();


    /**
     * Creates new form insertar_libro
     */
    public BIbliotecaVista() {
        initComponents();
           model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Título");
        model.addColumn("Autor");
        model.addColumn("ISBN");
        model.addColumn("Páginas");
        model.addColumn("Edición");
        model.addColumn("Editorial");
        model.addColumn("Lugar");
        model.addColumn("Fecha de Edición");
        TBtabla.setModel(model);
        llenarTabla();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        txtPagina = new javax.swing.JTextField();
        txtEdicion = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtLugar = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JToggleButton();
        btnLimpiar = new javax.swing.JToggleButton();
        btnAgregarAlarray = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnIngresarArrayAlaBase = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TBtabla = new javax.swing.JTable();
        btnactualizar = new javax.swing.JToggleButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("titulo Del Libro");

        jLabel2.setText("autor");

        jLabel3.setText("ISBN");

        jLabel4.setText("páginas");

        jLabel5.setText("edición");

        jLabel6.setText("editorial");

        jLabel7.setText("lugar");

        jLabel8.setText("fecha de edición");

        btnIngresar.setText("GUARDAR LIBRO");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR ENTRADAS");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAgregarAlarray.setText("AÑADIR");
        btnAgregarAlarray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlarrayActionPerformed(evt);
            }
        });

        btnVer.setText("VER LISTA");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnIngresarArrayAlaBase.setText("GUARDAR");
        btnIngresarArrayAlaBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarArrayAlaBaseActionPerformed(evt);
            }
        });

        jLabel9.setText("LIBROS");

        TBtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TBtabla);

        btnactualizar.setText("ACTUALIZAR LIBRO");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 261, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEditorial, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEdicion)
                                .addComponent(txtISBN, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPagina, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnAgregarAlarray)
                                        .addGap(100, 100, 100))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnIngresar)
                                            .addComponent(btnVer)
                                            .addComponent(btnIngresarArrayAlaBase)
                                            .addComponent(btnactualizar))
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(btnLimpiar))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnIngresarArrayAlaBase))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarAlarray)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVer)))
                .addGap(18, 18, 18)
                .addComponent(btnactualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private DefaultTableModel model;


     private void llenarTabla() {
        try (Connection con = Conexion.getConnection();
             CallableStatement cs = con.prepareCall("{CALL ObtenerLibrosConAutores()}")) {
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("titulo"),
                    rs.getString("autor"),
                    rs.getString("ISBN"),
                    rs.getInt("paginas"),
                    rs.getInt("edicion"),
                    rs.getString("editorial"),
                    rs.getString("lugar"),
                    rs.getString("fecha_edicion")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
 txtTitulo.setText("");      
    txtAutor.setText("");      
    txtISBN.setText("");       
    txtPagina.setText("");     
    txtEdicion.setText("");    
    txtEditorial.setText("");   
    txtLugar.setText("");       
    txtFecha.setText("");   
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
 String titulo = txtTitulo.getText().trim();
String autorCedula = txtAutor.getText().trim();
String ISBN = txtISBN.getText().trim();
String paginaStr = txtPagina.getText().trim();
String edicion = txtEdicion.getText().trim();
String editorial = txtEditorial.getText().trim();
String lugar = txtLugar.getText().trim();
String fecha = txtFecha.getText().trim();

// Validar que los campos no estén vacíos
if (titulo.isEmpty() || autorCedula.isEmpty() || ISBN.isEmpty() ||
    paginaStr.isEmpty() || edicion.isEmpty() || editorial.isEmpty() ||
    lugar.isEmpty() || fecha.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

int pagina;
try {
    pagina = Integer.parseInt(paginaStr);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "El número de páginas debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

try {
    // Verificar si la cédula del autor existe en la tabla persona
    int autorId = -1;
    try (Connection con = Conexion.getConnection();
         CallableStatement cs = con.prepareCall("{CALL ObtenerIdAutorPorCedula(?, ?)}")) {
        cs.setString(1, autorCedula);
        cs.registerOutParameter(2, Types.INTEGER);
        cs.execute();
        autorId = cs.getInt(2);
    }
    
    if (autorId == -1) {
        // Si la cédula del autor no existe, mostrar un mensaje de error
        JOptionPane.showMessageDialog(this, "El autor con cédula " + autorCedula + " no existe", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // Si la cédula del autor existe, llamar al procedimiento almacenado para insertar el libro
        try (Connection con = Conexion.getConnection();
             CallableStatement cs = con.prepareCall("{CALL IngresarLibro(?, ?, ?, ?, ?, ?, ?, ?)}")) {
            cs.setString(1, titulo);
            cs.setInt(2, autorId);
            cs.setString(3, ISBN);
            cs.setInt(4, pagina);
            cs.setString(5, edicion);
            cs.setString(6, editorial);
            cs.setString(7, lugar);
            cs.setString(8, fecha);
            cs.execute();
        }
        
        // Limpiar los campos
        txtTitulo.setText("");
        txtAutor.setText("");
        txtISBN.setText("");
        txtPagina.setText("");
        txtEdicion.setText("");
        txtEditorial.setText("");
        txtLugar.setText("");
        txtFecha.setText("");
        
        JOptionPane.showMessageDialog(this, "Libro ingresado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "Error al insertar libro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}


    }//GEN-LAST:event_btnIngresarActionPerformed
    private void btnAgregarAlarrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlarrayActionPerformed
 String titulo = txtTitulo.getText().trim();
        String autor = txtAutor.getText().trim();
        String ISBN = txtISBN.getText().trim();
        String paginaStr = txtPagina.getText().trim();
        String edicion = txtEdicion.getText().trim();
        String editorial = txtEditorial.getText().trim();
        String lugar = txtLugar.getText().trim();
        String fecha = txtFecha.getText().trim();
        if (titulo.isEmpty() || autor.isEmpty() || ISBN.isEmpty() ||
                paginaStr.isEmpty() || edicion.isEmpty() || editorial.isEmpty() ||
                lugar.isEmpty() || fecha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int pagina;
        try {
            pagina = Integer.parseInt(paginaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El número de páginas debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Libro libro = new Libro(titulo, autor, ISBN, pagina, edicion, editorial, lugar, fecha);
        libros.add(libro);
        Collections.sort(libros, Comparator.comparing(Libro::getTitulo));
        for (Libro l : libros) {
            System.out.println(l.getTitulo());
        }
    }//GEN-LAST:event_btnAgregarAlarrayActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
    // Limpiar el contenido del JTextArea
    txtArea.setText("");
    for (Libro libro : libros) {
        txtArea.append(libro.toString() + "\n");
    }    }//GEN-LAST:event_btnVerActionPerformed

    private void btnIngresarArrayAlaBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarArrayAlaBaseActionPerformed
         try {
        for (Libro libro : libros) {
            try (Connection con = Conexion.getConnection();
                 CallableStatement cs = con.prepareCall("{CALL IngresarLibro(?, ?, ?, ?, ?, ?, ?, ?)}")) {
                cs.setString(1, libro.getTitulo());
                cs.setInt(2, Integer.parseInt( libro.getAutor()));
                cs.setString(3, libro.getISBN());
                cs.setInt(4, libro.getPaginas());
                cs.setString(5, libro.getEdicion());
                cs.setString(6, libro.getEditorial());
                cs.setString(7, libro.getLugar());
                cs.setString(8, libro.getFecha());
                cs.execute();
            }
        }
        
        JOptionPane.showMessageDialog(this, "Libros ingresados correctamente a la base de datos", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al insertar libros en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnIngresarArrayAlaBaseActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
       try {
        int id = Integer.parseInt(txtAutor.getText().trim());
        String titulo = txtTitulo.getText().trim();
        String autorCedula = txtAutor.getText().trim();
        String ISBN = txtISBN.getText().trim();
        String paginaStr = txtPagina.getText().trim();
        String edicion = txtEdicion.getText().trim();
        String editorial = txtEditorial.getText().trim();
        String lugar = txtLugar.getText().trim();
        String fecha = txtFecha.getText().trim();

        // Validar que los campos no estén vacíos
        if (titulo.isEmpty() || autorCedula.isEmpty() || ISBN.isEmpty() ||
            paginaStr.isEmpty() || edicion.isEmpty() || editorial.isEmpty() ||
            lugar.isEmpty() || fecha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int autorId;
        try (Connection con = Conexion.getConnection();
             CallableStatement cs = con.prepareCall("{CALL ObtenerIdAutorPorCedula(?, ?)}")) {
            cs.setString(1, autorCedula);
            cs.registerOutParameter(2, Types.INTEGER);
            cs.execute();
            autorId = cs.getInt(2);
        }

        if (autorId == -1) {
            // Si la cédula del autor no existe, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "El autor con cédula " + autorCedula + " no existe", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Si la cédula del autor existe, llamar al procedimiento almacenado para actualizar el libro
            try (Connection con = Conexion.getConnection();
                 CallableStatement cs = con.prepareCall("{CALL actualizarLibro(?, ?, ?, ?, ?, ?, ?, ?, ?)}")) {
                cs.setInt(1, id);
                cs.setString(2, titulo);
                cs.setInt(3, autorId);
                cs.setString(4, ISBN);
                cs.setInt(5, Integer.parseInt(paginaStr));
                cs.setString(6, edicion);
                cs.setString(7, editorial);
                cs.setString(8, lugar);
                cs.setString(9, fecha);
                cs.execute();
            }

            // Limpiar los campos
            txtTitulo.setText("");
            txtAutor.setText("");
            txtISBN.setText("");
            txtPagina.setText("");
            txtEdicion.setText("");
            txtEditorial.setText("");
            txtLugar.setText("");
            txtFecha.setText("");

            JOptionPane.showMessageDialog(this, "Libro actualizado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al actualizar el libro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnactualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBtabla;
    private javax.swing.JButton btnAgregarAlarray;
    private javax.swing.JToggleButton btnIngresar;
    private javax.swing.JButton btnIngresarArrayAlaBase;
    private javax.swing.JToggleButton btnLimpiar;
    private javax.swing.JButton btnVer;
    private javax.swing.JToggleButton btnactualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtEdicion;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtPagina;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
