package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class MyFrame12  {

    JFrame frame;
    JLabel label;

    Action upAction,downAction,rightAction,leftAction;


    MyFrame12(){
        frame= new JFrame("key binding demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        label= new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100,100,100,100);
        label.setOpaque(true);

        upAction= new UpAction();
        downAction= new DownAction();
        leftAction= new LeftAction();
        rightAction= new RightAction();

//        label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
//        label.getActionMap().put("upAction",upAction);
//
//        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
//        label.getActionMap().put("downAction",downAction);
//
//        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
//        label.getActionMap().put("leftAction",leftAction);
//
//        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
//        label.getActionMap().put("rightAction",rightAction);

        label.getInputMap().put(KeyStroke.getKeyStroke('w'),"upAction");
        label.getActionMap().put("upAction",upAction);

        label.getInputMap().put(KeyStroke.getKeyStroke('s'),"downAction");
        label.getActionMap().put("downAction",downAction);

        label.getInputMap().put(KeyStroke.getKeyStroke('a'),"leftAction");
        label.getActionMap().put("leftAction",leftAction);

        label.getInputMap().put(KeyStroke.getKeyStroke('d'),"rightAction");
        label.getActionMap().put("rightAction",rightAction);


        frame.add(label);
        frame.setVisible(true);

    }
    public class UpAction extends AbstractAction{

        /**
         * Invoked when an action occurs.
         *
         * @param e the event to be processed
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()-10);
        }
    }


    public class DownAction extends AbstractAction{

        /**
         * Invoked when an action occurs.
         *
         * @param e the event to be processed
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()+10);
        }
    }

    public class RightAction extends AbstractAction{

        /**
         * Invoked when an action occurs.
         *
         * @param e the event to be processed
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10,label.getY());
        }
    }

    public class LeftAction extends AbstractAction{

        /**
         * Invoked when an action occurs.
         *
         * @param e the event to be processed
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10,label.getY());
        }
    }
}

public class Swing_tut_23 {
//    keyBinding=bind an action to a certain keystroke don't require you to click a component to give
//    it focus all components use key bindings increased flexiblity compared to keylistener can assign
//    key strokes to individual Swing components more difficult to utilize the set up

    public static void main(String[] args) {
        new MyFrame12();
    }

}
