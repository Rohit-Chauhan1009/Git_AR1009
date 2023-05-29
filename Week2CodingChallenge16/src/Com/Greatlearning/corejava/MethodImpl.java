package Com.Greatlearning.corejava;

public class MethodImpl {
	
	public String s= null;
	public void RedHouse() {//method without return type and without argument
		System.out.println("I am from method Withoud return type");
	}
	public void RedHouse(String s) {//Method without return type and an input argument
		this.s = s;
		System.out.println(s);
	}
	public String RedHouse1() {//methods with return type
		s = "I am from method with return type";
		return s;
	}
	public String RedHouse1(String s) {// method with return type and input argument
		this.s=s;
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodImpl obj = new MethodImpl();
		obj.RedHouse();
		obj.RedHouse("I am from method without return type and an input argument");
		System.out.println(obj.RedHouse1());
		System.out.println(obj.RedHouse1("I am from method with Return type and an as input argument"));
		System.out.println("We used method overload in this program");
	}

}
