// Lab20av100.java
// This is the 100 point version.
// Darren Fok
// June 9th, 2021
// APCS, Mr. Robinson
// This program converts the graphic made in Lab07 to Swing-based graphics, and adds extra items such as a cherry,
// and changes the sun's frown into a smile.

package Lab20a;

import java.awt.*;
import javax.swing.*;

public class Lab20av100
{
   public static void main(String[] args)
   {
      SwingUtilities.invokeLater(new Runnable()
      {
         public void run()
         {
            createPicture();
         }
      });
   }
   
   public static void createPicture()
   {
      JFrame myFrame = new JFrame("My Custom Swing Graphic: Ice Cream on the Beach");
      myFrame.setSize(800, 488);
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Picture myPanel = new Picture();
      myFrame.add(myPanel);
      myFrame.setVisible(true);
   }
}

      