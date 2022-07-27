package day20;

public class day20_1 {
	public static void main(String[] args) {

		int[] arrD = { 12, 13, 11, 14, 10 };
		int i = 0;

		System.out.println("정렬전");
		for (int each : arrD) {             //정렬전
			System.out.print(each+" ");	
	 }		System.out.println();
	 
	 System.out.println("정렬 중");
	 
		for (i = 0; i < 4; i++) {

			int min = i;

			for (int k = i + 1; k < 5; k++) {
				if (arrD[k] < arrD[min]) {
					min = k;
				}
			}

			int t = arrD[i];
			arrD[i] = arrD[min];
			arrD[min] = t;
			
			
			for (int each : arrD) {             //정렬후
				System.out.print(each+" ");
		 }		System.out.println();
		}
		System.out.println("정렬후");
		for (int j = 0; j <arrD.length; j++) {
			System.out.print(arrD[j]+" ");
		}
	}

}
