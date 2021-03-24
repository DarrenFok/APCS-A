import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 *
 * 02-27-15 altered by Leon Schram
 * This file is made shorter to focus on the Lab15b assignment.
 *
 */
 
 
 
//////////////////////////////////////////////////////////////////////////
//
// This is the student starting file of the Lab15b assignment.
//
// This is the only file that students use to write their methods.
//
//////////////////////////////////////////////////////////////////////////
 
 
public class Picture extends SimplePicture
{
  ///////////////////// constructors //////////////////////////////////

  /**
   * Constructor that takes no arguments
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor
     */
    super();
  }

  /**
   * Constructor that takes a file name and creates the picture
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }

  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }

  /**
   * Constructor that takes a picture and creates a
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }

  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }

  ////////////////////// methods ///////////////////////////////////////

  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() +
      " height " + getHeight()
      + " width " + getWidth();
    return output;

  }


 ////////////////////////////////////////////////////////////////////////

      // REQUIRED FOR 80-POINTS
      public void grayScale()
      {
          Pixel[][] pixels = this.getPixels2D();
          for(Pixel[] rowArray : pixels){
              for(Pixel pixelObj : rowArray){
                  int average = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
                  pixelObj.setRed(average);
                  pixelObj.setGreen(average);
                  pixelObj.setBlue(average);
              }
          }
      }

//////////////////////////////////////////////////////////////////////////  

      // REQUIRED FOR 80-POINTS
      public void mirror() {
          Pixel[][] pixels = getPixels2D();
          Pixel rightPixel = null;
          Pixel leftPixel = null;
          Color tempColor;   //storing the temporary color value
          Color color1;
          int width = pixels[0].length/2;
          int length = pixels.length;

          for(int i = 0; i < width; i++){
              for(int j = 0; j < length; j++){
                  tempColor = this.getPixel(getWidth()-1-i,j).getColor();  //storing the right pixel color value
                  leftPixel = this.getPixel(i,j);
                  rightPixel = this.getPixel(getWidth()-1-i,j);
                  color1 = leftPixel.getColor();
                  rightPixel.setColor(color1);
                  leftPixel.setColor(tempColor);

              }
          }
      }
////////////////////////////////////////////////////////////////////////////////////////

      // REQUIRED FOR 80-POINTS
      public void upsideDown(){
          Pixel[][] pixels = this.getPixels2D();
          Pixel bottomPixel = null;
          Pixel topPixel = null;
          Color tempColor;
          Color color1;
          int width = pixels[0].length;
          int height = pixels.length/2;

          for(int i = 0; i < width; i++){
              for(int j = 0; j < height; j++){
                  tempColor = this.getPixel(i,getHeight()-1-j).getColor();  //storing the top pixel color value
                  bottomPixel = this.getPixel(i,j);
                  topPixel = this.getPixel(i,getHeight()-1-j);
                  color1 = bottomPixel.getColor();
                  topPixel.setColor(color1);
                  bottomPixel.setColor(tempColor);

              }
          }
      }    
      
//////////////////////////////////////////////////////////////////////////////////////////

   // REQUIRED FOR 90-POINTS
   public void mirrorVertical()
   {
       Pixel[][] pixels = this.getPixels2D();
       Pixel leftPixel = null;
       Pixel rightPixel = null;
       int height = pixels.length;
       int width = pixels[0].length;
       for(int row = 0; row < height; row++){
           for (int col = 0; col < width / 2; col++){
               leftPixel = pixels[row][col];
               rightPixel = pixels[row][width - 1 - col];
               rightPixel.setColor(leftPixel.getColor());
           }
       }
   }
   
//////////////////////////////////////////////////////////////////////////////////
   
   // REQUIRED FOR 90-POINTS
   public void mirrorHorizontal()
   {
       Pixel[][] pixels = this.getPixels2D();
       Pixel topPixel = null;
       Pixel bottomPixel = null;
       int height = pixels.length;
       int width = pixels[0].length;
       for(int row = 0; row < (height / 2); row++){
           for (int col = 0; col < width; col++){
               topPixel = pixels[row][col];
               bottomPixel = pixels[height - 1 - row][col];
               bottomPixel.setColor(topPixel.getColor());
           }
       }
   }
      
//////////////////////////////////////////////////////////////////////////////////////////////////      
    
   // REQUIRED FOR 90-POINTS
   public void mirrorDiagonal()
   {
       Pixel[][] pixels = this.getPixels2D();
       Pixel topRightPixel = null;
       Pixel bottomLeftPixel = null;
       int maxLength;
       if(pixels.length < pixels[0].length){
           maxLength = pixels.length;
       }
       else{
           maxLength = pixels[0].length;
       }
       for (int row = 0; row < maxLength; row++){
           for (int col = row; col < maxLength; col++){
               topRightPixel = pixels[row][col];
               bottomLeftPixel = pixels[col][row];
               topRightPixel.setColor(bottomLeftPixel.getColor());
           }
       }
   }
   
/////////////////////////////////////////////////////////////////////////////////////
   
   // REQUIRED FOR 100-POINTS
   public void mirrorTemple()
   {
       Pixel[][] pixels = this.getPixels2D();
       int mirrorPoint = 276;
       Pixel leftPixel = null;
       Pixel rightPixel = null;
       int count = 0;

       //Looping through the rows..
       for (int row = 27; row < 97; row++){
           //Looping from 13 to just before the mirror point
           for (int col = 13; col < mirrorPoint; col++){
               leftPixel = pixels[row][col];
               rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
               rightPixel.setColor(leftPixel.getColor());
           }
       }
   }
   
} 
