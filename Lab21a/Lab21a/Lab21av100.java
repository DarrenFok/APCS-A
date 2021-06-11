// Lab21av100.java
// This is the 100 point version.
// Darren Fok
// June 10th, 2021
// APCS, Mr. Robinson
// This program creates a graphic based on input variables that are selected through the GUI.
// My choice is personally interesting because growing up, I have always played Nintendo games, and as a result, became a huge fan of Nintendo.
// My engagement in their games are what got me interested in technology, which eventually led to my interest in coding!

package Lab21a;

import javax.swing.*;

public class Lab21av100 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Lab21av100();
            }
        });
    }

    Lab21av100()
    {
        JFrame myFrame = new JFrame("Swing Responsive Painting: Nintendo Drawings");
        myFrame.setSize(870,550);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.add(new Display());
        myFrame.setVisible(true);
    }
}
