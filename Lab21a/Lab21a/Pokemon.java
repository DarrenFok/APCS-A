package Lab21a;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Pokemon extends JFrame {
    public static void drawPokemon(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        //Background
        g2d.setColor(new Color(0,204,0));
        g2d.fill(new Rectangle2D.Double(50,50,750,400));

        //Pokeball
        //Top and Bottom lids
        g2d.setColor(Color.red);
        g2d.fill(new Arc2D.Double(100,100,200,200,0,180,Arc2D.OPEN));
        g2d.setColor(Color.white);
        g2d.fill(new Arc2D.Double(100,100,200,200,180,180,Arc2D.OPEN));

        //Middle band and button
        g2d.fill(new Ellipse2D.Double(175,175,50,50));
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(7));
        g2d.draw(new Ellipse2D.Double(175,175,50,50));
        g2d.draw(new Line2D.Double(103,200,175,200));
        g2d.draw(new Line2D.Double(228,200,297,200));

        //Pikachu
        //Head
        g2d.setColor(Color.yellow);
        g2d.fill(new Ellipse2D.Double(400,100,250,175));

        //Eyes
        g2d.setColor(Color.BLACK);
        g2d.fill(new Ellipse2D.Double(450,150,30,50));
        g2d.fill(new Ellipse2D.Double(570,150,30,50));

        //Cheeks
        g2d.setColor(Color.red);
        g2d.fill(new Ellipse2D.Double(450,210,30,10));
        g2d.fill(new Ellipse2D.Double(570,210,30,10));

        //Ears
        Polygon ear1 = new Polygon();
        g2d.setColor(Color.yellow);
        ear1.addPoint(420, 70);
        ear1.addPoint(400,180);
        ear1.addPoint(450,150);
        g2d.fillPolygon(ear1);

        Polygon ear2 = new Polygon();
        ear2.addPoint(650,180);
        ear2.addPoint(600,150);
        ear2.addPoint(630,70);
        g2d.fillPolygon(ear2);

        //Mouth
        QuadCurve2D q = new QuadCurve2D.Double();
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(3));
        q.setCurve(450, 230,525,250,600,230);
        g2d.draw(q);

        //Body
        g2d.setColor(Color.yellow);
        g2d.fill(new Rectangle2D.Double(475,260,100,75));

        //Feet
        g2d.fill(new Ellipse2D.Double(450,320,50,30));
        g2d.fill(new Ellipse2D.Double(550,320,50,30));
    }
}
