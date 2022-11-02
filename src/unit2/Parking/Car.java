package unit2.Parking;

public class Car extends Thread {
    Parking p;
    int id;
    public Car(Parking p, int id) {
        this.p = p;
        this.id = id;
        System.out.println("Car " + id + " can park");
    }

    @Override
    public void run() {
        try {
            p.enter(id);
            Thread.sleep(2000);
            p.leave(id);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
