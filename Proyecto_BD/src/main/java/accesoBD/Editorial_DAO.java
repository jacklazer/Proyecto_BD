/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoBD;

import java.sql.*;
import modelo.*;

/**
 *
 * @author juanc
 */

public class Editorial_DAO {
    
    DAO dao;
    Connection conn;
    public Editorial_DAO(){
        dao= new DAO();
        conn= dao.getConnetion();
    }

    public int guardar_editorial(Editorial_modelo editorial){
        String sql_guardar;
        
        int numFilas=0;

        sql_guardar="INSERT INTO programa VALUES ('" +
                editorial.get_codigo_editorial() + "', '" + editorial.get_nombre_editorial() +  "', '" +
                editorial.get_pagina_web_editorial() + "', " + editorial.get_pais_de_origen_editorial() + ")";
        try{
            
            Statement sentencia = this.conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_guardar);            
            System.out.println("up " + numFilas);
            return numFilas;
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
        return -1;
    }//fin guardar

    public Editorial_modelo consultar_editorial(String codigo){
        Editorial_modelo editorial = new Editorial_modelo();
        String sql_select;
        sql_select="SELECT codigo_editorial, nombre_editorial, pagina_web_editorial, pais_de_origen_editorial FROM editorial WHERE codigo_editorial = '" + codigo +  "'";
         try{
            
            System.out.println("Consultando en la base de datos");
            Statement sentencia = this.conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                
               editorial.set_codigo_editorial(tabla.getString(1));              
               editorial.set_nombre_editorial(tabla.getString(2));               
               editorial.set_pagina_web_editorial(tabla.getString(3));              
               editorial.set_pais_de_origen_editorial(tabla.getString(4));
              
            }
           
            return editorial;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
        return null;
    }

    public void modificar_editorial(String codigo){

    }
    
    public void listar_editoriales(){
        
    }
    
    public void borrar_editorial(String codigo){
    }
    
    public void cerrarConexionBD(){
        dao.closeConection(dao.getConnetion());
    }
    
}
