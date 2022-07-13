package day10_1;

public class Exam1 {
	public static void main(String[] args) {
		
//		int a = 4/0;  //        /by zero 에러
		//에러 객체가 생성되는 개념이다! int 대신 double 사용시 에러가 안남
		
		try { int a = 4/0;
		} catch(ArithmeticException e) {
			System.out.println("에러가 발생했습니다.");
		} finally {
			System.out.println("에러가 생기든 안생기든 항상 처리된다.");
		}
		
		
//		int[] b = {1, 2, 3}; 
//		//ArrayIndexOutOfBoundsException 에러
//		
//		System.out.println(b[3]);
		
		
	}

}
