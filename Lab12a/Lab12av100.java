// Lab12av100.java
// This is the 100 point version.
// Darren Fok
// February 19th, 2021
// APCS, Mr. Robinson
// This program takes a deck of cards and shuffles them with the use of Dynamic Arrays. 



import java.util.ArrayList;
import java.util.Random;

public class Lab12av100
{
	public static void main(String[] args)
	{
		System.out.println("Lab12av100.java");
		System.out.println();     
        Deck deck = new Deck();
        System.out.println(deck);
	}
}


class Deck 
{
	private ArrayList<Card> cards;
	private int size;
	private static Random random = new Random();

	public Deck() 
    {
      size = 52;
      cards = new ArrayList<Card>();
      
      String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" }; //Possible suits
      String[] rank = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" }; //Possible rankings
		int[] value = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11 }; // Possible values
      
      int suits = suit.length; //size of suits array
      int ranks = rank.length; //size of ranks array
      
      for(int i = 0; i < suits; i++){
         for(int j = 0; j < ranks; j++){
            Card temp = new Card(suit[i], rank[j], value [j]);
            cards.add(temp);
       }
      }
      shuffle();
	}

	public String toString(){
	    String temp = "";
	    for(int k = 0; k < size; k++)
	        temp = temp + cards.get(k) + "\n";
	    return temp;
    }

    //methods necessary for shuffling

    private int randomInt(int low, int high){
	    int range = high - low + 1;
	    return low + random.nextInt(range);
    }

    private void swapCards(int i, int j){
	    Card temp = cards.get(i);
	    Card temp2 = cards.get(j);
	    cards.set(i,temp2);
	    cards.set(j,temp);
    }

    private void shuffle(){
	    for(int i = 0; i < cards.size() -1; i++){
	        int j = this.randomInt(i, cards.size()-1);
	        swapCards(i, j);
        }
    }
 }
