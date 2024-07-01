package task9;
import static java.lang.System.*;
import java.util.concurrent.*;
import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class GameApp {

	Scanner input = new Scanner(in);
	List<Country> countryList;//read-only
	
	public List<Country> getCountryList() {
		return countryList;
	}
	
	public GameApp(String filename) throws IOException {
		readData(filename);//data.txt
	 }
	 public void readData(String filename) throws IOException {
		 countryList = new LinkedList<>();
		 Path path = Paths.get(filename);
		 List<String> lines = Files.readAllLines(path); //read the files line by line
		 for(String line : lines) {
			 String[] items = line.split(",");//split the instances in an array
			 String name = items[0];//the name is the first value in an instances
			 String capital = items[1];//second value in each instances
			 int population = Integer.parseInt(items[2]);//third value in each instances
			 Country c = new Country(name, capital, population);
			 countryList.add(c);
		 }
	 }
	 
	 public void game() {
		 if(countryList == null || countryList.size() == 0) {
			 return;
		 } //checking if the list is empty
		 
		 int randomNum = ThreadLocalRandom.current().nextInt(0,6);
		 out.printf("What's the capital city of %s? ", countryList.get(randomNum).getName());
		 String capital = input.nextLine();
		 Country country = null;//flag variable
		 for(Country c : countryList) {
			 if(c.getCapital().equalsIgnoreCase(capital)) {
				 country = c;
				 break;
			 }
		 }  
		 
		 if(country == null) {
			 out.printf("Incorrect. It's %s.\n", countryList.get(randomNum).getCapital());
			 out.printf("%s is a country of %d million\n", countryList.get(randomNum).getName(),countryList.get(randomNum).getPopulation());
			}
		 
		 else {
			 out.println("Well done!");
		 	 out.printf("%s is a country of %d million\n", countryList.get(randomNum).getName(),countryList.get(randomNum).getPopulation());
		 }
	}
}
//End of class GameApp
