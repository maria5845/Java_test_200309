package javatest14;

public class JavaTest14 {

	public static void main(String[] args) {
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if ((2 * x + 4 * y) == 10) {
					System.out.println("X´Â" + x + ", Y´Â" + y);
				}
			}
		}
	}

}
