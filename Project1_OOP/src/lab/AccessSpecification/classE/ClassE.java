package lab.AccessSpecification.classE;

import lab.AccessSpecification.ClassAB.ClassA;

public class ClassE extends ClassA{
	
	void method(){
		ClassA class_e = new ClassA();
		//-> when classD extends from classA, 
		//and create object from classA, 
		//only public CAN access in the OTHER package
		//but protected/private/default access specification
		//CAN NOT access in the OTHER package
		
		class_e.asPublic = 7;//-> public CAN access in the OTHER package
		//class_c.asProtected = 8;//-> protected CAN NOT access in the OTHER package
		//class_c.asPrivate = 9;//-> private CAN NOT access in the OTHER package
		//class_c.asDefault = 10;//-> default CAN NOT access in the OTHER package
		
	}

}
