/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionv;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class MascotaPerro extends MascotaSuperClass{
    
    public MascotaPerro(String nombre, int codigo_mascota, String raza, LocalDate fecha_nacimiento, int nro_documento) {
        super(nombre, codigo_mascota, raza, fecha_nacimiento, nro_documento);
    }
    
}
