package Swing;


import javax.swing.*;
import java.awt.*;


class MyPanel extends JPanel{

    MyPanel(){
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g){
        Graphics2D g2D =(Graphics2D) g;

        g2D.setStroke(new BasicStroke(5));
        g2D.setPaint(Color.BLUE);
//        g2D.drawLine(0,0,500,500);
//            g2D.draw3DRect(10,10,100,100,true);
            g2D.fillRect(10,10,200,100);
        g2D.setPaint(Color.YELLOW);
            g2D.fillArc(50,50,100,200,40,60);
    }

//    here you can how to add image in panel
}



class MyFrame13 extends JFrame{
    MyPanel panel;
    MyFrame13(){
        panel= new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }


}


public class Swing_tut_24 {
    public static void main(String[] args) {
        new MyFrame13();
    }
}
