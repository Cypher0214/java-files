package thread.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {
    public static void main(String[] args) {
        try {

            System.out.println("server is starting");
            ServerSocket ss = new ServerSocket(8090);
            System.out.println("server is waiting for client request");
            Socket s = ss.accept();
            System.out.println(" client is running");

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String str = br.readLine();
            System.out.println("client data" + str);
        }
        catch(Exception e){
            System.out.println("exception is :"+e);
        }

    }
}
