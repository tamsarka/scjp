package java8;

public class DefaultInterfaceReasoning implements IClass, IClass1 {

	@Override
	public void defMeth() {
		// TODO Auto-generated method stub
		IClass1.super.defMeth();
	}
	
	@Override
	public void meth() {
		// TODO Auto-generated method stub
		
	}

}

interface IClass{
	void meth();
	default void defMeth() {
		System.out.println("From Iclass : defMeth");
	}

}


interface IClass1{
	void meth();
	default void defMeth() {
		System.out.println("From Iclass1 : defMeth");
	}
}