package unit3.GuessTheNumberThreads.GuessTheNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) {
        String exit = "";
        Scanner sc = new Scanner(System.in);
        try {
            Socket socketCliente = new Socket("localhost", 7000);
            PrintWriter output = new PrintWriter(socketCliente.getOutputStream(),true);
            BufferedReader input = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
            String message = "";
            System.out.println("Introduce a number:");
            message = sc.nextLine();
            output.println(message);
            System.out.println("The server answers: "+input.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
