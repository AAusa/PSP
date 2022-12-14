package unit3.GuessTheNumberThreads.GuessTheNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;

public class ClientHandler implements Runnable {
// Constructor
        private final Socket clientSocket;
        private int number;
        public ClientHandler(Socket socket, int number) {
                this.clientSocket=socket;
                this.number = number;
        }

        public void run()
        {
                System.out.println("ClientHandler starts...");
                PrintWriter out=null;
                BufferedReader in=null;
                try {
                        out = new PrintWriter(clientSocket.getOutputStream(),true);
                        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                        String line =in.readLine();
                        try {
                                String messageReceived = line;
                                System.out.println("The client sends: "+messageReceived);
                                int answer =  Integer.parseInt(messageReceived);
                                if(number == answer) {
                                        line = "You guess the number!!";
                                }
                                else {
                                        line = "You do not guess the number!!";
                                }
                                out.println(line);
                        }
                        catch (NumberFormatException e) {
                                line = "You must introduce a number";
                        }
                        } catch (IOException ex) {
                                throw new RuntimeException(ex);
                        }
                        finally{
                                try{
                                        if(out!=null){
                                                out.close();
                                        }
                                        if(in!=null){
                                                in.close();
                                                clientSocket.close();
                                        }
                                }
                                catch(IOException e){
                                        e.printStackTrace();
                                }
                        }
        }
}