// Lab22v100.java
// This is the 100 point version.
// Darren Fok
// June 12th, 2021
// APCS, Mr. Robinson
// This program creates an aquarium graphic, with varying amounts of fish based on how many the user inputs. The user can
// also input what color of fish they want. I chose this graphic because growing up, I had a huge obsession with fish and
// aquariums. This drawing is in homage to my interests back then.


package Lab22;

import javax.swing.*;

public class Lab22v100 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Lab22v100();
            }
        });
    }
    public Lab22v100(){
        JFrame myFrame = new JFrame("Custom GUI Swing Project: Aquarium");
        myFrame.setSize(800,450);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.add(new Display());
        myFrame.setVisible(true);
    }
}
