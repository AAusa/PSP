package unit2.ProducerConsumer;

public class Consumer extends Thread {
    Container c;

    public Consumer(Container c) {
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 0; ;) {
            try {
                System.out.println("Read " + c.read());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
