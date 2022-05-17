package thread.java;


import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocClient
{
    public static void main(String[] args)
    {
        try {
            String ip = "localhost";
            int port = 8090;
            Socket s = new Socket(ip, port);
            String str = "Navin Reddy";
            OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
            PrintWriter out = new PrintWriter(os);
            os.write(str);
            os.flush();
        }
        catch(Exception e){
            System.out.println("exception is "+e);
        }

    }

}
