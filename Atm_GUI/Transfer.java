package Atm_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Transfer implements ActionListener {
    private String username;

    public JFrame frame4;
    public JTextField usernameText,amountText ;
    public JButton button1;
    public JPanel panel3;

    Transfer(String id){
        this.username= id;
        transferFrame();
    }
    private void transferFrame(){

        frame4= new JFrame("ATM interface");

        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.setSize(1200,900);
        frame4.setLayout(new GridLayout(3,1,30,40));


        JPanel panel1= new JPanel();
        panel1.setLayout(new GridLayout(3,1,10,10));
        JLabel label1=new JLabel();
        label1.setText("ENTER ID-");
        label1.setForeground(new Color(0,0,0));//set font color of text
        label1.setFont(new Font("San sarif", Font.PLAIN,30));//set font of text
        usernameText = new JTextField();
        usernameText.setEditable(true);
        usernameText.setPreferredSize(new Dimension(200,150));

//        usernameText.setPreferredSize(new Dimension(250,50));
        usernameText.setFont(new Font("Consoles",Font.PLAIN,35));
        usernameText.setForeground(new Color(0x00FF00));
        usernameText.setBackground(Color.BLACK);
        usernameText.setCaretColor(Color.WHITE);

        panel1.add(label1);
        panel1.add(usernameText);

        JPanel panel2= new JPanel();
        panel2.setLayout(new GridLayout(3,1,10,10));


        JLabel label2= new JLabel();
        label2.setText("ENTER AMOUNT-");
        label2.setForeground(new Color(0,0,0));//set font color of text
        label2.setFont(new Font("San sarif", Font.PLAIN,30));//set font of text
        amountText = new JTextField();
        amountText .setEditable(true);
//        amountText .setPreferredSize(new Dimension(250,50));

        amountText .setPreferredSize(new Dimension(200,150));
        amountText .setFont(new Font("Consoles",Font.PLAIN,35));
        amountText .setForeground(new Color(0x00FF00));
        amountText .setBackground(Color.BLACK);
        amountText .setCaretColor(Color.WHITE);

        panel2.add(label2);
        panel2.add(amountText );

        button1= new JButton("SUBMIT");
        button1.addActionListener(this);


        panel3= new JPanel();
        panel3.setLayout(new GridLayout(3,1,10,10));


//        panel1.setBounds(0,0,400,425);

//        panel2.setBounds(0,450,400,425);
        panel3.add(button1,BorderLayout.NORTH);

        frame4.add(panel1,BorderLayout.NORTH);
        frame4.add(panel2,BorderLayout.CENTER);
        frame4.add(panel3,BorderLayout.SOUTH);
//        frame1.pack();

        frame4.setVisible(true);

    }
    public boolean check(int i){
        return i<=getUserBalance();
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
        if(e.getSource()==button1){
//            System.out.println("To which userID you want to transfer your money --");
            String toUserId=usernameText.getText();
            Db d8= new Db();
            if(d8.userPresent(toUserId)) {
//                System.out.println("How much money you want to transfer?");
                int i = Integer.parseInt(amountText.getText());

                if (check(i)) {
                    Db d4 = new Db();
                    d4.updateTotalBalance(username, (getUserBalance() - i));
                    Db d5 = new Db();
                    d5.insertIntoAtmTransactionHistory(username, ("transferTo-" + toUserId), i);

                    Db d6 = new Db();
                    d6.updateTotalBalance(toUserId, (getUserBalance() + i));
                    Db d7 = new Db();
                    d7.insertIntoAtmTransactionHistory(toUserId, ("transferFrom-" + username), i);

                    frame4.dispose();
                    new UserBalance(username);
                    System.out.println("Your money has been Transfered");
                    System.out.println("Your current balance is-->" + getUserBalance());
                } else {
//                    System.out.println("Your given amount is more than your account balance!!!");

                    JLabel label3=new JLabel();
                    label3.setText("Your given amount is more than your account balance!!!");
                    label3.setForeground(Color.red);
                    label3.setFont(new Font("San Sarif", Font.PLAIN,15));
                    frame4.setSize(1200,890);
                    panel3.add(label3);
//                frame1.pack();


                    ActionListener taskPerformer=new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            panel3.remove(label3);

//                        frame1.pack();
                        }
                    };
                    new Timer(4000,taskPerformer).start();


//                    System.out.println("You cannot transfer money");
                }
            }else {
                JLabel label4=new JLabel();
                label4.setText("This User ID is not Present!!!");
                label4.setForeground(Color.red);
                label4.setFont(new Font("San Sarif", Font.PLAIN,15));
                frame4.setSize(1200,890);
                panel3.add(label4);

//                frame1.pack();


                ActionListener taskPerformer=new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel3.remove(label4);

//                        frame1.pack();
                    }
                };
                new Timer(4000,taskPerformer).start();
            }
        }
    }
}
