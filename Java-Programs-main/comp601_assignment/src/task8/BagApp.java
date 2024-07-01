package task8;
import java.util.*;
public class BagApp {

	public double calcTotalCapacity(List<Bag> bagList) {
		
	 //This calculates and returns the total capacity of all instances in “bagList”.
		 
		 if(bagList == null || bagList.size() == 0) return 0;//checking if list is empty
		 double cap = bagList.get(0).getCapacity();
		 List<Bag> sublist = bagList.subList(1, bagList.size());
		 return cap + calcTotalCapacity(sublist);
		 
	 }
}//End of class BagApp