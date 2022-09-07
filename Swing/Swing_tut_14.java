package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame5 extends JFrame implements ActionListener{
    JComboBox comboBox;
    MyFrame5(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

//        it does not work for primitive datatype use wrapper classes instead of them

        String[] animal={"dog","cat","laura"};
         comboBox= new JComboBox(animal);
         comboBox.addActionListener(this);

         comboBox.setEditable(true);//gives the ability to search
            comboBox.addItem("horse");
            comboBox.insertItemAt("jhaat",2);
            comboBox.removeItem("dog");
            comboBox.removeItemAt(0);

        this.add(comboBox);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
            System.out.println(comboBox.getItemCount());
        }
    }
}


public class Swing_tut_14 {
//    JComboBox= A component that combines a button or editable field and a dropdown list
public static void main(String[] args) {
    MyFrame5 k= new MyFrame5();
}

}

