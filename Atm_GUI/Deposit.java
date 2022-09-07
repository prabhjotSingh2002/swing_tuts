package Atm_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.Scanner;

public class Deposit implements ActionListener {
    protected String  username;
    public JFrame frame6;
    public JTextField amountPlace;
    public JButton submit;

    Deposit(String id){
        this.username=id;
        depositFrame();


        System.out.println("Your current balance is-->"+getUserBalance());
    }

    private void depositFrame(){
        frame6 =new JFrame("ATM Interface") ;
        frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame6.setSize(800,400);
        frame6.setLayout(new BorderLayout(10,30));

        JLabel label1 =new JLabel();
        label1.setText("WELCOME  "+username.toUpperCase(Locale.ROOT));


        label1.setFont(new Font("San sarif", Font.PLAIN,30));
        label1.setForeground(Color.DARK_GRAY);

        JPanel panel1= new JPanel();
        panel1.add(label1);

        JPanel panel2= new JPanel(new GridLayout(3,1,10,10));
        JLabel label2=new JLabel();
        label2.setText("Enter the Amount you want to Deposit ? ");
        label2.setFont(new Font("San sarif", Font.PLAIN,25));
        label2.setForeground(Color.DARK_GRAY);

        amountPlace= new JTextField();
        amountPlace.setPreferredSize(new Dimension(250,50));
        amountPlace.setFont(new Font("Consoles",Font.PLAIN,35));
        amountPlace.setForeground(new Color(0x00FF00));
        amountPlace.setBackground(Color.BLACK);
        amountPlace.setCaretColor(Color.WHITE);
        amountPlace.setEditable(true);
        amountPlace.setPreferredSize(new Dimension(250,50));
        submit= new JButton("SUBMIT");
        submit.addActionListener(this);

        panel2.add(label2);
        panel2.add(amountPlace);
        panel2.add(submit);


        frame6.add(panel1,BorderLayout.NORTH);
        frame6.add(panel2,BorderLayout.CENTER);

        frame6.setVisible(true);

    }


    public int getUserBalance(){
        Db d3= new Db();
        return d3.userBalance(this.username);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){

            Integer i= Integer.parseInt( amountPlace.getText());


            Db d4= new Db();
            d4.updateTotalBalance(this.username,(getUserBalance()+i));
            Db d5= new Db();
            d5.insertIntoAtmTransactionHistory(this.username,"deposit",i);
            System.out.println("Your money has been deposited");

            amountPlace.setText("");
            frame6.dispose();
            new UserBalance(this.username);
        }
    }
}
