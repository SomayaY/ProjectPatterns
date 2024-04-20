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
public class Exam {
    
    private int subjectId;
    private int id;
    private String date;
    private String examClass;
    private String coordinates;
    
    
    public Exam(int id, int subjectId, String examDate, String examClass, String coordinates) {
        this.setId(id);
        this.setSubjectId(subjectId);
        this.setDate(examDate);
        this.setExamClass(examClass);
        this.setCoordinates(coordinates);
    }
    
    public int getId() {
        return id;
    }
    
    private void setId(int id) {
        this.id = id;
    }
    
    public String getDate() {
        return date;
    }
    
    private void setDate(String date) {
        this.date = date;
    }
    
    public String getExamClass() {
        return examClass;
    }
    
    private void setExamClass(String examClass) {
        this.examClass = examClass;
    }
    
    public String getCoordinates() {
        return coordinates;
    }
    
    private void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }
    
    private void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }
    
    public int getSubjectId() {
        return subjectId;
    }
    
    public String printDetails() {
        return "Exam ID: " + this.getId() + "\nDate: " + this.getDate() + "\nExam class: " + this.getExamClass() + "\nCoordinates: " + this.getCoordinates();
    }
    
}
