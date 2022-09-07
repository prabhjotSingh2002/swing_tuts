package Swing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame8 extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    MyFrame8(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button= new JButton("pick a color");
        button.addActionListener(this);

        label= new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("THis is some text");
        label.setFont(new Font("MV Boli",Font.PLAIN,100));

        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            JColorChooser colorChooser= new JColorChooser();

            Color color= JColorChooser.showDialog(null,"Pick a color",Color.BLACK);
//            label.setForeground(color);
                label.setBackground(color);
        }
    }
}


public class Swing_tut_19 {
//    JColorChooser= a gui mechanism that let's a user choose a color
public static void main(String[] args) {
    new MyFrame8();
}
}
