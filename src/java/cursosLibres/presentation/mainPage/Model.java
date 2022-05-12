/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosLibres.presentation.mainPage;
import cursosLibres.logic.Course;
import cursosLibres.logic.User;
import java.util.ArrayList;
/**
 *
 * @author David
 */
public class Model {
    User currentUser; 
    ArrayList<Course> coursesInPromotion;

    public Model() {
        coursesInPromotion = new ArrayList<Course>();
    }
    
    
    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
        
}


