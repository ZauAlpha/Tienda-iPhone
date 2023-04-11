public class iPhone implements Observer, Display {
    private String version;
    private Subject tienda;
    private Nombre dueño;

    public iPhone(Subject tienda) {
        this.tienda = tienda;
        tienda.registerObserver(this);
        dueño = Nombre.values()[(int) (Math.random() * Nombre.values().length)];

    }



    @Override
    public void update(String version) {
        this.version = version;
        display();
    }

    @Override
    public void display() {
        System.out.println("Hola "+dueño.toString() +" Hay una nueva version de iPhone: " + version);
    }
}

