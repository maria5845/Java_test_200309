package javatest01;
// 1�� ���� �� 
public class JavaTest1 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) - 1;
		// �ܿ��� (int) (Math.random() * 100 ) -1 
		int anw = num / 10;
        System.out.println("�������� ���� ������ " + num +" �Դϴ�." );
		switch (anw) {
		case 10:
		case 9:
			System.out.println("A �����Դϴ�.");
			break;
		case 8:
			System.out.println("B �����Դϴ�.");
			break;
		case 7:
			System.out.println("C �����Դϴ�.");
			break;
		case 6:
			System.out.println("D �����Դϴ�.");
			break;
		default:
			System.out.println("F �����Դϴ�.");
		}

	}

}
