package euclidean;

import java.util.*;

public class euclidean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a와 b를 입력해 주세요(더 큰 수를 a로 입력해주세요)");
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		int r;
		
		do {
			r = a%b;
			a = b;
			b = r;
		
		}
		while(r != 0);
		System.out.println("최대공약수 : " + a);
			
		}
	

	}


