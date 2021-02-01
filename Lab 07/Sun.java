// Sun.java

import java.awt.*;
import java.applet.*;

class Sun
{
   public static void drawMain(Graphics g)
   {
      g.setColor(new Color(255, 255, 0));
      g.fillOval(650, 0, 150, 150);
   }
   public static void drawRay1(Graphics g)
   {
      g.setColor(new Color(255, 255, 0));
      g.drawLine(650, 50, 600, 50);
   }
   public static void drawRay2(Graphics g)
   {
      g.setColor(new Color(255, 255, 0));
      g.drawLine(600, 100, 550, 150);
   }
}