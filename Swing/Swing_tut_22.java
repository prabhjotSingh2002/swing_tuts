//package Swing;
//
////Drag and drop
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseMotionAdapter;
//
//class MyFrame11 extends JFrame {
//
//    DragPanel dragPanel = new DragPanel();
//    MyFrame11(){
//        this.add(dragPanel);
//        this.setTitle("Drag and Drop demo");
//        this.setSize(600,600);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setVisible(true);
//
//    }
//
//}
//
//class DragPanel extends JPanel{
//
//
//    ImageIcon image = new ImageIcon("img.png");
//    int WIDTH= image.getIconWidth();
//    int HIEGHT= image.getIconHeight();
//    Point imageCorner;
//    Point prevPt;
//
//    DragPanel(){
//
//        imageCorner= new Point(0,0);
//        ClickListener clickListener = new ClickListener();
//        DragListener dragListener= new DragListener();
//        this.addMouseListener(clickListener);
//        this.addMouseMotionListener(dragListener);
//
//    }
//
//
//
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//        image.paintIcon(this,g,(int)imageCorner.getX(),
//                (int)imageCorner.getY());
//    }
//    private class ClickListener extends MouseAdapter{
//        @Override
//        public void mousePressed(MouseEvent e) {
////            super.mousePressed(e);
//            prevPt=e.getPoint();
//        }
//    }
//
//    private class DragListener extends MouseMotionAdapter {
//            public void mouseDragged(MouseEvent e){
//            Point currentPt= e.getPoint();
//imageCorner.translate(()currentPt.getX()-prevPt.getX()
//}
//
//public class Swing_tut_22 {
//    public static void main(String[] args) {
//        new MyFrame11();
//    }
//}
//
//
//
//
//
