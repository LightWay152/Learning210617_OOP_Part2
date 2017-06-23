package lab.Abstract;

public class UseShape {
		
	public static void main(String[] args) {
		/*2 way to create an shape1 object*/
		//demo1();
		//demo2();
		
		/* Abstract:
		 * In object-oriented programming, abstraction is one of three central principles 
		 * (along with encapsulation and inheritance). Through the process of abstraction, 
		 * a programmer hides all but the relevant data about an object in order to reduce 
		 * complexity and increase efficiency.
		 * */
		demo3();
		
	}

	private static void demo3() {
		Shape[] listShape = new Shape[5];
		listShape[0] = new Rectangle(44, 77);
		listShape[1] = new Square(88);
		listShape[2] = new Circle(99);
		listShape[3] = new Triangle(20, 30, 25);
		listShape[4] = new Square(33);
		
		for(Shape shape:listShape){
			shape.print();
			System.out.println("-----------------");
		}
	}

	//Create shape1 object type Square object from Shape object: Shape -> Square
	private static void demo2() {
		Shape shape1 = new Square(20);
		shape1.print();
	}

	//Create shape1 object type Circle object from Circle object: Circle -> Circle
	private static void demo1() {
		Circle shape1 = new Circle(20);
		shape1.print();
	}
	
}
