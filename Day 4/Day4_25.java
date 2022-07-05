import java.util.*;

public class Day4_25 {
    public static void main(String[] args) {

        int s = 0;
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("how many stars?");
        x = sc.nextInt();

        while(s<=x){
            System.out.print("*");
            s++;
        }      
        
    }
}
