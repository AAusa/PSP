package unit0;

public class Tarea extends Thread {
    private String name;

    public Tarea(String name) {
        this.name = name;
    }

    public void run() {
            for(int i = 1; i <= 500; i++) {
                System.out.println(name+" "+i);
            }
        }
}
