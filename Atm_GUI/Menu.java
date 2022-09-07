package Atm_GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Menu implements ActionListener {
    protected String username;

    public JFrame frame2;

    public JButton TransactionHistory;
    public JButton Withdraw;
    public JButton Deposit;
    public JButton Transfer;
    public JButton Back;
    public JButton Quit;

    Menu(String username){
        this.username= username;
        userFrame();
    }
    private void userFrame(){

        frame2= new JFrame("ATM INTERFACE");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(800,400);
        frame2.setLayout(new BorderLayout(10,40));

        JLabel label1 =new JLabel();
        label1.setText("WELCOME  "+username.toUpperCase(Locale.ROOT));

        label1.setFont(new Font("San sarif", Font.PLAIN,30));
        label1.setForeground(Color.DARK_GRAY);

        JPanel panel1= new JPanel();
        panel1.add(label1);

        TransactionHistory= new JButton("Transaction History");
        Withdraw=new JButton("Withdraw");
        Deposit= new JButton("Deposit");
        Transfer= new JButton("Transfer");
        Quit = new JButton("Quit");
        Back = new JButton("Back");

        TransactionHistory.addActionListener(this);
        Withdraw.addActionListener(this);
        Deposit.addActionListener(this);
        Transfer.addActionListener(this);
        Quit.addActionListener(this);
        Back.addActionListener(this);


        JPanel panel2= new JPanel();
        panel2.setLayout(new GridLayout(3,2,10,20));

        panel2.add(TransactionHistory);
        panel2.add(Withdraw);
        panel2.add(Deposit);
        panel2.add(Transfer);
        panel2.add(Back);
        panel2.add(Quit);

        frame2.add(panel1,BorderLayout.NORTH);
        frame2.add(panel2,BorderLayout.CENTER);

//        frame2.pack();
        frame2.setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==TransactionHistory){
            frame2.dispose() ;
            TransactionHistory frame3 =new TransactionHistory(this.username);
            System.out.println("TransactionHistory");
        }
        else if(e.getSource()==Transfer){
            frame2.dispose() ;
            Transfer frame4 =new Transfer(this.username);
            System.out.println("Transfer");
        }
        else if(e.getSource()==Back){
            frame2.dispose() ;
            new User();
            System.out.println("back");
        }else if(e.getSource()==Quit){
            frame2.dispose();
            System.out.println("QUIT");
        }
        else if(e.getSource()==Withdraw){
            frame2.dispose() ;
            Withdraw frame5 =new Withdraw(this.username);
            System.out.println("Withdraw");
        }else if(e.getSource()==Deposit){
            frame2.dispose() ;
            Deposit frame6 =new Deposit(this.username);
            System.out.println("Deposit");
        }

    }

//    public static void main(String[] args) {
//        new Menu("pqr");
//    }
}
