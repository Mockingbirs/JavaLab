package day8_1;

public class day8_3 {
	public static void main(String args[]) {
		Point3D p3 = new Point3D();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
		
		
	}
		
}

class Point {
	int x = 10;
	int y = 20;
	
	Point(int x, int y) {
		//super(); 생성자를 호출하지 않으면 자동으로 super();를 삽입해준다.
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	int z = 30;
	
	Point3D() { //Point3D(int x, int y, int z)를 호출한다.
		this(100, 200, 300);		
	}
	Point3D(int x, int y, int z) {
		super(x,y); //Point (int x , int y)를 호출한다.
		this.z = z;
	}
}
