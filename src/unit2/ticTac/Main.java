package unit2.ticTac;

import unit2.ticTac.Hilo;

public class Main {
    public static void main(String[] args) {
        Hilo h1 = new Hilo("TIC");
        Thread t1 = new Thread(h1);
        t1.start();
        Hilo h2 = new Hilo("TAC");
        Thread t2 = new Thread(h2);
        t2.start();
    }
}
