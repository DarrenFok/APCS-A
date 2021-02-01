// Lab05v100.java
// This is the 100 point verison.
// Darren Fok
// January 31st, 2021
// APCS, Mr. Robinson
// This program displays a pattern that appears to have a curve, but is a result of an illusion from many lines. 


import java.awt.*;
import java.applet.*;


public class Lab05v100 extends Applet
{
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;
		g.drawRect(10,10,width,height);
      
      //Draw bottom-left corner
      for(int a = 50, b = 0; a <= 990; a += 15, b += 20)
         g.drawLine(x2 - a, 640, 10, y1 - b/2);
  
            
      //Draw bottom-right corner
      for(int a = 50, b = 0; a <= 990; a += 15, b += 20)
         g.drawLine(x1 + a, 640, 990, y1 - b/2);
      
      //Draw top-right corner
      for(int a = 50, b = 0; a <= 990; a += 15, b += 20)
         g.drawLine(x1 + a, 10, 990, 10 + b/2);
      
      
      //Draw top-left corner
      for(int a = 50, b = 0; a <= 990; a += 15, b += 20)
         g.drawLine(x2 - a, 10, 10, 10 + b/2);   
	}
}

