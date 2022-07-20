package day13;

import java.util.*;

public class day13_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=0;
		
		int b=0;
		System.out.println("a를 입력하세요");
		a = sc.nextInt();
		
		System.out.println("b를 입력하세요");
		b = sc.nextInt();
		
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}

}
