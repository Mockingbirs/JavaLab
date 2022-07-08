package day7;

public class day7_6 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		for(i=1;i<=1000;i++) {
			if(i%3==0) {
				sum += i;
			} 
		}
		System.out.println(sum);
	}

}
