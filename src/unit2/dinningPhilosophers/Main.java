package unit2.dinningPhilosophers;

public class Main {
    public static void main(String[] args) {
        Chopstick c1 = new Chopstick();
        Chopstick c2 = new Chopstick();
        Chopstick c3 = new Chopstick();
        Chopstick c4 = new Chopstick();
        Chopstick c5 = new Chopstick();
        Thread p1 = new Thread(new Philosopher("p1", c1, c2));
        Thread p2 = new Thread(new Philosopher("p2", c2, c3));
        Thread p3 = new Thread(new Philosopher("p3", c3, c4));
        Thread p4 = new Thread(new Philosopher("p4", c4, c5));
        Thread p5 = new Thread(new Philosopher("p5", c1, c5));
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
}
