import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String ip="192.168.0.199";//host ip has to change
        Scanner s = new Scanner(System.in);
        try {
            AudioStreamUDP a = new AudioStreamUDP();
            System.out.println("my loacl port is: " +a.getLocalPort());
            System.out.println("feed me port:");
            String in =s.nextLine();
            a.connectTo(InetAddress.getByName(ip), Integer.parseInt(in));
            a.startStreaming();
            System.out.println("write to stop ");
            s.nextLine();

            System.out.println("stopping stream");
            a.stopStreaming();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
