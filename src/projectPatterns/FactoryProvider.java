/*Abstract facory */
package projectPatterns;

/**
 *
 * @author ysasm
 */
public class FactoryProvider {
    public static AccountFactory getFactory(String userType) {
        if (userType.equalsIgnoreCase("student")) {
            return new StudentFactory();
        } else if (userType.equalsIgnoreCase("admin")) {
            return new AdminFactory();
        }
        throw new IllegalArgumentException("Unknown user type " + userType);
    }
}
