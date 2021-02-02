// Lab07v110.java
// This is the 110 point version.
// Darren Fok
// Feburary 1st, 2021
// APCS, Mr. Robinson
// This program draws a nice picture of an ice cream cone, the sun and the beach.

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class Lab07v110 extends Applet
{
	
	public void paint(Graphics g) 	
	{	
      //Background
	   Background.drawSky(g);
      Background.drawSand(g);
      //Sun
      Sun.drawMain(g);
      Sun.drawEyes(g);
      Sun.drawSmile(g);
	   Sun.drawRay(g);
      //Ice Cream Cone
      IceCream.drawCircle(g);
      IceCream.drawCone(g);
      IceCream.drawSprinkles(g);
	}
		
}
