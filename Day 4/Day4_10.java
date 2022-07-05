public class Day4_10 {
    public static void main(String[] args) {
        
        int i =11;

        System.out.println("카운트 다운을 시작합니다.");
        while(i--!=0){
            System.out.println(i);
            for(long j=0;j<2_000_000_000_0L;j++){
                ; //j의 숫자만큼 작동을 더시켜서 지연시킴
            }
        }
        System.out.println("GAME OVER");
    }
}
