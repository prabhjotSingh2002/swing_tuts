package Swing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MyFrame9 extends JFrame implements KeyListener {

    JLabel label;

    MyFrame9(){


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        label= new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //keytyped= invoked when a key is typed. uses keychar , char output

        switch (e.getKeyChar()){
            case 'a':label.setLocation(label.getX()-5,label.getY());
                        break;
            case 's':label.setLocation(label.getX(),label.getY()+5);
                break;
            case 'w':label.setLocation(label.getX(),label.getY()-5);
                break;
            case 'd':label.setLocation(label.getX()+5,label.getY());
                break;


        }


    }

    @Override
    public void keyPressed(KeyEvent e) {
//keypressed= invoked when a physical key is pressed down. uses keycode,int output

        switch (e.getKeyCode()){
            case 65:label.setLocation(label.getX()-5,label.getY());
                break;
            case 83:label.setLocation(label.getX(),label.getY()+5);
                break;
            case 87:label.setLocation(label.getX(),label.getY()-5);
                break;
            case 68:label.setLocation(label.getX()+5,label.getY());
                break;


        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
//keyreleased= called whenever a button is released
        System.out.println("You released key Char: "+e.getKeyChar());
        System.out.println("You released key Code: "+e.getKeyCode());

    }
}

public class Swing_tut_20 {
    public static void main(String[] args) {
        new MyFrame9();
    }

}
