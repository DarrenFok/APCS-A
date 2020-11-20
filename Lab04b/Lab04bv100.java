// Lab04bv100.java
// This is the 100 point version.
// Darren Fok
// November 20, 2020
// APCS, Mr. Robinson
// This program displays different shapes such as a cube, the letters 'APCS', a sphere, a pacflower and a circumscribed triangle.


import java.awt.*;
import java.applet.*;


public class Lab04bv100 extends Applet
{
   public void init()
   {
      setSize(1000,650); //width: 1000, height: 650
   }

	public void paint(Graphics g)
	{
		// DRAW CUBE
      /* back square */
      g.drawLine(50, 50, 300, 50);
      g.drawLine(50, 50, 50, 300);
      g.drawLine(50, 300, 300, 300);
      g.drawLine(300, 50, 300, 300);
      /* front square */
      g.drawLine(125, 125, 375, 125);
      g.drawLine(125, 125, 125, 375);
      g.drawLine(125, 375, 375, 375);
      g.drawLine(375, 125, 375, 375);
      /* connecting lines*/
      g.drawLine(50, 50, 125, 125);
      g.drawLine(300, 50, 375, 125);
      g.drawLine(50, 300, 125, 375);
      g.drawLine(300, 300, 375, 375);


		// DRAW SPHERE
      /* big circle */
      g.drawOval(650, 50, 300, 300);
      
      /* vertical */
      g.drawOval(695, 50, 210, 300);
      g.drawOval(730, 50, 140, 300);
      g.drawOval(764, 50, 70, 300);
      //increase x1 35, increase x2 70
      
      /* horizontal */
      g.drawOval(650, 170, 300, 70);
      g.drawOval(650, 135, 300, 140); 
      g.drawOval(650, 100, 300, 210);
      //decrease y1 35, increase y2 70



		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
      /* big circle */
      g.drawOval(725, 375, 250, 250);
      
      /* triangle */
      g.drawLine(850, 375, 755, 580);
      g.drawLine(850, 375, 945, 580);
      g.drawLine(755, 580, 945, 580);
      
      /* small circle */
      g.drawOval(789, 459, 121, 121);



		// DRAW APCS
      /* Letter A */
      g.fillRect(50, 475, 75, 25);
      g.fillRect(50, 475, 25, 125);
      g.fillRect(100, 475, 25, 125);
      g.fillRect(50, 525, 75, 25);
      
      /* Letter P */
      g.fillRect(150, 475, 75, 25);
      g.fillRect(150, 475, 25, 125);
      g.fillRect(150, 525, 75, 25);
      g.fillRect(200, 475, 25, 75);
      
      /* Letter C */
      g.fillRect(250, 475, 75, 25);
      g.fillRect(250, 475, 25, 125);
      g.fillRect(250, 575, 75, 25);
      
      /* Letter S */
      g.fillRect(350, 475, 75, 25);
      g.fillRect(350, 475, 25, 75);
      g.fillRect(350, 525, 75, 25);
      g.fillRect(400, 525, 25, 75);
      g.fillRect(350, 575, 75, 25);
      

		// DRAW PACMEN FLOWER
      /* right */
      g.fillArc(600, 425, 100, 100, 45, 270);
      /* up */
      g.fillArc(535, 360, 100, 100, 135, 270);
      /* left */
      g.fillArc(470, 425, 100, 100, 225, 270);
      /* down */
      g.fillArc(535, 490, 100, 100, 315, 270);



	}
}