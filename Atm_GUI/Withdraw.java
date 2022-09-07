package Atm_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.Scanner;

public class Withdraw implements ActionListener{
    protected String username;

    public JFrame frame5;
    public JTextField amountPlace;
    public JButton submit;
    public  JPanel panel2;

    Withdraw(String id){
        this.username= id;
        withdrawFrame();
    }


    private void withdrawFrame(){
        frame5 =new JFrame("ATM Interface") ;
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame5.setSize(800,450);
        frame5.setLayout(new BorderLayout(10,30));

        JLabel label1 =new JLabel();
        label1.setText("WELCOME  "+username.toUpperCase(Locale.ROOT));


        label1.setFont(new Font("San sarif", Font.PLAIN,30));
        label1.setForeground(Color.DARK_GRAY);

        JPanel panel1= new JPanel();
        panel1.add(label1);

        panel2= new JPanel(new GridLayout(4,1,10,10));
        JLabel label2=new JLabel();
        label2.setText("Enter the Amount you want to Withdraw ? ");
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


        frame5.add(panel1,BorderLayout.NORTH);
        frame5.add(panel2,BorderLayout.CENTER);

        frame5.setVisible(true);

    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){
//            System.out.println("How much money you want to withdraw?");
//            this.id=id;
            int i= Integer.parseInt(amountPlace.getText());
            if(check(i)){
                Db d4= new Db();
                d4.updateTotalBalance(this.username,(getUserBalance()-i));
                Db d5= new Db();
                d5.insertIntoAtmTransactionHistory(this.username,"withdraw",i);
                System.out.println("Your money has been withdrawled");

                System.out.println("Your current balance is--> "+getUserBalance());
                amountPlace.setText("");
                frame5.dispose();
                new UserBalance(this.username);

            }else{
//                System.out.println("Your given amount is more than your account balance!!!");

//                System.out.println("You cannot withdraw money");
                JLabel label3=new JLabel();
                label3.setText("Your given amount is more than your account balance!!!You cannot withdraw money");
                label3.setForeground(Color.red);
                label3.setFont(new Font("San Sarif", Font.PLAIN,15));
                panel2.add(label3);
                frame5.setSize(800,448);


                ActionListener taskPerformer=new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel2.remove(label3);
                        amountPlace.setText("");
                        frame5.dispose();
                        new UserBalance(username);
                    }
                };
                new Timer(2000,taskPerformer).start();


            }
        }

    }
    public boolean check(int i){
        return i<=getUserBalance();
    }

    public int getUserBalance(){
        Db d3= new Db();
        return d3.userBalance(this.username);
    }
}
