package stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//8.응급실
//총환자수, m번째 환자, 위험도배열 입력 받아 숫자리턴
//사람객체 만들어줌 id랑 위험도 필요
//답은 0으로 초기화
//큐만들어 n번까지 사람객체 큐에 넣어줌
//큐가 비어있지 않을 때까지 큐에서 꺼내 임시변수에 담음
//큐에있는 사람돌려 임시변수와의 위험도 비교
//임시변수 위험도 낮으면 다시 뒤로 보내고 임시변수 널초기화하고 멈춤
//임시변수가 널이아니면 답++하고 임시변수아이디와 m이 같으면 답리턴


class Person{
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id=id;
		this.priority=priority;
	}
}

public class Ex8 {
	
	private static int solution(int n, int m, int[] arr) {
		int answer=0;
		Queue<Person> q = new LinkedList<>();
		for(int i=0; i<n; i++) {
			q.offer(new Person(i,arr[i]));
		}
		while(!q.isEmpty()) {
			Person tmp = q.poll();
			for(Person x:q) {
				if(x.priority>tmp.priority) {
					q.offer(tmp);
					tmp=null;
					break;
				}
			}
			if(tmp!=null) {
				answer++;
				if(tmp.id==m) return answer;
			}
		}
		return answer;
	}
 
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=kb.nextInt();
		}
		System.out.print(solution(n,m,arr));
		
	}

}
