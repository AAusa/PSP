package unit2.ProducerConsumer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Container c = new Container();
        ArrayList<Thread> people = new ArrayList<>();
        Thread producer = new Thread(new Producer(c));
        producer.start();
        Thread consumer = new Thread(new Consumer(c));
        consumer.start();
    }
}
