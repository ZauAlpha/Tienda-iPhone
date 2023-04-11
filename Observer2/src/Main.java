public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        for(int i = 0; i < 10; i++) {
            iPhone iPhone = new iPhone(tienda);
        }
        tienda.notifyObservers("iOS 14.2"); 

    }
}
