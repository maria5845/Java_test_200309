package javatest17;

public class JavaTest17 {
	public static void main(String[] args) {
		int num1 = 1;
		// �Ǻ���ġ ���� ù��° ���� 1���� �����Ѵ�.
		int num2 = 1;
		// �ι�° ���� 1���� �����Ѵ�. 
		int num3 = 0;
		// ����° ���� �� ���� �޾� ������ ������ �����Ѵ�.
		System.out.print(num1 + "," + num2);
		// ù���� �ι�° ���� ������ ������ ���� ��� 
		for (int i = 0; i < 4; i++) {
			num3 = num1 + num2;
			num1 = num3;
			num2 = num3 + num2;
			System.out.print("," + num1 + "," + num2);
		}
		
	}

}
