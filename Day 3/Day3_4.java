import java.util.*;

public class Day3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("insert number");

            int star =scanner.nextInt();
            
            for(int i=1;i<=star;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
}
}
