//Cherry.java
// This file corresponds with Lab10v100

import java.awt.*;

public class Cherry {
    //Attributes
    private Color color;

    //Default Constructor
    public Cherry(){
        color = Color.red;
    }

    //Parameterized Constructor
    public Cherry(Color c){
        color = c;
    }

    //Methods
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(190, 80, 25, 25);
    }
}
