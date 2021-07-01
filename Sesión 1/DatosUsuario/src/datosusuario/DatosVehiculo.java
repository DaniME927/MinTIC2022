/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosusuario;

/**
 *
 * @author Usuario
 */
public class DatosVehiculo {

    //Declaramos una función de visibilidad publica
    //Tipo de dato que va a retornar sería un string
    //Nombre de la función con (parametros)
    //Estructura: modificador_acceso tipo_dato_retorno_nombre(){}
    //Función
    public String informacion_vehiculo() {
        //Declarar variables a nivel local de la función
        String placa = "TIC202";
        int modelo = 2021;
        String marca = "MINTIC";
        String mensaje = placa + " " + modelo + " " + marca;
        //Retornamos un tipo String
        return mensaje;
    }
    
    //Cuando se trabaj con Método en java se debe utilizar la palabra 
    //reservada void
    public void informacion_vehiculo_m(){
        String placa = "TIC202";
        int modelo = 2021;
        String marca = "MINTIC";
        System.out.println(placa + " " + modelo + " " + marca);
    }
}
