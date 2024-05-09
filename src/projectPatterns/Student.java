/**/
package projectPatterns;

/**
 *
 * @author Somaya
 */
public class Student extends Account implements StudentFeature,Observer {
    
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
    //adapter حيستنى لين تجيه المعلومة من ستيودينت ديكوريتور
    @Override
    public String getDetails() {
        return "Standard Student: " + this.getName();
    }
    public void update() {
        System.out.println("Notification: Your subjects or exams have been updated.");
    }
    
}
