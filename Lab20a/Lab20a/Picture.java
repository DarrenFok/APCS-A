// Picture.java
// Darren Fok
// June 9th, 2021
// This class is a required file for Lab20av100.

package Lab20a;

import java.awt.*;
import javax.swing.*;

class Picture extends JPanel
{
   public Picture()
   {
      setLayout(null);
   }
   
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D)g;

      //Custom graphics code

      //Background
      Background.drawSky(g);
      Background.drawSand(g);

      //Sun
      Sun.drawMain(g);
      Sun.drawEyes(g);
      Sun.drawSmile(g);
      Sun.drawRay(g);

      //IceCream
      IceCream.drawCircle(g);
      IceCream.drawCone(g);
      IceCream.drawSprinkles(g);
      IceCream.drawCherry(g);
   }
}