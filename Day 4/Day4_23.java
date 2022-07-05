import java.util.*;

public class Day4_23 {
    public static void main(String[] args) {
     
    Random rand = new Random();
    Scanner stdIn = new Scanner(System.in);

    int no = 10 +rand.nextInt(90);
    System.out.println("number game start");
    System.out.println("right number(10~99");

    int x;
    do{
        System.out.println("what number?");
        x = stdIn.nextInt();

        if (x > no) {
            System.out.println("low number");
        }else if(x<no) {
            System.out.println("high number");
        }
    }while(x!=no);
    System.out.println("right");    
}
}
