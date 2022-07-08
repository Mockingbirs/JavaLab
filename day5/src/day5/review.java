package day5;

public class review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]);
		}
		System.out.println();
		int tmp = 0;
		int j = 0;
		
		for(int i=0;i<arr.length;i++) {
			j=(int)(Math.random()*9+1);
			tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
			
			}
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
		}

	}

}
