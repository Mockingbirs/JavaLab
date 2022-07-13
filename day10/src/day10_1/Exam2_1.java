package day10_1;

public class Exam2_1 {
	public static void main(String[] args) {
		Exam2 ex = new Exam2();
		int num = ex.get50thItem(new int[100]);
		System.out.println("array 배열의 50번째 요소의 값 : "+num);
	}

}
