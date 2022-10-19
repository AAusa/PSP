package unit1;

import java.io.IOException;

public class Ej3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder a = new ProcessBuilder();
        a.command("cmd", "/C", "dir");
        Process p = a.start();
        p.waitFor();
        String solution = (p.exitValue() == 0) ? "good " : "bad ";
        solution += p.exitValue();
        System.out.println(solution);

        ProcessBuilder b = new ProcessBuilder();
        b.command("cmd", "/C", "asd");
        Process p1 = b.start();
        p1.waitFor();
        String solution2 = (p1.exitValue() == 0) ? "good " : "bad ";
        solution2 += p1.exitValue();
        System.out.println(solution2);
    }
}
