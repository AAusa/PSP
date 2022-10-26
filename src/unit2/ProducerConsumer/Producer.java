package unit2.ProducerConsumer;

public class Producer extends Thread {
    Container c;

    public Producer(Container c) {
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 0; ;i++) {
            try {
                c.write("Product " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
