package stringprobs;

public class passByValueOrRef {
	public static void main(String[] args) {
		Emp mp = new Emp();
		mp.name = "Tamal";
		
		//Copy object
		Emp mp1 = mp;
		mp1.name ="Sarkar";
		System.out.println(mp1.name);
		
		mp1 = new Emp();
		mp1.name = "xyz";
		System.out.println(mp1.name);
		
		
		
		
		//To String
		passString(mp.name);
		System.out.println(mp.name); //Tamal
		
		//To int
		passInt(mp.age);
		System.out.println(mp.age); // 18
		
		//To Obj for modification in the existing object
//		passObj(mp);
//		System.out.println(mp.name);// New String
		
		//To Obj for asigning a new object to the old reference 
		passObj(mp);
		System.out.println(mp.name);// Papai - wrong :)
		
		//To immutable object
		passImmutableAge(mp.immutableAge);
		System.out.println(mp.immutableAge);
		
	}
	
	private static void passString(String str) {
		str = "New Str";
	}
	
	private static void passInt(int val) {
		val = 22;
	}
	
	private static void passObj(Emp obj) {
		//modifying the existing object
		//obj.name = "New Str";
		
		//reassigning a new object to the old reference
		obj = new Emp();
		obj.name = "Papai";
	}
	
	private static void passImmutableAge(Integer obj) {
		obj = new Integer(100);
	}
}

class Emp{
	String name;
	int age = 18;
	Integer immutableAge = new Integer(18);
}