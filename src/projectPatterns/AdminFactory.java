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
public class AdminFactory implements AccountFactory {
    @Override
    public Account selectAccount(String name, String password) {
        return new Admin(name, password);
    }
}
