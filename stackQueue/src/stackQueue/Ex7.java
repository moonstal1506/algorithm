package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//7. 교육과정 설계
public class Ex7 {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String need = kb.next();
		String plan = kb.next();
		Queue<Character> q=new LinkedList<>();
		for(char c:need.toCharArray()) {
			q.add(c);
		}
		String answer= "YES";
		for(char c: plan.toCharArray()) {
			if(q.contains(c)) {
				if(q.poll()!=c) {
					answer="NO";
					break;
				}
			}
		}
		if(!q.isEmpty()) {
			answer="NO";
		}
		System.out.println(answer);
	}

}
