package lab.AccessSpecification.classCD;

import lab.AccessSpecification.ClassAB.ClassA;

public class ClassC {
	
	void method(){
		ClassA class_c = new ClassA();
		class_c.asPublic = 7;//-> public CAN access in the OTHER package
		//class_c.asProtected = 8;//-> protected CAN NOT access in the OTHER package
		//class_c.asPrivate = 9;//-> private CAN NOT access in the OTHER package
		//class_c.asDefault = 10;//-> default CAN NOT access in the OTHER package
	}
	
}
