import java.util.*;

public class Day3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // for(int j=1;j=i;j++){
        // for(int i=1;i<=5;i++)
        // System.out.println("*");
        // System.out.print(i);
        // // System.out.print();}
        System.out.print("입력하세요");

            int star =scanner.nextInt();
            
            for(int i=1;i<=star;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
}
}
