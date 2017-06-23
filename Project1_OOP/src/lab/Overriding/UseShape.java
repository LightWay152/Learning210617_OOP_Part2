package lab.Overriding;

public class UseShape {
		
	public static void main(String[] args) {
		//Inheritance to Reuse
		System.out.println("--- Inheritance to Reuse ---");
		Rectangle rectangle = new Rectangle();
		rectangle.print();
		
		Circle circle = new Circle();
		circle.print();
		
		Square square = new Square();
		square.print();	
		
		/* Overriding:
		 * Method overriding, in object-oriented programming, 
		 * is a language feature that allows a subclass or child class 
		 * to provide a specific implementation of a method that is already 
		 * provided by one of its super classes or parent classes.
		 * */
		System.out.println("\n--- Overriding Triangle ---");
		Triangle triangle_override = new Triangle();
		triangle_override.print();			
	}
	
}
