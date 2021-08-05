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
 * @author usuario
 */
public class ClientClass extends PersonClass{
    
    private String address;
    private int phone;
    private CompanyClass company;
    private static Scanner inst_datos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    
    public ClientClass() {
        
    }

    public ClientClass(String name, String lastname, int document_ID, String email, String address, int phone_p, CompanyClass company) {
        super(name, lastname, document_ID, email);
        this.address = address;
        this.phone = phone_p;
        this.company = company;
    }

    
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    /**
     * @return the company
     */
    public CompanyClass getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(CompanyClass company) {
        this.company = company;
    }
    
    public void crud_clients(){
        CompanyClass company = new CompanyClass("MINTIC.INC", "123456.98", "Calle bulevar 38 N° 17 - 26");
        ArrayList<ClientClass> client_list = new ArrayList<>();
        boolean exit_program = false;
        //Ciclo para mostrar el menú de opciones
        //while(exit_program == true)
        while(!exit_program){
            System.out.println(ANSI_BLUE+"MINTIC.INC 2021"+ ANSI_RESET);
            System.out.println(ANSI_BLUE + "INGRESA UNA OPCIÓN DEL MENÚ"+ ANSI_RESET);
            System.out.println("    1. Crear cliente");
            System.out.println("    2. Consultar lista de clientes");
            System.out.println("    3. Editar cliente");
            System.out.println("    4. Eliminar cliente");
            System.out.println("    5. " + ANSI_RED + "SALIR"+ ANSI_RESET);
            System.out.println(ANSI_BLUE +"Opción: "+ ANSI_RESET);
            int option = Integer.parseInt(inst_datos.nextLine());
            // add(valor) => añadir al final
            // get(indice) => consultar un valor
            // set(indice, valor nuevo) => modificar determinado valor
            // remove(indice) => eliminar determinado valor
            switch(option){
                case 1:
                    System.out.println(ANSI_BLUE +"Cuántos clientes desea añadir?"+ ANSI_RESET);
                    int num_clients = Integer.parseInt(inst_datos.nextLine());
                    System.out.println("\n" + ANSI_RED + "FORMULARIO DE REGISTRO DE CLIENTES"+ ANSI_RESET);
                    for (int i = 1; i <= num_clients; i++) {
                        System.out.println(ANSI_BLUE +"//////////////////////////////Cliente "+ i + "///////////////////////////////" + i +ANSI_RESET);        
                        System.out.println(ANSI_BLUE +"Nombre:" + ANSI_RESET);
                        String name = inst_datos.nextLine();
                        System.out.println(ANSI_BLUE +"Apellidos:" + ANSI_RESET);
                        String lastname = inst_datos.nextLine();
                        System.out.println(ANSI_BLUE +"Documento de identidad:" + ANSI_RESET);
                        int document_ID = Integer.parseInt(inst_datos.nextLine()); 
                        System.out.println(ANSI_BLUE +"Email:" + ANSI_RESET);
                        String email = inst_datos.nextLine();
                        System.out.println(ANSI_BLUE +"Dirección de residencia:" + ANSI_RESET);
                        String address = inst_datos.nextLine();
                        System.out.println(ANSI_BLUE +"Número de teléfono:" + ANSI_RESET);
                        int phone_p = Integer.parseInt(inst_datos.nextLine());
                        
                        ClientClass client = new ClientClass(name, lastname, document_ID, email, address, phone_p, company);
                        client_list.add(client);
                        System.out.println(ANSI_RED +"//////////////////////////////CLIENTE CREADO CON ÉXITO///////////////////////////////"+ ANSI_RESET);
                    }
                    break;
                case 2:
                    System.out.println("\n" + ANSI_RED + "TOTAL DE CLIENTES "  + client_list.size()+ ANSI_RESET);
                    for (int i = 0; i < client_list.size(); i++) {
                        System.out.println(ANSI_BLUE + "Cliente " + (i + 1) + ANSI_RESET);
                        ClientClass client = client_list.get(i);
                        System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + client.getName());
                        System.out.println(ANSI_BLUE + "Apellidos: " + ANSI_RESET + client.getLastname());
                        System.out.println(ANSI_BLUE + "Documento de identidad: " + ANSI_RESET + client.getDocument_ID());
                        System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + client.getEmail());
                        System.out.println(ANSI_BLUE + "Dirección de residencia: " + ANSI_RESET + client.getAddress());
                        System.out.println(ANSI_BLUE + "Número de teléfono: " + ANSI_RESET + client.getPhone());
                        System.out.println(ANSI_BLUE + "Nombre de la Compañía asociada: " + ANSI_RESET + company.getCompany_name());
                        System.out.println(ANSI_BLUE + "NIT asociado: " + ANSI_RESET + company.getNIT());
                        System.out.println(ANSI_BLUE + "Dirección asociada: " + ANSI_RESET + company.getAddress());
                    }
                    break;
                case 3:
                    System.out.println(ANSI_RED + "EDITAR INFORMACIÓN DEL CLIENTE" + ANSI_RESET);
                    System.out.println("Ingresa el indice del cliente a Editar");
                    int index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= client_list.size()) {
                        ClientClass client = client_list.get(index);
                        System.out.println(ANSI_RED + "//////////////////////////////INFORMACIÓN ACTUAL DEL CLIENTE///////////////////////////////" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "     Nombre: " + ANSI_RESET + client.getName());
                        System.out.println(ANSI_BLUE + "     Apellidos: " + ANSI_RESET + client.getLastname());
                        System.out.println(ANSI_BLUE + "     Documento de identidad: " + ANSI_RESET + client.getDocument_ID());
                        System.out.println(ANSI_BLUE + "     Email: " + ANSI_RESET + client.getEmail());
                        System.out.println(ANSI_BLUE + "     Dirección de residencia: " + ANSI_RESET + client.getAddress());
                        System.out.println(ANSI_BLUE + "     Número de teléfono: " + ANSI_RESET + client.getPhone());
                        System.out.println(ANSI_BLUE + "     Nombre de la compañía asociada: " + ANSI_RESET + company.getCompany_name());
                        System.out.println(ANSI_BLUE + "     NIT asociado: " + ANSI_RESET + company.getNIT());
                        System.out.println(ANSI_BLUE + "     Dirección asociada: " + ANSI_RESET + company.getCompany_name());
                        
                        System.out.println("Que campo desea editar?\n      1. Nombre\n      2. Apellidos\n      3. Documento de identidad\n      4. Email\n      5. Dirección de residencia\n      6. Número de teléfono\n      7. Nombre de la compañía\n      8. NIT asociado\n      9. Dirección asociada");
                        int edit_field = Integer.parseInt(inst_datos.nextLine());
                        switch (edit_field) {
                            case 1:
                                System.out.println(ANSI_RED + "Nombre nuevo" + ANSI_RESET);
                                String name = inst_datos.nextLine();
                                client.setName(name);
                                break;
                            case 2:
                                System.out.println(ANSI_RED + "Apellidos nuevos" + ANSI_RESET);
                                String lastname = inst_datos.nextLine();
                                client.setLastname(lastname);
                                break;
                            case 3:
                                System.out.println(ANSI_RED + "Documento de identidad nuevo" + ANSI_RESET);
                                int document_ID = Integer.parseInt(inst_datos.nextLine());
                                client.setDocument_ID(document_ID);
                                break;
                            case 4:
                                System.out.println(ANSI_RED + "Email nuevo" + ANSI_RESET);
                                String email = inst_datos.nextLine();
                                client.setEmail(email);
                                break;
                            case 5:
                                System.out.println(ANSI_RED + "Dirección de residencia nuevo" + ANSI_RESET);
                                String address = inst_datos.nextLine();
                                client.setAddress(address);
                                break;
                            case 6:
                                System.out.println(ANSI_RED + "Número de teléfono nuevo" + ANSI_RESET);
                                int phone_d = Integer.parseInt(inst_datos.nextLine());
                                client.setPhone(phone_d);
                                break;
                            case 7:
                                System.out.println(ANSI_RED + "Compañía asociada nueva" + ANSI_RESET);
                                String company_p = inst_datos.nextLine();
                                company.setCompany_name(company_p);
                                break;
                            case 8:
                                System.out.println(ANSI_RED + "NIT asociado nuevo" + ANSI_RESET);
                                String nit_p = inst_datos.nextLine();
                                company.setNIT(nit_p);
                                break;
                            case 9:
                                System.out.println(ANSI_RED + "Dirección asociada nueva" + ANSI_RESET);
                                String address_p = inst_datos.nextLine();
                                company.setAddress(address_p);
                                break;
                            default:
                                    System.out.println(ANSI_RED+ "///////////////////////////////OPCIÓN INVÁLIDA///////////////////////////////" + ANSI_RESET);
                                break;
                        }
                        System.out.println(ANSI_RED + "///////////////////////////////LA INFORMACIÓN DEL CLIENTE SE HA ACTUALIZADO EXITOSAMENTE///////////////////////////////" + ANSI_RESET);
                    }

