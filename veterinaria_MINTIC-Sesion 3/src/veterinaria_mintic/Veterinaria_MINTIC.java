/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria_mintic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Veterinaria_MINTIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //FORMA I:
        // Instanciamiento de las clases
        MascotaEncapsulateFieldsClass inst_mascota = new MascotaEncapsulateFieldsClass();
        Date fecha_actual = new Date();

        //Obtener la fecha en formato corto dia/mes/año y mostrar en pantalla
        DateFormat formato_corto_fecha = new SimpleDateFormat("dd/MM/yyyy");
        Scanner inst_entrada_datos = new Scanner(System.in);

        //Mediante la instancia llamamos los métodos set para asignar valor
        inst_mascota.setNombre_mascota("Rocky");
        inst_mascota.setFecha_nacimiento(formato_corto_fecha.format(fecha_actual));
        inst_mascota.setRaza("Golden");
        inst_mascota.setColor("Café");
        inst_mascota.setHistorial_clinico(true);
        inst_mascota.setNro_documento_dueño(999999);
        inst_mascota.setVacunas(false);

        //Consultamos el valor de ciertas variables mediante la función GET
        System.out.println("FORMA I: GETTER Y SETTER de variables.\n    Nombre: "
                + inst_mascota.getNombre_mascota() + "\n    Fecha de nacimiento: "
                + inst_mascota.getFecha_nacimiento()
                + "\n    Raza: " + inst_mascota.getRaza() + "\n    Color: "
                + inst_mascota.getColor() + "\n    Cuenta con Historial Clínico: "
                + inst_mascota.isHistorial_clinico()
                + "\n    Número del documento del dueño de la mascota: "
                + inst_mascota.getNro_documento_dueño() + "\n    Vacunación al día: "
                + inst_mascota.isVacunas());

        //FORMA II:
        System.out.println("\nFORMA II: Funciones GETTER y constructor de la clase");
        //String nombre_mascota, String fecha_nacimiento, String raza, boolean vacunas,
        //boolean historial_clinico, int nro_documento_dueño
        MascotaConstructorGetterClass inst_mascota2 = new MascotaConstructorGetterClass(
                "Donatelo", formato_corto_fecha.format(fecha_actual), "Labrador", false, true, 1053999);
        //Consultamos el valor de ciertas variables mediante la función GET
        System.out.println("    Nombre: " + inst_mascota2.getNombre_mascota()
                + "\n    Fecha de nacimiento: " + inst_mascota2.getFecha_nacimiento()
                + "\n    Raza: " + inst_mascota2.getRaza() + "\n    Cuenta con Historial Clínico: "
                + inst_mascota2.isHistorial_clinico() + "\n    Número del documento del dueño de la mascota: "
                + inst_mascota2.getNro_documento_dueño() + "\n    Vacunación al día: "
                + inst_mascota2.isVacunas());

        //FORMA III:
        MascotaConstuctorEncapsulamientFuncionClass inst_mascota3 = new MascotaConstuctorEncapsulamientFuncionClass(
                "Miguel Ángel", formato_corto_fecha.format(fecha_actual), "Bull Terrier", false, true, 9995);
        inst_mascota3.consultar_informacion_mascota_metodo();
        System.out.println("*******FUNCIÓN*******");
        System.out.println(inst_mascota3.consultar_informacion_mascota_funcion());
        
        
        //Solicitamos la información al usuario
        System.out.println("\n>>>>>>DILIGENCIA EL SIGUIENTE FORMULARIO<<<<<<\nNombre: ");
        String nombre_dueño = inst_entrada_datos.nextLine();
        
        System.out.println("Tipo de documento: ");
        String tipo_documento = inst_entrada_datos.nextLine();
        
        System.out.println("N° de documento: ");
        int nro_documento = inst_entrada_datos.nextInt();
        
        System.out.println("N° de teléfono: ");
        int contacto = inst_entrada_datos.nextInt();
        
        //Instanciamos la clase deñ dueño de la mascota
        DueñoMascotaClass inst_dueño = new DueñoMascotaClass(
                nombre_dueño, tipo_documento, nro_documento, contacto, inst_mascota2.getNombre_mascota());
        System.out.println(inst_dueño.consultar_informacion_dueño());
    }

}
