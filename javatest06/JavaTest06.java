package javatest06;

public class JavaTest06 {

	public static void main(String[] args) {
		System.out.println("***********������ ����ϱ�***********");
		for (int i = 2; i <= 9; i++) {
			System.out.println("\n");

			for (int j = 1; j <= 9; j++) {
				if (i == 6 || i == 7) {
					continue;
				}
				System.out.println(i + "X" + j + "=" + (i * j));
			}
		}
	}

}
