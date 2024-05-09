/*Observer interface*/
package projectPatterns;

/**
 *
 * @author ysasm
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
