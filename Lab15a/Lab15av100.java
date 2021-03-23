// Lab15av100.java
// This is the 110 point version.
// Darren Fok
// March 23rd, 2021
// APCS, Mr. Robinson
// This program creates a magic square (size depending on input) and checks for whether the output is a magic square.


import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab15av100
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the odd# size of the Magic Square -->  ");
        int size = input.nextInt();
        MagicSquare magic = new MagicSquare(size);

        magic.computeMagicSquare();
        magic.displayMagicSquare();
        magic.expectedSum();            //Displays the expected sum
        magic.checkRows();          // for 100 & 110 Point Version Only
        magic.checkColumns();		 // for 100 & 110 Point Version Only
        magic.checkDiagonals();	 	 // for 100 & 110 Point Version Only
    }
}


class MagicSquare
{
    private int size;
    private int[][] magic;
    private DecimalFormat output;

    public MagicSquare(int s)
    {
        size = s;
        magic = new int[size][size];
        output = new DecimalFormat("000");
    }

    public void computeMagicSquare()
    {
        //Fields
        int number = 1;
        int row = 0;            //One goes in the first row
        int column = size / 2;  //in the middle column
        int currentRow;
        int currentColumn;

        while(number <= size*size) { //As long as the number is less than size^2
            magic[row][column] = number;
            number++;
            currentRow = row;
            currentColumn = column;
            row -= 1; 			 //moves up one
            column += 1;		 //moves right one

            if(row == -1){ //if at the top row (since 0-1 = -1), then reset to the bottom row
                row = size - 1;
            }
            if(column == size){ //if at the rightmost column, reset to the leftmost column
                column = 0;
            }
            if(magic[row][column] != 0){ //if neither row is top or column is leftmost...
                row = currentRow + 1;
                column = currentColumn;
                if(row == -1)
                    row = size - 1;
            }
        }
    }

    public void displayMagicSquare()
    {
        //Headline
        System.out.println();
        System.out.println(size + "x" + size + " Magic Square");
        System.out.println("==================");
        System.out.println();

        //Display MagicSquare
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(output.format(magic[i][j]) + " ");
            }
            System.out.println();
        }
    }
    public void expectedSum(){
        System.out.println();
        System.out.println("Expected Sum");
        System.out.println("============");
        System.out.println();
        //Expected Number
        int i = size/2;
        int j = size/2;
        int sum = (magic[i][j])*size;
        System.out.println(sum);
    }

    public void checkRows()
    {
        //Headline
        System.out.println();
        System.out.println("Checking Rows");
        System.out.println("=============");
        System.out.println();


        String string = "";
        for(int i = 0; i < size; i++){
            int rowSum = 0;
            for(int j = 0; j < size-1; j++){
                rowSum += magic[i][j];
                string += (output.format(magic[i][j]) + "+");
            }
            string += (output.format(magic[i][size-1]));
            rowSum += magic[i][size-1];
            string += (" = " + rowSum);
            string += "\n";
        }
        System.out.println(string);
    }

    public void checkColumns()
    {
        //Headline
        System.out.println();
        System.out.println("Checking Columns");
        System.out.println("================");
        System.out.println();

        String string = "";
        for(int i =0; i < size; i++){
            int columnSum = 0;
            for(int j = 0; j < size-1; j++){
                columnSum += magic[j][i];
                string += (output.format(magic[j][i]) + "+");
            }
            string += (output.format(magic[size-1][i]));
            columnSum += magic[size-1][i];
            string += (" = " + columnSum);
            string += "\n";
        }
        System.out.println(string);
    }

    public void checkDiagonals()
    {
        //Headline
        System.out.println();
        System.out.println("Checking Diagonals");
        System.out.println("==================");
        System.out.println();

        //Diagonal 1
        String one = "";
        int sumDiagonalOne = 0;
        for(int i = 0; i < size-1; i++){
            sumDiagonalOne += magic[i][i];
            one += (output.format(magic[i][i]) + "+");
        }
        sumDiagonalOne += magic[size-1][size-1];
        one += (output.format(magic[size-1][size-1]));

        //Diagonal 2
        String two = "";
        int sumDiagonalTwo = 0;
        for(int i = 0; i < size-1; i++){
            sumDiagonalTwo += magic[i][size-i-1];
            two += (output.format(magic[i][size-i-1]) + "+");
        }
        sumDiagonalTwo += (magic[size-1][size-(size-1)-1]);
        two += (output.format(magic[size-1][size-(size-1)-1]));

        //Print
        System.out.println(one + " = " + sumDiagonalOne);
        System.out.println(two + " = " + sumDiagonalTwo);

    }

}

