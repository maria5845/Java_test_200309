package javatest10;

public class JavaTest10 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i +" ");
		}
		System.out.println("\n");
		for(int j=100; j>0;j--) {
			// 역순은 끝까지 간 수부터 다시 0까지 빼는 작업을 말한다. 
			System.out.print(j+" ");
		}
	}

}
