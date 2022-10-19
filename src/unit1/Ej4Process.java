package unit1;

import java.io.IOException;

public class Ej4Process {
    public static void main(String[] args) throws IOException {
        ProcessBuilder p = new ProcessBuilder();
        p.command("java", "Ej4", "3", "2");
        p.start();

    }
}
