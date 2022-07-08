package day7;

// 7_16과 충돌 둘중 하나 //처리 하고 작업
class Anumal {
	String name;

	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	void sleep() {
		System.out.println(this.name + "zzz");
	}
}

class HouseDog extends Dog {
	HouseDog(String name) {
		this.setName(name);
	}
	HouseDog(int type) {
		if(type==1) {
			this.setName("yorkshrie");
		} else if(type==2){
			this.setName("bulldog");
		}
	}
	void sleep() {
		System.out.println(this.name + "zzz in house");
	}
	void sleep(int hour) {
		System.out.println(this.name + "zzz in house for " + hour + "hours");
	}
}
public class day7_17 {

	public static void main(String[] args) {
		
		HouseDog happy = new HouseDog("happy");
		HouseDog yorkshire = new HouseDog(1);
		
		System.out.println(happy.name);
		System.out.println(yorkshire.name);
	}
}
