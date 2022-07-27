package day19;

public class day19_2 {
	
	public static void main(String[] args) {
		
		int[] arrD = {12, 25, 36, 20, 30, 8, 42};
		int[] arrH = new int[11];
		
//		int i =0;
//		
//		for(i=0;i<arrD.length;i++) {
//			int k = arrD[i] % 11;
//      
//		while(true){if(arrH[k]!= 0) {
//				k = (k+1) % 11;
//			}else{arrH[k]=arrD[i];
//           break;}
//	    }
//		}
//for(int x=0;x<arrH.length;x++){    
//    System.out.println(arrH[x]);
//    
//	int[] arrD = {12,25,36,20,30,8,42};
//	int[] arrH = new int[11];
	
	
	int k = 0;
	
	for(int i = 0; i < arrD.length; i++) {
		k = arrD[i] % 11;
		if(arrH[k] == 0) {
			arrH[k] = arrD[i];
//			System.out.println("0인 k값 : " + k);

		}else if(arrH[k] != 0 ) {
			
			k = (k+1) % 11;
			arrH[k] = arrD[i];
//			System.out.println("0이 아닌 k값 : " + i);
		}
		
	}
	for(int i = 0; i < arrH.length; i++) {
		System.out.println(arrH[i]);
	}
		}
	}




