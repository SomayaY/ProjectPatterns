/* facory*/
package projectPatterns;

/**
 *
 * @author ysasm
 */
public interface AccountFactory {

    public Account selectAccount(String name, String password);
    
}
