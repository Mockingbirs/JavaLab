import java.util.*;

public class Day4_26 {
    public static void main(String[] args) {
        
  
    
    Scanner sc = new Scanner(System.in);

    System.out.println("How many stars?");
    int x = sc.nextInt();

    int s = 1;

    while(s<=x){
        if(s%2==0){
            System.out.println("+");
            s++;
        }else if(s%2==1){
            System.out.println("*");
            s++;
        }
        

    }
    

    }
}
