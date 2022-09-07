package Swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;

public class Swing_tut_7 {

//    Layout Manager = Defines the natural layout for componenets with a container

//    GridLayout = place componenets in a grid cells
//                    Each components takes all the available space within its cell,
//                    and each cell is the same size



    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3,10,10));



        frame.add(new Button("1"));
        frame.add(new Button("2"));
        frame.add(new Button("3"));
        frame.add(new Button("4"));
        frame.add(new Button("5"));
        frame.add(new Button("6"));
        frame.add(new Button("7"));
        frame.add(new Button("8"));
        frame.add(new Button("9"));



        frame.setVisible(true);


    }
}
