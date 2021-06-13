// Display.java
// Darren Fok
// June 12th, 2021
// This file is required for Lab22v100.java

package Lab22;

import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

public class Display extends JPanel implements ActionListener {
    //Fields
    JLabel amountLabel;
    JLabel colorLabel;

    JTextField amountField;

    JButton submitAmount;

    JButton btn1; //red
    JButton btn2; //blue
    JButton btn3; //yellow

    int numberOfFish = 0;
    int color = 0;

    public Display() {
        setLayout(new FlowLayout());
        setBackground(Color.lightGray);

        //Create labels
        amountLabel = new JLabel("Amount of fish:");
        colorLabel = new JLabel("Color of fish:");

        //Create fields
        amountField = new JTextField(10);

        //Create buttons
        btn1 = new JButton("Red");
        btn2 = new JButton("Blue");
        btn3 = new JButton("Yellow");

        //Add items
        //Enter amount of fish
        add(amountLabel);
        add(amountField);

        //Enter color of fish
        add(colorLabel);
        add(btn1);
        add(btn2);
        add(btn3);

        //Action listeners
        amountField.addActionListener(this);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        numberOfFish = Integer.parseInt(amountField.getText());

        if (e.getActionCommand().equals("Red")) {
            color = 1;
        } else if (e.getActionCommand().equals("Blue")) {
            color = 2;
        } else if (e.getActionCommand().equals("Yellow")) {
            color = 3;
        }
        setVisible(true);
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        //Blue background
        g2d.setColor(new Color(51, 153, 255));
        g2d.fill(new Rectangle2D.Double(50, 50, 700, 350));

        //Sand
        g2d.setColor(new Color(194,178,128));
        g2d.fill(new Rectangle2D.Double(50,370, 700,30));

        //Plants
        g2d.setColor(new Color(0,204,0));
        g2d.fill(new Rectangle2D.Double(70,320,20,80));
        g2d.fill(new Rectangle2D.Double(110,350,10,50));
        g2d.fill(new Rectangle2D.Double(140,310,20,90));
        g2d.fill(new Rectangle2D.Double(170,340,10,60));

        //Treasure Chest
        g2d.setColor(new Color(150,75,0));
        g2d.fill(new Rectangle2D.Double(600, 320, 120,60));
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(4));
        g2d.draw(new Line2D.Double(600,350,720,350));
        g2d.setColor(Color.yellow);
        g2d.fill(new Rectangle2D.Double(645,340,30,20));
        g2d.setColor(Color.black);
        g2d.draw(new Rectangle2D.Double(647,342,25,15));

        //Bubbles
        g2d.setColor(new Color(48,213,200));
        g2d.fill(new Ellipse2D.Double(620,280,25,25));
        g2d.fill(new Ellipse2D.Double(640,240,40,40));
        g2d.fill(new Ellipse2D.Double(620,200,25,25));

        Random rnd = new Random();

        if (this.color == 1) { //red fish
            for (int k = 1; k <= numberOfFish; k++) {
                int x = rnd.nextInt(610 - 50 + 1) + 50;
                int y = rnd.nextInt(300 - 50 + 1) + 50;
                Fish.drawFish(g, Color.red, x, y);
            }
        }
        else if (this.color == 2) {
            for (int k = 1; k <= numberOfFish; k++) {
                int x = rnd.nextInt(610 - 50 + 1) + 50;
                int y = rnd.nextInt(300 - 50 + 1) + 50;
                Fish.drawFish(g, Color.blue, x, y);
            }
        }
        else if (this.color == 3) {
            for (int k = 1; k <= numberOfFish; k++) {
                int x = rnd.nextInt(610 - 50 + 1) + 50;
                int y = rnd.nextInt(300 - 50 + 1) + 50;
                Fish.drawFish(g, Color.yellow, x, y);
            }
        }
    }
}
