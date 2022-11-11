package unit2.dinningPhilosophers2.dinningPhilosophers;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Philosopher2 extends Thread{
    String name;
    Chopstick2 cLeft = new Chopstick2();
    Chopstick2 cRight = new Chopstick2();
    int counter = 1;

    public Philosopher2(String name, Chopstick2 cLeft, Chopstick2 cRight) {
        this.name = name;
        this.cLeft = cLeft;
        this.cRight = cRight;
    }

    @Override
    public void run() {
        while(true) {
            try {
                think();
                eat();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void think() throws InterruptedException {
        Thread.sleep(2000);
    }

    public void eat() throws InterruptedException {
        if (cRight.tryLock(0, TimeUnit.SECONDS)) {
            try {
                cRight.taken(name+ " right");
                if (cLeft.tryLock(0, TimeUnit.SECONDS)) {
                    try {
                        cLeft.taken(name+ " left");
                        System.out.println(name + " has eaten: " + counter++ + " times");
                    } finally {
                        cLeft.unlock();
                    }
                }
            } finally {
                cRight.unlock();
            }
        } else {
            cLeft.taken(name);
            cRight.taken(name);
        }
    }



}
