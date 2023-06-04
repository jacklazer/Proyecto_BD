/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import accesoBD.*;
import modelo.*;

/**
 *
 * @author juanc
 */

public class Editorial_controlador {
    
    Editorial_DAO dao_editorial;
    
    public Editorial_controlador(){
        dao_editorial = new Editorial_DAO();
    }
    
    
    public int guardar_editorial_c(String codigo, String  nombre, String pagina_web, String pais_de_origen){
        
        Editorial_modelo editorial = new Editorial_modelo();        

        editorial.set_codigo_editorial(codigo);
        editorial.set_nombre_editorial(nombre);
        editorial.set_pagina_web_editorial(pagina_web);
        editorial.set_pais_de_origen_editorial(pais_de_origen);
        
        System.out.println("Insertando una nueva editorial");
        
        int result = dao_editorial.guardar_editorial(editorial);

        System.out.println("Se insertó una nueva editorial");
        
        return result;

    }//end

    public Editorial_modelo consultar_editorial_c(String codigo){
        
        System.out.println("Consultando una editorial");
        Editorial_modelo editorial = dao_editorial.consultar_editorial(codigo);

        return editorial;
    }

    public void listar_editoriales_c(){

    }
    
    public void cerrarConexionBD(){
        dao_editorial.cerrarConexionBD();
    }
    
}
