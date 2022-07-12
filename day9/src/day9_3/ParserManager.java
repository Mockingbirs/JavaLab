package day9_3;

interface Parseable {
	//구문 분석작업을 수행한다.
	public abstract void parse(String fileName);
}
public class ParserManager {
	//리턴타입이 Parseable 인터페이스이다.
	public static Parseable getParser (String type) {
		if(type.contentEquals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
			//return new HTMLParser();
			}
	}

}
