import java.util.*;

public class Day4_24 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;

        System.out.println("number a");
        x = sc.nextInt();
        System.out.println("number b");
        y = sc.nextInt();

        if(x>y){
            int t =x;
            x=y;
            y=t;
            for(y=t;y<=t;y++){
                System.out.print(y+" ");
            }
            
        } else{
            System.out.println(y+" ");
        }
        // do{
        //     System.out.print(x + " ");
        //     x = x+1;
        // }while(x<=y);
        // System.out.println();


    } 
}
