package day5;

import java.util.*;


public class day5_9 {
public static void main(String[] args) {
	int[] numArr = new int[10];
	int[] counter = new int[10];
	
	Random random = new Random();
	
	for(int i=0;i<numArr.length;i++) {
		numArr[i] = random.nextInt(10); // 0부터 10 미만까지
		System.out.print(numArr[i]);
		
	}System.out.println();

	for(int j=0;j<counter.length;j++) {
		counter[numArr[j]]++;
/* 9069501117
 * j = 0 numArr[0] counter[9]++
 * j = 1 numArr[1] counter[0]++
 * j = 2 numArr[2] counter[6]++
 *               : 
 *               : 
 *               : 
 * j = 9 numArr[9] counter[7]++ 			
 */
		
		}
	for(int i=0; i<counter.length;i++) {
		System.out.printf("%d의 갯수 : %d%n",i, counter[i]);
	}
		
	}
	
}

