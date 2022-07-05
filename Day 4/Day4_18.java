import java.util.*;

public class Day4_18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = 0;

        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("Choose Number>(1~3, 0:done)>");
            num = sc.nextInt();
        

            if(num==0){
                break;             
            }
            else if(1<=num && num <=3){
                System.out.printf("choosse number is %d%n",num);
            }
            else {
                System.out.println("number is wrong");
            }
        }
            System.out.println("shut down");
     }
   
    }

