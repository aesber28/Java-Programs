package task2;
import static java.lang.System.*;

import java.util.Scanner;
public class Main {

	static Scanner input = new Scanner (in);
	public static void main(String[] args) {
		radiusCircle();//outputs the program

	} //calculates the radius of the circle
	public static void radiusCircle() {
		out.print( "Enter circle radius: "); //user input
		double r = Double.parseDouble(input.nextLine()); // radius
		double per = 2 * Math.PI * r; // calculates the perimeter
		double area = Math.PI * Math.pow(r, 2); //calculates the area
		
		String fmt = "%-10s%-10s%9s\n"; //spacings between headings
		out.printf(fmt, "Radius", "Perimeter", "Area"); //headings
		out.println("-".repeat(30));// to make the dashline
		String fmt1 = "%.1f %11.2f %14.2f"; //spacings for results and places 2dp
		out.printf(fmt1, r, per, area ); //prints out the results
	}
}
