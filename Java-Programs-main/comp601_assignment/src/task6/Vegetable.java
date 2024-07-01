package task6;
public class Vegetable {

	private double weight;
	private double price;
	
	public Vegetable(double weight, double price) {
		this.setWeight(weight);
		this.setPrice(price);
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
