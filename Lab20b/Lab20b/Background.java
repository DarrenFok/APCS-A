//Background.java

package Lab20b;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Background extends JFrame {
    public static void draw (Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(new Color(51,153,255));
        g2d.fill(new Rectangle2D.Double(0,0,800,450));
    }
}
