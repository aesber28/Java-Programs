package task6;
import static java.lang.System.*;
import java.util.*;
public class Main {

	public static void main(String[] args){

		List<LeafyGreen> veges = new LinkedList<>();
		veges.add(new LeafyGreen(10, 3.5, "Cabbage"));
		veges.add(new LeafyGreen(5, 2.94, "Lettuce"));
		veges.add(new LeafyGreen(20, 5.45, "Broccoli"));
		veges.add(new LeafyGreen(7, 1.94, "Lettuce"));
		veges.add(new LeafyGreen(15, 2.8, "Lettuce"));
		veges.add(new LeafyGreen(30, 2.5, "Cabbage"));
		veges.add(new LeafyGreen(28, 4.4, "Broccoli"));
		veges.add(new LeafyGreen(20, 5.5, "Cabbage"));
		veges.add(new LeafyGreen(16, 3.9, "Broccoli"));
		veges.add(new LeafyGreen(26, 4.8, "Broccoli"));

		calculateStats(veges);

		}//end of main

	public static void calculateStats(List<LeafyGreen> list){
		if(list == null || list.size() == 0)
			return; //checking if the list is empty, because if it is then
		//you cannot do anything with it
		
		//variables to output the total of the vege costs
		double cabbageTotal = 0;
		double lettuceTotal = 0;
		double broccoliTotal = 0;
		double totalVegeCost = 0;
		
		for (LeafyGreen lg : list) {
			totalVegeCost += lg.getWeight() * lg.getPrice();
		}//outputs total vege cost
		for (LeafyGreen c : list) {
			if(c.getType() == "Cabbage" ) {
				cabbageTotal += c.getWeight();
			}
		}//outputs cabbage weight from the list
		for (LeafyGreen b : list) {
			if(b.getType() == "Broccoli" ) {
				broccoliTotal += b.getWeight();
			}
		}//output broccoli weight 
		for (LeafyGreen l : list) {
			if(l.getType() == "Lettuce" ) {
				lettuceTotal += l.getWeight();
			}
		}//outputs the lettuce weight
		out.printf("Total Vegetable cost: $%.1f\n", totalVegeCost);
		out.printf("Total Cabbage weight: $%.1f kg \n", cabbageTotal);
		out.printf("Total Broccoli weight: $%.1f kg \n", broccoliTotal);
		out.printf("Total Lettuce weight: $%.1f kg \n", lettuceTotal);
		
	}
}//end of class Main
