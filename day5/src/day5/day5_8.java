package day5;

public class day5_8 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
	
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = i;
			System.out.print(i);
		}
		System.out.println();
		int tmp = 0;
		int j = 0;
		
		for(int i = 0;i<numArr.length;i++) {
			j= (int)(Math.random()*9+1);
			tmp = numArr[i];
			numArr[i] = numArr[j];
			numArr[j] = tmp;
			
		}
		for(int i=0;i<numArr.length;i++) {
		System.out.print(numArr[i]);
		}
		
	}
}