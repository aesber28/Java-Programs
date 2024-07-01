package task10;
import static java.lang.System.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class AudioBookApp {
	private List<AudioBook> bookList;
	
	public List<AudioBook> getBookList() {
		return bookList;
	}
	 
	public AudioBookApp(String filename) throws IOException {
		bookList = new LinkedList<>();
		readData(filename);
	}
	
	public void readData(String filename) throws IOException {
		bookList = new LinkedList<>();
		Path path = Paths.get(filename);
		List<String> lines = Files.readAllLines(path);
		for(String line : lines) {
			String[] items = line.split(",");
			String name = items[0];
			int year = Integer.parseInt(items[1]);
			double length = Double.parseDouble(items[2]);
			AudioBook a = new AudioBook(name, year, length);
			bookList.add(a);
		}
	}
	
	public AudioBook getShortestBook() {
		if(bookList == null || bookList.size() == 0) { 
			return null;
		}
		AudioBook shortestB = bookList.get(0);
		for (AudioBook s : bookList) {//every audiobook in the list
		if(s.getLength() < shortestB.getLength()){//calculates the shortest book length
			shortestB = s;
			}
		}
		return shortestB;//outputs the shortest book
	}
	
	public int countBooks() {
		//counts how many books publishes between year 2010 & 2020
		int count = 0, year = 0;
		if(bookList != null && bookList.size() > 0) {
			for (AudioBook a : bookList) {
				year = a.getYear();
				if(year >= 2010 && year <= 2020)
					count ++;
			}
		}
		return count;
	}
	public void randomBookList() {
		//List validation
		if(bookList ==  null || bookList.size() == 0) {
			return;
		}
		
		List<AudioBook> b1 = new LinkedList<>();
		List<AudioBook> b2 = new LinkedList<>();
		List<AudioBook> b3 = new LinkedList<>();
		
		int num;
		
		//Looping through the list - randomly adding each instance to one of three lists
		for (AudioBook a: bookList) {
			num = ThreadLocalRandom.current().nextInt(1, 4);
			if (num == 1) {
				b1.add(a);
			}else if (num == 2) {
				b2.add(a);
			}else {
				b3.add(a);
			}
		}
		
		//Displaying the results
		out.printf("\n%d books in list #1: \n", b1.size());
		for (AudioBook a : b1) {
			out.printf("%s %d %.2f\n", a.getName(), a.getYear(), a.getLength());
		}
		out.printf("\n%d books in list #2: \n", b2.size());
		for (AudioBook a : b2) {
			out.printf("%s %d %.2f\n", a.getName(), a.getYear(), a.getLength());
		}
		out.printf("\n%d books in list #3: \n", b3.size());
		for (AudioBook a : b3) {
			out.printf("%s %d %.2f\n", a.getName(), a.getYear(), a.getLength());
		}
		
		
	}
}//End of class App
