package day6_2;

public class CardTest {

	public static void main(String[] args) {
		// 클래스 변수 호출 객체 생성 없이도 바로 호출 가능하다.
		System.out.println("Card width = " + card.width);
		System.out.println("Card height = " + card.height);
		
		// 인스턴스 변수는 객체를 생성해야만 호출 가능하다.
		card c1 = new card();
		c1.kind = "Heart";
		c1.number = 7;

		card c2 = new card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은" + c1.kind +"," + c1.number + 
				"이며 " + "크기는 (" + c1.width + "," + c1.height + 
				")이다.");
		
		System.out.println("c2은 " + c2.kind +"," + c2.number + 
				"이며 " + "크기는 (" + c2.width + "," + c2.height + 
				")이다.");
		System.out.println("c1의 width와 height을 50, 80으로 변경");
		
		c1.width = 50;
		c1.height = 80;
		//클래스 변수는 하나만 수정해도 공통적으로 적용된다.
		System.out.println("c1은" + c1.kind +"," + c1.number + 
				"이며 " + "크기는 (" + c1.width + "," + c1.height + 
				")이다.");
		
		System.out.println("c2은 " + c2.kind +"," + c2.number + 
				"이며 " + "크기는 (" + c2.width + "," + c2.height + 
				")이다.");
		
	}
}
