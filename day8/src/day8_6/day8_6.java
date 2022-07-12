package day8_6;

//public class day8_6 {
//	public static void main(String[] args) {
//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//		
//		fe.water();
//		car = fe; // car=(car)fe;에서 형변환이 생략된 형태
//	//	car.water();
//		fe2 = (FireEngine)car; // 자손타입 <- 조상타입
//		fe2.water();
//	}
//
//}

public class day8_6 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;  //형변환 오류 자손타입<-조상타입
		fe.drive();
		car2 = fe;
		car2.drive();
	}

}


class Car {
	String color;
	int door;
	
	void drive() {  //운전하는 기능
		System.out.println("drive, Brrrrr");
	}
	void stop( ) {  //멈추는 기능
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {//물뿌리는기능
		System.out.println("water!!!!");
	}
}
