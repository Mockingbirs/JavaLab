package day5;

public class day5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[45];
		
	    for (int i=0; i < ball.length;i++) {
	    	ball[i] = i+1;  //볼[0]=1이 저장
	    }
	    	int tmp = 0;  //두 값을 바꾸는데 사용할 임시변수
	    	int j =0;  //임의의 값을 얻어서 저장할 변수
	    
	    	//배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
	    	// 0번째부터 5번째 요소까지 모두 6개만 바꾼다.
	    	for(int i=0; i<6; i++) {
	    		j= (int)(Math.random()*45);  // 0~44범위의 임의의 값을 얻는다.
	    		tmp = ball[i];  //tmp에 ball[i] 값을 저장  x=y
	    		ball[i] = ball[j]; //ball[i]에 ball[j]값을 저장 y=z
	    		ball[j] = tmp; //ball[j]에 tmp값을 저장z = x
	    		
	    	}
	    	
	    	// 배열 ball의 앞에서 부터 6개의 요소를 출력한다.
	    	for(int i=0; i<6;i++) {
	    		System.out.printf("ball[%d]=%d%n", i, ball[i]);
	    	}
	    }
	}


