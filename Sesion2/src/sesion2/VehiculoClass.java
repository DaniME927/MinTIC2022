/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion2;

/**
 *
 * @author Usuario
 */
public class VehiculoClass {
    //Declarar las siguientes variables: marca, modelo, color, 
    //cilindraje, disponibilida, placa
    String marca = "Mazda", placa = "MIN202", color = "Rose";
    int modelo = 2022, cilindraje = 2000;
    boolean disponibilidad = false;
    
    //Función que retorna si la marca y el modelo del 
    //vehiculo se encuentra disponible 
    public boolean disponibilidad_vehiculo(String marca_v, int modelo_v){
        if(marca_v == marca && modelo_v == modelo){
            disponibilidad = true;
        }else{
            //Mostrar mensaje informativo al usuario que indique la marca 
            //y el modelo disponible
            System.out.println("Sólo tenemos disponibles vehículos con las "
                    + "siguientes características: " + marca + " modelo " + modelo);
            disponibilidad = false;
        }
        return disponibilidad;
    }    
}
