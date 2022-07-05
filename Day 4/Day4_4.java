import java.util.*;

public class Day4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇개의*를 표시할까요?:");
        int star = scanner.nextInt();
        if(star > 0){
        for(int i=0;i < star;i++){
            System.out.print("*");
          
        }  System.out.println();
        } 
    }
}
