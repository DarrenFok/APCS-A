package Lab20a;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;
import javax.swing.*;

public class Sun extends JPanel{
    public static void drawMain(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(255,255,0));
        g2d.fill(new Ellipse2D.Double(650,0,150,150));
    }
    public static void drawEyes(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(0,0,0));
        g2d.fill(new Ellipse2D.Double(675,50,15,15));
        g2d.fill(new Ellipse2D.Double(725,50,15,15));
    }
    public static void drawSmile(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(0,0,0));
        QuadCurve2D q = new QuadCurve2D.Double();
        q.setCurve(675,100,725,125,775,100);
        g2d.draw(q);
    }
    public static void drawRay(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(255,255,0));
        g2d.draw(new Line2D.Double(660,25,610,25));
        g2d.draw(new Line2D.Double(650,100,615,115));
        g2d.draw(new Line2D.Double(685,145,670,180));
        g2d.draw(new Line2D.Double(775,140,775,190));
    }
}
