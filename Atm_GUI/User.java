package Atm_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class User implements ActionListener {
    private String id;
    private String pass;

    JButton button1;
    JTextField passText;
    JTextField usernameText;
    String userPass;
    String userId;
    JPanel panel3;
    JFrame frame1;
    private  void userFrame(){
        frame1= new JFrame("ATM INTERFACE");

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(800,350);
        frame1.setLayout(new BorderLayout(10,10));


        JPanel panel1= new JPanel();
        JLabel label1=new JLabel();
        label1.setText("Username");
        label1.setForeground(new Color(0,0,0));//set font color of text
        label1.setFont(new Font("San sarif", Font.PLAIN,30));//set font of text
        usernameText = new JTextField();
        usernameText.setEditable(true);
        usernameText.setPreferredSize(new Dimension(250,50));

        usernameText.setPreferredSize(new Dimension(250,50));
        usernameText.setFont(new Font("Consoles",Font.PLAIN,35));
        usernameText.setForeground(new Color(0x00FF00));
        usernameText.setBackground(Color.BLACK);
        usernameText.setCaretColor(Color.WHITE);

        JLabel label2= new JLabel();
        label2.setText("Password");
        label2.setForeground(new Color(0,0,0));//set font color of text
        label2.setFont(new Font("San sarif", Font.PLAIN,30));//set font of text
        passText = new JTextField();
        passText.setEditable(true);
        passText.setPreferredSize(new Dimension(250,50));

        passText.setPreferredSize(new Dimension(250,50));
        passText.setFont(new Font("Consoles",Font.PLAIN,35));
        passText.setForeground(new Color(0x00FF00));
        passText.setBackground(Color.BLACK);
        passText.setCaretColor(Color.WHITE);

        button1= new JButton("SUBMIT");
        button1.addActionListener(this);

        JPanel panel2= new JPanel();
         panel3= new JPanel();
        panel3.setLayout(new BorderLayout());

        panel1.add(label1);
        panel1.add(usernameText);
//        panel1.setBounds(0,0,400,425);
        panel2.add(label2);
        panel2.add(passText);
//        panel2.setBounds(0,450,400,425);
        panel3.add(button1,BorderLayout.NORTH);

        frame1.add(panel1,BorderLayout.NORTH);
        frame1.add(panel2,BorderLayout.CENTER);
        frame1.add(panel3,BorderLayout.SOUTH);
//        frame1.pack();

        frame1.setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            userId=usernameText.getText();
            userPass=passText.getText();
            Db d1=new Db();
            if(d1.userPresent(this.userId,this.userPass)){
                   frame1.dispose() ;
                   Menu frame2 =new Menu(this.userId);
                System.out.println("db connected");
            }else{
                JLabel label3=new JLabel();
                label3.setText("Either your password or account ID is wrong please enter again");
                label3.setForeground(Color.red);
                label3.setFont(new Font("San Sarif", Font.PLAIN,15));
                panel3.add(label3,BorderLayout.SOUTH);
//                frame1.pack();


                ActionListener taskPerformer=new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel3.remove(label3);
//                        frame1.pack();
                    }
                };
                new Timer(2000,taskPerformer).start();
            }
        }
    }
    User(){
        userFrame();
    }

}
