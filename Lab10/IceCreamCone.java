// IceCream.java
// This file corresponds with Lab10v100.java

import java.awt.*;

public class IceCreamCone {
   //Attributes
   private Color scoopColor; //Color of Ice Cream
   private Point scoopStart; //Starting coordinates of Ice Cream circle
   private int scoopDiameter; //Diameter of Ice Cream circle, is both width and height for perfect circle

   private Color coneColor; //Color of cone
   private Point coneOne; //Three points of cone triangle
   private Point coneTwo;
   private Point coneThree;

   //Default Constructor
   public IceCreamCone() {
      scoopStart = new Point(100, 100);
      scoopColor = Color.black;
      scoopDiameter = 200;

      coneColor = Color.black;
      coneOne = new Point(75, 200);
      coneTwo = new Point(325, 200);
      coneThree = new Point(200, 450);
   }

   //Parameterizied Constructor
   public IceCreamCone(Color sC, Point sS, int sD, Color cC, Point c1, Point c2, Point c3) {
      scoopColor = sC;
      scoopStart = sS;
      scoopDiameter = sD;

      coneColor = cC;
      coneOne = c1;
      coneTwo = c2;
      coneThree = c3;
   }

   //Methods
   public void drawScoop (Graphics g)
   {
      g.setColor(scoopColor);
      g.fillOval(scoopStart.getX(), scoopStart.getY(), scoopDiameter, scoopDiameter);
   }

   public void drawCone (Graphics g){
      Polygon cone = new Polygon();
      cone.addPoint(coneOne.getX(), coneOne.getY());
      cone.addPoint(coneTwo.getX(), coneTwo.getY());
      cone.addPoint(coneThree.getX(), coneThree.getY());
      g.setColor(coneColor);
      g.fillPolygon(cone);
   }

   public void drawTotal (Graphics g){
      drawScoop(g);
      drawCone(g);
   }

   //Getters and Setters
   public Color getScoopColor() {
      return scoopColor;
   }

   public void setScoopColor(Color scoopColor) {
      this.scoopColor = scoopColor;
   }

   public Point getScoopStart() {
      return scoopStart;
   }

   public void setScoopStart(Point scoopStart) {
      this.scoopStart = scoopStart;
   }

   public int getScoopDiameter() {
      return scoopDiameter;
   }

   public void setScoopDiameter(int scoopDiameter) {
      this.scoopDiameter = scoopDiameter;
   }

   public Color getConeColor() {
      return coneColor;
   }

   public void setConeColor(Color coneColor) {
      this.coneColor = coneColor;
   }

   public Point getConeOne() {
      return coneOne;
   }

   public void setConeOne(Point coneOne) {
      this.coneOne = coneOne;
   }

   public Point getConeTwo() {
      return coneTwo;
   }

   public void setConeTwo(Point coneTwo) {
      this.coneTwo = coneTwo;
   }

   public Point getConeThree() {
      return coneThree;
   }

   public void setConeThree(Point coneThree) {
      this.coneThree = coneThree;
   }
}
      