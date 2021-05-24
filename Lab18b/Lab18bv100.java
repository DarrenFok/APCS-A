// Lab18bv100.java
// This is the 100 point version.
// Darren Fok
// May 23rd, 2021
// APCS, Mr. Robinson
// This program takes two lists and merge sorts them together.


import java.util.ArrayList;

public class Lab18bv100
{
	public static void main(String[] args)
	{
		int[] jsaList1 = {101, 105, 115, 125, 145, 165, 175, 185, 195, 225, 235, 275, 305, 315, 325, 335, 345, 355, 375, 385};
		int[] jsaList2 = {110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 270, 280, 320, 350, 400};

		Array list1 = new Array(jsaList1,"List #1");
		Array list2 = new Array(jsaList2,"List #2");
		Array list3 = new Array("Merged List");

		list3.merge(list1,list2,list3);

		list1.display();
		list2.display();
		list3.display();
	}

}


class Array
{
	private ArrayList<Integer> list;
	private int size;
	private String listName;

	public Array(String ln)
	{
		list = new ArrayList<Integer>();
		size = 0;
		listName = ln;
	}

	public Array(int[] jsArray, String ln)
	{
		list = new ArrayList<Integer>();
		size = jsArray.length;
		listName = ln;
		for (int j = 0; j < size; j++)
			list.add( new Integer( jsArray[j] ));
	}

	public void display()
	{
		System.out.println("\n" + listName + ":\n");
		System.out.println(list + "\n");
	}

	public void merge(Array that, Array theOther, Array merged)
	{
		int p = 0;
		int q = 0;
		while(p < that.size && q < theOther.size){
			if(that.list.get(p) < theOther.list.get(q)){
				merged.list.add(that.list.get(p));
				p++;
			}
			else{
				merged.list.add(theOther.list.get(q));
				q++;
			}
		}
		if (p < that.size)
			merged.list.add(that.list.get(p));
		if (q < theOther.size)
			merged.list.add(theOther.list.get(q));
	}

}
