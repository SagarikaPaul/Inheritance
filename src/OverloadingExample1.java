
class A{
	public void display() {
		System.out.println("Class A is executed");
	}
}

class B extends A{
	public void display() {
		System.out.println("Class B is executed");
	}
}

public class OverloadingExample1 {
	public static void main(String args[]) {
		//  Output -> Class A is executed
		// A obj = new A();
		// obj.display();
		
		// OR
		// Output -> class B is executed
		// B obj = new B();
		// obj.display();
		
		
	}

}
