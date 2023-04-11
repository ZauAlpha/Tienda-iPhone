public class Galaxy implements Observer, Display {
    private String version;
    private Subject tienda;

    public Galaxy(Subject tienda) {
        this.tienda = tienda;
        tienda.registerObserver(this);
    }

    @Override
    public void update(String version) {
        this.version = version;
        display();
    }

    @Override
    public void display() {
        System.out.println("Nueva version de Galaxy: " + version);
    }

}
