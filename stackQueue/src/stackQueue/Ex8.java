package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//8. 응급실

class Person{
	int id;
	int priority;
	
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class Ex8 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
		}
		Queue<Person> q = new LinkedList<>();
		for(int i=0;i<n;i++) {
			q.add(new Person(i,arr[i]));
		}
		int answer=0;
		while(!q.isEmpty()) {
			Person tmp=q.poll();
			for(Person a:q) {
				if(a.priority>tmp.priority) {
					q.add(tmp);
					tmp=null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
				if(tmp.id==m) {
					System.out.println(answer);
					break;
				}
			}
		}
	}
}
