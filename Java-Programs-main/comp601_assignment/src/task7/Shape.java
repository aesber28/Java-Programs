package task7;

public class Shape {
	
	private String colour;
	
	public Shape(String colour) {
		this.setColour(colour);
	}
	
	public String getShapeType() {
		return "I'm a Shape";
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
