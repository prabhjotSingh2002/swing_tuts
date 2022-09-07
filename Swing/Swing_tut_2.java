package Swing;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.Border;
//import javax.swing.border.Border;
import java.awt.*;


public class Swing_tut_2 {
    public static void main(String[] args) {
//        JLabel :  a gui display area for  a string of text or image or both


        ImageIcon img =new ImageIcon("src/Swing/img.png");


        JLabel label = new JLabel();
        label.setText("lasan");
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text left,right and center of imageicon
        label.setVerticalTextPosition(JLabel.TOP);//set text top,bootom and center of imageicon
        label.setForeground(new Color(125,50,180));//set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN,30));//set font of text
        label.setBackground(Color.MAGENTA);//set backgroundcolor
        label.setOpaque(true);//display background color
        Border b= BorderFactory.createLineBorder(Color.BLACK,20);
        label.setBorder(b);//set border

        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within the label
        label.setHorizontalAlignment(JLabel.CENTER);//set Horizontal position of icon+text within the label

//        label.setBounds(0,0,1000,1000);//set x ,y position within the frame and dimension


        JFrame frame= new JFrame();
        frame.setTitle("label intro:");
        frame.setVisible(true);
//        frame.setSize(500,500);

//        frame.setLayout(null);
            frame.pack();
        frame.add(label);

    }
}
