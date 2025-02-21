import java.io.*;
import java.net.*;

class Server {
    static  String data = "Hey This message is from Server";;
    public static void main(String[] args) {
        try {
            ServerSocket srvr = new ServerSocket(1234);
            Socket skt = srvr.accept();
            System.out.println("Server has connected");
            PrintWriter out = new PrintWriter(skt.getOutputStream(),true);
            System.out.println("Sending string "+data+"\n");
            out.print(data);
            out.close();
            skt.close();
            srvr.close();
        }
        catch (Exception e){
            System.out.println("Whoops! It didn't work");
        }

    }
}