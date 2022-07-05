import java.util.*;

public class Day4__20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = 0;

        outer : while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("Choose Number>(1~3, 0:done)>");
            num = sc.nextInt();
        

            if(num==0){
                break;             
            }
            else if(1<=num && num <=3){
                int tmp = 0;
                while (true) {
                    System.out.println("input number?(0:finish 99 : Done");
                    tmp = sc.nextInt();
                    if(tmp==0){
                        break;
                    }else if(tmp==99){
                        break outer;
                    }else if(num==1){
                        System.out.println("result :" + (tmp*tmp));

                    }else if(num==2){
                        System.out.println("result :" + (Math.sqrt(tmp)));

                    }else if(num==3){
                        System.out.println("result :" + (Math.log(tmp)));

                }
                
            }
            }
            else {
                System.out.println("number is wrong");
        }
            System.out.println("shut down");
     }
    }
    }