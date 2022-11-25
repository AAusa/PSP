package unit3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        String exit = "";
        try {
            ServerSocket serverSocket = new ServerSocket(7000);
            while(true) {
                System.out.println("New client operation");
                Socket clientSocket = serverSocket.accept();
                PrintWriter output = new PrintWriter(clientSocket.getOutputStream(),true);
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String line = input.readLine();
                while(!line.equalsIgnoreCase("Exit")) {
                    System.out.println(line+".");
                    output.println(line+" back");
                    line = input.readLine();
                }
                // Clean buffers
                clientSocket.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
