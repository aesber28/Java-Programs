package task7;
import java.util.*;
public class Main {
	 public static void main(String[] args) {
		 List<Shape> shapes = new LinkedList<>();
		 shapes.add(new Shape("white"));
		 shapes.add(new Rectangle("red", 10, 6));
		 shapes.add(new Rectangle("black", 20, 9));
		 shapes.add(new Shape("orange"));
		 showShapeNames(shapes);//produces output part 1

		 Rectangle[] rectangleArray1 = {
				 				new Rectangle("white", 4, 3),
				 				new Rectangle("red", 9, 5),
				 				new Rectangle("purple", 3, 6),
				 				new Rectangle("orange", 15, 10),
				 				new Rectangle("black", 4, 14),
		 					};
		 Rectangle[] rectangleArray2 = {
				 				new Rectangle("pink", 3, 4),
				 				new Rectangle("red", 10, 2),
				 				new Rectangle("white", 8, 5),
				 				new Rectangle("blue", 14, 4),
				 				new Rectangle("bindle", 10, 15),
		 					};
	
		 //produces output part 2
		 countOverlapRectangles(rectangleArray1, rectangleArray2);
	 }//end of main() method
	 
	 public static void showShapeNames(List<Shape> shapes){
 
		 if(shapes == null || shapes.size()== 0) return;//checking if list is empty
		 for(Shape s : shapes) {
			 System.out.println(s.getShapeType());//outputs all the shape type & the one we override
		 }
	 }
	 
	 public static void countOverlapRectangles(Rectangle[] group1, Rectangle[]
	group2){

		 int count = 0;
		 int count1 = 0;
		 for(Rectangle c1 : group1) {
			 for(Rectangle c2 : group2) {
				 if(c1.getColour() == c2.getColour()) {//calculates the rectangles with same colours
					 count++;
				 } 
				 if (c1.getPerimeter() == c2.getPerimeter()) {//calculates the rectangles with same parameter
					 count1++;
				 }
			 }
		 }
		 System.out.printf("There are %d Rectangle objects with overlapping colour between the two arrays\n", count);
		 System.out.printf("There are %d Rectangle objects with overlapping perimeter between the two arrays", count1);
	 	}
	 }//end of Main class


