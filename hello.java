import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class hello extends JFrame {
    public static void main(String [] args){
        System.out.println("Hello World!");
        JFrame window = new hello();
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setSize(720,480);
        window.setVisible(true);
        window.setTitle("Hello World!");

        Button button = new Button("Hello") {
            public void actionPerformend(ActionEvent e) {
                System.exit(0);
            }
        };
    }
}
