package task9;
import java.io.*;
import static java.lang.System.*;
public class Main {

	public static void main(String[] args) {
		String txtfile = "data/data.txt";
		try {
			GameApp app = new GameApp(txtfile);
			app.game();
		 }catch(IOException ioe) {
			 out.printf("Perhaps missing text file: %s/%s? \n\n",
					 	new Main().getClass().getPackage().getName(), txtfile);
		 }
		}//End of main method
	}//End of class Main
