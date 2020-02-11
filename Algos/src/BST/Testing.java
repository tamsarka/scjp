package BST;

public class Testing {
  Obj object;
  
  private void method(Obj o) {
	  if(o == null)
		  o = new Obj();
	  o.i = 100;
 }
  public static void main(String[] args) {
	  Testing testing = new Testing();
//	  System.out.println(testing.object.i);
	  testing.object = new Obj();
	  testing.method(testing.object);
	  System.out.println("  for :"+testing.object.i);
 }
}

class Obj{
	int i;
}