                    break;
                case 4:
                    System.out.println(ANSI_RED + "ELIMINAR CLIENTE" + ANSI_RESET);
                    System.out.println("Ingresa el indice del cliente a Eliminar");
                    int index_remove = Integer.parseInt(inst_datos.nextLine());
                    if (index_remove >= 0 && index_remove <= client_list.size()) {
                        ClientClass client = client_list.get(index_remove);
                        System.out.println(ANSI_RED + "///////////////////////////////INFORMACIÓN DEL CLIENTE///////////////////////////////" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "     Nombre: " + ANSI_RESET + client.getName());
                        System.out.println(ANSI_BLUE + "     Apellidos: " + ANSI_RESET + client.getLastname());
                        System.out.println("Estás seguro que desea eliminar a " + ANSI_BLUE + client.getName() + "? (Si, No)" + ANSI_RESET);
                        String remove = inst_datos.nextLine();
                        if (remove.toUpperCase().equals("SI") || remove.toUpperCase().equals("SÍ")) {
                            client_list.remove(index_remove);
                        } else {
                            System.out.println(ANSI_RED + "///////////////////////////////CANCELADO///////////////////////////////" + ANSI_RESET);
                        }
                        System.out.println(ANSI_BLUE + "BASE DE DATOS DE CLIENTES ACTUALIZADA" + ANSI_RESET);
                        for (int i = 0; i < client_list.size(); i++) {
                            System.out.println("\n" + ANSI_BLUE + "       Cliente " + (i + 1) + ANSI_RESET);
                            ClientClass client_new = client_list.get(i);
                            System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + client_new.getName());
                            System.out.println(ANSI_BLUE + "Apellidos: " + ANSI_RESET + client_new.getLastname());
                            System.out.println(ANSI_BLUE + "Documento de identidad: " + ANSI_RESET + client_new.getDocument_ID());
                            System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + client_new.getEmail());
                            System.out.println(ANSI_BLUE + "Dirección de residencia: " + ANSI_RESET + client_new.getAddress());
                            System.out.println(ANSI_BLUE + "Número de teléfono: " + ANSI_RESET + client_new.getPhone());
                            System.out.println(ANSI_BLUE + "Compañía asociada: " + ANSI_RESET + company.getCompany_name());
                            System.out.println(ANSI_BLUE + "NIT asociado: " + ANSI_RESET + company.getNIT());
                            System.out.println(ANSI_BLUE + "Dirección asociada: " + ANSI_RESET + company.getAddress());
                        }
                    }

                    break;
                case 5:
                    exit_program=true;
                    System.out.println(ANSI_RED + "///////////////////////////////SALIENDO DEL PROGRAMA///////////////////////////////" + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "///////////////////////////////OPCIÓN INVÁLIDA///////////////////////////////"+ ANSI_RESET);
            }
        }
    }

}
