// Static  method cant be overidden.

class Ana{
	public static void display() {
		System.out.println("Method a is displayed");
	}
}

class Sag extends Ana{
	public void mira() {
		System.out.println("Method B is displayed");
	}
}
public class OverloadingExample3 {
	public static void main (String args[]) {
		Sag obj = new Sag();
		obj.display();
	}

}
