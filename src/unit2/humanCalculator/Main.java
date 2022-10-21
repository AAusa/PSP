package unit2.humanCalculator;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Ini");
        Calculator h1 = new Calculator();
        Thread t1 = new Thread(h1);
        t1.start();
        Thread.sleep(10000);
        //t1.stop();
        t1.interrupt();
        System.out.println("Take the last operation");

    }
}
