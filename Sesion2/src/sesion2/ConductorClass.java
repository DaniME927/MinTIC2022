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
public class ConductorClass {
    //Nombre, matrícula, categoria, multa, nro_documento
    String nombre_propietario = "";
    int nro_documento = 0;
    char categoria;
    String tipo_infraccion = "";
    boolean multar = false;
    
    public boolean asignar_multa(int numero_doc, String nombre_conductor, String infraccion){
        nombre_propietario = nombre_conductor;
        nro_documento = numero_doc;
        tipo_infraccion = infraccion;
        
        if (tipo_infraccion != ""){
            System.out.println(nombre_propietario + " se le encontró una multa por la infracción " 
                    + tipo_infraccion);
            multar = true;
        }else{
            System.out.println(nombre_propietario + " felicitacines. Te salvaste de ser multado");
        }
        return multar;
    }
    
    public void asignar_multa_m(int numero_doc, String nombre_conductor, String infraccion){
        nombre_propietario = nombre_conductor;
        nro_documento = numero_doc;
        tipo_infraccion = infraccion;
        
        if (tipo_infraccion != ""){
            System.out.println(nombre_propietario + " se le encontró una multa por la infracción " 
                    + tipo_infraccion);
            multar = true;
        }else{
            System.out.println(nombre_propietario + " Felicitacines. Te salvaste de ser multado");
        }
    }
    
    public boolean asignar_multa_f(int numero_doc, String nombre_conductor, String infraccion){
        nombre_propietario = nombre_conductor;
        nro_documento = numero_doc;
        tipo_infraccion = infraccion;
        
        if (tipo_infraccion != ""){
            System.out.println(nombre_propietario + " se le encontró una multa por la infracción " 
                    + tipo_infraccion);
            multar = true;
        }else{
            System.out.println(nombre_propietario + " Felicitacines. Te salvaste de ser multado");
        }
        return multar;
    }
}
