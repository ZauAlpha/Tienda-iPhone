import java.util.ArrayList;

public class Tienda implements Subject{
    String dueño;
    private ArrayList<Observer> observers;
    Tienda() {
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String version) {
        for (Observer observer : observers) {
            observer.update(version);
        }
    }
}
