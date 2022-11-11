package unit2.dinningPhilosophers2.dinningPhilosophers;

import java.util.concurrent.locks.ReentrantLock;

public class Chopstick2 extends ReentrantLock {
    public Chopstick2() {
        super(true);
    }

    public void taken(String name) {
        System.out.println(name + " take chopstick");
    }
    public void release(String name) {
        System.out.println(name + " release chopstick");
    }
}
