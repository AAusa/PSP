package unit2.sync;

public class Person extends Thread {
    Counter c;
    int id;

    public Person(Counter c, int id) {
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
            Thread.yield();
        }
    }
}
