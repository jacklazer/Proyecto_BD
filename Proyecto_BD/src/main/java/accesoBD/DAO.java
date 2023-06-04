/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoBD;

import java.sql.*;

/**
 *
 * @author juanc
 */

public class DAO {

    String url, usuario, password;
    Connection conexion = null;   

    DAO(){
        url="jdbc:postgresql://localhost:5432/Proyecto_BD";
        usuario="usuario de postgres";
        password="contraseña de postgres";
    }

    public Connection openConnection(){
        try {
            System.out.println( "Cargando driver" );
            Class.forName("org.postgresql.Driver");
            System.out.println( "Driver Cargado" );
        } catch( ClassNotFoundException e ) {
            System.out.println( "No se pudo cargar el driver." );
        }

        try{
            //Crear el objeto de conexion a la base de datos
            conexion = DriverManager.getConnection(url,usuario, password);
            System.out.println( "Conexion Exitosa con la Base de datos" );
            return conexion;
            //Crear objeto Statement para realizar queries a la base de datos
         } catch( SQLException e ) {
            System.out.println( "No se pudo abrir la bd." );
            return null;
         }

    }//end connectar

    public Connection getConnetion(){
        if (conexion == null) {
            return this.openConnection();
        }
        else{
              return conexion;      
        }
//        return this.openConnection();
    }

    public void closeConection(Connection c){
        try{
            if (conexion != null){
                c.close();
            }

        } catch( SQLException e ) {
            System.out.println( "No se pudo cerrar." );
        }
    }

    /*
    public static void main(String a[]){
        FachadaBD fachada = new FachadaBD();
        Connection c = fachada.openConnection();
       fachada.closeConection(c);
    }*/


}
