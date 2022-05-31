/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import Usuarios.Usuarios;
import com.toedter.calendar.JDateChooser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arago
 */
public class Metodos {
  /*En esta clase generaremos los metodos que nos permitiran escribir, leer y guardar nuestros datos 
    dentro de la tabla y por ende dentro del txt
    */
/*Para ello creamos un vector, el vector es so¿imilar a un array la unica diferencia es que nos permite yir tomando 
    la cantidad de datos deseados a gregar segun los vallamos agregando es decir no es necesario poner
    desde un principio la cantidad deseada, ademas ya tiene funciones incluidas tal es el caso de la agregacion*/

Vector vPrincipal= new Vector();
  //Procedimiento para gusrdar los datos dentro de un vector
  public void Guardar(Usuarios unUsuarios){
      vPrincipal.addElement(unUsuarios); 
  }
     //Procedimiento para guardar los datos en un txt
  public void guardarArchivo(Usuarios usuarios){
      try{
  /*Creamos un objeto de FileWriter esta libreria nos permitira escribir dentro de un txt
          la ventaja de esta diseñada para generar el archivo si aun no existe, es por ello 
          que se le agrega el valor boleano true*/
          FileWriter fw=new FileWriter("Registros.txt",true);
   /*Creamos o generamos un objeto de tipo clase BufferedWriter Nos permite escribir dentro de un archivo byte a byte*/
          BufferedWriter bw= new BufferedWriter(fw);
  /*La clase printWriter es la clase encargada de la salida de datos, en este caso la encargada de imprimir los datos
          dentro de nuestro archivo txt*/
          PrintWriter pw=new PrintWriter(bw);
 /*Establecemos la manera en que queremos que nuestrod datos se guarden en nuestr txt, es decir podemos darle formato a dicho txt*/
 

          pw.print(usuarios.getID());
          pw.print("|"+usuarios.getNombre());
          pw.print("|"+usuarios.getTelefono());
          pw.print("|"+usuarios.getEstatusLectura());
          pw.print("|"+usuarios.getEstatusConexion());
          pw.println("|"+usuarios.getFecha());
  /*aplicamos ña funcion close para cerrar nuestra funcion y no leer datos que no esten dentro de lo especificado */       
          pw.close();
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      }
  }
  //Funcion para guardar los datos en una jtable
  /*s el modelo de tabla que utiliza JTable cuando el no se define específicamente ningún modelo de tabla. 
  El DefaultTableModel almacena los datos para la JTable */
  public DefaultTableModel listaUsuarios()  {
  //Creamos el vector que nos permitira almacenar las cabeceras o la columna inicial de nuestra txt
      Vector cabeceras= new Vector();
  //Cramos vector que contenga Id, nombre, telefono, estatus de lectura y conexion
       cabeceras.addElement("ID");
       cabeceras.addElement("NOMBRE");
       cabeceras.addElement("TELEFONO");
       cabeceras.addElement("LECTURA");
       cabeceras.addElement("CONEXION");
       cabeceras.addElement("FECHA");
     
   //Creamos un modelo de tabla a traves de la funcion DefaultTableModel para que se guarde en la ubicacion deseada.
       DefaultTableModel mdlTabla=new DefaultTableModel(cabeceras, 0);
          try {
   //FileReader noes permite leer ficheros o informacion en Buffer
              FileReader fr= new FileReader("Registros.txt");
  //generamos la clase que nos permitira leer el arcjivo*/
              BufferedReader br= new BufferedReader(fr);
  /*Creamos un bluque while que nos permitira leer linea por linea dentro de nuestro archivo, para que este archivo se
 lea linea por linea utilizamos la funcion StrigTokenizer  y tambien usamos hasMoreTokens devuelve true si hay más tokens que obtener en la cadena.
  nextToken() devuelve un String con el siguiente token; la funcion addRow nos permitira agregar mas lineas con forme valla leyendo y
              escribiendo datos  */       
              String d;
              while((d=br.readLine())!=null){
                  StringTokenizer dato =new StringTokenizer(d,"|");
                  Vector x=new Vector();
                  while(dato.hasMoreTokens()){
                      x.addElement(dato.nextToken());
                  }
                      mdlTabla.addRow(x);   
              }      
          } catch (Exception e) {
           
              JOptionPane.showMessageDialog(null, e);  
          }
         return mdlTabla;
      }
  
  /*Creamos los metodos que nos permitira agragar datos a nuestros JComboBox */
  public void comboLectura(JComboBox ComboLectura){
      ComboLectura.removeAllItems();
      ComboLectura.addItem("Leido");
      ComboLectura.addItem("Visto");
      ComboLectura.addItem("No leido");
      ComboLectura.addItem("No Recibido");
      
  }
    public void comboConexion(JComboBox ComboConexion){
      ComboConexion.removeAllItems();
      ComboConexion.addItem("En linea");
      ComboConexion.addItem("Escribiendo");
      ComboConexion.addItem("Sin conexion");
     
    }
    
     public void guardarArchivocsv(Usuarios usuarios) throws IOException{
         try{
        File archivo= new File("C:\\Users\\arago\\OneDrive\\Desktop\\RegistroWhatsApp\\Registros.csv");
        FileWriter fw=new FileWriter(archivo,true);
        
       
        
         BufferedWriter bw= new BufferedWriter(fw);
        
         PrintWriter pw=new PrintWriter(bw);
        if(archivo.length()==0) {
         pw.write("Id,Nombre,Telefono,Lectura,Conexion,Fecha" + "\n");
        }   
          pw.print(usuarios.getID());
          pw.print(","+usuarios.getNombre());
          pw.print(","+usuarios.getTelefono());
          pw.print(","+usuarios.getEstatusLectura());
          pw.print(","+usuarios.getEstatusConexion());
          pw.println(","+usuarios.getFecha());
        
  /*aplicamos ña funcion close para cerrar nuestra funcion y no leer datos que no esten dentro de lo especificado */       
          pw.close();
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      }
  }
     
    public DefaultTableModel listaUsuarios2()  {
  //Creamos el vector que nos permitira almacenar las cabeceras o la columna inicial de nuestra txt
      Vector cabeceras= new Vector();
  //Cramos vector que contenga Id, nombre, telefono, estatus de lectura y conexion
  
       cabeceras.addElement("ID");
       cabeceras.addElement("NOMBRE");
       cabeceras.addElement("TELEFONO");
       cabeceras.addElement("LECTURA");
       cabeceras.addElement("CONEXION");
       cabeceras.addElement("FECHA");
     
   //Creamos un modelo de tabla a traves de la funcion DefaultTableModel para que se guarde en la ubicacion deseada.
       DefaultTableModel mdlTabla=new DefaultTableModel(cabeceras, 0);
          try {
              
   //FileReader noes permite leer ficheros o informacion en Buffer
              FileReader fr= new FileReader("Registros.csv");
  //generamos la clase que nos permitira leer el arcjivo*/
              BufferedReader br= new BufferedReader(fr);
              String d;
                  
       if (br.readLine() == null) {
 
}
              while((d=br.readLine())!=null){
                  StringTokenizer dato =new StringTokenizer(d,",");
                  Vector x=new Vector();
                  while(dato.hasMoreTokens()){
                      x.addElement(dato.nextToken());
                  }
                      mdlTabla.addRow(x);   
              }      
          } catch (Exception e) {
           
              JOptionPane.showMessageDialog(null, e);  
          }
         return mdlTabla;
      }
   

  }
   
    

