package lab.Overloading;

import java.util.Scanner;

public class Rectangle {
	
	public double length;
	public double width;
	
	//Create rectangle object way 1:
	//-> user input length, width from keyboard
	public Rectangle(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(">> Enter length: ");
		this.length = scanner.nextDouble();
		System.out.print(">> Enter width: ");
		this.width = scanner.nextDouble();
	}
	
	//Create rectangle object way 2:
	//-> default length, width in code
	public Rectangle(double length,double width){
		this.length = length;
		this.width = width;
	}
	
	//Create rectangle object way 3:
	//-> default length, width in code by coordinates 2 points
	public Rectangle(double x1,double y1,double x2,double y2){
		this.length = Math.abs(x1-x2);
		this.width = Math.abs(y1-y2);
	}
	
	//calculate perimeter of rectangle
	public double getPerimeter(){
		return 2*(length+width);
	}
	
	//calculate area of rectangle
	public double getArea(){
		return length*width;
	}
	
	//print title of rectangle to screen
	public void printTitle(){
		String title = "Rectangle title with printTitle function NO parameter";
		this.printTitle(title);
	}
	
	public void printTitle(String title){
		System.out.println(title);
		System.out.println(">> Length: "+this.length);
		System.out.println(">> Width: "+this.width);
		System.out.println(">> Perimeter: "+this.getPerimeter());
		System.out.println(">> Area: "+this.getArea());
	}

}
