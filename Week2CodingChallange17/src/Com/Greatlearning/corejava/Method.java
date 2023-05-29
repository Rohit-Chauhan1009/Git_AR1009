package Com.Greatlearning.corejava;

public class Method {
	
	public int num = 10, Output;
	public int performLeftshift() {
		Output = num<<1;
		return Output;
	}
	public void performRightShift(int val, int digitstshift) {
		num = val;
		Output = num >> digitstshift;
		System.out.println("Right shift of the number "+ num + "is " + Output);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method obj = new Method();
		System.out.println("Left Shift of the number "+ obj.num + "is " + obj.performLeftshift());
		obj.performRightShift(45, 2);
	}

}
