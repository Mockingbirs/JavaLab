public class Day4_17 {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            if (i%3==0)
            continue;  //continue, break 는 for 보다 while과 더 잘어울린다.
            System.out.println(i);
        }
    }
}
