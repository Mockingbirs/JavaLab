package day7;

public class day7_14 {

	int a;
	
	void varTest() {
		this.a++;
	}
	
	public static void main(String[] args) {
		day7_14 sample = new day7_14();
		sample.a = 1;
		sample.varTest();
		System.out.println(sample.a);
	}
}
