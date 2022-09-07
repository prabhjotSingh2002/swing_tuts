package Swing;

import javax.swing.*;
import java.awt.*;

public class Swing_tut_6 {

    //    Layout Manager= Defines the natural layout for components within a container

//    FlowLayout = places components in a row sized at thier prefered size
//                    if the horizontal space in the container is too small
//                    the FlowLayout class uses the next available row


    public static void main(String[] args) {

        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
//        frame.setLayout(new FlowLayout());
//        frame.setLayout(new FlowLayout(FlowLayout.TRAILING));
//        frame.setLayout(new FlowLayout(FlowLayout.LEADING));
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));


        frame.setVisible(true);


    }



}
