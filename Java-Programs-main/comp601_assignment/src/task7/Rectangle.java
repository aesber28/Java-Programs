package task7;

public class Rectangle extends Shape {

	private double height;
	private double width;
	private double perimeter;
	
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	public Rectangle (String colour, double height, double width) {
		super(colour);
		this.setHeight(height);
		this.setWidth(width);
	}
	@Override // allows a class to inherit from a superclass
	public String getShapeType() {
		return "I'm a Rectangle";
	}
	public double getPerimeter() {
		this.setPerimeter(width + height);
		return perimeter;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
