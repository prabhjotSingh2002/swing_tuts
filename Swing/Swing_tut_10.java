package Swing;

import javax.swing.*;

public class Swing_tut_10 {

//    JOptionPane= pop up a standard dialog box that prompts user for a value or informs them something

    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null,"This is Some useless info","title",
//                JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is Some useless info","title",
//                JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is Some useless info","title",
//                JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is Some useless info","title",
//                JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is Some useless info","title",
//                JOptionPane.ERROR_MESSAGE);

//        for(int i=0;i<=3;i++) {
//            int ans = JOptionPane.showConfirmDialog(null, "bro do you even code?", "this is title,",
//                    JOptionPane.YES_NO_CANCEL_OPTION);
//            System.out.println(ans);
//        }

//        String name= JOptionPane.showInputDialog("what is your name?: ");
//        System.out.println(name);
        String[] response={"No","You are sugoi","Arighatohyo","blush"};


        System.out.println( JOptionPane.showOptionDialog(null,"You are awesome","secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,response,0));
    }

}
