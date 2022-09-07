package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class MyFrame6 extends JFrame implements ActionListener{
//    private static final Object VK_L = ;
//    private final Object KeyEvent = null;
    JMenuBar menuBar;

    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    MyFrame6(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

         menuBar= new JMenuBar();

        fileMenu= new JMenu("FILE");
        editMenu= new JMenu("EDIT");
         helpMenu= new JMenu("HELP");

         loadItem =new JMenuItem("Load");
         saveItem =new JMenuItem("Save");
         exitItem =new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

//        loadItem.setMnemonic(KeyEvent,VK_L);


        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loadItem){
            System.out.println("you have loaded a file");
        }
        else if(e.getSource()==saveItem){
            System.out.println("you have saved a file");
        }
        else if(e.getSource()==exitItem){
            System.exit(0);
        }
    }
}


public class Swing_tut_17 {
//    creating menu bar
    public static void main(String[] args) {
        new MyFrame6();
    }
}
