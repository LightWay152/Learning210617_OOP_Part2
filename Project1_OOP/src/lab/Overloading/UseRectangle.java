package lab.Overloading;

public class UseRectangle {

	public static void main(String[] args) {
		
		/* Overloading:
		 * Function overloading (also method overloading) is a programming concept 
		 * that allows programmers to define two or more functions with the same name, 
		 * in the same scope but different number of arguments.
		 * */
		
		//Create rectangle object way 1 - use length, width which use enter
		Rectangle r1 = new Rectangle();
		r1.printTitle();
		System.out.println("---------------");
		
		//Create rectangle object way 2 - default length, width before run
		Rectangle r2 = new Rectangle(200,150);
		r2.printTitle("Rectangle title with printTitle function HAS parameter:");
		System.out.println("---------------");
		
		//Create rectangle object way 3 - use coordinates 2 points
		Rectangle r3 = new Rectangle(20,30,100,200);
		r3.printTitle();
		System.out.println("---------------");
	}

}
