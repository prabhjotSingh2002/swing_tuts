package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame3 extends JFrame implements ActionListener{
    JCheckBox checkBox= new JCheckBox();
    JButton button= new JButton("Submit");
    MyFrame3(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);


        checkBox.setText("I m not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consoles",Font.PLAIN,35));


        button.addActionListener(this);

        this.add(checkBox);
        this.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(  checkBox.isSelected());
        }
    }
}

public class Swing_tut_12 {
//    JCheckBox = A GUI component that can be selected or delected

    public static void main(String[] args) {
        MyFrame3 ls= new MyFrame3();
    }
}
