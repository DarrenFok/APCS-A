// Lab08st.java
// The "Palindrome" Program
// This is the student starting file for Lab08.

import java.util.Scanner;

public class Lab08st
{
	public static void main (String args[])
	{
		System.out.println("\nLab08v80\n");
      Scanner input = new Scanner(System.in);
		boolean notFinished = false;
		do
		{
			System.out.print("Enter a string  ===>>  ");
			String str = input.nextLine();
			System.out.println();
			System.out.println("Entered String:     " + str);
			System.out.println("Palindrome:         " + Palindrome.isPal(str));
			System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));	  // used only for the 100 point version
			System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
			String repeat = input.nextLine();
			notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
			System.out.println();
		}
		while (notFinished);
	}
}



class Palindrome
{
	/*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: The value of true is returned if s is a Palindrome, false otherwise.
    * Note:          >>>>> This method is required for both the 80 point and the 100 point versions  <<<<<
	 */
	public static boolean isPal(String s)
	{
      int length = s.length();
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--)
            reverse = reverse + s.substring(i, i+1);
        boolean isEqual = s.equals(reverse);
        return isEqual;
	}  
   
   /*
	 * Precondition:  s is a String of one character.
	 * Postcondition: The value of true is returned if s is a letter and false otherwise.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	 */
   private static boolean isLetter(String letter)
   {
      String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = alphabet.indexOf(i); )
      return true;      // This statement is provided to allow initial compiling.
   }
   
	/*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: All non-letter characters are removed from s, and this "purged" String is returned.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	 */
	private static String purge(String s)
	{
      s.trim();
      return s;        // This statement is provided to allow initial compiling.
	}
   
   /*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: After purging all non-letter characters from s,
	 *                the value of true is returned if the resulting String is a Palindrome, false otherwise.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	 */
	public static boolean almostPal(String s)
	{
      return true;      // This statement is provided to allow initial compiling.
	}

}

