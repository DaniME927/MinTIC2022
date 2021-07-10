/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculoproject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VehiculoProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cuando trabajamos con fechas, debes instanciar la clase Date
        Date inst_fecha_actual = new Date();
        Scanner inst_scanner = new Scanner(System.in);
        //Modificamos el formato largo de la fecha utilizando la clase SimpleDateFormat
        //System.out.println(inst_fecha_actual);
        SimpleDateFormat inst_cambiar_formato = new SimpleDateFormat("dd/MM/yyy");
        //System.out.println(inst_cambiar_formato.format(inst_fecha_actual));
        
        // 1. Instanciar la clase vehiculo
        VehiculoClass inst_vehiculo = new VehiculoClass(
                "MIN2021", "MisiónTIC", 2022, 2000, false, inst_cambiar_formato.format(inst_fecha_actual));
        // 2. Mediante la instancia accedemos a las funciones del método de la clase
        System.out.println(inst_vehiculo.funcion_consultar_info_v());
        inst_vehiculo.metodo_consultar_info_v();
        
        //Consultar por placa del vehículo
        System.out.println("\nIngrese la placa a consultar: ");
        String placa_consultar = inst_scanner.nextLine();
        inst_vehiculo.metodo_consulta_vehiculo_por_placa(placa_consultar);
    }

}
