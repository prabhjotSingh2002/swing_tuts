package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class MyFrame7 extends JFrame implements ActionListener{
    JButton button;
    MyFrame7(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("select file");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){

            JFileChooser fileChooser= new JFileChooser();

//            fileChooser.setCurrentDirectory(new File("."));//for current directory
            fileChooser.setCurrentDirectory(new File("C:\\Users"));

         //   int response= fileChooser.showOpenDialog(null);//select file to open
//            System.out.println(fileChooser.showOpenDialog(null));

            int response1= fileChooser.showSaveDialog(null);//select file to save


//            if(response==JFileChooser.APPROVE_OPTION){
//                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
//                System.out.println(file);
//            }
            if(response1==JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }

        }
    }
}


public class Swing_tut_18 {
//    JFileChooser= A gui mechanism that lets user choose a file (helpful for opening or saving file)
public static void main(String[] args) {
    new MyFrame7();
}

}
