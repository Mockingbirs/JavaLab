package day6_1;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//t1 객체 생성,Tv클래스로 t1인스턴스 생성

		Tv t1 = new Tv(); // t1 객체 생성
		Tv t2 = new Tv();

		t1.channel = 7; // 번호 7로 초기화
		t1.channelDown();  // 채널 하나 내림
		
		t2.channel = 11;
		t2.channelUp();
		
		System.out.println("현재채널 " + t1.channel);
		System.out.println("현재채널 " + t2.channel);
	    
	}

}
