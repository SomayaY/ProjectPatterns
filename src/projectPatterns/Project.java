/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectPatterns;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Somaya
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        filesCreate();
        
        System.out.println("----------- login -----------");
        System.out.println("1- student");
        System.out.println("2- admin");
        System.out.println("----------- login -----------");
        
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        
        if(select == 1) {
            
            System.out.println("type name: ");
            String name = input.next();
            System.out.println("type national id: ");
            String nactionalid = input.next();
            
            if(nactionalid.length() != 10) {
                System.out.println("national id incorrect");
                return;
            }
            
            Student stu = new Student(name, nactionalid);
            
            dataToArray(stu);
            
            
            System.out.println("Welcome, " + stu.getName());
            
            
            boolean running = true;
            
            while(running) {
            
                System.out.println("------- student menu -------");
                System.out.println("1- subject list");
                System.out.println("2- exam list");
                System.out.println("3- search exams by subject id");
                System.out.println("0- exit");
                System.out.println("------- student menu -------");

                int selectStudent = input.nextInt();
                
                

                ArrayList<Subject> subs = stu.getSubjects();
                if(selectStudent == 0) {
                    running = false;
                } else if(selectStudent == 1) {
                    System.out.println("------- subject list -------");
                    System.out.println("ID,subject name,professor name");
                    for (int i = 0; i < subs.size(); i++) {
                        Subject sub = subs.get(i);
                        System.out.println(sub.printDetails());
                    }
                    System.out.println("------- subject list -------");
                } else if(selectStudent == 2) {
                    System.out.println("------- exam list -------");
                    for (int i = 0; i < subs.size(); i++) {
                        Subject sub = subs.get(i);
                        ArrayList<Exam> exams = sub.getExams();
                        for (int v = 0; v < exams.size(); v++) {
                            Exam exam = exams.get(v);
                            System.out.println("Subject name: " + sub.getName() + "\n" + exam.printDetails());
                            System.out.println("-----------------------------------------------");
                        }

                    }
                    System.out.println("------- exam list -------");
                } else if(selectStudent == 3) {
                    System.out.println("type subject id: ");
                    int subjectId = input.nextInt();
                    System.out.println("------- search exam -------");
                    boolean found = false;
                    boolean foundExam = false;
                    for (int i = 0; i < subs.size(); i++) {
                        Subject sub = subs.get(i);
                        if(sub.getId() == subjectId) {
                            found = true;
                            ArrayList<Exam> exams = sub.getExams();
                            for (int v = 0; v < exams.size(); v++) {
                                Exam exam = exams.get(v);
                                foundExam = true;
                                System.out.println("Subject name: " + sub.getName() + "\n" + exam.printDetails());
                                System.out.println("-----------------------------------------------");
                            }
                        } 
                    }
                    
                    if(found == false) {
                        System.out.println("subject id not found.");
                    } else {
                        if(foundExam == false) {
                            System.out.println("exams not found.");
                        }
                    }
                    System.out.println("------- search exam -------");
                } else {
                    System.out.println("not found!");
                }
            }
            
           
            
        } else {
            
            
           
            System.out.print("type name: ");
            String name = input.next();
            System.out.print("type password: ");
            String password = input.next();
            
            Admin admin = new Admin(name, password);
            
            dataToArray(admin);
            
            if(admin.login()) {
                System.out.println("Welcome, " + admin.getName());
                boolean running = true;
                while(running) {
                    System.out.println("------- admin menu -------");
                    System.out.println("1- add subject");
                    System.out.println("2- remove subject");
                    System.out.println("3- add Exam");
                    System.out.println("4- remove Exam");
                    System.out.println("0- exit");
                    System.out.println("------- admin menu -------");

                    int selectAdmin = input.nextInt();

                    if(selectAdmin == 0) {
                        running = false;
                    } else if(selectAdmin == 1) {
                        System.out.print("type subject id: ");
                        int subjectId = input.nextInt();
                        System.out.print("type subject name: ");
                        String subjectName = input.next();
                        System.out.print("type professor name: ");
                        String professorName = input.next();
                        Subject subject = new Subject(subjectId, subjectName, professorName);
                        admin.addSubject(subject);
                        
                        System.out.println("Subject has been added successfully.");
                        
                        filesUpdate(admin.getSubjects());

                    } else if (selectAdmin == 2) {
                        System.out.println("type subject id: ");
                        int subjectId = input.nextInt();
                        admin.removeSubject(subjectId);
                        
                        System.out.println("Subject has been removed successfully.");
                        
                        filesUpdate(admin.getSubjects());

                    } else if (selectAdmin == 3) {
                        System.out.println("type exam id: ");
                        int examId = input.nextInt();
                        System.out.println("type subject id: ");
                        int subjectId = input.nextInt();
                        System.out.println("type date: ");
                        String date = input.next();
                        System.out.println("type class: ");
                        String examClass = input.next();
                        System.out.println("type coordinates: ");
                        String coordinates = input.next();
                        
                        System.out.println("coordinates: " + coordinates);

                        Exam exam = new Exam(examId, subjectId, date, examClass, coordinates);

                        admin.addExam(exam);
                        
                        System.out.println("Exam has been added successfully.");
                        
                        filesUpdate(admin.getSubjects());

                    } else if (selectAdmin == 4) {
                        System.out.println("type exam id: ");
                        int examId = input.nextInt();

                        admin.removeExam(examId);
                        
                        System.out.println("Exam has been removed successfully.");
                        
                        filesUpdate(admin.getSubjects());

                    } else {
                        System.out.println("not found!");
                    }

                    
                }
            }
            
            
        }
    }
    
    public static void dataToArray(Account user) throws FileNotFoundException {
        ArrayList<Subject> subjectsFile = subjectsData();
        ArrayList<Exam> ExamsFile = examsData();
        user.setSubjects(subjectsFile);
        
        for (int i = 0; i < user.getSubjects().size(); i++) {
            Subject sub = user.getSubjects().get(i);
            ArrayList<Exam> exams = new ArrayList<>();
            for (int v = 0; v < ExamsFile.size(); v++) {
                Exam ExamFile = ExamsFile.get(v);
                if(ExamFile.getSubjectId() == sub.getId()) {
                    exams.add(ExamFile);
                }
            }
            sub.setExams(exams);
        }
    }
    
    public static ArrayList<Subject> subjectsData() throws FileNotFoundException {
        Scanner s;
        ArrayList<Subject> subjects = new ArrayList<>();
        File file = new File("subjects.txt");
        s = new Scanner(file);
        while (s.hasNext()){
            String[] arr = s.nextLine().split(":");
            Subject subject = new Subject(Integer.parseInt(arr[0]),arr[1],arr[2]);
            subjects.add(subject);
        }
        
        return subjects;
    }
    
    public static ArrayList<Exam> examsData() throws FileNotFoundException {
        Scanner s;
        ArrayList<Exam> exams = new ArrayList<>();
        File file = new File("exams.txt");
        s = new Scanner(file);
        while (s.hasNext()){
            String[] arr = s.nextLine().split(":");
            Exam exam = new Exam(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),arr[2],arr[3],arr[4]);
            exams.add(exam);
        }
        
        return exams;
    }
    
    public static void filesCreate() throws IOException {
        File file = new File("subjects.txt");
        if(!file.exists()) {
            file.createNewFile();
        }
            
        File file2 = new File("exams.txt");
        if(!file2.exists()) {
           file2.createNewFile();
        }
    }
    
    public static void filesUpdate(ArrayList<Subject> subjects) throws IOException {
            FileWriter fwSubjects = new FileWriter("subjects.txt");
            FileWriter fwExams = new FileWriter("exams.txt");
            for (int i = 0; i < subjects.size(); i++) {
                Subject sub = subjects.get(i);
                fwSubjects.write(sub.getId() + ":" + sub.getName() + ":" + sub.getProfessor() + "\n");
  
                for (int v = 0; v < sub.getExams().size(); v++) {
                    Exam exam = sub.getExams().get(v);
                    if(exam.getSubjectId() == sub.getId()) {
                        fwExams.write(exam.getId() + ":" + exam.getSubjectId() + ":" + exam.getDate()+ ":" + exam.getExamClass() +  ":" + exam.getCoordinates()+ "\n");
                    }
                }
            
            }
            
            fwSubjects.close();
            fwExams.close();

    }
    

    
}
