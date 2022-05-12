/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosLibres.logic;

public class record {
    //Attributes
    private String idCourse;
    private String courseName;
    private double grade;
    //Methods

    public record(String idCourse, String courseName, double grade) {
        this.idCourse = idCourse;
        this.courseName = courseName;
        this.grade = grade;
    }

    public String getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(String idCourse) {
        this.idCourse = idCourse;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    } 
    
}
