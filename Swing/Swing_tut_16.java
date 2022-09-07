package Swing;

import javax.swing.*;
import java.awt.*;

class ProgressBarDemo{
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    ProgressBarDemo(){

        bar.setValue(0);
        bar.setBounds(0,0,400,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }
    public void fill(){
        int counter=0;

        while(counter<=100) {
            bar.setValue(counter);
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            counter+=1;
        }
        bar.setString("done!..");
    }
}

public class Swing_tut_16 {
//    Progress Bar= visual aid to let the user know that an operation is progressing
public static void main(String[] args) {
    ProgressBarDemo demo= new ProgressBarDemo();
}
}
