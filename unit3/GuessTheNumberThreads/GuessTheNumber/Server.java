package unit3.GuessTheNumberThreads.GuessTheNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(10);
        System.out.println(number);
        String line = "";
        try {
            ServerSocket serverSocket = new ServerSocket(7000);
            while(true) {
                System.out.println("New client operation");
                Socket clientSocket = serverSocket.accept();
                PrintWriter output = new PrintWriter(clientSocket.getOutputStream(),true);
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                try {
                    int answer =  Integer.parseInt(input.readLine());
                    if(number == answer) {
                        line = "You guess the number!!";
                    }
                    else {
                        line = "You do not guess the number!!";
                    }
                }
                catch (NumberFormatException e) {
                    line = "You must introduce a number";
                }
                output.println(line);
                // Clean buffers
                clientSocket.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
