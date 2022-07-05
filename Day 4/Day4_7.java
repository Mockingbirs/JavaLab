import java.util.*;

public class Day4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");

        do{     System.out.println("n의 값 :");

        int n = scanner.nextInt();
         while(n <= 0);

        
        int sum = 0;

        for(int i=1;i<n;i++){
            System.out.printf("%d + ",i);
            sum += i;
        }
        System.out.print(n + " = ");
        sum += n;
        System.out.println(sum);
    }
        
    }
}
