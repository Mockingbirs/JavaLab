import java.util.*;

public class Day4_22 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = 0;

        System.out.println("three number : ");
        n = sc.nextInt();
        while(true){

        if(100<=n && n<=999){
            System.out.printf("the number is %d",n);
            break;
        }else{
           
            System.out.printf("three nuber is %d%n",n);
            n = sc.nextInt();
        }
        }


    }
}
