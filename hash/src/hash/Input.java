package hash;

public class Input {
	public static int[] Inputs(int[] arrS, int[] arrH) {
		
		for( int i=0; i < arrS.length; i+=1) {
			int k = arrS[i] % 11;
			
			while(true) {
				if(arrH[k] != 0) {
					k = (k+1)/11;
				}else {
					arrH[k] = arrS[i];
					break;
				}
			} 
		}
		return arrH;	
	}

}
