import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    static BufferedReader input;
    static PrintWriter output;
    static Socket socket;

    public static void main(String[] arg) {

        boolean check = new Main().initiate();
        if (check) {
            new Logingui();
        } else {
            System.out.println("Error: Connection not able to establish between Client and Server.");
        }

    }

    static ImageIcon resizeImage(String image_path, int width, int height) {
        ImageIcon myImage = new ImageIcon(image_path);
        Image img = myImage.getImage();
        Image newimg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimg);
        return image;
    }

    boolean initiate() {
        try {
            socket = new Socket("127.0.0.1", 5006);
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            output = new PrintWriter(socket.getOutputStream(), true);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
}

