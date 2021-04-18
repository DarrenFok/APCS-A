// Lab17bv110.java
// This is the 110 point version.
// Darren Fok
// April 17th, 2021
// APCS, Mr. Robinson
// This program displays a square fractal with an assortment of colors (based on a pattern).


import java.awt.*;
import java.applet.*;


public class Lab17bv110 extends Applet
{
	public void paint (Graphics g)
	{
		drawSquare1(g,1000,650);
      setSize(1000,650); //Set size of window
	}

	public void drawSquare1(Graphics g, int maxX, int maxY) {
		int midX = maxX / 2;
		int midY = maxY / 2;
		int startWidth = maxX / 4;
		int startHeight = maxY / 4;
		int tlX = midX - (startWidth / 2); // Top Left X
		int tlY = midY - (startHeight / 2); // Top Left Y
		g.fillRect(tlX, tlY, startWidth, startHeight);

		//Top left
		g.setColor(Color.red);
		drawFourSquares(g, tlX - startWidth / 2, tlY - startHeight / 2, startWidth / 2, startHeight / 2, 1);
		//Top right
		g.setColor(Color.blue);
		drawFourSquares(g, tlX + startWidth, tlY - startHeight / 2, startWidth / 2, startHeight / 2, 2);
		//Bottom right
		g.setColor(Color.yellow);
		drawFourSquares(g, tlX + startWidth, tlY + startHeight, startWidth / 2, startHeight / 2, 3);
		//Bottom left
		g.setColor(Color.green);
		drawFourSquares(g, tlX - startWidth / 2, tlY + startHeight, startWidth / 2, startHeight / 2, 4);
	}

	public void delay(long n) {
		n *= 1000;
		long startDelay = System.nanoTime();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.nanoTime();
	}

	public void drawTopLeft(Graphics g, int xStart, int yStart, int width, int height) {
		//Top left
		g.setColor(Color.red);
		drawFourSquares(g, xStart - width / 2, yStart - height / 2, width / 2, height / 2, 1);
		//Top right
		g.setColor(Color.blue);
		drawFourSquares(g, xStart + width, yStart - height / 2, width / 2, height / 2, 2);
		//Bottom left
		g.setColor(Color.green);
		drawFourSquares(g, xStart - width / 2, yStart + height, width / 2, height / 2, 4);
	}

	public void drawBottomRight(Graphics g, int xStart, int yStart, int width, int height) {
		//Top left
		g.setColor(Color.red);
		drawFourSquares(g, xStart - width / 2, yStart - height / 2, width / 2, height / 2, 1);
		//Bottom right
		g.setColor(Color.yellow);
		drawFourSquares(g, xStart + width, yStart + height, width / 2, height / 2, 3);
		//Bottom left
		g.setColor(Color.green);
		drawFourSquares(g, xStart - width / 2, yStart + height, width / 2, height / 2, 4);
	}

	public void drawBottomLeft(Graphics g, int xStart, int yStart, int width, int height) {
		//Top right
		g.setColor(Color.blue);
		drawFourSquares(g, xStart + width, yStart - height / 2, width / 2, height / 2, 2);
		//Bottom right
		g.setColor(Color.yellow);
		drawFourSquares(g, xStart + width, yStart + height, width / 2, height / 2, 3);
		//Bottom left
		g.setColor(Color.green);
		drawFourSquares(g, xStart - width / 2, yStart + height, width / 2, height / 2, 4);
	}

	public void drawTopRight(Graphics g, int xStart, int yStart, int width, int height) {
		//Top left
		g.setColor(Color.red);
		drawFourSquares(g, xStart - width / 2, yStart - height / 2, width / 2, height / 2, 1);
		//Top right
		g.setColor(Color.blue);
		drawFourSquares(g, xStart + width, yStart - height / 2, width / 2, height / 2, 2);
		//Bottom right
		g.setColor(Color.yellow);
		drawFourSquares(g, xStart + width, yStart + height, width / 2, height / 2, 3);
	}

	public void drawFourSquares(Graphics g, int xStart, int yStart, int width,
								int height, int side) {
		if (width >= 1) {
			g.fillRect(xStart, yStart, width, height);

			switch (side) {
				// Top left
				case 1: drawTopLeft(g, xStart, yStart, width, height); break;
				// Top right
				case 2: drawTopRight(g, xStart, yStart, width, height); break;
				// Bottom left
				case 3: drawBottomLeft(g, xStart, yStart, width, height); break;
				// Bottom right
				case 4: drawBottomRight(g, xStart, yStart, width, height); break;

				default: break;
			}
		}
	}
}


