package javatest21;

public class JavaTest21 {
	public static void main(String[] args) {

		int i, j, n, m;
		//1000�� �ڸ�, 100�� �ڸ�, 10���ڸ�, 1���ڸ� 4������ ��Ÿ���� ������ �ʿ��ϴ� .
		int sum;
		sum = 0;

		for (i = 0; i < 10; i++) {
			// i�� 10�����̱� ������ 10000���ڸ������� �ǹ��Ѵ�. 
			for (j = 0; j < 10; j++) {
				// j 10�����̱� ������ 1000���ڸ������� �ǹ��Ѵ�. 
				for (n = 0; n < 10; n++) {
					for (m = 0; m < 10; m++) {
						if (m == 8) {
							sum = sum + 1;
						}
						if (n == 8) {
							sum = sum + 1;
						}
						if (j == 8) {
							sum = sum + 1;
						}
						if (i == 8) {
							sum = sum + 1;
						}
					}
				}
			}

		}
		System.out.println(sum);
	}
}