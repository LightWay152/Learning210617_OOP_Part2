package lab.Abstract;

public class Rectangle extends Shape{
	double length;
	double width;
	
	public Rectangle(double length,double width){
		super.name = "Rectangle";
		this.length = length;
		this.width = width;
	}

	@Override
	public double getPerimeter() {
		return 2*(length+width);
	}

	@Override
	public double getArea() {
		return length*width;
	}
	
}
