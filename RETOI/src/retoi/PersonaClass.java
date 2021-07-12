/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoi;


/**
 *
 * @author Usuario
 */
public class PersonaClass {
    private String nombre;
    private String tipo_documento;
    private int nro_documento;
    private int edad;
    private String genero;
    private int peso;
    private int estatura;
    private String pais_residencia;
    private String departamento_residencia;
    private String municipio_residencia;
    private int nro_contacto;
    private String estado_civil;
    private int cantidad_hijos;
    private boolean discapacidad;
    private boolean actual_estudio;
    private String profesion;

    public PersonaClass(String nombre, String tipo_documento, int nro_documento, int edad, String genero, int peso, int estatura, String pais_residencia, String departamento_residencia, String municipio_residencia, int nro_contacto, String estado_civil, int cantidad_hijos, boolean discapacidad, boolean actual_estudio, String profesion) {
        this.nombre = nombre;
        this.tipo_documento = tipo_documento;
        this.nro_documento = nro_documento;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.estatura = estatura;
        this.pais_residencia = pais_residencia;
        this.departamento_residencia = departamento_residencia;
        this.municipio_residencia = municipio_residencia;
        this.nro_contacto = nro_contacto;
        this.estado_civil = estado_civil;
        this.cantidad_hijos = cantidad_hijos;
        this.discapacidad = discapacidad;
        this.actual_estudio = actual_estudio;
        this.profesion = profesion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo_documento
     */
    public String getTipo_documento() {
        return tipo_documento;
    }

    /**
     * @param tipo_documento the tipo_documento to set
     */
    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    /**
     * @return the nro_documento
     */
    public int getNro_documento() {
        return nro_documento;
    }

    /**
     * @param nro_documento the nro_documento to set
     */
    public void setNro_documento(int nro_documento) {
        this.nro_documento = nro_documento;
    }
 
    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the estatura
     */
    public int getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the pais_residencia
     */
    public String getPais_residencia() {
        return pais_residencia;
    }

    /**
     * @param pais_residencia the pais_residencia to set
     */
    public void setPais_residencia(String pais_residencia) {
        this.pais_residencia = pais_residencia;
    }

    /**
     * @return the departamento_residencia
     */
    public String getDepartamento_residencia() {
        return departamento_residencia;
    }

    /**
     * @param departamento_residencia the departamento_residencia to set
     */
    public void setDepartamento_residencia(String departamento_residencia) {
        this.departamento_residencia = departamento_residencia;
    }

    /**
     * @return the municipio_residencia
     */
    public String getMunicipio_residencia() {
        return municipio_residencia;
    }

    /**
     * @param municipio_residencia the municipio_residencia to set
     */
    public void setMunicipio_residencia(String municipio_residencia) {
        this.municipio_residencia = municipio_residencia;
    }

    /**
     * @return the nro_contacto
     */
    public int getNro_contacto() {
        return nro_contacto;
    }

    /**
     * @param nro_contacto the nro_contacto to set
     */
    public void setNro_contacto(int nro_contacto) {
        this.nro_contacto = nro_contacto;
    }

    /**
     * @return the estado_civil
     */
    public String getEstado_civil() {
        return estado_civil;
    }

    /**
     * @param estado_civil the estado_civil to set
     */
    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    /**
     * @return the cantidad_hijos
     */
    public int getCantidad_hijos() {
        return cantidad_hijos;
    }

    /**
     * @param cantidad_hijos the cantidad_hijos to set
     */
    public void setCantidad_hijos(int cantidad_hijos) {
        this.cantidad_hijos = cantidad_hijos;
    }

    /**
     * @return the discapacidad
     */
    public boolean isDiscapacidad() {
        return discapacidad;
    }

    /**
     * @param discapacidad the discapacidad to set
     */
    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    /**
     * @return the actual_estudio
     */
    public boolean isActual_estudio() {
        return actual_estudio;
    }

    /**
     * @param actual_estudio the actual_estudio to set
     */
    public void setActual_estudio(boolean actual_estudio) {
        this.actual_estudio = actual_estudio;
    }

    /**
     * @return the profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    public void consultar_informacion_persona(){
        
        String discapacidad;
        if(isDiscapacidad() == true){
            discapacidad = "Si";
        }else{
            discapacidad = "No";
        }
        
        String estudio;
        if(isActual_estudio() == true){
            estudio = "Si";
        }else{
            estudio = "No";
        }
                
        System.out.println("Información personal:\n    >>>> Nombre: " + getNombre() 
                + "\n    >>>> Tipo de documento: " + getTipo_documento() 
                + "\n    >>>> Número de documento: " + getNro_documento() + "\n    >>>> Edad: " 
                + getEdad() +  "\n    >>>> Género: " 
                + getGenero() + "\n    >>>> Peso: " + getPeso() + " kg" + "\n    >>>> Estatura: " 
                + getEstatura() + " cm" + "\n    >>>> País de residencia: " + getPais_residencia() 
                + "\n    >>>> Departamento de residencia: " + getDepartamento_residencia() 
                + "\n    >>>> Municipio de residencia: " + getMunicipio_residencia() 
                + "\n    >>>> Número de contacto: " + getNro_contacto() + "\n    >>>> Estado civil: " 
                + getEstado_civil() +"\n    >>>> Cantidad de hijos: " + getCantidad_hijos() 
                + "\n    >>>> ¿Sufre de alguna discapacidad?: " + discapacidad 
                + "\n    >>>> Actualmente, ¿Estudia?: " + estudio + "\n    >>>> Profesión: " 
                + getProfesion());
    }
    
    public String ingresar_informacion_persona(String nombre_p, String t_documento, int n_documento, 
            int edad_p, String genero_p, int peso_p, int estatura_p, 
            String pais_res, String dep_res, String mun_res, int nro_contacto_p, String estado_civil_p, 
            int cant_hijos, boolean discapacidad_p, boolean actual_estudio_p, String profesion_p){
        
        nombre = nombre_p;
        tipo_documento = t_documento;
        nro_documento = n_documento;
        edad = edad_p;
        genero = genero_p;
        peso = peso_p;
        estatura = estatura_p;
        pais_residencia = pais_res;
        departamento_residencia = dep_res;
        municipio_residencia = mun_res;
        nro_contacto = nro_contacto_p;
        estado_civil = estado_civil_p;
        cantidad_hijos = cant_hijos;
        discapacidad = discapacidad_p;
        actual_estudio = actual_estudio_p;
        profesion = profesion_p;
        
        String discapacidad2;
        if(discapacidad_p == true){
            discapacidad2 = "Si";
        }else{
            discapacidad2 = "No";
        }
        
        String estudio1;
        if(actual_estudio_p == true){
            estudio1 = "Si";
        }else{
            estudio1 = "No";
        }
        
        System.out.println("Información personal:\n    >>>> Nombre: " + getNombre() 
                + "\n    >>>> Tipo de documento: " + nombre + "\n    >>>> Número de documento: " 
                + nro_documento + "\n    >>>> Edad: " + edad +  "\n    >>>> Género: " + genero + "\n    >>>> Peso: " + peso + " kg" 
                + "\n    >>>> Estatura: " + estatura + " cm" + "\n    >>>> País de residencia: " + pais_residencia 
                + "\n    >>>> Departamento de residencia: " + departamento_residencia 
                + "\n    >>>> Municipio de residencia: " + municipio_residencia 
                + "\n    >>>> Número de contacto: " + nro_contacto + "\n    >>>> Estado civil: " 
                + estado_civil +"\n    >>>> Cantidad de hijos: " + cantidad_hijos 
                + "\n    >>>> ¿Sufre de alguna discapacidad?: " + discapacidad2 
                + "\n    >>>> Actualmente, ¿Estudia?: " + estudio1 + "\n    >>>> Profesión: " 
                + profesion);
        return "***FIN***";
    }
}
