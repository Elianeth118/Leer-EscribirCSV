/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author arago
 */
public class Usuarios {
    /*Cramos las variables que nos permitiran guardar los datos en la memoria, en este caso necesitamos guardar un id, nombre y demas
    que se muestran a continuacion*/
      private int ID;
    private String Nombre;
    private long Telefono;
    private String EstatusLectura;
    private String EstatusConexion;
     private Date Fecha;
   /*Creamos el metodo constructos que nos permitira hacer uso de dichas variables*/

    public Usuarios(int ID, String Nombre, long Telefono, String EstatusLectura, String EstatusConexion, Date Fecha ) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.EstatusLectura = EstatusLectura;
        this.EstatusConexion = EstatusConexion;
     this.Fecha=Fecha;
    }

    public Usuarios() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


/*Generamos sus metodos set y get de cada variable*/
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }

    public String getEstatusLectura() {
        return EstatusLectura;
    }

    public void setEstatusLectura(String EstatusLectura) {
        this.EstatusLectura = EstatusLectura;
    }

    public String getEstatusConexion() {
        return EstatusConexion;
    }

    public void setEstatusConexion(String EstatusConexion) {
        this.EstatusConexion = EstatusConexion;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

  

  



  
 

}
