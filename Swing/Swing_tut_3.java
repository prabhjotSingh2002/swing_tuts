package Swing;


import  javax.swing.JLabel;
import javax.swing.JFrame;
import  javax.swing.JPanel;
import java.awt.*;
import  javax.swing.ImageIcon;


public class Swing_tut_3 {

    public static void main(String[] args) {
        //JPanel= a GUI component that function as a container to hold another component

        ImageIcon icon= new ImageIcon("src/Swing/img_2.png");


        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
//        label.setVerticalAlignment(JLabel.TOP);


        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(label.RIGHT);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);

        JLabel label1 = new JLabel();
        label1.setText("Hi");
        label1.setIcon(icon);
        label1.setBounds(0,0,250,250);

        JPanel yellowPanel= new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        yellowPanel.setBounds(0,0,250,250);

        JPanel bluePanel= new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);


        JPanel greenPanel= new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());


        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);



//        JPanel panelArray[]=new JPanel[3];



        greenPanel.add(label);
        bluePanel.add(label1);

        frame.add(yellowPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }

}
