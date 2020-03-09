package javatest18;

public class JavaTest18 {
	public static void main(String[] args) {
		int n = 0;
		int count = 0;
		int result = 0;
		while (true) {
			if (n % 2 != 0) {
				result += n;
				count++;

			} else if ((n % 2 == 0) && (n % 3 == 0)) {
				result += n;
				count++;

			}
			if (result > 1000) {
				System.out.println(count);
				System.out.println(result);
				break;
			}
			n++;
		}
		
	}
}
