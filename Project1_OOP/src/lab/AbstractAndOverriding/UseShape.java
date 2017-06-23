package lab.AbstractAndOverriding;

public class UseShape {
		
	public static void main(String[] args) {
		/*Demo for Abstract + Overriding*/
		//demo1();
		//demo2();
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

	private static void demo2() {
		Shape shape1 = new Square(20);
		shape1.print();
	}

	private static void demo1() {
		Circle shape1 = new Circle(20);
		shape1.print();
	}
	
}
