package lab.Overriding;

public class Triangle extends Shape{

	public Triangle(){
		super.name = "Triangle";
	}
	
	@Override
	public void print(){
		System.out.println("Override method in class Shape!");
	}
	
}
