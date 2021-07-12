/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoi;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RETOI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner inst_scanner = new Scanner(System.in);
        
        PersonaClass inst_persona = new PersonaClass("Andrés", "C.C", 1053837897, 26, "Masculino", 70, 180, "Colombia", 
                "Caldas", "Manizales", 313567786, "Soltero", 1, false, true, "Administrador de Empresas");
        inst_persona.consultar_informacion_persona();
        
        System.out.println("\nIngrese los siguientes datos:\n ");
        System.out.println(">>>> Digite su nombre completo ");
        String nombre_p = inst_scanner.nextLine();
        System.out.println(">>>> ¿Qué tipo de documento tiene? (C.C, T.I) ");
        String t_documento = inst_scanner.nextLine();
        System.out.println(">>>> Digite su número de documento ");
        int n_documento = inst_scanner.nextInt();
        System.out.println(">>>> Digite su edad ");
        int edad_p = inst_scanner.nextInt();
        System.out.println(">>>> ¿Cuál es su género? (F ó M) ");
        String genero_p = inst_scanner.nextLine();
        System.out.println(">>>> Digite su peso en kg ");
        int peso_p = inst_scanner.nextInt();
        System.out.println(">>>> Digite su estatura en cm ");
        int estatura_p = inst_scanner.nextInt();
        System.out.println(">>>> ¿Cuál es su país de residencia? ");
        String pais_res = inst_scanner.nextLine();
        System.out.println(">>>> ¿Cuál es su departamento de residencia? ");
        String dep_res = inst_scanner.nextLine();
        System.out.println(">>>> ¿Cuál es su municipio de residencia? ");
        String mun_res = inst_scanner.nextLine();
        System.out.println(">>>> Digite su número de contacto ");
        int nro_contacto_p = inst_scanner.nextInt();
        System.out.println(">>>> ¿Cuál es su estado civil? (Solter@, Casad@, Divorciad@, Viud@) ");
        String estado_civil_p = inst_scanner.nextLine();
        System.out.println(">>>> ¿Cuantos hijos tiene? ");
        int cant_hijos = inst_scanner.nextInt();
        System.out.println(">>>> ¿Sufre de alguna discapacidad? (true=Si, false=No) ");
        boolean discapacidad_p = inst_scanner.hasNextBoolean();
        System.out.println(">>>> ¿Estudia Actualmente? (true=Si, false=No) ");
        boolean actual_estudio_p = inst_scanner.hasNextBoolean();
        System.out.println(">>>> ¿Cuál es su profesión? ");
        String profesion_p = inst_scanner.nextLine();
      
        System.out.println(inst_persona.ingresar_informacion_persona(nombre_p, t_documento, n_documento, edad_p, genero_p, peso_p, estatura_p, pais_res, dep_res, mun_res, nro_contacto_p, estado_civil_p, cant_hijos, discapacidad_p, actual_estudio_p, profesion_p));
    }
}
    
