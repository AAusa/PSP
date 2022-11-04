package unit2.dinningPhilosophers;

public class Philosopher extends Thread{
    String name;
    Chopstick cLeft = new Chopstick();
    Chopstick cRight = new Chopstick();

    public Philosopher(String name, Chopstick cLeft, Chopstick cRight) {
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
        synchronized (cRight) {
            cRight.taken(name);
            synchronized (cLeft) {
                cLeft.taken(name);
                System.out.println(name+" is eating");
                cRight.release(name);
            }
            cLeft.release(name);
        }
    }



}
