/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculoproject;

/**
 *
 * @author Usuario
 */
public class VehiculoClass {

    //1. Declarar las variables globales con tipo de visibilidad privada
    //2. Encapsulate fields. Clic secundario> Refactor > Encapsulate Fields (GET Y SET)
    //3. Insertar método ejecutor de la clase
    //4. Creación del método o de la función que nos permite consultar la informaión del vehículo
    private String placa;
    private String marca;
    private int modelo;
    private int cilindraje;
    private boolean soat_al_dia;
    private String fecha_matricula_vehiculo;

    //Los métodos utilizan la palabra reservada VOID(VACÍO)
    //Las funciones no utilizan VOID pero si el tipo de dato que retornan
    public VehiculoClass(String placa, String marca, int modelo, int cilindraje, boolean soat_al_dia, String fecha_matricula_vehiculo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.soat_al_dia = soat_al_dia;
        this.fecha_matricula_vehiculo = fecha_matricula_vehiculo;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cilindraje
     */
    public int getCilindraje() {
        return cilindraje;
    }

    /**
     * @param cilindraje the cilindraje to set
     */
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    /**
     * @return the soat_al_dia
     */
    public boolean isSoat_al_dia() {
        return soat_al_dia;
    }

    /**
     * @param soat_al_dia the soat_al_dia to set
     */
    public void setSoat_al_dia(boolean soat_al_dia) {
        this.soat_al_dia = soat_al_dia;
    }

    /**
     * @return the fecha_matricula_vehiculo
     */
    public String getFecha_matricula_vehiculo() {
        return fecha_matricula_vehiculo;
    }

    /**
     * @param fecha_matricula_vehiculo the fecha_matricula_vehiculo to set
     */
    public void setFecha_matricula_vehiculo(String fecha_matricula_vehiculo) {
        this.fecha_matricula_vehiculo = fecha_matricula_vehiculo;
    }

    //La función debe retornar una expresión
    //El tipo de dato de la expresión que retorna un String
    public String funcion_consultar_info_v() {
        String soat;
        //Le asignamos el valor de la variable dependiendo del condicional que se active
        if (isSoat_al_dia() == true) {
            soat = "Pago";
        } else {
            soat = "No pago";
        }
        return "******FORMA I: Función******\n\nInformación del vehículo\n     >> Placa: "
                + getPlaca() + "\n     >> Marca: " + getMarca() + "\n     >> Modelo: "
                + getModelo() + "\n     >> Cilindraje: " + getCilindraje() + "\n     >> Soat al día: "
                + soat;
    }

    //El método lo debemos declarar utilizando la palabra reservada VOID
    public void metodo_consultar_info_v() {
        String soat;
        //Le asignamos el valor de la variable dependiendo del condicional que se active
        if (isSoat_al_dia() == true) {
            soat = "Pago";
        } else {
            soat = "No pago";
        }
        System.out.println("\n\n******FORMA II: Método******\n\nInformación del vehículo\n     >> Placa: "
                + getPlaca() + "\n     >> Marca: " + getMarca() + "\n     >> Modelo: " + getModelo()
                + "\n     >> Cilindraje: " + getCilindraje() + "\n     >> Soat al día: "
                + soat);
    }
    
    public void metodo_consulta_vehiculo_por_placa(String placa) {
        if (getPlaca().equals(placa)) {
            String soat;
            //Le asignamos el valor de la variable dependiendo del condicional que se active
            if (isSoat_al_dia() == true) {
                soat = "Pago";
            } else {
                soat = "No pago";
            }
            System.out.println("\nPlaca consultada: "
                    + getPlaca() + "\n     >> Marca: " + getMarca() + "\n     >> Modelo: " + getModelo()
                    + "\n     >> Cilindraje: " + getCilindraje() + "\n     >> Soat al día: "
                    + soat);
        } else {
            System.out.println("Placa de vehículo no registrado");
        }
    }
}
