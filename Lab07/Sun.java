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
   public static void drawEyes(Graphics g)
   {
      g.setColor(new Color(0, 0, 0));
      g.fillOval(675, 50, 15, 15);
      g.fillOval(725, 50, 15, 15);
   }
   public static void drawSmile(Graphics g)
   {
      g.setColor(new Color(0, 0, 0));
      g.drawArc(675, 100, 100, 25, 0, 90);
   }
   public static void drawRay(Graphics g)
   {
      g.setColor(new Color (255, 255, 0));
      //1st ray (from top to bottom)
      g.drawLine(660, 25, 610, 25);
      //2nd ray
      g.drawLine(650, 100, 615, 115);
      //3rd ray
      g.drawLine(685, 145, 670, 180);
      //4th ray
      g.drawLine(775, 140, 775, 190);
   }
}