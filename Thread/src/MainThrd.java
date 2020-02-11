
public class MainThrd {
	public static void main(String[] args) {
//		int processors = Runtime.getRuntime().availableProcessors();
//		System.out.println(processors);
		
	 new Thread(() -> method1() ).start();
	 new Thread(() -> method2() ).start();
	 method3();
	}
	
	private static void method1() {
		System.out.println("From meth 1");
	}
	
	private static void method2() {
		System.out.println("From meth  2");
	}
	
	private static void method3() {
		System.out.println("From meth   3");
	}

}
