package Atm_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class UserBalance implements ActionListener {
    private  String username;
    JFrame frame7;
    JButton exit;
    JButton backToMenu;

    UserBalance(String id){
        this.username=id;
        userBalanceFrame();
    }

    private void userBalanceFrame(){
        frame7= new JFrame("ATM Interface");
        frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame7.setSize(800,400);
        frame7.setLayout(new BorderLayout(10,40));

        JLabel label1= new JLabel();
        label1.setText(this.username.toUpperCase(Locale.ROOT)+ " CURRENT BALANCE IS --> "+getUserBalance());
        label1.setFont(new Font("San sarif", Font.PLAIN,30));
        label1.setForeground(Color.DARK_GRAY);

        JPanel panel1= new JPanel();
        panel1.setLayout(new GridLayout(1,2,20,30));
        exit=new JButton("EXIT");
        backToMenu=new JButton("Back To Menu");

        exit.addActionListener(this);
        backToMenu.addActionListener(this);

        panel1.add(backToMenu);
        panel1.add(exit);

        frame7.add(label1,BorderLayout.NORTH);
        frame7.add(panel1,BorderLayout.CENTER);

        frame7.setVisible(true);
        frame7.pack();
    }
    public int getUserBalance(){
        Db d9= new Db();
        return d9.userBalance(this.username);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==exit){
            frame7.dispose();
        }else if(e.getSource()==backToMenu){
            frame7.dispose();
            new Menu(this.username);
        }
    }
}
