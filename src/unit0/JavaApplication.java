package unit0;

public class JavaApplication {
    public static void main(String[] args) {

        Tarea t1 = new Tarea("t1");
        Tarea t2 = new Tarea("t2");
        t1.start();
        t2.start();
        System.out.println("Fin");
    }
}

