package day7;

public class day7_12 {
	void sayNick(String nick) {
		if ("fool".equals(nick)) {
		return;
	}
	System.out.println("나의 별명은"+nick+"입니다.");

 }
	public static void main(String[] args) {
		day7_12 sample = new day7_12();
		sample.sayNick("angel");
		sample.sayNick("fool");  //출력되지 않는다.
		
	}
}

