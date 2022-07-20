package day12;

import java.util.*;

public class day12_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("base를 입력해주세요");
		double base = sc.nextDouble();
		System.out.println("height를 입력해주세요");
		double height = sc.nextDouble();
		
		double area = base*height/2;
		
		System.out.println(area);
		
//	double base = 5.0;
//	double height = 2.0;
//	
//	double area = base*height/2;
//	System.out.println(area);
		
	}
	
}
