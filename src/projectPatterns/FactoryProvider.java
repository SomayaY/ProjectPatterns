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
