class Abc{
	public void display() {
		System.out.println("Method a is displayed");
	}
}

class Bcd extends Abc{
	public void display (int x) {
		System.out.println("Method B is displayed");
	}
}
public class OverloadingExample2 {
	public static void main (String args[]) {
		Bcd obj = new Bcd();
		obj.display();
	}

}
