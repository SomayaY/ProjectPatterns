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
public abstract class StudentDecorator implements StudentFeature {
    protected StudentFeature decoratedStudent;

    public StudentDecorator(StudentFeature decoratedStudent) {
        this.decoratedStudent = decoratedStudent;
    }

    @Override
    public String getName() {
        return decoratedStudent.getName();
    }

    @Override
    public String getDetails() {
        return decoratedStudent.getDetails();
    }
}
