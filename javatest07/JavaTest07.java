package javatest07;

import java.util.*;

public class JavaTest07 {

	public static void main(String[] args) {
		System.out.println("�ش簪�� �Է��ϼ��� :" );
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean b = false;

		for (int i = 2; i <= n; i++) {
			//2���Ͱ� �Ҽ��̱� ������ ������ 2����  
           if(n % i == 0) {
        	   b=true;
        	   break;
        	   
           }
           if(b) {
        	   System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
        	   
           }else {
        	   System.out.println(n+"�� �Ҽ��Դϴ�.");
           }
		}
	}
}