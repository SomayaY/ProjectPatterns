/**/
package projectPatterns;

import java.util.ArrayList;

/**
 *
 * @author Somaya
 */
public class Exam implements Observable{
    
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
    
    private ArrayList<Observer> observers = new ArrayList<>();

//    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

//    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

//    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    
}
