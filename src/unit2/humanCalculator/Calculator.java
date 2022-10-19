package unit2.humanCalculator;

import java.util.Random;
import java.util.Scanner;

public class Calculator extends Thread {
    boolean play = true;
    int n1, n2, solution, tried, correct = 0, total = 0;
    public Calculator() {

    }
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        try {
            while(play) {
                n1 = r.nextInt(0,100);
                n2 = r.nextInt(0,100);
                solution = n1 + n2;
                System.out.print(n1 + "+" + n2 + "= ");
                tried = sc.nextInt();
                if(solution == tried) {
                    System.out.println("Correct");
                    correct++;
                }
                else {
                    System.out.println("Incorrect");
                }
                total++;
            }
        } catch(Exception e)
        {
            System.out.println(solution());
        }
    }

    public String solution() {
        return "In 10 s. you guess " + correct + " of " + total;
    }
}
