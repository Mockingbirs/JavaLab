public class Day4_3 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        // for(int i : arr){
        //    System.out.print(i); 
        // }
        // System.out.println();
        // for(int j : arr){
        //     System.out.print(j);   
        // }
        for(int i=0;i<arr.length;i++)
        System.out.printf("%d", arr[i]);
        System.out.println();

        for(int tmp : arr){
            System.out.printf("%d", arr[tmp]);
            sum += tmp;
        }
        

        System.out.println();
        System.out.println("sum="+sum);
    }
}
