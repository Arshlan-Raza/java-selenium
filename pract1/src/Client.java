import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try{
            Socket skt = new Socket("localhost",1234);
            BufferedReader in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
            System.out.println("Received String:");
            while(!in.ready()){

            }
            System.out.println(in.readLine());
            System.out.println("\n");
        }
        catch(Exception e){
            System.out.println("Whoops!! It didn't work..");
        }
    }
}