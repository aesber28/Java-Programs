package task8;
import static java.lang.System.*;

import java.util.*;
public class Main {
	 public static void main(String[] args) {
	 List<Bag> bags = new LinkedList<>();
	 
	 bags.add(new Bag("red", 4.30));
	 bags.add(new Bag("blue", 4.30));
	 bags.add(new Bag("pink", 4.30));
	 
	 BagApp bgapp = new BagApp();
	 
	 double totalCapacity = bgapp.calcTotalCapacity(bags);
	 out.printf("Total capacity: %.2f\n", totalCapacity);
	 out.printf("Total number of bags: %d\n", bags.size());
	 }
}//End of class Main

