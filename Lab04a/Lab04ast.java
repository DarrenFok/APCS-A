// Lab04av100.java
// This is the 100 point version.
// Darren Fok
// November 19, 2020
// APCS, Chris Robinson
// This program computes monthly payment, total payment and total interest from principal, annual rate and number of years. 


public class Lab04ast
{
	public static void main(String[] args)
	{
		System.out.println("Lab04a, 100 Point Version\n");

      //Fields
		double principal  = 250000;
		double annualRate = 4.85;
		double numYears   = 30;
      
      //Convert percentage to decimal, 4.85/100 = 0.0485
      double equationAnnualRate = annualRate / 100;
      
      //Convert years to month, 30*12 = 360
      double numMonths = numYears * 12;
      
      //Convert annual rate to monthly rate, 0.0485/12 = 0.00404166667
      double monthRate = equationAnnualRate / 12;
      
      double monthlyPayment = principal*((monthRate * Math.pow(1 + monthRate, numMonths))/(Math.pow(1 + monthRate, numMonths) -1));
      /* 
      M = P [ i(1 + i)^n ] / [ (1 + i)^n - 1]
      double principal = p
      double monthRate = i
      numMonths = n
      */
       
      //Round monthlyPayment to nearest hundredth 
      double monthlyRounded = Math.round(monthlyPayment * 100.0) / 100.0;

      //Convert monthly payment to total payment by multiplying it by amount of months
      double totalPayment = monthlyPayment * numMonths;
      
      //Round totalPayment to nearest hundredth
      double totalRounded = Math.round(totalPayment * 100.0) / 100.0;

      //Find totalInterest by subtracting principal from total payment
      double totalInterest =  totalPayment - principal;
      
      //Round totalInterest to nearest hundredth
      double totalInterestRounded = Math.round(totalInterest * 100.0) / 100.0; 
      
      //Output
      System.out.println("\nPrincipal:         $" + principal);
      System.out.println("Annual Rate:       " + annualRate +"%");
      System.out.println("Number of Years:   " + numYears);
      System.out.println("Monthly Payment:   $" + monthlyRounded);
      System.out.println("Total Payment:     $" + totalRounded);
      System.out.println("Total Interest:    $" + totalInterestRounded);

	}
}

