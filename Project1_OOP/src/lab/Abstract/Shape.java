package lab.Abstract;

public abstract class Shape {
	protected String name;
	public abstract double getPerimeter();
	public abstract double getArea();
	
	public void print(){
		System.out.print(">> Shape's name: "+this.name);
		System.out.print("\n>> Perimeter: "+this.getPerimeter());
		System.out.print("\n>> Area: "+this.getArea());
		System.out.println();
	}

}
