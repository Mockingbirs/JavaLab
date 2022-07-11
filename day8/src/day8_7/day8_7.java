package day8_7;

public class day8_7 {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("this is a FireEngine instance.");
		}
		if (fe instanceof Car) {
			System.out.println("this is a Car instance");
		}
		if (fe instanceof Object) {
			System.out.println("this is an Object instance");
		}
		System.out.println(fe.getClass().getName());//클래스의 이름을 출력
	}
}  //class

class Car{
	
}

class FireEngine extends Car{
	
}
