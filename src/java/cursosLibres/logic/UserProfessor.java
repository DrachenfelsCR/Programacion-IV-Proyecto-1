/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosLibres.logic;

import java.util.ArrayList;

public class UserProfessor extends User {
    //Attributes
    private ArrayList<String> ArrSpecialties = new ArrayList<String>();
    //Methods
    public UserProfessor(String rol, String id, String name, String email, String phoneNumber) {
        super(rol, id, name, email, phoneNumber);
    }

    public ArrayList<String> getArrSpecialties() {
        return ArrSpecialties;
    }

    public void setArrSpecialties(ArrayList<String> ArrSpecialties) {
        this.ArrSpecialties = ArrSpecialties;
    }

    
}
