package javatest17;

public class JavaTest17 {
	public static void main(String[] args) {
		int num1 = 1;
		// 피보나치 수열 첫번째 수는 1부터 시작한다.
		int num2 = 1;
		// 두번째 수도 1부터 시작한다. 
		int num3 = 0;
		// 세번째 수는 두 수를 받아 저장할 변수를 설정한다.
		System.out.print(num1 + "," + num2);
		// 첫수와 두번째 수는 정해져 있으니 먼저 출력 
		for (int i = 0; i < 4; i++) {
			num3 = num1 + num2;
			num1 = num3;
			num2 = num3 + num2;
			System.out.print("," + num1 + "," + num2);
		}
		
	}

}
