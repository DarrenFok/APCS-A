// Lab11av100.java
// This is the 100 point version.
// Darren Fok
// February 15th, 2021
// APCS, Mr. Robinson
// This is the "Sieves of Eratosthenes" Program, which displays all prime numbers within a specified range.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab11av100
{
	public static void main(String[] args)
	{
		System.out.println("\nLab11a\n");
		for(;;){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the primes upper bound ===>>   ");
			final int MAX = input.nextInt();
			boolean primes[] = new boolean[MAX];   // Array to hold primes, true or false.
			// The index of the array represents each number.
			// The value stored at each index is true or false, prime or not prime.
			computePrimes(primes);
			displayPrimes(primes);
			System.out.println("\n");
		}
	}

	public static void computePrimes(boolean[] primes)
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");
      
      // See the word document for Steps 1-4.
      // Step 1: A for-loop to set all of numbers in the array from 2 to 100 to true,
      // whether prime or not.
      // Step 2: A for-loop to run through all of the numbers in the array.
            // A for-loop inside the above for-loop to check each number, starting with 2.
            // If it is prime, change all of its multiples to not prime.
      // Step 3-4: Process repeats until MAX is reached.

		for (int k = 2; k < primes.length; k++)
			primes[k] = true;

		for (int p = 2; p < primes.length; p++)
			for(int q = p * p; q < primes.length; q += p)
				primes[q] = false;
   }

	public static void displayPrimes(boolean[] primes)
	{
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		System.out.println();

      // A for-loop to print each index if prime.
		boolean prime = true;
		int x = 0;
		int y = 0;
		for(int number = 0; number < primes.length; number++){
			if (y%15 == 0 && prime!= false){
				System.out.println();
				prime = false;
			}

			if (primes[number] == true){
				x = number;
				DecimalFormat dformat = new DecimalFormat("0000");
				String formatted = dformat.format(x);
				System.out.print(formatted + " ");
				y++;
				prime = true;
			}
		}
	}
}



