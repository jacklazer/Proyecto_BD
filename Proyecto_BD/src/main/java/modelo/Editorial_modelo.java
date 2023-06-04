/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juanc
 */

public class Editorial_modelo {
    
    String codigo_editorial;
    String nombre_editorial;
    String pagina_web_editorial;
    String pais_de_origen_editorial;

    public Editorial_modelo(){}
    
    public String get_codigo_editorial() {
        return codigo_editorial;
    }

    public String get_nombre_editorial() {
        return nombre_editorial;
    }

    public String get_pagina_web_editorial() {
        return pagina_web_editorial;
    }

    public String get_pais_de_origen_editorial() {
        return pais_de_origen_editorial;
    }

    public void set_codigo_editorial(String codigo_editorial) {
        this.codigo_editorial = codigo_editorial;
    }

    public void set_nombre_editorial(String nombre_editorial) {
        this.nombre_editorial = nombre_editorial;
    }

    public void set_pagina_web_editorial(String pagina_web_editorial) {
        this.pagina_web_editorial = pagina_web_editorial;
    }

    public void set_pais_de_origen_editorial(String pais_de_origen_editorial) {
        this.pais_de_origen_editorial = pais_de_origen_editorial;
    }
    
}
