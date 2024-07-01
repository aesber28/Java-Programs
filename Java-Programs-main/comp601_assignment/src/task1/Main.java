package task1;
import static java.lang.System.*;
public class Main {

	public static void main(String[] args) {

		t1(); //output the results, calling it out
	}

	public static void t1() {
		String fmt = "%-25s%-20s\n"; //aligns or make spaces for the string characters
		out.printf(fmt, "Escape sequence", "Description");//prints out the headings
		out.println("-".repeat(45)); //dashline
		out.printf(fmt, "\\n", "New line character"); //prints out the column
		out.printf(fmt, "\\t", "Horizontal tab character"); //adding dashlines infront makes the '/' visible as a normal string
		out.printf(fmt, "\\\"", "Double qoute");
		out.printf(fmt, "\\b", "Backspace character");
	}
}
