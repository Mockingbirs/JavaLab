package day11;

import java.util.*;

public class day11_6 {
	
	public static void main(String[] args) {
		
	
	Stack st = new Stack();
	Queue q = new LinkedList(); //Queue인터페이스의 구현체인 LinkedList사용
	
	st.push("0");
	st.push("1");
	st.push("2");
	
	q.offer("0");
	q.offer("1");
	q.offer("2");
	
	System.out.println("==stact==");
	while(!st.empty()) {
		System.out.println(st.pop());
	}
	System.out.println("==Queue==");
	while(!q.isEmpty()) {
		System.out.println(q.poll());
	}
	}
}