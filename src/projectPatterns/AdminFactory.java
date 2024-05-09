/*Abstract facory*/
package projectPatterns;

/**
 *
 * @author ysasm
 */
public class AdminFactory implements AccountFactory {
    @Override
    public Account selectAccount(String name, String password) {
        return new Admin(name, password) {
            @Override
            public void update() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
}
