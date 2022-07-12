package day9;

interface Predator {
	String getFood();
	
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator {
	public String getFood() {
		return "apple";
	}
}

class Lion extends Animal implements Predator {
	public String getFood() {
		return "banana";
	}
}

class ZooKeeper {
//    void feed(Tiger tiger) {  // 호랑이가 오면 사과를 던져 준다.
//        System.out.println("feed apple");
//    }
//
//    void feed(Lion lion) {  // 사자가 오면 바나나를 던져준다.
//        System.out.println("feed banana");
//    }
	  void feed(Predator predator) {
//		  System.out.println("feed apple");
		  System.out.println("feed " + predator.getFood());
	  }
}

public class Sample {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  // feed apple 출력
        zooKeeper.feed(lion);  // feed banana 출력
    }
}