import java.util.*;

public class hello {
    public static void main(String[] args) {
        // System.out.println("Hello world");
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("x값을 정해주세요.>");
        int x = scanner.nextInt();

        for(int i=1;i<=10;i++){
            System.out.printf("x+n= %d%n", i+x);
        }
            System.out.println();
    }
}
