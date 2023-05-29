package Com.greatlearning.corejava;

public class InheritanceA {
	int r;
	float Pi = 3.14f;
	public void Calculate(int r) {
		float AreaofCircle= 2*Pi*r*r;
		System.out.println("The Area of Circle is: "+ AreaofCircle);
	}
	
}
class InheritanceB extends InheritanceA{
	int length, Width;
	public void Calculate1(int l, int w) {
		float AreaofRectangle = l*w;
		System.out.println("The Area of Rectangle is: " + AreaofRectangle);
	}
}

class InheritanceC extends InheritanceB{
	int Breadth, height;
	public void Calculate2(int B, int H) {
		float AreaofTriangle = (B*H)/2;
		System.out.println("The Area of Triangle is: "+ AreaofTriangle);
		
	}
}
