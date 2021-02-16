// Lab11bv100.java
// This is the 100 point version.
// Darren Fok
// February 16th, 2021
// APCS, Mr. Robinson
// This program takes a deck of cards and shuffles them.

import java.util.Random;

public class Lab11bv100
{
	public static void main(String[] args) {
		System.out.println("Lab11bv100.java");
		System.out.println();
		Deck deck = new Deck();
      	System.out.println(deck);
	}
}

class Deck 
{
	private Card[] cards; //our deck
	private int size; //size of deck
	private static Random random = new Random();

	public Deck(){
      size = 52;
      this.cards = new Card[size];
      int index = 0;

      String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
      String[] rank = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
      int[] value = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11 };

      int suits = suit.length;
      int ranks = rank.length;

      for(int i = 0; i < suits; i++){
      	for(int j = 0; j < ranks; j++){
      		Card temp = new Card (suit[i], rank[j], value[j]);
      		cards[index] = temp;
      		index++;
		}
	  }
      shuffle();
	}

	public String toString(){
		String temp = "";
		for(int k = 0; k < size; k++)
			temp = temp + cards[k].toString() + "\n";
		return temp;
	}

	//Methods necessary for shuffling

	private int randomInt(int low, int high){
		int range = high - low + 1;
		return low + random.nextInt(range);
	}

	private void swapCards(int i, int j){
		Card temp = this.cards[i];
		this.cards[i] = this.cards[j];
		this.cards[j] = temp;
	}

	private void shuffle(){
		for(int i = 0; i < this.cards.length - 1; i ++){
			int j = this.randomInt(i, this.cards.length - 1);
			this.swapCards(i,j);
		}
	}

 }
