package day8_1;

class Tv {
	boolean power;  //전원상태on/off
	int channel;  //채널
	
	void power( ) { power = !power;
	}
	void channelUp( ) { ++channel;
	}
	void channelDown( ) { -- channel;	
	}
}
class CaptionTv extends Tv {
	boolean caption; //캡션 상태 on/off
	
	void displayCaption(String text) {
		if (caption) {  //캡션 상태가 on(true)일때만 text를 보여준다.
			System.out.println(text);
		}
	}
}
	
//class CaptionTvTest{
//	public static void main(String args[]) {
//
//			CaptionTv ctv = new CaptionTv();
//			ctv.channel = 10;	//조상클래스로부터 상속받은 맴버
//			ctv.channelUp();	//조상클래스로부터 상속받은 맴버
//			System.out.println(ctv.channel);
//			ctv.displayCaption("Hello,world");
//			ctv.caption = true;	//캡션(자막)기능을 켠다
//			ctv.displayCaption("Hello,word");	
//	}
//}
public class day8_1 {
	public static void main(String args[]) {

		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;	//조상클래스로부터 상속받은 맴버
		ctv.channelUp();	//조상클래스로부터 상속받은 맴버
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello,world");
		ctv.caption = true;	//캡션(자막)기능을 켠다
		ctv.displayCaption("Hello,word");	
}
	
}

	

		
		
