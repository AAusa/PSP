package unit2.sync;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        ArrayList<Thread> people = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            people.add(new Thread(new Person(c, i)));
        }
        for (Thread t: people) {
            t.start();
        }
        Thread.sleep(5000);
        System.out.println("Final counter: " + c.c);
    }
}
