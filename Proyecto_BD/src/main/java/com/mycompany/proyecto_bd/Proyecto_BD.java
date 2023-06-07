
package com.mycompany.proyecto_bd;

import accesoBD.IniciarSesion_DAO;
import accesoBD.InterfaceIniciarSesionDAO;
import controlador.ControladorIniciarSesion;
import vista.VistaIniciarSesion;
import modelo.ModeloIniciarSesion;
/**
 *
 * @author juanc
 */
public class Main {

    public static void main(String[] args) {
        VistaIniciarSesion view = new VistaIniciarSesion ();
        
        ModeloIniciarSesion model = new ModeloIniciarSesion("Usuario", "Contraseña");
        InterfaceIniciarSesionDAO daoAministrador = new IniciarSesion_DAO();
        ControladorIniciarSesion ctrl = new ControladorIniciarSesion (view,model, daoAministrador);

        ctrl.iniciar();

        view.setVisible(true);
    }
}
