import java.util.*;

public class Day4_14 {
    public static void main(String[] args) {
        
        int input = 0, answer = 0;

        answer = (int)(Math.random()*100) + 1;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("1과 100사이의 정수를 입력하세요.>");
            input = scanner.nextInt();

            if(input > answer){
                System.out.println("less 더 작은 수로 다시 시도해보세요.");
            }
            else if(input < answer){
                System.out.println("more 더 큰 수로 다시 시도해보세요.");
            }
    
        }
        while(input!=answer);
        System.out.println("pass 정답입니다.");
    }
}
