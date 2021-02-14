// Point.java
// This file corresponds with Lab10v100

public class Point {
   //Attributes
   private int x;
   private int y;


   //Default Constructor
   public Point() {
      x = 0;
      y = 0;
   }

   //Parameterized Constructor
   public Point(int x, int y) {
      this.x = x;
      this.y = y;
   }

   //Modules
   public int getX() {
      return x;
   }

   public void setX(int x) {
      this.x = x;
   }

   public int getY() {
      return y;
   }

   public void setY(int y) {
      this.y = y;
   }
}
   