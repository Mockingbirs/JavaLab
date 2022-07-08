package day7_1;

import java.util.*;

class Calculator {
	
	int value;
	
	Calculator() {
		this.value = 0;
	}
	
	void add(int val) {
		this.value += val;
	}
	
	int getValue() {
		return this.value;
	}

	boolean isOdd(int num) {
		return num %2 == 1;
	}	
	int avg(int[] arr) {
		int sum = 0;
		
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}return sum / arr.length;
	}
	int avg(ArrayList<Integer> data) {
		int total = 0;
		for (int num : data) {
			total += num;
		}
		return total / data.size();
	}
}

class UpgradeCalculator extends Calculator {
	
	void minus(int val) {
		this.value -= val;
	}


class MaxLimitCalculator extends UpgradeCalculator {

	void add(int val) {
		this.value += val;
		if(this.value > 100) {
			this.value = 100;
		}
	}
		
	}
}

public class Quz1 {
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(10);
		System.out.println(cal.getValue());
		
		UpgradeCalculator cal1 = new UpgradeCalculator();
		cal1.add(10);
		cal1.minus(3);
		System.out.println(cal1.getValue());
		
		/////////////////////////////////////
		int[] arr = {1, 3, 5 ,7, 9};
	
		System.out.println(cal1.avg(arr));
		
		ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
		int result2 = cal.avg(data2);
		System.out.println(result2);
		
		
	}
	
}
