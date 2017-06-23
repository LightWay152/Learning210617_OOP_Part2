package lab.AccessSpecification.classCD;

import lab.AccessSpecification.ClassAB.ClassA;

public class ClassD extends ClassA{
	
	void method(){
		ClassC class_d = new ClassC();
		//-> when classD extends from classA, 
		//but create object from classC instead of classA
		//public/protected/private/default access specification
		//also CAN NOT access in the OTHER package
		
		//class_d.asPublic = 7;
		//class_d.asProtected = 8;
		//class_d.asPrivate = 9;
		//class_d.asDefault = 10;
		
	}

}
