package Swing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame4 extends JFrame implements ActionListener{
    JRadioButton pizzaButton= new JRadioButton("PIZZA");
    JRadioButton idliButton= new JRadioButton("IDLI CHUTNEY");
    JRadioButton hamburgerButton= new JRadioButton("BURGER");

    MyFrame4(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(idliButton);
        group.add(hamburgerButton);

        pizzaButton.addActionListener(this);
        idliButton.addActionListener(this);
        hamburgerButton.addActionListener(this);

        this.add(pizzaButton);
        this.add(idliButton);
        this.add(hamburgerButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==pizzaButton){
            System.out.println("PIZZA");
        }
        if (e.getSource()==idliButton){
            System.out.println("IDLI");
        }
        if (e.getSource()==hamburgerButton){
            System.out.println("Burger");
        }
    }
}


public class Swing_tut_13 {
//   JRadioButton= One or more buttons in a grouping in which only 1 may be selected per group

    public static void main(String[] args) {
        MyFrame4 ls= new MyFrame4();
    }
}
