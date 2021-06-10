//Kirby.java

package Lab20b;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.QuadCurve2D;

public class Kirby extends JFrame {
    public static void drawKirby (Graphics g, int red, int green, int blue){
        Graphics2D g2d = (Graphics2D)g;
        //Body
        g2d.setColor(new Color(red, green, blue));
        g2d.fill(new Ellipse2D.Double(300, 125, 200, 200));

        //Arms
        g2d.fill(new Ellipse2D.Double(280, 140, 50, 100)); //left arm
        g2d.fill(new Ellipse2D.Double(470, 140, 50, 100)); //right arm

        //Eyes
        g2d.setColor(Color.black);
        g2d.fill(new Ellipse2D.Double(350,150,20,50)); //left eye
        g2d.fill(new Ellipse2D.Double(425,150,20,50)); //right eye

        //Mouth
        QuadCurve2D q = new QuadCurve2D.Double();
        q.setCurve(350,230,388,250,445,230);
        g2d.draw(q);

        //Draw Shoes
        g2d.setColor(new Color(204,0,0));
        g2d.fill(new Ellipse2D.Double(280, 290, 100,50));
        g2d.fill(new Ellipse2D.Double(415,290,100,50));
    }
}
