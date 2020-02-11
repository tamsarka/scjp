package protect;

public class DefultCalss {
  final int number; // this variable can be initialized from a constructor once only
  public DefultCalss(){
	  number = 10;
  }
  public DefultCalss(int val){
	  number = val;
  }
  
  
  
  public static void main(String[] args) {
	  DefClass def = new DefClass();
	  System.out.println(def.name);
	  
	  
}
  protected void meth2() {
	  System.out.println("From a protected class ");
  }
  
  void defMeth() {
	  System.out.println("From a default method.. ");
  }
}

class DefClass{
	private int i = 100;
	String name = "Tamal ";
	protected String fulName = "Tamal Sarkar";
	private void meth() {
		System.out.println("This is from DefClass");
	}
}

