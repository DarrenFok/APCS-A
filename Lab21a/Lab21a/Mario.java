package Lab21a;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;

public class Mario extends JFrame {
    public static void drawMario(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        //Background
        g2d.setColor(new Color(255,204,0));
        g2d.fill(new Rectangle2D.Double(50,50,750,400));

        //Face
        g2d.setColor(new Color(236,188,180));
        g2d.fill(new Ellipse2D.Double(200,100,300,300));

        //Eyes
        g2d.setColor(Color.black);
        g2d.fill(new Ellipse2D.Double(350,250,30,50));
        g2d.fill(new Ellipse2D.Double(450,250,30,50));

        //Mario Hat
        g2d.setColor(Color.red);
        g2d.fill(new Ellipse2D.Double(200,100,300,140));
        g2d.fill(new Ellipse2D.Double(350,180,200,80));
        g2d.setColor(Color.white);
        g2d.fill(new Ellipse2D.Double(350,130,70,70));
        g2d.setColor(Color.red);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 60));
        g2d.drawString("M",360,190);

        //Mustache
        g2d.setColor(new Color(102,51,0));
        g2d.fill(new Rectangle2D.Double(350,320,100,20));

        //Mouth
        QuadCurve2D q = new QuadCurve2D.Double();
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(3));
        q.setCurve(350,350,390,370,430,350);
        g2d.draw(q);

        //Mushroom
        //Stem
        g2d.setColor(new Color(236,188,180));
        g2d.fill(new Rectangle2D.Double(600,330,100,70));
        //Cap
        g2d.setColor(Color.white);
        g2d.fill(new Ellipse2D.Double(550,250,200,100));
        g2d.setColor(Color.red);
        g2d.fill(new Ellipse2D.Double(600,280,50,50));
        g2d.fill(new Ellipse2D.Double(670,300,30,30));
        //Eyes
        g2d.setColor(Color.black);
        g2d.fill(new Ellipse2D.Double(620,360,10,30));
        g2d.fill(new Ellipse2D.Double(650,360,10,30));
    }
}
