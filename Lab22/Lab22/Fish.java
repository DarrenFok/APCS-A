// Fish.java
// Darren Fok
// June 12th, 2021
// This file is required for Lab22v100.java

package Lab22;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Fish extends JFrame {
    public static void drawFish(Graphics g, Color color, int x, int y){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(color);

        //Tail
        Polygon tail = new Polygon();
        tail.addPoint(x,y);
        tail.addPoint(x, y+50);
        tail.addPoint(x+25, y+25);
        g2d.fillPolygon(tail);
        //outline
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawPolygon(tail);

        //Body
        g2d.setColor(color);
        g2d.fill(new Ellipse2D.Double(x+20, y, 70,50));
        //outline
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(3));
        g2d.draw(new Ellipse2D.Double(x+20, y, 70,50));
    }

}
