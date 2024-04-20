/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectPatterns;

/**
 *
 * @author Somaya
 */
public class Student extends Account {
    
    private String nationalId;
    
    public Student(String name, String nationalid) {
        super(name);
    }
    
    private void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
    
    public String getNationalId() {
        return nationalId;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + this.getName() + ", NID: " + this.getNationalId());
    }
}
