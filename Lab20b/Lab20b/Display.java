// Display.java
// Darren Fok
// June 9th, 2021
// This class is a required file for Lab20bv100.

package Lab20b;

import java.awt.*;
import javax.swing.*;

public class Display extends JPanel
{
    private int red;
    private int blue;
    private int green;

    public Display()
    {
        setLayout(null);
        String kirbyRed = JOptionPane.showInputDialog("Enter red value of Kirby (0-255):");
        String kirbyBlue = JOptionPane.showInputDialog("Enter blue value of Kirby (0-255):");
        String kirbyGreen = JOptionPane.showInputDialog("Enter green value of Kirby (0-255):");

        red = Integer.parseInt(kirbyRed);
        blue = Integer.parseInt(kirbyBlue);
        green = Integer.parseInt(kirbyGreen);

        JOptionPane.showMessageDialog(null, "Processing image of Kirby based on color values input...");
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        //Background
        Background.draw(g);

        //Draw Kirby
        Kirby.drawKirby(g, red, green, blue);
    }

}
