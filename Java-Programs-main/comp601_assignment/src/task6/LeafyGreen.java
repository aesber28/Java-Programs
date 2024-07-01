package task6;

public class LeafyGreen extends Vegetable {

	private String type;

	public LeafyGreen(double weight, double price, String type) {
		super(weight, price);//passing the two parameter in superclass
		this.setType(type);
		
	}
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
}
