package task10;
import static java.lang.System.*;
public class AudioBook extends Book{
	
	private double length;
	
	public AudioBook(String name, int year, double length) {
		super(name, year);
		this.setLength(length);
	}
	public void displayInfo() {
		out.printf("%-20s %s\n", "Name", super.getName());
		out.printf("%-20s %d\n", "Year", super.getYear());
		out.printf("%-20s %.2f\n","Length", length);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

}
