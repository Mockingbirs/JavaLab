import java.util.*;

import java.util.Scanner;
public class Day4_20 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("number :");
            int num = scanner.nextInt();

            if(num>0){
                System.out.println("this number is +");
            } else if(num==0){
                System.out.println("this number is 0");
            } else {
                System.out.println("this number is -");
            }
            
             System.out.println("one more? 1-yes, 2-no");

        int tmp ;
        tmp = scanner.nextInt();

            if (tmp==2) {
                break;
            } else {

            }
        
            }
           
        } 
    }