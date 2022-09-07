package Swing;


import javax.swing.*;
import java.awt.*;
//import java.util.jar.JarFile;


class MyPanel1 extends JPanel{

    final int PANEL_WIDTH=500;
    final int PANEL_HIETH=500;

    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity=1;
    int yVelocity=1;
    int x=0;
    int y=0;

    MyPanel1(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HIETH));
        this.setBackground(Color.black);
        enemy= new ImageIcon("src/Swing/OIP.jpg").getImage();
        timer = new Timer(1000,null);
    }

}


class MyFrame14 extends JFrame {
    MyPanel1 panel;

    MyFrame14(){
        panel= new MyPanel1();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}




public class Swing_tut_25 {

    public static void main(String[] args) {

    new MyFrame14();

    }

}
