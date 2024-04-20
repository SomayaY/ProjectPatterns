/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectPatterns;

import java.util.ArrayList;

/**
 *
 * @author Somaya
 */
public class Admin extends Account {
    
    private final String pass = "123123";
    private String password;
    
    public Admin(String name, String password) {
        super(name);
        this.password = password;
    }
    
    public void addSubject(Subject subject) {
        subjects = getSubjects();
        subjects.add(subject);
    }
    
    public void removeSubject(int subjectId) {
        subjects = getSubjects();
        for (int i = 0; i < subjects.size(); i++) {
            Subject sub = subjects.get(i);
            if(sub.getId() == subjectId) {
                subjects.remove(i);
            }
        }
    }
    
    public void addExam(Exam exam) {
        for (int i = 0; i < subjects.size(); i++) {
            Subject sub = subjects.get(i);
            if(sub.getId() == exam.getSubjectId()) {
                ArrayList<Exam> exams = sub.getExams();
                exams.add(exam);
                sub.setExams(exams);
            }
        }
    }
    
    public void removeExam(int examId) {
        for (int i = 0; i < subjects.size(); i++) {
            Subject sub = subjects.get(i);
            ArrayList<Exam> exams = sub.getExams();
            for (int v = 0; v < exams.size(); v++) {
                Exam examg = exams.get(v);
                if(examg.getId() == examId) {
                    exams.remove(v);
                }
            }
            sub.setExams(exams);
        }
    }
    
    public boolean login() {
        return this.password.equals(pass);
    }
    
}
