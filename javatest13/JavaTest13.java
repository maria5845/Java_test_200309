package javatest13;

public class JavaTest13 {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
              if((i+j)==6) {
            	  System.out.println("첫번째 주사위는 " + i+ "두번째 주사위는" + j);
              }
			}
		}
	}
}
