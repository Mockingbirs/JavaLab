package day8_1;


class Machine{
	public void turnOn(){
		System.out.println("켰습니다.");
	}
	public void turnOff(){
		System.out.println("껐습니다.");
	}
	
}

class Car extends Machine{
	
}

public class day8_4 {
	public static void main(String[] args) {
		Car car = new Car();
		car.turnOn();
		car.turnOff();
	}
}

