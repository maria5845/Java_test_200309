package javatest09;

public class JavaTest9 {

	public static void main(String[] args) {
		int sum = 0; 
		// 
		int i;
		for (i = 0; i <=200; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
				;
			}

		}
		System.out.println("2�ǹ���� 3�� ����� �ƴ� ���� ��: " + sum);
	}

}
