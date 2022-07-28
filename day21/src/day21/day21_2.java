package day21;

public class day21_2 {
	public static void main(String[] args) {
		
		int[] arr = {5,3,4,1,2};
		
		
		for(int i=1;i<arr.length;i++) {
			
			int temp=arr[i];
			
			int k =i;
			 
			 while(k>0 && temp<arr[k-1]) {
				 arr[k] = arr[k-1];
				 k-= 1;
			 }
			 arr[k] = temp;	
		}
		
			for(int each :arr){
			System.out.print(each + " ");
			}
		
		
	}

}
