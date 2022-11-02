package unit2.Parking;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Parking p = new Parking();
        for(int i = 0; i < 10; i++) {
            Thread Car = new Thread(new Car(p, i));
            Car.start();
        }

    }
}
