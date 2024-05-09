/*Abstract facory */
package projectPatterns;

/**
 *
 * @author ysasm
 */
public class StudentFactory implements AccountFactory {
    @Override
    public Account selectAccount(String name, String nlId) {
        return new Student(name, nlId);
    }
}
