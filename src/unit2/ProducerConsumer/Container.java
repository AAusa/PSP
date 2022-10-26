package unit2.ProducerConsumer;

public class Container {
    String sentence;
    boolean newData;
    public Container() {
        newData = false;
    }
    public synchronized void write(String s) throws InterruptedException {
        while(newData) {
            wait();
        }
        sentence = s;
        System.out.println("Write: " + sentence);
        newData = true;
        notifyAll();
    }

    public synchronized String read() throws InterruptedException {
        while(!newData) {
            wait();
        }
        newData = false;
        notifyAll();
        return sentence;
    }
}
