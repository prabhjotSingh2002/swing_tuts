package Swing;


import com.sun.source.tree.NewArrayTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class NewWindow{
    JFrame frame= new JFrame();
    JLabel label= new JLabel("hello");

    NewWindow(){
        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}




class LaunchPage implements ActionListener {
    JFrame frame= new JFrame();
    JButton myButton = new JButton("new window");
    LaunchPage(){
        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==myButton){
            frame.dispose();
            NewWindow myWindow= new NewWindow();
        }

    }

}

public class Swing_tut_9 {

    //how to open a new window
    public static void main(String[] args) {

    LaunchPage launchPage= new LaunchPage();


    }
}


