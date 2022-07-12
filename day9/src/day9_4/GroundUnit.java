package day9_4;

public class GroundUnit extends Unit {
	GroundUnit (int hp) {
		super(hp);
	}

}

class AirUnit extends Unit {
	AirUnit (int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

