/*command*/
package projectPatterns;

/**
 *
 * @author ysasm
 */
public class AddSubjectCommand implements Command {

    private Admin admin;
    private Subject subject;

    public AddSubjectCommand(Admin admin, Subject subject) {
        this.admin = admin;
        this.subject = subject;
    }

    @Override
    public void execute() {
        admin.addSubject(subject);
    }
}
