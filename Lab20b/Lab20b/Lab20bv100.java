// Lab20bv100
// This is the 100 point version.
// Darren Fok
// June 9th, 2021
// APCS, Mr. Robinson
// This program creates a picture of the classic Nintendo character Kirby and changes his color based on user input.

package Lab20b;

import javax.swing.*;

public class Lab20bv100 {
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater((new Runnable()
        {
            public void run()
            {
                createPicture();
            }
        }));
    }
    public static void createPicture(){
        JFrame myFrame = new JFrame("My Custom Swing Graphic: Kirby");
        myFrame.setSize(800, 450);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Display myPanel = new Display();
        myFrame.add(myPanel);
        myFrame.setVisible(true);
    }
}
