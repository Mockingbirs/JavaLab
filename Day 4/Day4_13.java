import java.util.*;

public class Day4_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0 을 입력)");
  
        int num;

        int sum = 0;

        while(true) {  //true 무한반복
            System.out.print(">>");
            num = scanner.nextInt();
            if(num != 0){    //반복을 빠져나가기 위한 코드
                sum += num;
            }
            else{//0을 입력한 경우
                break;
            }
        }
        System.out.println("합계 =" + sum);
    }
}
