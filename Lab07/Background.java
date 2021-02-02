// Background.java

import java.awt.*;
import java.applet.*;

class Background
{
   public static void drawSky(Graphics g)
   {
      g.setColor(new Color(51,204,255));
      g.fillRect(0,0,800,300);
   }
   public static void drawSand(Graphics g)
   {
      g.setColor(new Color(194, 178, 128));
      g.fillRect(0,300,800,150);
   }
} 