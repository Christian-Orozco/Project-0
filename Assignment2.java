import java.util.Scanner;

public class Assignment2 
{
	public static void main (String[] args) 
	{
Scanner scan = new Scanner(System.in);

String P1 = "";
String P2 = "";



System.out.println("Player 1: Choose rock, scissors, or paper: ");	
	 P1 = scan.nextLine();
	 P1 = P1.toLowerCase();
System.out.println("Player 2: Choose rock, scissors, or paper: ");
	 P2 = scan.nextLine();
	 P2 = P2.toLowerCase();
	 


	 
if (!P1.equals("rock") && !P1.equals("scissors") && !P1.equals("paper")){
	System.out.println ("Wrong choice!");	
	}																			//tells user that option is invalid by testing to see
if (!P2.equals("rock") && !P2.equals("scissors") && !P2.equals("paper")) {		//if the choices are valid
			System.out.println ("Wrong choice!");	
}
	
if (P1.equals("rock") && P2.equals("scissors") || P1.equals("paper") && P2.equals("rock") ||	//test game outputs to see if Player 1 wins
	P1.equals("scissors") && P2.equals("paper")){
			System.out.println("Player 1 wins.");
}
if (P1.equals("rock") && P2.equals("paper") || P1.equals("paper") && P2.equals("scissors") ||	//tests game outputs to see if Player 2 wins
	P1.equals("scissors") && P2.equals("rock")) {
			System.out.print("Player 2 wins.");
}

if (P1.equals(P2)) {					//if user inputs are the same then it tells players that they tied
	System.out.println("It is a tie.");
}

scan.close();
	}
}
