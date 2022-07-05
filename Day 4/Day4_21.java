import java.util.*;
public class Day4_21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int re;

        do{
        System.out.print("number :");
        int n = sc.nextInt();

        if(n>0){
            System.out.println("+");
        }else if(n<0){
            System.out.println("-");
        }else {
            System.out.println("0");
        }
        System.out.println("retry? 1-yes 2-no");
        re = sc.nextInt();
        }   while(re==1);

        
    }
}
