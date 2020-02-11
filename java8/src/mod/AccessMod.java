package mod;

public class AccessMod extends Child{
	public static void main(String[] args) {
//		DefClass def = new  DefClass
		AccessMod mod = new AccessMod();
//		AccessMod sup = (AccessMod) new Child(); // trying to downcast but not possible as it throws class cast exception.
		
		mod.meth("");
//		sup.meth("");
		
		System.out.println("               Using upcasting..");
		Child supClass = new Child();
		Child child = new AccessMod(); // upcasting..
		
		supClass.meth("");
		child.meth("");
				
	}
	
	public void meth(String argument) {
		
		System.out.println("This is the arg from meth..");
	}
}
class Child {
	/*
	 * public static void main(String[] ar) {
	 * 
	 * }
	 */
	
	public static void meth(String argument) {
		System.out.println("This is the arg..");
	}
}
