package javatest21;

public class JavaTest21 {
	public static void main(String[] args) {

		int i, j, n, m;
		//1000의 자리, 100의 자리, 10의자리, 1의자리 4가지를 나타내는 변수가 필요하다 .
		int sum;
		sum = 0;

		for (i = 0; i < 10; i++) {
			// i가 10까지이기 때문에 10000의자리까지를 의미한다. 
			for (j = 0; j < 10; j++) {
				// j 10까지이기 때문에 1000의자리까지를 의미한다. 
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