import java.awt.print.Printable;


public class JavaTest {
	public static void main(String[] args) {
		int a = 9876;
		String b = Integer.toString(a);
		for (int i = 0; i < b.toCharArray().length; i++) {
			System.out.println(b.toCharArray()[i]);
			System.out.println("Test the travis");
		}
	}

}
