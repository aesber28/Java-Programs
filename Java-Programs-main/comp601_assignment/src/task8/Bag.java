package task8;

public class Bag {
	private String colour;
	private double capacity;
	
	public Bag(String colour, double capacity) {
		this.setColour(colour);
		this.setCapacity(capacity);
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

}
