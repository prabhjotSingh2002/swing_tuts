package Swing;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class SliderDemo implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo(){
        frame= new JFrame("slider Demo");
        panel= new JPanel();
        label =new JLabel();
        slider= new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(250,300));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(10);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.PLAIN,15));

        slider.setOrientation(SwingConstants.NORTH);
        slider.addChangeListener(this);
        label.setText("degree= "+slider.getValue());

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,430);
        frame.setVisible(true);


    }
    @Override
    public void stateChanged(ChangeEvent e) {

        label.setText("degree= "+slider.getValue());

    }
}

public class Swing_tut_15 {
//    JSlider= GUI component that lets user enter a value by using an adjustable sliding knob on a track
public static void main(String[] args) {
    SliderDemo sliderdemo=new SliderDemo();
}
}
