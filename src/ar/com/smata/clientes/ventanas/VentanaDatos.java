/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.smata.clientes.ventanas;

import Clase.NuevaPersona;
import Recursos.LectorDeArchivos;
import java.io.IOException;
import java.util.Locale;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author maquina 1
 */
public class VentanaDatos extends javax.swing.JInternalFrame {
    
    

    /**
     * Creates new form VentanaClientes
     */
    public VentanaDatos() throws IOException {
        super("Datos Adultos", true, true, true, true);
        this.setSize(800, 600);
        initComponents();
        cargarPaises();
    }
    
    public void cargarPaises() throws IOException
    {
        ArrayList paises = LectorDeArchivos.obtenerColeccionDesdeArchivo();
        cmbPais.addItem("<Seleccione>");
        //recorro la coleccion y completo el combo
        Iterator it = paises.iterator();
        while (it.hasNext())
        {
         String unPais = (String)it.next();
         cmbPais.addItem(unPais);
        }
                
    }
    
 public void limpiarformulario() {
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtEdad.setText(null);
        txtCel.setText(null);
        txtCorreo.setText(null);
        cmbPais.setSelectedItem(null);// resolver que quede en Seleccione, con "0" no funciona
        cmbRama.setSelectedItem(null);
        cmbSexo.setSelectedItem(null);
        
//        
    }
 
 public boolean validarformulario() {
        //validar nombre completo
        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que completar el Nombre",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            txtNombre.requestFocus();
            return false;
        }
        //validar Apellido completo
        if (txtApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que completar el Apellido",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            txtApellido.requestFocus();
            return false;
        }
         //validar DNI completo
        if (txtEdad.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que completar el DNI",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            txtEdad.requestFocus();
            return false;
        }
        
        
        
        //validar celular completo
        if (txtCel.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que completar el Celular",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            txtCel.requestFocus();
            return false;}
        
         //validar correo completo
        if (txtCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que completar el Correo",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            txtCorreo.requestFocus();
            return false;}
        
        //validar Pais completo
        if (cmbPais.getSelectedIndex() ==0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que seleccionar un pais",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            cmbPais.requestFocus();
            return false;
        }
        
        //validar Rama completo
        if (cmbRama.getSelectedIndex() ==0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que seleccionar una rama",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            cmbRama.requestFocus();
            return false;
        }
        
        //validar Sexo completo
        if (cmbSexo.getSelectedIndex() ==0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Tenes que seleccionar un Sexo",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
            cmbSexo.requestFocus();
            return false;
        }
        
        try {
// valido edad entero (podemos cambiar por DNI)
         Integer.parseInt(txtEdad.getText());
     } catch (NumberFormatException e)
     {
         JOptionPane.showMessageDialog(
                    this,
                    "El DNI debe ser un Numero",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            
           txtEdad.requestFocus();
            return false;
        
     }
        
            return true;
        
            }
            
            
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cmbPais = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbRama = new javax.swing.JComboBox<>();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnMisCursos = new javax.swing.JButton();
        txtCel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Pais");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        cmbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaisActionPerformed(evt);
            }
        });

        jLabel9.setText("Rama");

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Masculino", "Femenino" }));
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });

        jLabel4.setText("DNI");

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        jLabel5.setText("Sexo");

        cmbRama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Castores", "Lobatos", "Caminantes", "Rover", "Colaborador" }));
        cmbRama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRamaActionPerformed(evt);
            }
        });

        jLabel6.setText("Cursos");

        btnMisCursos.setText("Ver Cursos");
        btnMisCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMisCursosActionPerformed(evt);
            }
        });

        txtCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelActionPerformed(evt);
            }
        });

        jLabel7.setText("Cel");

        jLabel8.setText("Correo");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMisCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPais, 0, 162, Short.MAX_VALUE)
                            .addComponent(cmbRama, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCel)
                    .addComponent(txtCorreo)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addComponent(txtEdad)
                    .addComponent(txtApellido)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbRama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnMisCursos))
                .addGap(82, 82, 82))
        );

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(396, Short.MAX_VALUE)
                .addComponent(btnNuevo)
                .addGap(27, 27, 27)
                .addComponent(btnGuardar)
                .addGap(35, 35, 35)
                .addComponent(btnEliminar)
                .addGap(36, 36, 36)
                .addComponent(btnCerrar)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo))
                .addContainerGap())
        );

        jPanel2.getAccessibleContext().setAccessibleName("Datos Persona");
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //hasta no tener base de datos no podemos eliminar ningun dato!
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarformulario();//
        txtNombre.requestFocus();
        btnGuardar.setEnabled(true);// esto hace que se active el boton
        btnEliminar.setEnabled(false);// esto hace que se cancele la accion del boton osea deshabilita
        // no hace falta aclarar el boton CERRAR
                
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
 this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
          // esto lo deberia vincular con la base de datos
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String dni = txtEdad.getText();
        String cel = txtCel.getText();
        String correo = txtCorreo.getText();
        String pais = cmbPais.getItemAt(WIDTH);
        String rama = cmbRama.getItemAt(WIDTH);
        String sexo = cmbSexo.getItemAt(WIDTH);
        
//        ArrayList <NuevaPersona> adultos = new ArrayList();
//        NuevaPersona p1 = new NuevaPersona(nombre,apellido,dni,cel,correo,pais,rama,sexo);   
//        
//        for (int i = 0; i <adultos.size(); i++) {
//            adultos (i)= new NuevaPersona(nombre,apellido,dni,cel,correo,pais,rama,sexo);
//                        System.out.println(p1);
//        }
                
        // Hay que ver como resolver esto, imprime o guarda una persona y vuelve a reemplar cada vez que damos un registro nuevo.
         
        
// TODO add your handling code here:
        if (!validarformulario()  ) {
            return;
        }
        JOptionPane.showMessageDialog(
                    this,
                    "EL CLIENTE HA SIDO VALIDADO",
                    "GUARDAR",
                    JOptionPane.INFORMATION_MESSAGE);
 
       
        
      
        
        limpiarformulario();
        btnNuevo.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
                                
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed
        
        
        
    }//GEN-LAST:event_cmbSexoActionPerformed

    private void cmbRamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRamaActionPerformed

    private void btnMisCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMisCursosActionPerformed
      
//        VentanaMisCursos.AccessibleJInternalFrame ();
        VentanaMisCursos.getDefaultLocale();
        
//        
//        VentanaMisCursos vmc = new VentanaMisCursos();
//        jDesktopPane1.(vmc);
//        vmc.setVisible(true); 
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMisCursosActionPerformed

    private void txtCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed



    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        btnNuevo.setEnabled(false);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_txtNombreKeyPressed

    private void cmbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPaisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMisCursos;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbPais;
    private javax.swing.JComboBox<String> cmbRama;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
