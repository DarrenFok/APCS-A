// IceCream.java

package Lab20a;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;
import javax.swing.*;

public class IceCream extends JFrame {
    public static void drawCircle(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(255,255,255));
        g2d.fill(new Ellipse2D.Double(100,100,200,200));
    }
    public static void drawCone(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(255,229,180));
        Polygon cone = new Polygon();
        cone.addPoint(75,200);
        cone.addPoint(325,200);
        cone.addPoint(200,450);
        g2d.fillPolygon(cone);
    }
    public static void drawSprinkles(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        Random rndInt = new Random(12345);
        for(int k = 1; k <= 30; k++){
            int x = rndInt.nextInt(100) + 150;
            int y = rndInt.nextInt(25) + 150;
            int red = rndInt.nextInt(256);
            int green = rndInt.nextInt(256);
            int blue = rndInt.nextInt(256);
            g2d.setColor(new Color(red,green,blue));
            g2d.fill(new Ellipse2D.Double(x,y,5,5));
        }
    }
    public static void drawCherry(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.RED);
        g2d.fill(new Ellipse2D.Double(190,75,30,30));
        g2d.setColor(new Color(139,0,0));
        g2d.drawLine(205,75,205,65);
    }
}
