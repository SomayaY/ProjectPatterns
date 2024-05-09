/**/
package projectPatterns;

import java.util.ArrayList;
/**
 *
 * @author Somaya
 */
public class Subject implements Observable{
    
    private String name;
    private int id;
    private String professor;
    private ArrayList<Exam> exams;
  
    public Subject(int id, String name, String professor) {
        setId(id);
        setName(name);
        setProfessor(professor);
        this.exams = new ArrayList<Exam>();
    }
    
    private void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    private void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    private void setProfessor(String professor) {
        this.professor = professor;
    }
    
    public String getProfessor() {
        return professor;
    }

    public void setExams(ArrayList<Exam> exams) {
        this.exams = exams;
    }
    
    public ArrayList<Exam> getExams() {
        return exams;
    }
    
    public String printDetails() {
        return this.getId() + "," + this.getName() + "," + this.getProfessor();
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
