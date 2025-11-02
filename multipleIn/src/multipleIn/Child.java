package multipleIn;

public class Child implements Demo,Demo1 {
	public void print() {
		System.out.println("Hello");
	}
public static void main (String arg[]) {
	Child ch =new Child();
	ch.print();
}
}
