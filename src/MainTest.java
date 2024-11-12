import Graphic.GameFrame;
import objects.Pacman;

import javax.swing.*;
import java.awt.*;

public class MainTest {
    

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setSize(500,500);
        frame.setVisible(true);
        JButton button = new JButton("555");
        button.setBounds(0,0 ,80,80);
        button.setBackground(Color.YELLOW);
        frame.add(button);



    }
}
