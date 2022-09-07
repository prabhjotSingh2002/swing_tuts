package Swing;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

public class Swing_tut_1 {

    public static void main(String[]args){
        JFrame frame = new JFrame();//create a frame
        frame.setVisible(true);
        frame.setSize(420,420);
// frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("lauda");
        frame.setResizable(true);
        ImageIcon icon= new ImageIcon("src/Swing/img.png");
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(255,255,0));
    }
}
