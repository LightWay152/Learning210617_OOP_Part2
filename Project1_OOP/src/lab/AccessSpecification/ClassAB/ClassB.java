package lab.AccessSpecification.ClassAB;

public class ClassB {
	
	void method(){
		ClassA class_a = new ClassA();
		class_a.asPublic = 7;// -> public can access in the same package
		class_a.asProtected = 8;// -> protected can access in the same package
		//class_a.asPrivate = 9;// -> private can not access in the same package
		class_a.asDefault = 10;// -> default can access in the same package
	}
	
}
