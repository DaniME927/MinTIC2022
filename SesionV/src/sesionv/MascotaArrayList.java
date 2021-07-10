/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesionv;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class MascotaArrayList {
    //Tipo de colección que permite añadir, eliminar, consultar, editar valores del mismo tipo de datos

    ArrayList<String> nombre_mascotas = new ArrayList<>();

    //Función que nos permite añadir elementos al arrayList
    public ArrayList add_nombres_mascotas() {
        nombre_mascotas.add("Milú");
        nombre_mascotas.add("Toby");
        nombre_mascotas.add("Donatelo");
        nombre_mascotas.add("Nala");
        return nombre_mascotas;
    }

    public ArrayList modificar_nombres_mascotas() {
        nombre_mascotas.set(3, "Malo");
        return nombre_mascotas;
    }

    public void consultar_cantidad_elementos() {
        System.out.println(nombre_mascotas.size());
    }

    public void eliminar_elemento(int posicion_eliminar) {
        if (posicion_eliminar >= 0 && posicion_eliminar < nombre_mascotas.size()) {
            nombre_mascotas.remove(posicion_eliminar);
            System.out.println(nombre_mascotas);
        }else{
            System.out.println("Posición ingresada es no válida");
        }
    }
    
    public void consultar_elemento(int posicion_consultar) {
        if (posicion_consultar >= 0 && posicion_consultar < nombre_mascotas.size()) {            
            System.out.println(nombre_mascotas.get(posicion_consultar));
        }else{
            System.out.println("Posición ingresada es no válida");
        }
    }
    
    public void lista_vacia(){
        System.out.println(nombre_mascotas.isEmpty());
    }
}
