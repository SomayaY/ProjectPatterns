/**/
package projectPatterns;

import java.util.ArrayList;

/**
 *
 * @author Somaya
 */
public abstract class Account {
    
    private String name;
    ArrayList<Subject> subjects;
    
    public Account(String name) {
        setName(name);
    }
    
    private void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }
    
    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
    
    public abstract void displayInfo();

    
}
