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
public class EmployeeClass extends PersonClass{
    
    private int salary;
    private JobPositionClass job_position;
    private AdminClass num_subordinates;
    private CompanyClass company;
    private static Scanner inst_datos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    
    public EmployeeClass() {
        
    }
   
    public EmployeeClass(String name, String lastname, int document_ID, String email, int salary, JobPositionClass job_position, AdminClass num_subordinates, CompanyClass company) {
        super(name, lastname, document_ID, email);
        this.salary = salary;
        this.job_position = job_position;
        this.num_subordinates = num_subordinates;
        this.company = company;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public JobPositionClass getJob_position() {
        return job_position;
    }

    public void setJob_position(JobPositionClass job_position) {
        this.job_position = job_position;
    }
    
    /**
     * @return the num_subordinates
     */
    public AdminClass getNum_subordinates() {
        return num_subordinates;
    }

    /**
     * @param num_subordinates the num_subordinates to set
     */
    public void setNum_subordinates(AdminClass num_subordinates) {
        this.num_subordinates = num_subordinates;
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
    
    public static void crud_employees(){
        CompanyClass company = new CompanyClass("MINTIC.INC", "123456.98", "Calle bulevar 38 N° 17 - 26");
        JobPositionClass job = new JobPositionClass("Ingeniero de Sistemas", "Area administrativa");
        AdminClass admin = new AdminClass(3);
        ArrayList<EmployeeClass> employee_list = new ArrayList<>();
        boolean exit_program = false;
        //while(exit_program == true), para mostrar el menú de opciones
        while(!exit_program){
            System.out.println(ANSI_BLUE + "MINTIC.INC 2021");
            System.out.println(ANSI_BLUE + "INGRESA UNA OPCIÓN DEL MENÚ" + ANSI_RESET);
            System.out.println("    1. Crear empleados");
            System.out.println("    2. Mostrar lista de empleados");
            System.out.println("    3. Editar empleado");
            System.out.println("    4. Eliminar empleado");
            System.out.println("    5. " + ANSI_RED + "SALIR" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "Opción: " + ANSI_RESET);
            //convertir número de tipo string a número entero con parse
            int option = Integer.parseInt(inst_datos.nextLine());
            //add(valor) añade valor
            //instancia.get() consulta valor
            //instancia.set(indice, valor) edita valor
            //remove(indice) elimina el valor
            switch(option){
                case 1:
                    System.out.println(ANSI_BLUE + "Cuántos empleados desea añadir? " + ANSI_RESET);
                    int num_employees = Integer.parseInt(inst_datos.nextLine());
                    System.out.println("\n" + ANSI_RED + "FORMULARIO DE REGISTRO DE EMPLEADOS" + ANSI_RESET);
                    for (int i = 1; i <= num_employees; i++) {
                        System.out.println(ANSI_BLUE +"//////////////////////////////Empleado "+ i + "///////////////////////////////"+ ANSI_RESET);
                        System.out.println(ANSI_BLUE +"Nombre:"+ ANSI_RESET);
                        String name = inst_datos.nextLine();
                        System.out.println(ANSI_BLUE +"Apellidos:"+ ANSI_RESET);
                        String lastname = inst_datos.nextLine();
                        System.out.println(ANSI_BLUE +"Documento de identidad:"+ ANSI_RESET);
                        int document_ID = Integer.parseInt(inst_datos.nextLine());
                        System.out.println(ANSI_BLUE +"Email:"+ ANSI_RESET);
                        String email = inst_datos.nextLine();
                        System.out.println(ANSI_BLUE +"Salario:"+ ANSI_RESET);
                        int salary = Integer.parseInt(inst_datos.nextLine());
                        EmployeeClass employee = new EmployeeClass(name, lastname, document_ID, email, salary, job, admin, company);
                        employee_list.add(employee);
                        System.out.println(ANSI_RED +"//////////////////////////////EMPLEADO CREADO CON ÉXITO///////////////////////////////"+ ANSI_RESET);
                    }
                    break;
                    
                case 2:
                    System.out.println("\n" +ANSI_RED +"TOTAL DE EMPLEADOS " + employee_list.size()+ ANSI_RESET);
                    for (int i = 0; i < employee_list.size(); i++) {
                        System.out.println(ANSI_BLUE +"Empleado " + (i+1) + ANSI_RESET);
                        EmployeeClass employee = (EmployeeClass)employee_list.get(i);
                        System.out.println(ANSI_BLUE +"Nombre: "+ employee.getName()+ ANSI_RESET);
                        System.out.println(ANSI_BLUE +"Apellidos: "+ employee.getLastname()+ ANSI_RESET);
                        System.out.println(ANSI_BLUE +"Documento de identidad: "+ employee.getDocument_ID()+ ANSI_RESET);
                        System.out.println(ANSI_BLUE +"Email: "+ employee.getEmail()+ ANSI_RESET);
                        System.out.println(ANSI_BLUE +"Nombre del cargo: "+ job.getJob_name()+ ANSI_RESET);
                        System.out.println(ANSI_BLUE +"Nivel de jerarquía: "+ job.getHerarchy_name()+ ANSI_RESET);
                        System.out.println(ANSI_BLUE +"Número de personas a cargo: "+ admin.getNum_subordinates()+ ANSI_RESET);
                        System.out.println(ANSI_BLUE +"Salario: "+ employee.getSalary()+ ANSI_RESET);
                        System.out.println(ANSI_BLUE + "Nombre de la Compañía: " + ANSI_RESET + company.getCompany_name());
                        System.out.println(ANSI_BLUE + "NIT: " + ANSI_RESET + company.getNIT());
                        System.out.println(ANSI_BLUE + "Dirección: " + ANSI_RESET + company.getAddress());
                    }
                    break;
                case 3:
                    System.out.println(ANSI_RED + "EDITAR INFORMACIÓN DEL EMPLEADO" + ANSI_RESET);
                    System.out.println("Ingresa el indice del empleado a Editar");
                    int index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= employee_list.size()) {
                        EmployeeClass employee = employee_list.get(index);
                        System.out.println(ANSI_RED + "//////////////////////////////INFORMACIÓN ACTUAL DEL EMPLEADO///////////////////////////////" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "     Nombre: " + ANSI_RESET + employee.getName());
                        System.out.println(ANSI_BLUE + "     Apellidos: " + ANSI_RESET + employee.getLastname());
                        System.out.println(ANSI_BLUE + "     Documento de identidad: " + ANSI_RESET + employee.getDocument_ID());
                        System.out.println(ANSI_BLUE + "     Email: " + ANSI_RESET + employee.getEmail());
                        System.out.println(ANSI_BLUE + "     Salario: " + ANSI_RESET + employee.getSalary());
                        System.out.println(ANSI_BLUE + "     Nombre del cargo: " + ANSI_RESET + job.getJob_name());
                        System.out.println(ANSI_BLUE + "     Nivel de jerarquía: " + ANSI_RESET + job.getHerarchy_name());
                        System.out.println(ANSI_BLUE + "     Número de personas a cargo: " + ANSI_RESET + admin.getNum_subordinates());
                        System.out.println(ANSI_BLUE + "     Nombre de la compañía: " + ANSI_RESET + company.getCompany_name());
                        System.out.println(ANSI_BLUE + "     NIT: " + ANSI_RESET + company.getNIT());
                        System.out.println(ANSI_BLUE + "     Dirección: " + ANSI_RESET + company.getCompany_name());
                        System.out.println("Que campo desea editar?\n      1. Nombre\n      2. Apellidos\n      3. Documento de identidad\n      4. Email\n      5. Salario\n      6. Nombre del cargo\n      7. Nivel de Jerarquía\n      8. Número de personas a cargo\n      9. Nombre de la compañía\n      10. NIT \n      11. Dirección");
                        int edit_field = Integer.parseInt(inst_datos.nextLine());
                        switch (edit_field) {
                            case 1:
                                System.out.println(ANSI_RED + "Nombre nuevo" + ANSI_RESET);
                                String name = inst_datos.nextLine();
                                employee.setName(name);
                                break;
                            case 2:
                                System.out.println(ANSI_RED + "Apellidos nuevos" + ANSI_RESET);
                                String lastname = inst_datos.nextLine();
                                employee.setLastname(lastname);
                                break;
                            case 3:
                                System.out.println(ANSI_RED + "Documento de identidad nuevo" + ANSI_RESET);
                                int document_ID = Integer.parseInt(inst_datos.nextLine());
                                employee.setDocument_ID(document_ID);
                                break;
                            case 4:
                                System.out.println(ANSI_RED + "Email nuevo" + ANSI_RESET);
                                String email = inst_datos.nextLine();
                                employee.setEmail(email);
                                break;
                            case 5:
                                System.out.println(ANSI_RED + "Salario nuevo" + ANSI_RESET);
                                int salary = Integer.parseInt(inst_datos.nextLine());
                                employee.setSalary(salary);
                                break;
                            case 6:
                                System.out.println(ANSI_RED + "Nombre del cargo nuevo" + ANSI_RESET);
                                String job_p = inst_datos.nextLine();
                                job.setJob_name(job_p);
                                break;
                            case 7:
                                System.out.println(ANSI_RED + "Nombre del área nueva" + ANSI_RESET);
                                String herarchy_p = inst_datos.nextLine();
                                job.setHerarchy_name(herarchy_p);
                                break;
                            case 8:
                                System.out.println(ANSI_RED + "Número de personas a cargo" + ANSI_RESET);
                                int admin_p = Integer.parseInt(inst_datos.nextLine());
                                admin.setNum_subordinates(admin_p);
                                break;
                            case 9:
                                System.out.println(ANSI_RED + "Compañía nueva" + ANSI_RESET);
                                String company_p = inst_datos.nextLine();
                                company.setCompany_name(company_p);
                                break;
                            case 10:
                                System.out.println(ANSI_RED + "NIT nuevo" + ANSI_RESET);
                                String nit_p = inst_datos.nextLine();
                                company.setNIT(nit_p);
                                break;
                            case 11:
                                System.out.println(ANSI_RED + "Dirección nueva" + ANSI_RESET);
                                String address_p = inst_datos.nextLine();
                                company.setAddress(address_p);
                                break;
                            default:
                                System.out.println(ANSI_RED + "///////////////////////////////OPCIÓN INVÁLIDA///////////////////////////////"+ ANSI_RESET);
                            break;      
                        }
                        System.out.println(ANSI_RED + "///////////////////////////////LA INFORMACIÓN DEL EMPLEADO SE HA ACTUALIZADO EXITOSAMENTE///////////////////////////////" + ANSI_RESET);
                    }
                    break;
                case 4:
                    System.out.println(ANSI_RED + "ELIMINAR EMPLEADO" + ANSI_RESET);
                    System.out.println("Ingresa el indice del empleado a Eliminar");
                    int index_remove = Integer.parseInt(inst_datos.nextLine());
                    if (index_remove >= 0 && index_remove <= employee_list.size()) {
                        EmployeeClass employee = employee_list.get(index_remove);
                        System.out.println(ANSI_RED + "///////////////////////////////INFORMACIÓN DEL EMPLEADO///////////////////////////////" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "     Nombre: " + ANSI_RESET + employee.getName());
                        System.out.println(ANSI_BLUE + "     Apellidos: " + ANSI_RESET + employee.getLastname());
                        System.out.println("Estás seguro que desea eliminar a " + ANSI_BLUE + employee.getName() + "? (Si, No)" + ANSI_RESET);
                        String remove = inst_datos.nextLine();
                        if (remove.toUpperCase().equals("SI") || remove.toUpperCase().equals("SÍ")) {
                            employee_list.remove(index_remove);
                        } else {
                            System.out.println(ANSI_RED + "///////////////////////////////CANCELADO///////////////////////////////" + ANSI_RESET);
                        }
                        System.out.println(ANSI_BLUE + "BASE DE DATOS DE EMPLEADOS ACTUALIZADA" + ANSI_RESET);
                        for (int i = 0; i < employee_list.size(); i++) {
                            System.out.println("\n" + ANSI_BLUE + "       Empleado " + (i + 1) + ANSI_RESET);
                            EmployeeClass employee_new = employee_list.get(i);
                            System.out.println(ANSI_BLUE + "Nombre: " + ANSI_RESET + employee_new.getName());
                            System.out.println(ANSI_BLUE + "Apellidos: " + ANSI_RESET + employee_new.getLastname());
                            System.out.println(ANSI_BLUE + "Documento de identidad: " + ANSI_RESET + employee_new.getDocument_ID());
                            System.out.println(ANSI_BLUE + "Email: " + ANSI_RESET + employee_new.getEmail());
                            System.out.println(ANSI_BLUE + "Salario: " + ANSI_RESET + employee_new.getSalary());
                            System.out.println(ANSI_BLUE + "Nombre del cargo: " + ANSI_RESET + job.getJob_name());
                            System.out.println(ANSI_BLUE + "Nivel de jerarquía: " + ANSI_RESET + job.getHerarchy_name());
                            System.out.println(ANSI_BLUE + "Número de personas a cargo: " + ANSI_RESET + admin.getNum_subordinates());
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
