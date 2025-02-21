import java.io.*;
import java.net.*;
public class Server {
    public static int clientport = 8040, serverport = 8050;

    public static void main(String args[]) throws Exception {
        DatagramSocket Srvsoc =new DatagramSocket(clientport);
        byte[] SData = new byte[1024];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Server Ready");
        while (true) {
            byte[] RData = new byte[1024];
            DatagramPacket RPack = new DatagramPacket(RData, RData.length);
            Srvsoc.receive(RPack);
            String Text = new String(RPack.getData(), 0, RPack.getLength());
            if (Text.trim().length() == 0)
                break;
            System.out.println("\nFrom Client <<< " + Text.trim()+"\n");
            System.out.println("\nMessage for Client <<< ");
            String srvmsg = br.readLine();
            InetAddress IPAddr = RPack.getAddress();
            SData = srvmsg.getBytes();
            DatagramPacket SPack = new DatagramPacket(SData, SData.length, IPAddr, serverport);
            Srvsoc.send(SPack);
        }
        System.out.println("\nClient Quit\n ");
        Srvsoc.close();
    }
}