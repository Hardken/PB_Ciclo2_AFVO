/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session1;

/**
 *
 * @author andre
 */
public class Session1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre_formador = "Yaneth Mejia";
        char genero = 'F';
        int edad = 30;
        boolean mujer = true;
        //Validar si el usuario es mayor o menor de edad
        if(edad >= 18){
            System.out.println(nombre_formador + " Es mayor de edad");
        }else{
            System.out.println(nombre_formador + " Es menor de edad");
        }
        
        //Validar que e smujer y es mayor de edad
        if( genero == 'F' && edad>17){
            System.out.println(nombre_formador + " es una mujer mayor de edad");
        }else{
            System.out.println(nombre_formador + " no cumple alguna condicion");
        }
        
        //preguntar si es mujer utilizando la variable booleana
        if(mujer == true){
            System.out.println("Es mujer");
        }else{
            System.out.println("Es hombre");
        }
    }
    
}
