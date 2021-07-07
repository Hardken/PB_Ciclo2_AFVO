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
public class PersonaClase {
    private String nombre_persona;
    private int edad;
    private String genero;
    private float peso;
    private float estatura;
    private String Fecha_nacimiento;    
    private String tipo_documento;
    private int num_documento;
    private String Departamento_nacimiento;
    private String Municipio_nacimiento;
    private String Direccion;
    private int Telefono_contacto;
    private String Profesion;
    private String Estado_Civil;
    private boolean Discapacidad;
    private int Cantidad_hijos;

    public PersonaClase(String nombre_persona, int edad, String genero, float peso, float estatura, String Fecha_nacimiento, String tipo_documento, int num_documento, String Departamento_nacimiento, String Municipio_nacimiento, String Direccion, int Telefono_contacto, String Profesion, String Estado_Civil, boolean Discapacidad, int Cantidad_hijos) {
        this.nombre_persona = nombre_persona;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.estatura = estatura;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.tipo_documento = tipo_documento;
        this.num_documento = num_documento;
        this.Departamento_nacimiento = Departamento_nacimiento;
        this.Municipio_nacimiento = Municipio_nacimiento;
        this.Direccion = Direccion;
        this.Telefono_contacto = Telefono_contacto;
        this.Profesion = Profesion;
        this.Estado_Civil = Estado_Civil;
        this.Discapacidad = Discapacidad;
        this.Cantidad_hijos = Cantidad_hijos;
    }

    /**
     * @return the nombre_persona
     */
    public String getNombre_persona() {
        return nombre_persona;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @return the estatura
     */
    public float getEstatura() {
        return estatura;
    }

    /**
     * @return the Fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    /**
     * @return the tipo_documento
     */
    public String getTipo_documento() {
        return tipo_documento;
    }

    /**
     * @return the num_documento
     */
    public int getNum_documento() {
        return num_documento;
    }

    /**
     * @return the Departamento_nacimiento
     */
    public String getDepartamento_nacimiento() {
        return Departamento_nacimiento;
    }

    /**
     * @return the Municipio_nacimiento
     */
    public String getMunicipio_nacimiento() {
        return Municipio_nacimiento;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @return the Telefono_contacto
     */
    public int getTelefono_contacto() {
        return Telefono_contacto;
    }

    /**
     * @return the Profesion
     */
    public String getProfesion() {
        return Profesion;
    }

    /**
     * @return the Estado_Civil
     */
    public String getEstado_Civil() {
        return Estado_Civil;
    }

    /**
     * @return the Discapacidad
     */
    public boolean isDiscapacidad() {
        return Discapacidad;
    }

    /**
     * @return the Cantidad_hijos
     */
    public int getCantidad_hijos() {
        return Cantidad_hijos;
    }

    
    public void mensaje_getter(){
        String mensaje;
        if(isDiscapacidad()==true){
            Scanner inst_scanner = new Scanner(System.in);
            System.out.println("Digite su discapcidad");
            String disca = inst_scanner.nextLine();
            mensaje = "Presenta "+disca;
        }else{
            mensaje = "no presenta discapacidad";
        }
        System.out.println("Nombre: "+getNombre_persona()+" \nTipo de documento: "
                +getTipo_documento()+"  \nNro de documento: \n"+getNum_documento()+
                "   \nGenero: "+getGenero()+" \nFecha de nacimiento: "+
                getFecha_nacimiento()+" \nPeso: "+getPeso()+"KG "+" \nEstatura: "+getEstatura()
                +"CM "+"  \nDepartamento de nacimiento: "+getDepartamento_nacimiento()
                +"  \nMunicipio de nacimiento: "+getMunicipio_nacimiento()+
                "   \nDireccion: "+getDireccion()+"   \nTelefono: "+getTelefono_contacto()
                +"  \nProfesion: "+getProfesion()+" \nEstado civil: "+getEstado_Civil()
                +"  \nDiscapacidad: "+ mensaje+ "  \nCantidad de hijos: "+getCantidad_hijos()); 
    }    

        

    
    
    
    
    
    
}
