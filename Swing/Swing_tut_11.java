package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MyFrames extends JFrame implements ActionListener {

    JButton button = new JButton("Submit");
    JTextField textField= new JTextField();

    MyFrames(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        button.addActionListener(this);


        textField.setPreferredSize(new Dimension(250,50));
        textField.setFont(new Font("Consoles",Font.PLAIN,35));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);
        textField.setText("laura mera");
//        textField.setEditable(false);

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//            auto generated mewthod stub
        if(e.getSource()==button){
            System.out.println( textField.getText());
            textField.setText("");
        }
    }
}



public class Swing_tut_11 {
//    JTextField= A GUI textbox component that can be used to add,set or gettext

    public static void main(String[] args) {

    MyFrames ls= new MyFrames();

    }

}

