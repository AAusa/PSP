package unit2.ticTac;

public class Hilo implements Runnable {
    public Hilo(String word) {

    }

    @Override
    public void run() {
        boolean infinito = true;
        while(infinito) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("TIC");
        }
    }
}
