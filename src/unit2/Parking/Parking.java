package unit2.Parking;

public class Parking {
    int amount = 6, counter = 0;
    boolean park;

    public Parking() {
        park = true;
    }
    public synchronized void enter(int id) throws InterruptedException {
        while(counter >= amount) {
            System.out.println("Car " + id + " can not park");
            wait();
        }
        counter++;
        System.out.println("Car " + id + " entered");
    }

    public synchronized void leave(int id) throws InterruptedException {
        counter--;
        notifyAll();
        System.out.println("Car " + id + " leave parking space");
    }
}
