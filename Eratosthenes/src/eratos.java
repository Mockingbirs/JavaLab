import java.util.*;

public class eratos {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[101];
		
		int i =0;
		
		
//		for(i=0;i<arr.length;i+=1) {
//			arr[i]=1;
//		}  // Arrays.fill(arr, 1); 와 같음
		Arrays.fill(arr, 1);  //arr 를 1로 채움
		
//		System.out.println(Arrays.toString(arr));
		
		
		for(int k=2;k<=(arr.length-1)/k;k+=1) { //k의 범위지정
			if(arr[k]==1) { 
			for(i=2;i<=(arr.length-1)/k;i+=1) {  //i의 범위지정
				arr[k*i]=0;		//조건에 맞는 arr 값을 0으로 지정
//				System.out.println(Arrays.toString(arr));
			} 
			}
			
			
		}
		System.out.print("소수 : [ ");
		for(int j=2;j<=arr.length-1;j++) {
			if(arr[j]==1) {
				System.out.print(j + " ");
			}	
		}
		System.out.print("]");
	}

}
