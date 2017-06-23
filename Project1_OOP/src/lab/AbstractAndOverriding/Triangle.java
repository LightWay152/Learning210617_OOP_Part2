package lab.AbstractAndOverriding;

public class Triangle extends Shape{
	
	public double edgeA;
	public double edgeB;
	public double edgeC;
	
	public Triangle(double edgeA,double edgeB,double edgeC){
		super.name = "Triangle";
		this.edgeA = edgeA;
		this.edgeB = edgeB;
		this.edgeC = edgeC;
	}

	@Override
	public double getPerimeter() {
		return this.edgeA+this.edgeB+this.edgeC;
	}

	@Override
	public double getArea() {
		double p = getPerimeter()/2;
		double s = Math.sqrt(p*(p-edgeA)*(p-edgeB)*(p-edgeC));
		return s;
	}
	
	@Override
	public void print(){
		super.print();
		System.out.println(">> Edge A: "+this.edgeA);
		System.out.println(">> Edge B: "+this.edgeB);
		System.out.println(">> Edge C: "+this.edgeC);
	}
	
}
