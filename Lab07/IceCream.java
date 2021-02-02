// IceCream.java

import java.awt.*;
import java.applet.*;
import java.util.*;

class IceCream
{
   public static void drawCircle (Graphics g)
   {
      g.setColor(new Color(255, 255, 255));
      g.fillOval(100, 100, 200, 200);
   }
   public static void drawCone (Graphics g)
   {
      Polygon cone = new Polygon();
      cone.addPoint(75, 200);
      cone.addPoint(325, 200);
      cone.addPoint(200, 450);
      g.setColor(new Color(255, 229, 180));
      g.fillPolygon(cone);
    }
    public static void drawSprinkles (Graphics g)
    {
      Random rndInt = new Random(12345);
      for(int k = 1; k <= 30; k++)
      {
         int x = rndInt.nextInt(100) + 150;
         int y = rndInt.nextInt(25) + 150;
         int red = rndInt.nextInt(256);
         int green = rndInt.nextInt(256);
         int blue = rndInt.nextInt(256);
         g.setColor(new Color(red, green, blue));
         g.fillOval(x, y, 5, 5);
      }   
    }
} 
