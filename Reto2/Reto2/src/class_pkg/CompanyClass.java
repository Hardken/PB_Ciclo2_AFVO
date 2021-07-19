/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class CompanyClass {
    private String company_name;
    private String NIT;
    private String direccion;
    private static Scanner inst_datos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public CompanyClass(String company_name, String NIT, String direccion) {
        this.company_name = company_name;
        this.NIT = NIT;
        this.direccion = direccion;
    }

    public CompanyClass() {
    }

    /**
     * @return the company_name
     */
    public String getCompany_name() {
        return company_name;
    }

    /**
     * @param company_name the company_name to set
     */
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    /**
     * @return the NIT
     */
    public String getNIT() {
        return NIT;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
    

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void crud_ecompany(){
         ArrayList<CompanyClass> company_list = new ArrayList<>();
         boolean exit_program = false;
         while (!exit_program) {             
            System.out.println(ANSI_PURPLE + "==================================================================" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "SELECCIONA UNA OPCIÓN DEL MENÚ" + ANSI_RESET);
            System.out.println("    1. Crear empresa");
            System.out.println("    2. Consultar empresa");
            System.out.println("    3. Editar empresa");
            System.out.println("    4. Eliminar empresa");
            System.out.println(ANSI_RED + "    5. SALIR" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "Ingresa tu respuesta" + ANSI_RESET);
            int option = Integer.parseInt(inst_datos.nextLine());
            switch(option){
                case 1:
                    //System.out.println(ANSI_RED +"Cuántas empresas deseas añadir?"+ ANSI_RESET);
                    //int num_empre = Integer.parseInt(inst_datos.nextLine());
                    int num_empre = 1;
                    System.out.println("\n" +ANSI_PURPLE+"=================================================================="+ ANSI_RESET);
                    System.out.println(ANSI_BLUE + "FORMULARIO DE REGISTRO DE EMPRESAS"+ ANSI_RESET);
                    for (int i = 1; i <= num_empre; i++) {
                        System.out.println("\n" +ANSI_BLUE +"       Empresa " + i +ANSI_RESET);
                        System.out.println(ANSI_BLUE +"NIT:" + ANSI_RESET);
                        String NIT = inst_datos.nextLine();
                        
                        System.out.println(ANSI_BLUE +"Nombre:" + ANSI_RESET);
                        String name = inst_datos.nextLine();
                        
                        System.out.println(ANSI_BLUE +"Direccion:" + ANSI_RESET);
                        String direccion = inst_datos.nextLine();                        
                        
                        
                        CompanyClass company = new CompanyClass(name, NIT, direccion);
                        company_list.add(company);
                        System.out.println(ANSI_RED +"=======================EMPRESA CREADA CON ÉXITO======================="+ ANSI_RESET);
                    }
                    break;
                case 2:
                    System.out.println(ANSI_BLUE + "BASE DE DATOS EMPRESAS" + ANSI_RESET);
                    for (int i = 0; i < company_list.size(); i++) {
                        CompanyClass company = company_list.get(i);
                        System.out.println("\n" + ANSI_BLUE + "       Empresa: " + (company.getCompany_name()) + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "NIT: " + ANSI_RESET + company.getNIT());
                        System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + company.getCompany_name());
                        System.out.println(ANSI_BLUE + "Direccion: " + ANSI_RESET + company.getDireccion());
                    }
                    break;
                case 3:
                    System.out.println(ANSI_BLUE + "EDITAR INFORMACIÓN DE EMPRESA" + ANSI_RESET);
                    System.out.println("Ingresa el indice de la EMPRESA a Editar");
                    int index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= company_list.size()) {
                        CompanyClass company = company_list.get(index);
                        System.out.println(ANSI_RED + "=======================INFORMACIÓN ACTUAL DE LA EMPRESA=======================" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "     NIT: " + ANSI_RESET + company.getNIT());
                        System.out.println(ANSI_BLUE + "     Nombre: " + ANSI_RESET + company.getCompany_name());
                        System.out.println(ANSI_BLUE + "     Direccion: " + ANSI_RESET + company.getDireccion());
                        System.out.println("Que campo deseas editar?\n      1. NIT\n      2. Nombre\n       3.Direccion");
                        int edit_field = Integer.parseInt(inst_datos.nextLine());
                        switch (edit_field) {
                            case 1:
                                System.out.println(ANSI_PURPLE + "NIT nuevo" + ANSI_RESET);
                                String NIT = inst_datos.nextLine();
                                company.setNIT(NIT);
                                break;
                            case 2:
                                System.out.println(ANSI_PURPLE + "Nombre nuevo" + ANSI_RESET);
                                String name = inst_datos.nextLine();
                                company.setCompany_name(name);
                                break;
                            case 3:
                                System.out.println(ANSI_PURPLE + "Direccion nueva" + ANSI_RESET);
                                String direccion = inst_datos.nextLine();
                                company.setDireccion(direccion);                                
                            default:
                    System.out.println(ANSI_RED + "=========================OPCIÓN INVÁLIDA========================="+ ANSI_RESET);
                                
                        }
                        System.out.println(ANSI_RED + "=================LA INFORMACIÓN DE EMPRESA SE HA ACTUALIZADO EXITOSAMENTE=================" + ANSI_RESET);
                    }

                    break; 
                case 4:
                    System.out.println(ANSI_RED + "ELIMINAR EMPRESA" + ANSI_RESET);
                    System.out.println("Ingresa el indice de la empresa a Eliminar");
                    int index_remove = Integer.parseInt(inst_datos.nextLine());
                    if (index_remove >= 0 && index_remove <= company_list.size()) {
                        CompanyClass company = company_list.get(index_remove);
                        System.out.println(ANSI_RED + "=======================INFORMACIÓN DE LA EMPRESA=======================" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "     NIT: " + ANSI_RESET + company.getNIT());
                        System.out.println(ANSI_BLUE + "     Nombre: " + ANSI_RESET + company.getCompany_name());
                        System.out.println(ANSI_BLUE + "     Direccion: " + ANSI_RESET + company.getDireccion());
                        System.out.println("Estás seguro que deseas eliminar a " + ANSI_BLUE + company.getCompany_name()+ "? (Si, No)" + ANSI_RESET);
                        String remove = inst_datos.nextLine();
                        if (remove.toUpperCase().equals("SI") || remove.toUpperCase().equals("SÍ")) {
                            company_list.remove(index_remove);
                        } else {
                            System.out.println(ANSI_RED + "=======================CANCELANDO PROCESO=======================" + ANSI_RESET);
                        }
                        System.out.println(ANSI_BLUE + "BASE DE DATOS EMPLEADOS ACTUALIZADA" + ANSI_RESET);
                        for (int i = 0; i < company_list.size(); i++) {
                            System.out.println("\n" + ANSI_BLUE + "       Empleado " + (i + 1) + ANSI_RESET);
                            CompanyClass company_new = company_list.get(i);
                            System.out.println(ANSI_BLUE + "NIT: " + ANSI_RESET + company_new.getNIT());
                            System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + company_new.getCompany_name());
                            System.out.println(ANSI_BLUE + "Direccion: " + ANSI_RESET + company_new.getDireccion());

                        }
                    }

                    break;
                case 5:
                    exit_program=true;
                    System.out.println(ANSI_RED + "=======================SALIENDO DEL PROGRAMA=======================" + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "=========================OPCIÓN INVÁLIDA========================="+ ANSI_RESET);                    
            }
         }
     }    
    
}
