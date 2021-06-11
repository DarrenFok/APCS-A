package Lab21a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Display extends JPanel implements ActionListener{
    //Fields
    JLabel jlab01;
    int state = 0;
    JButton b1;
    JButton b2;
    JButton b3;

    public Display(){
        setLayout(new FlowLayout());

        jlab01 = new JLabel("Choose your Nintendo-themed picture:");
        JButton b1 = new JButton("Kirby");
        JButton b2 = new JButton("Pokemon");
        JButton b3 = new JButton("Mario");

        add(jlab01);
        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Kirby")){
            this.state = 1;
        }
        else if(e.getActionCommand().equals("Pokemon")){
            this.state = 2;
        }
        else if(e.getActionCommand().equals("Mario")){
            this.state = 3;
        }
        setVisible(true);
        repaint();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;

        if(this.state == 0){
            g2d.drawRect(50,50,750,400);
        }
        else if(this.state == 1){
            Kirby.drawKirby(g);
            repaint();
            revalidate();
        }
        else if(this.state == 2){
            Pokemon.drawPokemon(g);
            repaint();
            revalidate();
        }
        else if(this.state == 3){
            Mario.drawMario(g);
            repaint();
            revalidate();
        }
    }
}
