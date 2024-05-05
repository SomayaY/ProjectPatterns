/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectPatterns;

/**
 *
 * @author ysasm
 */
public class HonorsStudentDecorator extends StudentDecorator {
    public HonorsStudentDecorator(StudentFeature decoratedStudent) {
        super(decoratedStudent);
    }

    @Override
    public String getDetails() {
        return decoratedStudent.getDetails() + " | Honors Student";
    }
}
