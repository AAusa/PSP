package unit2.dinningPhilosophers2.dinningPhilosophers;

public class Main2 {
    public static void main(String[] args) {
        Chopstick2 c1 = new Chopstick2();
        Chopstick2 c2 = new Chopstick2();
        Chopstick2 c3 = new Chopstick2();
        Chopstick2 c4 = new Chopstick2();
        Chopstick2 c5 = new Chopstick2();
        Thread p1 = new Thread(new Philosopher2("p1", c1, c2));
        Thread p2 = new Thread(new Philosopher2("p2", c2, c3));
        Thread p3 = new Thread(new Philosopher2("p3", c3, c4));
        Thread p4 = new Thread(new Philosopher2("p4", c4, c5));
        Thread p5 = new Thread(new Philosopher2("p5", c5, c1));
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
}
