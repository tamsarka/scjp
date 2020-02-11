package java8;

public class SuperClass extends Super {

	static void statMeth() {
		System.out.println("from child");
	}

	public void meth2() {
		System.out.println("From child ..");
		super.meth2();
	}

	public static void main(String[] args) {
		SuperClass sClass = new SuperClass();
		Super s = new SuperClass();
		Super s1 = new Super();

		s.statMeth();
		s.meth2();
//		sClass.meth2();
		s.meth1();
	}
	
	
}

class Super {
	static void statMeth() {
		System.out.println("from super");
	}

	private void meth() {
		System.out.println("From private ..");
	}

	protected void meth1() {
		System.out.println("From protected ..");
	}

	public void meth2() {
		System.out.println("From public ..");
	}
}