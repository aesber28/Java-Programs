package task4;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		colourInput();
	}
	
	public static void colourInput() {
		String colours1, colours2; //variables
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first line of colours: ");
		colours1 = input.nextLine();
		String[] line1 = colours1.split(",");//split the colours into an array
				
		System.out.print("Enter second line of colours: ");
		colours2 = input.nextLine();
		String[] line2 = colours2.split(",");//split the colours into an array
		input.close();
		
		System.out.printf("You entered %s colours in the first list\n", line1.length);//calculates how many colours has been entered
		System.out.printf("You entered %s colours in the second list\n", line2.length); 
		
		List<String> duplicates = new LinkedList<>();//empty list for storing the duplicated colours

		for(String c1 : line1) {
			for(String c2 : line2) {
				if(c1.equalsIgnoreCase(c2))//if the colours are the same in c1 and c2 then store them in the duplicate list
					duplicates.add(c1);//storing the duplicates colours in the duplicate list
			}	
		}
		System.out.printf("Number of overlapping colours: %s \n", duplicates.size());
		//outputting the number of overlapping colours by counting it in the duplicate list
		
		System.out.println("Overlapping colours are as follows: ");
		//outputs the names of the colours that has duplicates
		
		for (String e : duplicates) {//outputs the duplicated colours from the duplicates list
			System.out.println(e);
		}
	}
}

