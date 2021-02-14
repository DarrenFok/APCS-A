// Lab10v100.java
// This is the 100 point version.
// Darren Fok
// February 10th, 2021
// APCS, Mr. Robinson
// This program creates an image useing TWO examples of inheritance (is-a) and THREE examples of composition (has-a).
// The image drawn is a strawberry ice cream cone with sprinkles and a cherry on top, along with a spoon on the side.

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class Lab10v100 extends Applet
{
   public void paint(Graphics g){
      CherryOnTop instance = new CherryOnTop();
      instance.drawTotal(g);
      instance.drawSprinkles(g);
      instance.drawCherry(g);
      instance.drawSpoon(g);
   }
}

class CherryOnTop extends StrawberrySprinkle
{
   public void drawCherry (Graphics g){
      Cherry c = new Cherry(Color.red);
      c.draw(g);
   }
   public void drawSpoon (Graphics g){
      Spoon s = new Spoon(new Color(255,204,203));
      s.draw(g);
   }
}  

class StrawberrySprinkle extends IceCreamCone
{
   public StrawberrySprinkle(){
      setScoopColor(new Color(255, 182, 193));
      setConeColor(new Color(255, 229, 180));
   }

   public void drawSprinkles (Graphics g){
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