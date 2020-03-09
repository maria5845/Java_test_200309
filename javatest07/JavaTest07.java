package javatest07;

import java.util.*;

public class JavaTest07 {

	public static void main(String[] args) {
		System.out.println("해당값을 입력하세요 :" );
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean b = false;

		for (int i = 2; i <= n; i++) {
			//2부터가 소수이기 때문에 시작은 2부터  
           if(n % i == 0) {
        	   b=true;
        	   break;
        	   
           }
           if(b) {
        	   System.out.println(n+"은 소수가 아닙니다.");
        	   
           }else {
        	   System.out.println(n+"은 소수입니다.");
           }
		}
	}
}