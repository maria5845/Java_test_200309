package javatest08;

public class JavaTest8 {

	public static void main(String[] args) {
		 int count=0;

         for(int i=2; i<=100; i++) // 1�� �Ҽ��� �ƴϹǷ� 2���� ����
         {
             for(int j=2; j<=i; j++)
             {
                  if(i%j ==0) 
                  {
                       count ++;
                  }    
             }
             
             // �Ҽ��� 1�� �ڱ��ڽ����θ� �������Ƿ� �ڱ��ڽ����� �ѹ��� �������� �Ҽ�
             if(count==1)
             {
                  System.out.println(i+" ");
             }
             count=0;
         }

	}

}
