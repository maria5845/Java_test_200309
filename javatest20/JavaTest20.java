package javatest20;

public class JavaTest20 {
	public static void main(String[] args) {
		boolean b1, b2;

		for (int i = 1; i < 100; i++) {
			if (i < 10) { // �Է°��� ���ڸ� ���� ���
				if ((i % 3) == 0)
					System.out.println(i + " �ڼ� �ѹ�");
			} else { // �Է°��� ���ڸ� ���� ���
				b1 = (i / 10) % 3 == 0; // ���� �ڸ����� 3�� ������� �Ǻ�
				b2 = (i % 10) % 3 == 0; // ���� �ڸ����� 3�� ������� �Ǻ�

				if ((i % 10) == 0) // ����ó��. ex)30, 60, 90
					b2 = false;

				if (b1 && b2)
					System.out.println(i + " �ڼ� �ι�");
				else if (b1 || b2)
					System.out.println(i + " �ڼ� �ѹ�");
			}
		}
	}
}
