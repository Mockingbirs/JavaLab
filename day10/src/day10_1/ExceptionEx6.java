package day10_1;

public class ExceptionEx6 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		//int a[]  = {1, 2, 3};
		try {
			System.out.println(3);
			//System.out.println(a[4]);
			System.out.println(0/0);
			System.out.println(4); //실행되지 않는다.
		} catch (ArithmeticException e) {
			if (e instanceof ArithmeticException) {
				System.out.println("true");
			}System.out.println("ArithmeticException");
		} catch (Exception a2) {
			System.out.println("Exception");
		}
		// try-catch의 끝
		System.out.println(6);
	} //main메서드의 끝

}
