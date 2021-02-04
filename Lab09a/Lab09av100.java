// Lab09av100.java
// This is the 100 point version.
// Darren Fok
// Feburary 4th, 2021
// APCS, Mr. Robinson
// This program takes a numerator and denominator, and displays its result as a decimal. It also reduces the fraction. 


import java.util.Scanner;


public class Lab09av100
{
    private static int num, den;   // numerator and denominator of the rational number

    public static void main (String[] args)
    {
        enterData();
        Rational r = new Rational(num,den);
        r.displayData();
    }

    public static void enterData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the numerator ----> ");
        num = input.nextInt();
        System.out.print("\nEnter the denominator --> ");
        den = input.nextInt();
    }
}



class Rational
{
    private int firstNum;
    private int firstDen;
    private int gcf;

    public Rational(int n, int d) {
        firstNum = n;
        firstDen = d;
    }

    public String getOriginal(){
        String original = firstNum + "/" + firstDen;
        return original;
    }

    public String getReduced(){
        int gcf = getGCF(firstNum, firstDen);
        int reduceNum = (firstNum/gcf);
        int reduceDen = (firstDen/gcf);
        String reduced = new String (reduceNum + "/" + reduceDen);
        return reduced;
    }

    public void displayData()
    {
        System.out.println();
        System.out.println(getOriginal() + " equals " + getDecimal());
        System.out.println();
        System.out.println("and reduces to " + getReduced());
        System.out.println();
    }

    private int getGCF(int n1,int n2)
    {
        int rem = 0;
        do
        {
            rem = n1 % n2;
            if (rem == 0)
                gcf = n2;
            else
            {
                n1 = n2;
                n2 = rem;
            }
        }
        while (rem != 0);
        return gcf;
    }
    public int getNum(){
        return firstNum;
    }
    public int getDen(){
        return firstDen;
    }
    public double getDecimal(){
        double d = firstNum;
        double ans = d / firstDen;
        return ans;
    }

}








