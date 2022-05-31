/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inicio.enserioya;

import Metodos.Metodos;
import Usuarios.Usuarios;
import java.awt.Color;
import java.io.IOException;
import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arago
 */
public class GUI_Interfaz extends javax.swing.JFrame {
    /*Creamos un objetos que nos permitira almacenar la imagen que queremos colocar en nuestro JFRAME*/
    
    ImageIcon logoWhats = new ImageIcon("src/main/java/inicio/enserioya/Imagenes/Fondo.png");
   /*Creamos los objetos que nos permitiran jalar los datos de la clase metodos y de la classe usuario*/
    Usuarios usuarios =new Usuarios();
    Metodos metodos= new Metodos();
   /*Mandamos a traer el modelos de la tabla que generamos anteriormente en la clase metodo */ 
    DefaultTableModel mdlTabla;
    /*Creamos el vector que nos permitira establecer los datos que iremos genrando al momento de ingresar los datos*/
    Vector Vcabeceras=new Vector();
    

    /**
     * Creates new form GUI_Interfaz
     */
    public GUI_Interfaz() {
        
        initComponents();
        /*Configuramos el JFrame, no queremos que sea expandible por tanto establecemos la funcion setResizable con valor bolean false
        y deseamos que la localizacion de nuestra ventana sea centrica por tanto agregamos un valor null dentro de la funcion localizacion relatica*/
        setResizable(false);
        setLocationRelativeTo(null);
        /*Colocamos la imagen que esta almacenada dentro de nuetro objeto dentro del jPanel(icon) que generamos*/
         icon.setIcon(logoWhats);
         
        /*Agregamos un color a nuestro panel y un titulo a nuestra ventana*/
        this.getContentPane().setBackground(Color.PINK);
        this.setTitle("Registro WHATSAPP");

        /*Mandamos a jalar los metodos para agregar elementos dentro del CombobBox generados dentro de nuestra clase metosdos*/
        metodos.comboConexion(ComboConexion);
        metodos.comboLectura(ComboLectura);
        /*addElement es un método que se utiliza para añadir un elemento especificado al final de este vector mediante 
        el aumento del tamaño del vector por 1, en este caso van a ser 6 cabeceras dentro de nuestra tabla*/
        Vcabeceras.addElement("ID");
        Vcabeceras.addElement("NOMBRE");
        Vcabeceras.addElement("TELEFONO");
        Vcabeceras.addElement("CONEXION");
        Vcabeceras.addElement("LECTURA");
        Vcabeceras.addElement("FECHA");
        //Establecemos el modelo de la tabla para la tabla generada dentro de nuestro JFrame
        mdlTabla= new DefaultTableModel(Vcabeceras,0);
        jTable1.setModel(mdlTabla);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        ComboLectura = new javax.swing.JComboBox<>();
        ComboConexion = new javax.swing.JComboBox<>();
        btmGuardar = new javax.swing.JButton();
        btmMostrarLista = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        JFecha = new com.toedter.calendar.JDateChooser();
        icon = new javax.swing.JLabel();
        btmSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de actividad en whatsApp");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setText("Id:");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel4.setText("Telefono:");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel5.setText("Lectura:");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel6.setText("Conexión:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        ComboLectura.setForeground(new java.awt.Color(204, 102, 255));

        ComboConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboConexionActionPerformed(evt);
            }
        });

        btmGuardar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btmGuardar.setForeground(new java.awt.Color(153, 102, 255));
        btmGuardar.setText("TXT");
        btmGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmGuardarActionPerformed(evt);
            }
        });

        btmMostrarLista.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btmMostrarLista.setForeground(new java.awt.Color(153, 102, 255));
        btmMostrarLista.setText("Mostrar lista TXT");
        btmMostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmMostrarListaActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setForeground(new java.awt.Color(255, 0, 204));
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
        jTable1.setGridColor(new java.awt.Color(204, 204, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel7.setText("Fecha:");

        JFecha.setDateFormatString("dd/MM/yyyy HH:mm:ss");

        btmSalir.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btmSalir.setForeground(new java.awt.Color(153, 102, 255));
        btmSalir.setText("Salir");
        btmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmSalirActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 255));
        jButton1.setText("CSV");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 153, 255));
        jButton2.setText("Mostrar lista CSV");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))))
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ComboLectura, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btmGuardar)
                        .addGap(246, 246, 246)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btmMostrarLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(84, 84, 84)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btmSalir)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(ComboLectura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ComboConexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(8, 8, 8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7))
                            .addComponent(JFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btmGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmMostrarLista)
                    .addComponent(btmSalir)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void ComboConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboConexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboConexionActionPerformed

    private void btmGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmGuardarActionPerformed
  /*Configuramos el boton guardar*/
        /*Generamos una condicion a traves de un ciclo if, este nos indica que nos nos permitira
        continuar si dejamos campos vacios dentro de nuestro formulario*/
        if(txtId.getText().isEmpty()||txtNombre.getText().isEmpty()||txtTelefono.getText().isEmpty()){
      JOptionPane.showMessageDialog(this, "No dejar campos vacios");
  }else{//Jalamos el modelo de la tabla para indicar que es ahi donde deseamos almacenarlos y mostraralos
        mdlTabla= new DefaultTableModel();
        /*Indicamos en que variable deseamos almacenar los valores ingresados en cada jTexField, para ello
        tambien indicamos el tipo de dato que es*/
        
        int ID= Integer.parseInt(txtId.getText());
        String Nombre= txtNombre.getText();
        long Telefono=Long.parseLong(txtTelefono.getText());
        String Conexion= ComboConexion.getSelectedItem().toString();
        String Lectura= ComboLectura.getSelectedItem().toString();
        Date Fecha= (JFecha.getDate());
        /*Mandamos traer los metodos que generamos en la clase usuario para establecer los valores */
        usuarios.setID(ID);
        usuarios.setNombre(Nombre);
        usuarios.setTelefono(Telefono);
        usuarios.setEstatusConexion(Conexion);
        usuarios.setEstatusLectura(Lectura);
        usuarios.setFecha(Fecha);

        /*Mandamos a traer los metodos de la clase metodos que nos permitiran guardar los datos y tambien para guardarlos dentro del archivo*/
        metodos.Guardar(usuarios);
        metodos.guardarArchivo(usuarios);
         
  }
    }//GEN-LAST:event_btmGuardarActionPerformed

    private void btmMostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmMostrarListaActionPerformed
     /*Configuramos el boton de mostrar datos en la tabla a traves de la funcion setmodel 
        y del metodo lista de usuario que se genero en la clase metodos*/
       jTable1.setModel(metodos.listaUsuarios());
        
        
    }//GEN-LAST:event_btmMostrarListaActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        /*Validamos el campo de telefono para que nos permita solo ingresar numeros*/
        
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo Numero ");
        }
                
                
         // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        /*Validamos el campo de telefono para que nos permita solo ingresar letras*/
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras ");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmSalirActionPerformed
        // funcion para cerrar ventana actual
        dispose();
    }//GEN-LAST:event_btmSalirActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
      /*Configuramos el boton guardar*/
        /*Generamos una condicion a traves de un ciclo if, este nos indica que nos nos permitira
        continuar si dejamos campos vacios dentro de nuestro formulario*/
        if(txtId.getText().isEmpty()||txtNombre.getText().isEmpty()||txtTelefono.getText().isEmpty()){
      JOptionPane.showMessageDialog(this, "No dejar campos vacios");
  }else{//Jalamos el modelo de la tabla para indicar que es ahi donde deseamos almacenarlos y mostraralos
        mdlTabla= new DefaultTableModel();
        /*Indicamos en que variable deseamos almacenar los valores ingresados en cada jTexField, para ello
        tambien indicamos el tipo de dato que es*/
        
        int ID= Integer.parseInt(txtId.getText());
        String Nombre= txtNombre.getText();
        long Telefono=Long.parseLong(txtTelefono.getText());
        String Conexion= ComboConexion.getSelectedItem().toString();
        String Lectura= ComboLectura.getSelectedItem().toString();
        Date Fecha= (JFecha.getDate());
        /*Mandamos traer los metodos que generamos en la clase usuario para establecer los valores */
        usuarios.setID(ID);
        usuarios.setNombre(Nombre);
        usuarios.setTelefono(Telefono);
        usuarios.setEstatusConexion(Conexion);
        usuarios.setEstatusLectura(Lectura);
        usuarios.setFecha(Fecha);

        /*Mandamos a traer los metodos de la clase metodos que nos permitiran guardar los datos y tambien para guardarlos dentro del archivo*/
        metodos.Guardar(usuarios);
            try {
                metodos.guardarArchivocsv(usuarios);
            } catch (IOException ex) {
                Logger.getLogger(GUI_Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
         
  }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          jTable1.setModel(metodos.listaUsuarios2());
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GUI_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI_Interfaz().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboConexion;
    private javax.swing.JComboBox<String> ComboLectura;
    private com.toedter.calendar.JDateChooser JFecha;
    private javax.swing.JButton btmGuardar;
    private javax.swing.JButton btmMostrarLista;
    private javax.swing.JButton btmSalir;
    private javax.swing.JLabel icon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
