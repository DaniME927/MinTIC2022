/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

/**
 *
 * @author usuario
 */
public class PersonClass {
    //1. Declarar las variables de la superclase con visibilidad private
    private String name;
    private String lastname;
    private int document_ID;
    private String email;

    //2. Insertar el constructor de la clase

    public PersonClass() {
    }

    
    public PersonClass(String name, String lastname, int document_ID, String email) {
        this.name = name;
        this.lastname = lastname;
        this.document_ID = document_ID;
        this.email = email;
    }

    //3. Insertar GETTER y SETTER

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the document_ID
     */
    public int getDocument_ID() {
        return document_ID;
    }

    /**
     * @param document_ID the document_ID to set
     */
    public void setDocument_ID(int document_ID) {
        this.document_ID = document_ID;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}