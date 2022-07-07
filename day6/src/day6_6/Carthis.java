package day6_6;

public class Carthis {
	String color;
	String gearType;
	int door;
	Carthis() {
		this("white","auto", 4);
	}
	Carthis(String color){
		this(color,"auto",4);
	}
	Carthis(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	
}
