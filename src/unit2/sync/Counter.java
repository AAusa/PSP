package unit2.sync;

public class Counter {
    int c;
    public Counter() {

    }
    public synchronized void increment() {
        c++;
    }

    public int getCounter() {
        return c;
    }
}
