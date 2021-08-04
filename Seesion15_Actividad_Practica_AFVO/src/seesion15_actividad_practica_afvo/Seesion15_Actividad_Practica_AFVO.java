/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seesion15_actividad_practica_afvo;

import model_pkg.Conexion;
import views_pkg.Frame_principal;

/**
 *
 * @author andre
 */
public class Seesion15_Actividad_Practica_AFVO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion inst_con = new Conexion();
        Frame_principal inst_frame = new Frame_principal();
        
        inst_con.getConnection();
        inst_frame.setVisible(true);
    }
    
}
