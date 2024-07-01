package task5;
import static java.lang.System.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		List<Note> notes = new LinkedList<>();//List of the music notes
		notes.add(new Note("D", 19));
		notes.add(new Note("C", 20));
		notes.add(new Note("F", 31));
		notes.add(new Note("B", 45));
		notes.add(new Note("C", 73));
		notes.add(new Note("F", 13));
		notes.add(new Note("B", 34));
		notes.add(new Note("C", 53));
		processNotes(notes);

		}//end of main method

	public static void processNotes(List<Note> list){
		 double total = 0;
		 for (Note e : list) {
			 e.playNote();
			 total += e.getSeconds();//+= adding two values together
		 }
		 out.printf("\nTotal duration: %.0f seconds", total);
		}
		//end of class Main
	}


