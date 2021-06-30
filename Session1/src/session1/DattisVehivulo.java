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
public class DattisVehivulo {
    //sout = system out print ln
    //psvm = public static void main
    public static void main(String[] args) {
      String marca_vehiculo = "Mazda";
      String placa = "TIC202";
      int modelo = 2011;
      boolean renovo_soat = true;
      String color = "Rojo";
      
      //validar si el usuario no ha renovado el soat se le impone una multa
      if(renovo_soat==false){
          int valor_multa = 600000;
          System.out.println("El dueño del vehiculo con placas: " + placa + " debe pagar $" +valor_multa);
      }else{
          System.out.println("El dueño del vehiculo con placas: " + placa +" tiene la documentacion OK");
      }
    }
}
