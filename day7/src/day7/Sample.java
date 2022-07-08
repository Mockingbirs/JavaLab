package day7;
//
//class Calculator {
//	int result=0;
//	
//	int add(int num) {
//		result += num;
//		return result;
//	}
//	
//	int sub(int num ) {
//		result -= num;
//		return result;
//	}
//} 
//
//
//public class Sample {
//	public static void main(String[] args) {
//		
//		Calculator cal1 = new Calculator();
//		
//		Calculator cal2 = new Calculator();
//		
//		
//		System.out.println(cal1.add(3));
//		
//		System.out.println(cal2.add(4));
//	}
//}
//=========================================================


class Animal{
	String name;
	
	public void setName(String name) {
		this.name = name;
		//this 는 Animal클래스에 의해서 생성된 객체를 지칭한다.
	}
	
}
public class Sample {
	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.setName("boby"); //메소드 호출
		
		Animal dog = new Animal();
		dog.setName("happy");
	
		//**************객체 변수의 값이 독립적으로 유지된다******************
	System.out.println(cat.name);	
	System.out.println(dog.name);	
	
	
	}
	
}


