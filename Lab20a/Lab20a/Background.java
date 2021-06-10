package Lab20a;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class Background extends JPanel{
    public static void drawSky(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(51,204,255));
        g2d.fill(new Rectangle2D.Double(0,0,800,300));
    }
    public static void drawSand(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(194,178,128));
        g2d.fill(new Rectangle2D.Double(0,300,800,150));
    }
}
