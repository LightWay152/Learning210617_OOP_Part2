package lab.AbstractAndOverriding;

public class Square extends Rectangle{
	public double edge;
	
	public Square(double edge){
		super(edge, edge);
		super.name = "Square";
	}
	
}
