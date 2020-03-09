package javatest01;
// 1번 문제 답 
public class JavaTest1 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) - 1;
		// 외우자 (int) (Math.random() * 100 ) -1 
		int anw = num / 10;
        System.out.println("랜덤으로 돌린 점수는 " + num +" 입니다." );
		switch (anw) {
		case 10:
		case 9:
			System.out.println("A 학점입니다.");
			break;
		case 8:
			System.out.println("B 학점입니다.");
			break;
		case 7:
			System.out.println("C 학점입니다.");
			break;
		case 6:
			System.out.println("D 학점입니다.");
			break;
		default:
			System.out.println("F 학점입니다.");
		}

	}

}
