// Lab13v100.java
// This is the 100 point version.
// Darren Fok
// February 28th, 2021
// APCS, Mr. Robinson
// This program demonstrates the use of one-dimensional arrays in a class to create random responses in the form of the Magpie-Chatbot.

 
import java.util.Scanner;
import java.util.ArrayList;

public class Lab13v100
{
	public static void main(String[] args)
	{
		MagpieLab13 maggie = new MagpieLab13();

		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}


class MagpieLab13
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0
            || statement.indexOf("family") >= 0
            || statement.indexOf("parent") >= 0)
		{
			final int NUMBER_OF_RESPONSES = 10;
         double r = Math.random();
         int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
         
         ArrayList<String> responses = new ArrayList<String>();
         responses.add("Are you close with your family?");
         responses.add("How many members are in your family?");
         responses.add("Does your family live close together?");
         responses.add("Do you keep in touch with your family?");
         responses.add("Who is the funniest person in your family?");
         responses.add("Do you have family gatherings often?");
         responses.add("Are you the youngest in your family?");
         responses.add("What do you like the most about your family?");
         responses.add("What's the best memory you have of your family?");
         responses.add("What's is your most favourite activity that do you with your family?");
         
         response = responses.get(whichResponse);
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 10;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
      else if (whichResponse == 4)
      {
         response = "Wow.";
      }
      else if (whichResponse == 5)
      {
         response = "What's the hottest headline right now?";
      }
      else if (whichResponse == 6)
      {
         response = "My dream vacation spot is Korea.";
      }
      else if (whichResponse == 7)
      {
         response = "That is intriguing.";
      }
      else if (whichResponse == 8)
      {
         response = "That really got me thinking.";
      }
      else if (whichResponse == 9)
      {
         response = "What an interesting take.";
      }
		return response;
	}
}
