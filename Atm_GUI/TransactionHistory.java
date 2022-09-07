package Atm_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;

public class TransactionHistory implements ActionListener {

    private  String username;
    TransactionHistory(String id){
        this.username=id;
        transactionHistoryFrame();
    }

    public JFrame frame2;
    public JButton button;
    private void transactionHistoryFrame(){
        Db t1= new Db();
        System.out.println("transaction history for our user");
        String rowData[][]= t1.showTransactionHistory(this.username);
        System.out.println("Your current balance id-->  "+t1.userBalance(this.username));

        frame2=new JFrame("ATM interface");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(1200,900);
        frame2.setLayout(new BorderLayout());

        String[] colData={"dateAndTime","transactionType","amount"};

        JTable table1= new JTable(rowData,colData);

        JScrollPane scrollPane = new JScrollPane(table1);
        table1.setFillsViewportHeight(true);

        button= new JButton("CLOSE");
        button.setSize(80,30);
        button.addActionListener(this);

        frame2.add(scrollPane,BorderLayout.NORTH);
        frame2.add(button,BorderLayout.CENTER);

        frame2.pack();
        frame2.setVisible(true);
    }


    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            frame2.dispose();
            new UserBalance(this.username);
        }
    }
}
