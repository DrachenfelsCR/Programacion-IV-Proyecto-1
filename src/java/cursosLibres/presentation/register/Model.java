/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosLibres.presentation.register;

/**
 *
 * @author David
 */
import cursosLibres.logic.User;
import cursosLibres.logic.UserStudent;
/**
 *
 * @author David
 */
public class Model {
    UserStudent newStudent ; 

    public Model(UserStudent newStudent) {
        this.newStudent = newStudent;
    }

    public UserStudent getNewStudent() {
        return newStudent;
    }

    public void setNewStudent(UserStudent newStudent) {
        this.newStudent = newStudent;
    }

    
}

