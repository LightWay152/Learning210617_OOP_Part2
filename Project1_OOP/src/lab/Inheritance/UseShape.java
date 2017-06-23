package lab.Inheritance;

public class UseShape {
		
	public static void main(String[] args) {
		//Inheritance to Reuse
		System.out.println("--- Inheritance to Reuse ---");
		
		//Rectangle inheritance from Shape
		Rectangle rectangle = new Rectangle();
		rectangle.print();
		
		//Circle inheritance from Shape
		Circle circle = new Circle();
		circle.print();
		
		//Triangle inheritance from Shape
		Triangle triangle = new Triangle();
		triangle.print();
		
		//Square inheritance from Shape
		Square square = new Square();
		square.print();		
	}
	
}
