// Lab06v100.java
// This is the 100 point version.
// Darren Fok
// January 31st, 2021
// APCS, Mr. Robinson
// This program displays 100 random lines with color in quadrant one, 100 random suqares filled with color in quadrant two, 100 random random circles with color in
// quadrant three and an open-topped box with red, blue, green and yellow on its sides.


import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class Lab06v100 extends Applet
{
	
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
		
		// Draw Random Lines
      Random rndInt = new Random(12345);
      for(int k = 1; k <= 100; k++)
      {
         int x1 = rndInt.nextInt(390) + 10;
         int y1 = rndInt.nextInt(290) + 10;
         int x2 = rndInt.nextInt(390) + 10;
         int y2 = rndInt.nextInt(290) + 10;
         int red = rndInt.nextInt(256);
         int green = rndInt.nextInt(256);
         int blue = rndInt.nextInt(256);
         g.setColor(new Color(red, green, blue));
         g.drawLine(x1,y1,x2,y2);
      }
		
		// Draw Random Squares
      for(int k = 1; k <= 100; k++)
      {
         int x = rndInt.nextInt(340) + 400;
         int y = rndInt.nextInt(240) + 10;
         int red = rndInt.nextInt(256);
         int green = rndInt.nextInt(256);
         int blue = rndInt.nextInt(256);
         g.setColor(new Color(red, green, blue));
         g.fillRect(x,y,50,50);
      }
		
		// Draw Random Circles
      for(int k = 1; k <= 100; k++)
      {
         int x = rndInt.nextInt(200) + 10;
         int y = rndInt.nextInt(100) + 300;
         int red = rndInt.nextInt(256);
         int green = rndInt.nextInt(256);
         int blue = rndInt.nextInt(256);
         int z = rndInt.nextInt(200);
         g.setColor(new Color(red, green, blue));
         g.drawOval(x,y,z,z);
      }
		
		// Draw 3-D Box
	   Polygon one = new Polygon(); //green
      Polygon two = new Polygon(); //red
      Polygon three = new Polygon(); //blue
      Polygon four = new Polygon(); //yellow
      
      //green
      one.addPoint(500, 350);
      one.addPoint(550, 400);
      one.addPoint(550, 500);
      one.addPoint(500, 450);
      g.setColor(new Color(0, 255, 0));
      g.fillPolygon(one);
      
      //red
      two.addPoint(550, 400);
      two.addPoint(650, 400);
      two.addPoint(650, 500);
      two.addPoint(550, 500);
      g.setColor(new Color(255, 0, 0));
      g.fillPolygon(two);
      
      //blue
      three.addPoint(600, 350);
      three.addPoint(650, 400);
      three.addPoint(600, 400);
      g.setColor(new Color(0, 0, 255));
      g.fillPolygon(three);
      
      //yellow
      four.addPoint(500, 350);
      four.addPoint(600, 350);
      four.addPoint(600, 400);
      four.addPoint(550, 400);
      g.setColor(new Color(255, 255, 0));
      g.fillPolygon(four);
	
	}
		
}



    
 