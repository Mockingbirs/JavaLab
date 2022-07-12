package day9_4;

public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();		
		Marine marine = new Marine();
		SCV scv = new SCV();
		
			scv.repair(tank);
			scv.repair(dropship);
//			scv.repair(marine);
	}

}

interface Repairable {}
	

class Unit {
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp) {
		MAX_HP = hp;
	}
}
