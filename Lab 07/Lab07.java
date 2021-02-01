// Lab07v110.java
// This is the 110 point version.
// Darren Fok
// Feburary 1st, 2021
// APCS, Mr. Robinson
// This program draws a nice picture of a person, their ice cream cone and the beach.

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class Lab07 extends Applet
{
	
	public void paint(Graphics g) 	
	{	
	   Background.drawTop(g);
      Background.drawBottom(g);
      Sun.drawMain(g);
      Sun.drawRay1(g);
      Sun.drawRay2(g);   
	
	
	
	}
		
}



    
 