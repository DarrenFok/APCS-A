// Lab03v80.java
// This is the 80 point version.
// Darren Fok
// October 23rd, 2020
// APCS, Chris Robinson
// This program computes hours, minutes and seconds from seconds.


public class Lab03v80
{
	public static void main(String[] args)
	{
		System.out.println("\nLab03, 100 Point Version\n");
      /**Fields**/
      int start = 10000;
      int hours = start / 3600;
      int hoursLeftover = start % 3600;
      int minutes = hoursLeftover / 60;
      int seconds = hoursLeftover % 60;
      
      System.out.println("Starting seconds:  " + start);
      System.out.println("Hours:             " + hours);
      System.out.println("Minutes:           " + minutes);
      System.out.println("Seconds:           " + seconds);

	}


}

