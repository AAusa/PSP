package unit3.GuessTheNumber;

import unit3.GuessTheNumberThreads.GuessTheNumber.ClientHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(7000);
            Random r = new Random();
            int number = r.nextInt(10);
            System.out.println("Random number generated is: "+number);
            while(true) {
                System.out.println("Ready for a new connection");
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected");

                ClientHandler clientSock = new ClientHandler(clientSocket, number);
                new Thread(clientSock).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
