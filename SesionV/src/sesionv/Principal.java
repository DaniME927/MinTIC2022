/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionv;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        LocalDate fecha_nacimiento_perro = LocalDate.of(2016, Month.JUNE, 3);
//        //Inicialización de parametros con el constructor
//        MascotaSuperClass inst_mascota = new MascotaSuperClass("Milú", 1, 
//                "Labrador", fecha_nacimiento_perro, 123456);
//        MascotaSuperClass inst_mascota2 = new MascotaSuperClass("Nala", 2, 
//               "Pastor Alemán", LocalDate.of(2018, Month.FEBRUARY, 10), 456789);
//        //Modificar la raza de la mascota
//        inst_mascota.setRaza("Golden Retriver");
//        int codigo_mascota = 1;
//        inst_mascota.informacion_mascota(codigo_mascota);
//        inst_mascota2.informacion_mascota(codigo_mascota);
//        // Trabajo con los setter - Inicialización de parametros sin el constructor
//        inst_mascota.setNombre("Milú");
//        inst_mascota.setCodigo_mascota(1);
//        //LocalDate fecha_nacimiento_perro = LocalDate.of(2016, Month.JUNE, 3);
//        inst_mascota.setFecha_nacimiento(fecha_nacimiento_perro);
//        inst_mascota.setRaza("Labrador");
//        inst_mascota.setNro_documento(123456);

        MascotaPerro inst_perro = new MascotaPerro("Nala", 1,
                "Pastor Alemán", LocalDate.of(2018, Month.FEBRUARY, 10), 456789);
        MascotaGato inst_gato = new MascotaGato("Toby", 1,
                "Persia", LocalDate.of(2019, Month.AUGUST, 1), 123456);
        
        DueñoMascota inst_dueño = new DueñoMascota("Juan", "C.C", 127896);
        
        MascotaArrayList inst_mascota = new MascotaArrayList();
        
        inst_gato.edit_gato("Michin", 2,
                "Persia", LocalDate.of(2010, Month.JANUARY, 26), 127896);
        inst_gato.edit_gato("Mila", 3,
                "Persia", LocalDate.of(2010, Month.DECEMBER, 30), 12986543);
        inst_gato.informacion_mascota(3);
        
        inst_dueño.consultar_informacion_dueño(127896);
        
        System.out.println(inst_mascota.add_nombres_mascotas());
        System.out.println(inst_mascota.modificar_nombres_mascotas());
        inst_mascota.consultar_cantidad_elementos();
        inst_mascota.eliminar_elemento(2);
        inst_mascota.consultar_elemento(1);
        inst_mascota.lista_vacia();
    }

}
