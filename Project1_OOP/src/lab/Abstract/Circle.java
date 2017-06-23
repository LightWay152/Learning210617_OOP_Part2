package lab.Abstract;

public class Circle extends Shape{
	
	public double radius;
	
	public Circle(double radius){
		super.name = "Circle";
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
}
