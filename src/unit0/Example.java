package unit0;

import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder a = new ProcessBuilder();
        a.command("notepad.exe");
        Process p = a.start();
        p.waitFor();
        System.out.println("Fin");
    }
}
