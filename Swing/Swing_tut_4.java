package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

class MyFrame extends  JFrame implements ActionListener {
    JLabel label;
    JButton button;
    int i=0;
    MyFrame(){
        ImageIcon icon =new ImageIcon("src/Swing/img_2.png");
        label= new JLabel();
        label.setIcon(icon);
        label.setText("i = "+i);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVisible(false);
        label.setBounds(0,0,500,500);



         button= new JButton();

        button.setBounds(200,100,100,50);
//        button.setIcon(icon);
        button.setText("click me");
        button.setFocusable(false);

        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,10));

        button.setForeground(Color.cyan);
        button.setBackground(Color.red);
        button.setBorder(BorderFactory .createEtchedBorder());
//        button.setEnabled(false);

        button.addActionListener(this);//here actionPerformed method is called

     //   button.addActionListener(e-> System.out.println("9oo"));// using lambda function in java


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
//            System.out.println("poo");
            label.setVisible(true);

            for(int j=0;j<1000;j++){
                i++;
                label.setText("i = "+i);
            }
//            label.setText("i = "+i);

        }
    }
}

public class Swing_tut_4  {
    public static  void main(String[] args) {
        // JButton= a button that performs action on click
        MyFrame frame= new MyFrame();

    }

}
