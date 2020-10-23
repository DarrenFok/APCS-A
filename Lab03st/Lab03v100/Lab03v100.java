// Lab03v100.java
// This is the 100 point version.
// Darren Fok
// October 23rd, 2020
// APCS, Chris Robinson
// This program computes hours, minutes, seconds and milliseconds from milliseconds.


public class Lab03v100
{
	public static void main(String[] args)
	{
		System.out.println("\nLab03, 100 Point Version\n");
      /**Fields**/
      int start = 10000123;
      int hours = start / 3600000;
      int hoursLeftover = start % 3600000;
      int minutes = hoursLeftover / 60000;
      int minutesLeftover = hoursLeftover % 60000;
      int seconds = minutesLeftover / 1000;
      int milliseconds = minutesLeftover % 1000; 
      
      System.out.println("Starting milli-seconds:  " + start);
      System.out.println("Hours:                   " + hours);
      System.out.println("Minutes:                 " + minutes);
      System.out.println("Seconds:                 " + seconds);
      System.out.println("Milli Seconds:           " + milliseconds);  

	}


}

