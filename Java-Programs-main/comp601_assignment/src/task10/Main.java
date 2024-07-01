package task10;
import java.io.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		String txtfile = "data1/data.txt";
		try {
			AudioBookApp app = new AudioBookApp(txtfile);
			AudioBook shortest = app.getShortestBook();
			if(shortest != null) {
				out.println("Shortest book:");
				shortest.displayInfo();
	 }
	 out.printf("Books published btw 2010-2020: %d\n", app.countBooks());
	 app.randomBookList();
	}catch(IOException ioe) {
		out.printf("Perhaps missing text file: %s/%s? \n\n",
				new Main().getClass().getPackage().getName(), txtfile);
	 }
   }//End of main method
}//End of class Main
