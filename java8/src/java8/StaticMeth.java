package java8;

public class StaticMeth implements IFace{
	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}
	
	public static void main(String args[]){
		StaticMeth obj = new StaticMeth();
		obj.print("dasf");
		obj.isNull("abc");
	}

}
interface IFace{
	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData Print::" + str);
	}
	
	
	/*
	 * CANT OVERRIDE ANY OF THE METHOD FROM OBJECT CLASS..
	 * default boolean equals(Object obj) { return (this == obj); }
	 */
	
	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}