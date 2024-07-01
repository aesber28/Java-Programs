package task3;
import static java.lang.System.out;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scoreUserInput();
	}
	static void scoreUserInput () 
	{
		double score;
		try(Scanner input = new Scanner (System.in))
		{
			while (true)
			{
				out.print("Enter a score: "); //prompts user to enter the score
				score = input.nextDouble();
				if(score >= 0 && score <= 50) {//condition D grade when score is 0-50
					out.printf("Score %.1f will receive grade D", score); //output D grade
					break; 
				} else if(score >= 50 && score <= 70) {//condition C grade when score is 50-70
						out.printf("Score %.1f will receive grade C", score);//output C grade
						break; 
				} else if(score >= 70 && score <= 80) {//condition B grade when score is 70-80
							out.printf("Score %.1f will receive grade B", score); //output B grade
							break; } else if(score >= 80 && score <= 100) {//condition A grade when score is 80-100
								out.printf("Score %.1f will receive grade A", score); //output A grade
								break;}
							else
								out.println("Invalid score");//if user entered invalid score, prompts them again to enter until valid
			}
		}
	}

}
