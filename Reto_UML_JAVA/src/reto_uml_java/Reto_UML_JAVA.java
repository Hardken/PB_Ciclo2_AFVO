/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_uml_java;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Reto_UML_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String nombre_persona, int edad, char genero, float peso, float estatura, 
        //String Fecha_nacimiento, String tipo_documento, int num_documento, String 
        //Departamento_nacimiento, String Municipio_nacimiento, String Direccion, 
        //int Telefono_contacto, String Profesion, String Estado_Civil, String Discapacidad, int Cantidad_hijos        
        PersonaClase inst_persona = new PersonaClase("Andres",19,"M",67,160,"20/08/2001","CC",9999,
        "Bogotoa","Bogota","Cll 65 b155",69885,"Estudiante","Soltero",true,0);
        inst_persona.mensaje_getter();
    }
    
}
