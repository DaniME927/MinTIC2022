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
public class AdminClass{
    private int num_subordinates;

    public AdminClass() {
    }
    
    public AdminClass(int num_subordinates) {
        this.num_subordinates = num_subordinates;
    }

    /**
     * @return the num_subordinates
     */
    public int getNum_subordinates() {
        return num_subordinates;
    }

    /**
     * @param num_subordinates the num_subordinates to set
     */
    public void setNum_subordinates(int num_subordinates) {
        this.num_subordinates = num_subordinates;
    }
    
    public void crud_admin(){
        ArrayList<AdminClass> admin_list = new ArrayList<>();
        boolean exit_program = false;
        while (!exit_program) {}        
    }
}
