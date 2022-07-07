package day6_5;

public class Data1 {
	int value; // 생성자가 없어서 default생성자를 java가 스스로 생성한다.
}
class Data2 {
	int value;  //생성자가 하나라도 있으면 default생성자를 만들지않는다.
	
	//생성자를 직접 설정시 작동
//	Data2(){   
//		
//	}
	
	Data2(int x) {
		value = x;
	}
}
class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2();
		
	}
}
