package Lab21b;

import javax.swing.*;

public class Lab21bv100 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Lab21bv100();
            }
        });
    }
    public Lab21bv100(){
        JFrame myFrame = new JFrame("Basic Functions Calculator");
        myFrame.setSize(770,450);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.add(new Display());
        myFrame.setVisible(true);
    }
}
