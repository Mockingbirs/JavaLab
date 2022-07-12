package day9_4;

public class Dropship extends AirUnit implements Repairable {	
	Dropship() {
		super(125);
		hitPoint = MAX_HP;
}

	public String toString() {
		return "Dropship";
	}

}

class Marine extends GroundUnit {
	Marine () {
		super(40);
		hitPoint = MAX_HP;
		
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
		}
	void repair (Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint!=u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
}
