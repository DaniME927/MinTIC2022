/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_pkg;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class CompanyClass {
    private String company_name;
    private String NIT;
    private String address;

    public CompanyClass(String company_name, String NIT, String address) {
        this.company_name = company_name;
        this.NIT = NIT;
        this.address = address;
    }

    /**
     * @return the company_name
     */
    public String getCompany_name() {
        return company_name;
    }

    /**
     * @param company_name the company_name to set
     */
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    /**
     * @return the NIT
     */
    public String getNIT() {
        return NIT;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void crud_company(){
        ArrayList<CompanyClass> company_list = new ArrayList<>();
        boolean exit_program = false;
        while (!exit_program) {}        
    }
    
}
