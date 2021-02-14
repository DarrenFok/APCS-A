// Spoon.java
// This file corresponds with Lab10v100

import java.awt.*;

public class Spoon {
    //Attributes
    private Color color;

    //Default Constructor
    public Spoon(){
        color = Color.gray;
    }

    //Parameterized Constructor
    public Spoon(Color c){
        color = c;
    }

    //Methods
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(400, 75, 50, 85);
        g.fillRect(420, 125, 10, 200);
    }
}
